import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.PlaceOrderV3Request;
import com.upstox.api.PlaceOrderV3Response;
import io.swagger.client.api.InstrumentsApi;
import io.swagger.client.api.OrderApiV3;
import java.util.List;
import java.util.Map;

public class BullButterfly {
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
            System.out.println("Lower long  (ATM)    - Trading symbol : " + lowerLong.get("trading_symbol"));
            System.out.println("Lower long  (ATM)    - Instrument key : " + lowerLong.get("instrument_key"));

            // Step 2: Find the ATM+1 call option (middle short)
            List<Map<String, Object>> middleInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "CE", "next_week", 1, null, null).getData();
            Map<String, Object> middleShort = middleInstruments.get(0);
            System.out.println("Middle short (ATM+1) - Trading symbol : " + middleShort.get("trading_symbol"));
            System.out.println("Middle short (ATM+1) - Instrument key : " + middleShort.get("instrument_key"));

            // Step 3: Find the ATM+2 call option (upper long)
            List<Map<String, Object>> upperInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "CE", "next_week", 2, null, null).getData();
            Map<String, Object> upperLong = upperInstruments.get(0);
            System.out.println("Upper long  (ATM+2)  - Trading symbol : " + upperLong.get("trading_symbol"));
            System.out.println("Upper long  (ATM+2)  - Instrument key : " + upperLong.get("instrument_key"));

            // Step 4: Buy the ATM call (lower long)
            PlaceOrderV3Request buyLowerOrder = new PlaceOrderV3Request();
            buyLowerOrder.setInstrumentToken((String) lowerLong.get("instrument_key"));
            buyLowerOrder.setQuantity(((Double) lowerLong.get("lot_size")).intValue());
            buyLowerOrder.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.BUY);
            buyLowerOrder.setOrderType(PlaceOrderV3Request.OrderTypeEnum.MARKET);
            buyLowerOrder.setProduct(PlaceOrderV3Request.ProductEnum.D);
            buyLowerOrder.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
            buyLowerOrder.setPrice(0F);
            buyLowerOrder.setDisclosedQuantity(0);
            buyLowerOrder.setTriggerPrice(0F);
            buyLowerOrder.setMarketProtection(-1F);
            buyLowerOrder.setIsAmo(false);

            PlaceOrderV3Response buyLowerResult = orderApi.placeOrder(buyLowerOrder);
            System.out.println("Buy ATM CE order placed. Order ID: " + buyLowerResult);

            // Step 5: Sell 2x the ATM+1 call (middle short)
            PlaceOrderV3Request sellMiddleOrder = new PlaceOrderV3Request();
            sellMiddleOrder.setInstrumentToken((String) middleShort.get("instrument_key"));
            sellMiddleOrder.setQuantity(((Double) middleShort.get("lot_size")).intValue() * 2);
            sellMiddleOrder.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.SELL);
            sellMiddleOrder.setOrderType(PlaceOrderV3Request.OrderTypeEnum.MARKET);
            sellMiddleOrder.setProduct(PlaceOrderV3Request.ProductEnum.D);
            sellMiddleOrder.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
            sellMiddleOrder.setPrice(0F);
            sellMiddleOrder.setDisclosedQuantity(0);
            sellMiddleOrder.setTriggerPrice(0F);
            sellMiddleOrder.setMarketProtection(-1F);
            sellMiddleOrder.setIsAmo(false);

            PlaceOrderV3Response sellMiddleResult = orderApi.placeOrder(sellMiddleOrder);
            System.out.println("Sell 2x ATM+1 CE order placed. Order ID: " + sellMiddleResult);

            // Step 6: Buy the ATM+2 call (upper long)
            PlaceOrderV3Request buyUpperOrder = new PlaceOrderV3Request();
            buyUpperOrder.setInstrumentToken((String) upperLong.get("instrument_key"));
            buyUpperOrder.setQuantity(((Double) upperLong.get("lot_size")).intValue());
            buyUpperOrder.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.BUY);
            buyUpperOrder.setOrderType(PlaceOrderV3Request.OrderTypeEnum.MARKET);
            buyUpperOrder.setProduct(PlaceOrderV3Request.ProductEnum.D);
            buyUpperOrder.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
            buyUpperOrder.setPrice(0F);
            buyUpperOrder.setDisclosedQuantity(0);
            buyUpperOrder.setTriggerPrice(0F);
            buyUpperOrder.setMarketProtection(-1F);
            buyUpperOrder.setIsAmo(false);

            PlaceOrderV3Response buyUpperResult = orderApi.placeOrder(buyUpperOrder);
            System.out.println("Buy ATM+2 CE order placed. Order ID: " + buyUpperResult);

        } catch (ApiException e) {
            System.err.println("API error: " + e.getMessage());
        }
    }
}
