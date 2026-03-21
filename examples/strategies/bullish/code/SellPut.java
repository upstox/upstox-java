import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.PlaceOrderV3Request;
import com.upstox.api.PlaceOrderV3Response;
import io.swagger.client.api.InstrumentsApi;
import io.swagger.client.api.OrderApiV3;
import java.util.List;
import java.util.Map;

public class SellPut {
    public static void main(String[] args) {
        // Replace with your access token
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("your_access_token_here");

        try {
            // Step 1: Find the ATM put option
            InstrumentsApi instrumentsApi = new InstrumentsApi();
            List<Map<String, Object>> instruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "PE", "next_week", 0, null, null).getData();
            Map<String, Object> instrument = instruments.get(0);
            System.out.println("Trading symbol : " + instrument.get("trading_symbol"));
            System.out.println("Instrument key : " + instrument.get("instrument_key"));

            // Step 2: Place a sell order
            OrderApiV3 orderApi = new OrderApiV3();
            PlaceOrderV3Request body = new PlaceOrderV3Request();
            body.setInstrumentToken((String) instrument.get("instrument_key"));
            body.setQuantity(((Double) instrument.get("lot_size")).intValue());
            body.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.SELL);
            body.setOrderType(PlaceOrderV3Request.OrderTypeEnum.MARKET);
            body.setProduct(PlaceOrderV3Request.ProductEnum.D);
            body.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
            body.setPrice(0F);
            body.setDisclosedQuantity(0);
            body.setTriggerPrice(0F);
            body.setMarketProtection(-1F);
            body.setIsAmo(false);

            PlaceOrderV3Response result = orderApi.placeOrder(body);
            System.out.println("Order placed successfully. Order ID: " + result);

        } catch (ApiException e) {
            System.err.println("API error: " + e.getMessage());
        }
    }
}
