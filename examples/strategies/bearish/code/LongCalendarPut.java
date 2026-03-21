import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.PlaceOrderV3Request;
import com.upstox.api.PlaceOrderV3Response;
import io.swagger.client.api.InstrumentsApi;
import io.swagger.client.api.OrderApiV3;
import java.util.List;
import java.util.Map;

public class LongCalendarPut {
    public static void main(String[] args) {
        // Replace with your access token
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("your_access_token_here");

        try {
            InstrumentsApi instrumentsApi = new InstrumentsApi();
            OrderApiV3 orderApi = new OrderApiV3();

            // Step 1: Find the current-week ATM put (near-term)
            List<Map<String, Object>> nearInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "PE", "current_week", 0, null, null).getData();
            Map<String, Object> nearPut = nearInstruments.get(0);
            System.out.println("Near-term put (current week) - Trading symbol : " + nearPut.get("trading_symbol"));
            System.out.println("Near-term put (current week) - Instrument key : " + nearPut.get("instrument_key"));

            // Step 2: Find the next-week ATM put (far-term)
            List<Map<String, Object>> farInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "PE", "next_week", 0, null, null).getData();
            Map<String, Object> farPut = farInstruments.get(0);
            System.out.println("Far-term put  (next week)    - Trading symbol : " + farPut.get("trading_symbol"));
            System.out.println("Far-term put  (next week)    - Instrument key : " + farPut.get("instrument_key"));

            // Step 3: Sell the near-term (current-week) put
            PlaceOrderV3Request sellOrder = new PlaceOrderV3Request();
            sellOrder.setInstrumentToken((String) nearPut.get("instrument_key"));
            sellOrder.setQuantity(((Double) nearPut.get("lot_size")).intValue());
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
            System.out.println("Sell current-week PE order placed. Order ID: " + sellResult);

            // Step 4: Buy the far-term (next-week) put
            PlaceOrderV3Request buyOrder = new PlaceOrderV3Request();
            buyOrder.setInstrumentToken((String) farPut.get("instrument_key"));
            buyOrder.setQuantity(((Double) farPut.get("lot_size")).intValue());
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
            System.out.println("Buy next-week PE order placed. Order ID: " + buyResult);

        } catch (ApiException e) {
            System.err.println("API error: " + e.getMessage());
        }
    }
}
