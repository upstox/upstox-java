import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.PlaceOrderV3Request;
import com.upstox.api.PlaceOrderV3Response;
import io.swagger.client.api.InstrumentsApi;
import io.swagger.client.api.OrderApiV3;
import java.util.List;
import java.util.Map;

public class LongIronCondor {
    public static void main(String[] args) {
        // Replace with your access token
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("your_access_token_here");

        try {
            InstrumentsApi instrumentsApi = new InstrumentsApi();
            OrderApiV3 orderApi = new OrderApiV3();

            // Step 1: Find the ATM+1 call option (long call)
            List<Map<String, Object>> longCallInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "CE", "next_week", 1, null, null).getData();
            Map<String, Object> longCall = longCallInstruments.get(0);
            System.out.println("Long call  (ATM+1) - Trading symbol : " + longCall.get("trading_symbol"));
            System.out.println("Long call  (ATM+1) - Instrument key : " + longCall.get("instrument_key"));

            // Step 2: Find the ATM-1 put option (long put)
            List<Map<String, Object>> longPutInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "PE", "next_week", -1, null, null).getData();
            Map<String, Object> longPut = longPutInstruments.get(0);
            System.out.println("Long put   (ATM-1) - Trading symbol : " + longPut.get("trading_symbol"));
            System.out.println("Long put   (ATM-1) - Instrument key : " + longPut.get("instrument_key"));

            // Step 3: Find the ATM+2 call option (short call wing)
            List<Map<String, Object>> shortCallInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "CE", "next_week", 2, null, null).getData();
            Map<String, Object> shortCall = shortCallInstruments.get(0);
            System.out.println("Short call (ATM+2) - Trading symbol : " + shortCall.get("trading_symbol"));
            System.out.println("Short call (ATM+2) - Instrument key : " + shortCall.get("instrument_key"));

            // Step 4: Find the ATM-2 put option (short put wing)
            List<Map<String, Object>> shortPutInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "PE", "next_week", -2, null, null).getData();
            Map<String, Object> shortPut = shortPutInstruments.get(0);
            System.out.println("Short put  (ATM-2) - Trading symbol : " + shortPut.get("trading_symbol"));
            System.out.println("Short put  (ATM-2) - Instrument key : " + shortPut.get("instrument_key"));

            // Step 5: Buy the ATM+1 call
            PlaceOrderV3Request buyCallOrder = new PlaceOrderV3Request();
            buyCallOrder.setInstrumentToken((String) longCall.get("instrument_key"));
            buyCallOrder.setQuantity(((Double) longCall.get("lot_size")).intValue());
            buyCallOrder.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.BUY);
            buyCallOrder.setOrderType(PlaceOrderV3Request.OrderTypeEnum.MARKET);
            buyCallOrder.setProduct(PlaceOrderV3Request.ProductEnum.D);
            buyCallOrder.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
            buyCallOrder.setPrice(0F);
            buyCallOrder.setDisclosedQuantity(0);
            buyCallOrder.setTriggerPrice(0F);
            buyCallOrder.setMarketProtection(-1F);
            buyCallOrder.setIsAmo(false);

            PlaceOrderV3Response buyCallResult = orderApi.placeOrder(buyCallOrder);
            System.out.println("Buy ATM+1 CE order placed. Order ID: " + buyCallResult);

            // Step 6: Buy the ATM-1 put
            PlaceOrderV3Request buyPutOrder = new PlaceOrderV3Request();
            buyPutOrder.setInstrumentToken((String) longPut.get("instrument_key"));
            buyPutOrder.setQuantity(((Double) longPut.get("lot_size")).intValue());
            buyPutOrder.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.BUY);
            buyPutOrder.setOrderType(PlaceOrderV3Request.OrderTypeEnum.MARKET);
            buyPutOrder.setProduct(PlaceOrderV3Request.ProductEnum.D);
            buyPutOrder.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
            buyPutOrder.setPrice(0F);
            buyPutOrder.setDisclosedQuantity(0);
            buyPutOrder.setTriggerPrice(0F);
            buyPutOrder.setMarketProtection(-1F);
            buyPutOrder.setIsAmo(false);

            PlaceOrderV3Response buyPutResult = orderApi.placeOrder(buyPutOrder);
            System.out.println("Buy ATM-1 PE order placed. Order ID: " + buyPutResult);

            // Step 7: Sell the ATM+2 call (wing)
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
            System.out.println("Sell ATM+2 CE order placed. Order ID: " + sellCallResult);

            // Step 8: Sell the ATM-2 put (wing)
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
            System.out.println("Sell ATM-2 PE order placed. Order ID: " + sellPutResult);

        } catch (ApiException e) {
            System.err.println("API error: " + e.getMessage());
        }
    }
}
