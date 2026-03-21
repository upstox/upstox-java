import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.PlaceOrderV3Request;
import com.upstox.api.PlaceOrderV3Response;
import io.swagger.client.api.InstrumentsApi;
import io.swagger.client.api.OrderApiV3;
import java.util.List;
import java.util.Map;

public class Batman {
    public static void main(String[] args) {
        // Replace with your access token
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("your_access_token_here");

        try {
            InstrumentsApi instrumentsApi = new InstrumentsApi();
            OrderApiV3 orderApi = new OrderApiV3();

            // Step 1: Find all six option legs
            List<Map<String, Object>> atmCallInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "CE", "next_week", 0, null, null).getData();
            Map<String, Object> atmCall = atmCallInstruments.get(0);
            System.out.println("ATM call   (CE offset 0)  - Trading symbol : " + atmCall.get("trading_symbol"));
            System.out.println("ATM call   (CE offset 0)  - Instrument key : " + atmCall.get("instrument_key"));

            List<Map<String, Object>> otm1CallInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "CE", "next_week", 1, null, null).getData();
            Map<String, Object> otm1Call = otm1CallInstruments.get(0);
            System.out.println("OTM+1 call (CE offset 1)  - Trading symbol : " + otm1Call.get("trading_symbol"));
            System.out.println("OTM+1 call (CE offset 1)  - Instrument key : " + otm1Call.get("instrument_key"));

            List<Map<String, Object>> otm2CallInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "CE", "next_week", 2, null, null).getData();
            Map<String, Object> otm2Call = otm2CallInstruments.get(0);
            System.out.println("OTM+2 call (CE offset 2)  - Trading symbol : " + otm2Call.get("trading_symbol"));
            System.out.println("OTM+2 call (CE offset 2)  - Instrument key : " + otm2Call.get("instrument_key"));

            List<Map<String, Object>> atmPutInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "PE", "next_week", 0, null, null).getData();
            Map<String, Object> atmPut = atmPutInstruments.get(0);
            System.out.println("ATM put    (PE offset 0)  - Trading symbol : " + atmPut.get("trading_symbol"));
            System.out.println("ATM put    (PE offset 0)  - Instrument key : " + atmPut.get("instrument_key"));

            List<Map<String, Object>> otm1PutInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "PE", "next_week", -1, null, null).getData();
            Map<String, Object> otm1Put = otm1PutInstruments.get(0);
            System.out.println("OTM-1 put  (PE offset -1) - Trading symbol : " + otm1Put.get("trading_symbol"));
            System.out.println("OTM-1 put  (PE offset -1) - Instrument key : " + otm1Put.get("instrument_key"));

            List<Map<String, Object>> otm2PutInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "PE", "next_week", -2, null, null).getData();
            Map<String, Object> otm2Put = otm2PutInstruments.get(0);
            System.out.println("OTM-2 put  (PE offset -2) - Trading symbol : " + otm2Put.get("trading_symbol"));
            System.out.println("OTM-2 put  (PE offset -2) - Instrument key : " + otm2Put.get("instrument_key"));

            // Step 2: Buy ATM call
            PlaceOrderV3Request buyAtmCallOrder = new PlaceOrderV3Request();
            buyAtmCallOrder.setInstrumentToken((String) atmCall.get("instrument_key"));
            buyAtmCallOrder.setQuantity(((Double) atmCall.get("lot_size")).intValue());
            buyAtmCallOrder.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.BUY);
            buyAtmCallOrder.setOrderType(PlaceOrderV3Request.OrderTypeEnum.MARKET);
            buyAtmCallOrder.setProduct(PlaceOrderV3Request.ProductEnum.D);
            buyAtmCallOrder.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
            buyAtmCallOrder.setPrice(0F);
            buyAtmCallOrder.setDisclosedQuantity(0);
            buyAtmCallOrder.setTriggerPrice(0F);
            buyAtmCallOrder.setMarketProtection(-1F);
            buyAtmCallOrder.setIsAmo(false);

            PlaceOrderV3Response buyAtmCallResult = orderApi.placeOrder(buyAtmCallOrder);
            System.out.println("Buy ATM CE order placed. Order ID: " + buyAtmCallResult);

            // Step 3: Sell 2x OTM+1 call
            PlaceOrderV3Request sellOtm1CallOrder = new PlaceOrderV3Request();
            sellOtm1CallOrder.setInstrumentToken((String) otm1Call.get("instrument_key"));
            sellOtm1CallOrder.setQuantity(((Double) otm1Call.get("lot_size")).intValue() * 2);
            sellOtm1CallOrder.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.SELL);
            sellOtm1CallOrder.setOrderType(PlaceOrderV3Request.OrderTypeEnum.MARKET);
            sellOtm1CallOrder.setProduct(PlaceOrderV3Request.ProductEnum.D);
            sellOtm1CallOrder.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
            sellOtm1CallOrder.setPrice(0F);
            sellOtm1CallOrder.setDisclosedQuantity(0);
            sellOtm1CallOrder.setTriggerPrice(0F);
            sellOtm1CallOrder.setMarketProtection(-1F);
            sellOtm1CallOrder.setIsAmo(false);

            PlaceOrderV3Response sellOtm1CallResult = orderApi.placeOrder(sellOtm1CallOrder);
            System.out.println("Sell 2x OTM+1 CE order placed. Order ID: " + sellOtm1CallResult);

            // Step 4: Buy OTM+2 call
            PlaceOrderV3Request buyOtm2CallOrder = new PlaceOrderV3Request();
            buyOtm2CallOrder.setInstrumentToken((String) otm2Call.get("instrument_key"));
            buyOtm2CallOrder.setQuantity(((Double) otm2Call.get("lot_size")).intValue());
            buyOtm2CallOrder.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.BUY);
            buyOtm2CallOrder.setOrderType(PlaceOrderV3Request.OrderTypeEnum.MARKET);
            buyOtm2CallOrder.setProduct(PlaceOrderV3Request.ProductEnum.D);
            buyOtm2CallOrder.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
            buyOtm2CallOrder.setPrice(0F);
            buyOtm2CallOrder.setDisclosedQuantity(0);
            buyOtm2CallOrder.setTriggerPrice(0F);
            buyOtm2CallOrder.setMarketProtection(-1F);
            buyOtm2CallOrder.setIsAmo(false);

            PlaceOrderV3Response buyOtm2CallResult = orderApi.placeOrder(buyOtm2CallOrder);
            System.out.println("Buy OTM+2 CE order placed. Order ID: " + buyOtm2CallResult);

            // Step 5: Buy ATM put
            PlaceOrderV3Request buyAtmPutOrder = new PlaceOrderV3Request();
            buyAtmPutOrder.setInstrumentToken((String) atmPut.get("instrument_key"));
            buyAtmPutOrder.setQuantity(((Double) atmPut.get("lot_size")).intValue());
            buyAtmPutOrder.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.BUY);
            buyAtmPutOrder.setOrderType(PlaceOrderV3Request.OrderTypeEnum.MARKET);
            buyAtmPutOrder.setProduct(PlaceOrderV3Request.ProductEnum.D);
            buyAtmPutOrder.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
            buyAtmPutOrder.setPrice(0F);
            buyAtmPutOrder.setDisclosedQuantity(0);
            buyAtmPutOrder.setTriggerPrice(0F);
            buyAtmPutOrder.setMarketProtection(-1F);
            buyAtmPutOrder.setIsAmo(false);

            PlaceOrderV3Response buyAtmPutResult = orderApi.placeOrder(buyAtmPutOrder);
            System.out.println("Buy ATM PE order placed. Order ID: " + buyAtmPutResult);

            // Step 6: Sell 2x OTM-1 put
            PlaceOrderV3Request sellOtm1PutOrder = new PlaceOrderV3Request();
            sellOtm1PutOrder.setInstrumentToken((String) otm1Put.get("instrument_key"));
            sellOtm1PutOrder.setQuantity(((Double) otm1Put.get("lot_size")).intValue() * 2);
            sellOtm1PutOrder.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.SELL);
            sellOtm1PutOrder.setOrderType(PlaceOrderV3Request.OrderTypeEnum.MARKET);
            sellOtm1PutOrder.setProduct(PlaceOrderV3Request.ProductEnum.D);
            sellOtm1PutOrder.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
            sellOtm1PutOrder.setPrice(0F);
            sellOtm1PutOrder.setDisclosedQuantity(0);
            sellOtm1PutOrder.setTriggerPrice(0F);
            sellOtm1PutOrder.setMarketProtection(-1F);
            sellOtm1PutOrder.setIsAmo(false);

            PlaceOrderV3Response sellOtm1PutResult = orderApi.placeOrder(sellOtm1PutOrder);
            System.out.println("Sell 2x OTM-1 PE order placed. Order ID: " + sellOtm1PutResult);

            // Step 7: Buy OTM-2 put
            PlaceOrderV3Request buyOtm2PutOrder = new PlaceOrderV3Request();
            buyOtm2PutOrder.setInstrumentToken((String) otm2Put.get("instrument_key"));
            buyOtm2PutOrder.setQuantity(((Double) otm2Put.get("lot_size")).intValue());
            buyOtm2PutOrder.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.BUY);
            buyOtm2PutOrder.setOrderType(PlaceOrderV3Request.OrderTypeEnum.MARKET);
            buyOtm2PutOrder.setProduct(PlaceOrderV3Request.ProductEnum.D);
            buyOtm2PutOrder.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
            buyOtm2PutOrder.setPrice(0F);
            buyOtm2PutOrder.setDisclosedQuantity(0);
            buyOtm2PutOrder.setTriggerPrice(0F);
            buyOtm2PutOrder.setMarketProtection(-1F);
            buyOtm2PutOrder.setIsAmo(false);

            PlaceOrderV3Response buyOtm2PutResult = orderApi.placeOrder(buyOtm2PutOrder);
            System.out.println("Buy OTM-2 PE order placed. Order ID: " + buyOtm2PutResult);

        } catch (ApiException e) {
            System.err.println("API error: " + e.getMessage());
        }
    }
}
