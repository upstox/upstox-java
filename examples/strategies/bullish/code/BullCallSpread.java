import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.PlaceOrderV3Request;
import com.upstox.api.PlaceOrderV3Response;
import io.swagger.client.api.InstrumentsApi;
import io.swagger.client.api.OrderApiV3;
import java.util.List;
import java.util.Map;

public class BullCallSpread {
    public static void main(String[] args) {
        // Replace with your access token
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("your_access_token_here");

        try {
            InstrumentsApi instrumentsApi = new InstrumentsApi();
            OrderApiV3 orderApi = new OrderApiV3();

            // Step 1: Find the ATM call option (lower long)
            List<Map<String, Object>> lowerInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "CE", "next_week", 0, null, null).getData();
            Map<String, Object> lowerLong = lowerInstruments.get(0);
            System.out.println("Lower long  (ATM)   - Trading symbol : " + lowerLong.get("trading_symbol"));
            System.out.println("Lower long  (ATM)   - Instrument key : " + lowerLong.get("instrument_key"));

            // Step 2: Find the ATM+1 call option (upper short)
            List<Map<String, Object>> upperInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "CE", "next_week", 1, null, null).getData();
            Map<String, Object> upperShort = upperInstruments.get(0);
            System.out.println("Upper short (ATM+1) - Trading symbol : " + upperShort.get("trading_symbol"));
            System.out.println("Upper short (ATM+1) - Instrument key : " + upperShort.get("instrument_key"));

            // Step 3: Buy the ATM call (lower long)
            PlaceOrderV3Request buyOrder = new PlaceOrderV3Request();
            buyOrder.setInstrumentToken((String) lowerLong.get("instrument_key"));
            buyOrder.setQuantity(((Double) lowerLong.get("lot_size")).intValue());
            buyOrder.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.BUY);
            buyOrder.setOrderType(PlaceOrderV3Request.OrderTypeEnum.MARKET);
            buyOrder.setProduct(PlaceOrderV3Request.ProductEnum.D);
            buyOrder.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
            buyOrder.setPrice(0F);
            buyOrder.setDisclosedQuantity(0);
            buyOrder.setTriggerPrice(0F);
            buyOrder.setMarketProtection(-1F);
            buyOrder.setIsAmo(false);

            PlaceOrderV3Response buyResult = orderApi.placeOrder(buyOrder);
            System.out.println("Buy ATM CE order placed. Order ID: " + buyResult);

            // Step 4: Sell the ATM+1 call (upper short)
            PlaceOrderV3Request sellOrder = new PlaceOrderV3Request();
            sellOrder.setInstrumentToken((String) upperShort.get("instrument_key"));
            sellOrder.setQuantity(((Double) upperShort.get("lot_size")).intValue());
            sellOrder.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.SELL);
            sellOrder.setOrderType(PlaceOrderV3Request.OrderTypeEnum.MARKET);
            sellOrder.setProduct(PlaceOrderV3Request.ProductEnum.D);
            sellOrder.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
            sellOrder.setPrice(0F);
            sellOrder.setDisclosedQuantity(0);
            sellOrder.setTriggerPrice(0F);
            sellOrder.setMarketProtection(-1F);
            sellOrder.setIsAmo(false);

            PlaceOrderV3Response sellResult = orderApi.placeOrder(sellOrder);
            System.out.println("Sell ATM+1 CE order placed. Order ID: " + sellResult);

        } catch (ApiException e) {
            System.err.println("API error: " + e.getMessage());
        }
    }
}
