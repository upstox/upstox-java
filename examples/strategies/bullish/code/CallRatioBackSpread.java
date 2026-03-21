import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.PlaceOrderV3Request;
import com.upstox.api.PlaceOrderV3Response;
import io.swagger.client.api.InstrumentsApi;
import io.swagger.client.api.OrderApiV3;
import java.util.List;
import java.util.Map;

public class CallRatioBackSpread {
    public static void main(String[] args) {
        // Replace with your access token
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("your_access_token_here");

        try {
            InstrumentsApi instrumentsApi = new InstrumentsApi();
            OrderApiV3 orderApi = new OrderApiV3();

            // Step 1: Find the ATM call option (short call)
            List<Map<String, Object>> shortInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "CE", "next_week", 0, null, null).getData();
            Map<String, Object> shortCall = shortInstruments.get(0);
            System.out.println("Short call (ATM)   - Trading symbol : " + shortCall.get("trading_symbol"));
            System.out.println("Short call (ATM)   - Instrument key : " + shortCall.get("instrument_key"));

            // Step 2: Find the ATM+1 call option (long call)
            List<Map<String, Object>> longInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "CE", "next_week", 1, null, null).getData();
            Map<String, Object> longCall = longInstruments.get(0);
            System.out.println("Long call  (ATM+1) - Trading symbol : " + longCall.get("trading_symbol"));
            System.out.println("Long call  (ATM+1) - Instrument key : " + longCall.get("instrument_key"));

            // Step 3: Sell 1x the ATM call
            PlaceOrderV3Request sellOrder = new PlaceOrderV3Request();
            sellOrder.setInstrumentToken((String) shortCall.get("instrument_key"));
            sellOrder.setQuantity(((Double) shortCall.get("lot_size")).intValue());
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
            System.out.println("Sell 1x ATM CE order placed. Order ID: " + sellResult);

            // Step 4: Buy 2x the ATM+1 call
            PlaceOrderV3Request buyOrder = new PlaceOrderV3Request();
            buyOrder.setInstrumentToken((String) longCall.get("instrument_key"));
            buyOrder.setQuantity(((Double) longCall.get("lot_size")).intValue() * 2);
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
            System.out.println("Buy 2x ATM+1 CE order placed. Order ID: " + buyResult);

        } catch (ApiException e) {
            System.err.println("API error: " + e.getMessage());
        }
    }
}
