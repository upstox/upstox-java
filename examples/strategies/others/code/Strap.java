import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.PlaceOrderV3Request;
import com.upstox.api.PlaceOrderV3Response;
import io.swagger.client.api.InstrumentsApi;
import io.swagger.client.api.OrderApiV3;
import java.util.List;
import java.util.Map;

public class Strap {
    public static void main(String[] args) {
        // Replace with your access token
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("your_access_token_here");

        try {
            InstrumentsApi instrumentsApi = new InstrumentsApi();
            OrderApiV3 orderApi = new OrderApiV3();

            // Step 1: Find the ATM call option (long call x2)
            List<Map<String, Object>> callInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "CE", "next_week", 0, null, null).getData();
            Map<String, Object> longCall = callInstruments.get(0);
            System.out.println("Long call - Trading symbol : " + longCall.get("trading_symbol"));
            System.out.println("Long call - Instrument key : " + longCall.get("instrument_key"));

            // Step 2: Find the ATM put option (long put)
            List<Map<String, Object>> putInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "PE", "next_week", 0, null, null).getData();
            Map<String, Object> longPut = putInstruments.get(0);
            System.out.println("Long put  - Trading symbol : " + longPut.get("trading_symbol"));
            System.out.println("Long put  - Instrument key : " + longPut.get("instrument_key"));

            // Step 3: Buy 2x the ATM call
            PlaceOrderV3Request buyCallOrder = new PlaceOrderV3Request();
            buyCallOrder.setInstrumentToken((String) longCall.get("instrument_key"));
            buyCallOrder.setQuantity(((Double) longCall.get("lot_size")).intValue() * 2);
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
            System.out.println("Buy 2x ATM CE order placed. Order ID: " + buyCallResult);

            // Step 4: Buy 1x the ATM put
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
            System.out.println("Buy 1x ATM PE order placed. Order ID: " + buyPutResult);

        } catch (ApiException e) {
            System.err.println("API error: " + e.getMessage());
        }
    }
}
