import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.PlaceOrderV3Request;
import com.upstox.api.PlaceOrderV3Response;
import io.swagger.client.api.InstrumentsApi;
import io.swagger.client.api.OrderApiV3;
import java.util.List;
import java.util.Map;

public class PutRatioBackSpread {
    public static void main(String[] args) {
        // Replace with your access token
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("your_access_token_here");

        try {
            InstrumentsApi instrumentsApi = new InstrumentsApi();
            OrderApiV3 orderApi = new OrderApiV3();

            // Step 1: Find the ATM put option (short put)
            List<Map<String, Object>> shortInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "PE", "next_week", 0, null, null).getData();
            Map<String, Object> shortPut = shortInstruments.get(0);
            System.out.println("Short put (ATM)   - Trading symbol : " + shortPut.get("trading_symbol"));
            System.out.println("Short put (ATM)   - Instrument key : " + shortPut.get("instrument_key"));

            // Step 2: Find the ATM-1 put option (long put)
            List<Map<String, Object>> longInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "PE", "next_week", -1, null, null).getData();
            Map<String, Object> longPut = longInstruments.get(0);
            System.out.println("Long put  (ATM-1) - Trading symbol : " + longPut.get("trading_symbol"));
            System.out.println("Long put  (ATM-1) - Instrument key : " + longPut.get("instrument_key"));

            // Step 3: Sell 1x the ATM put
            PlaceOrderV3Request sellOrder = new PlaceOrderV3Request();
            sellOrder.setInstrumentToken((String) shortPut.get("instrument_key"));
            sellOrder.setQuantity(((Double) shortPut.get("lot_size")).intValue());
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
            System.out.println("Sell 1x ATM PE order placed. Order ID: " + sellResult);

            // Step 4: Buy 2x the ATM-1 put
            PlaceOrderV3Request buyOrder = new PlaceOrderV3Request();
            buyOrder.setInstrumentToken((String) longPut.get("instrument_key"));
            buyOrder.setQuantity(((Double) longPut.get("lot_size")).intValue() * 2);
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
            System.out.println("Buy 2x ATM-1 PE order placed. Order ID: " + buyResult);

        } catch (ApiException e) {
            System.err.println("API error: " + e.getMessage());
        }
    }
}
