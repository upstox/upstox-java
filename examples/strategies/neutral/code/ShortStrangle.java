import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.PlaceOrderV3Request;
import com.upstox.api.PlaceOrderV3Response;
import io.swagger.client.api.InstrumentsApi;
import io.swagger.client.api.OrderApiV3;
import java.util.List;
import java.util.Map;

public class ShortStrangle {
    public static void main(String[] args) {
        // Replace with your access token
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("your_access_token_here");

        try {
            InstrumentsApi instrumentsApi = new InstrumentsApi();
            OrderApiV3 orderApi = new OrderApiV3();

            // Step 1: Find the ATM+1 call option (short call)
            List<Map<String, Object>> callInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "CE", "next_week", 1, null, null).getData();
            Map<String, Object> shortCall = callInstruments.get(0);
            System.out.println("Short call (ATM+1) - Trading symbol : " + shortCall.get("trading_symbol"));
            System.out.println("Short call (ATM+1) - Instrument key : " + shortCall.get("instrument_key"));

            // Step 2: Find the ATM-1 put option (short put)
            List<Map<String, Object>> putInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "PE", "next_week", -1, null, null).getData();
            Map<String, Object> shortPut = putInstruments.get(0);
            System.out.println("Short put  (ATM-1) - Trading symbol : " + shortPut.get("trading_symbol"));
            System.out.println("Short put  (ATM-1) - Instrument key : " + shortPut.get("instrument_key"));

            // Step 3: Sell the ATM+1 call
            PlaceOrderV3Request sellCallOrder = new PlaceOrderV3Request();
            sellCallOrder.setInstrumentToken((String) shortCall.get("instrument_key"));
            sellCallOrder.setQuantity(((Double) shortCall.get("lot_size")).intValue());
            sellCallOrder.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.SELL);
            sellCallOrder.setOrderType(PlaceOrderV3Request.OrderTypeEnum.MARKET);
            sellCallOrder.setProduct(PlaceOrderV3Request.ProductEnum.D);
            sellCallOrder.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
            sellCallOrder.setPrice(0F);
            sellCallOrder.setDisclosedQuantity(0);
            sellCallOrder.setTriggerPrice(0F);
            sellCallOrder.setMarketProtection(-1F);
            sellCallOrder.setIsAmo(false);

            PlaceOrderV3Response sellCallResult = orderApi.placeOrder(sellCallOrder);
            System.out.println("Sell ATM+1 CE order placed. Order ID: " + sellCallResult);

            // Step 4: Sell the ATM-1 put
            PlaceOrderV3Request sellPutOrder = new PlaceOrderV3Request();
            sellPutOrder.setInstrumentToken((String) shortPut.get("instrument_key"));
            sellPutOrder.setQuantity(((Double) shortPut.get("lot_size")).intValue());
            sellPutOrder.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.SELL);
            sellPutOrder.setOrderType(PlaceOrderV3Request.OrderTypeEnum.MARKET);
            sellPutOrder.setProduct(PlaceOrderV3Request.ProductEnum.D);
            sellPutOrder.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
            sellPutOrder.setPrice(0F);
            sellPutOrder.setDisclosedQuantity(0);
            sellPutOrder.setTriggerPrice(0F);
            sellPutOrder.setMarketProtection(-1F);
            sellPutOrder.setIsAmo(false);

            PlaceOrderV3Response sellPutResult = orderApi.placeOrder(sellPutOrder);
            System.out.println("Sell ATM-1 PE order placed. Order ID: " + sellPutResult);

        } catch (ApiException e) {
            System.err.println("API error: " + e.getMessage());
        }
    }
}
