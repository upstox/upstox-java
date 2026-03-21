import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.PlaceOrderV3Request;
import com.upstox.api.PlaceOrderV3Response;
import io.swagger.client.api.InstrumentsApi;
import io.swagger.client.api.OrderApiV3;
import java.util.List;
import java.util.Map;

public class BearCondor {
    public static void main(String[] args) {
        // Replace with your access token
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("your_access_token_here");

        try {
            InstrumentsApi instrumentsApi = new InstrumentsApi();
            OrderApiV3 orderApi = new OrderApiV3();

            // Step 1: Find all four put option legs
            List<Map<String, Object>> atmInstruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "PE", "next_week", 0, null, null).getData();
            Map<String, Object> atmLeg = atmInstruments.get(0);
            System.out.println("ATM    (offset  0) - Trading symbol : " + atmLeg.get("trading_symbol"));
            System.out.println("ATM    (offset  0) - Instrument key : " + atmLeg.get("instrument_key"));

            List<Map<String, Object>> atm1Instruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "PE", "next_week", -1, null, null).getData();
            Map<String, Object> atm1Leg = atm1Instruments.get(0);
            System.out.println("ATM-1  (offset -1) - Trading symbol : " + atm1Leg.get("trading_symbol"));
            System.out.println("ATM-1  (offset -1) - Instrument key : " + atm1Leg.get("instrument_key"));

            List<Map<String, Object>> atm2Instruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "PE", "next_week", -2, null, null).getData();
            Map<String, Object> atm2Leg = atm2Instruments.get(0);
            System.out.println("ATM-2  (offset -2) - Trading symbol : " + atm2Leg.get("trading_symbol"));
            System.out.println("ATM-2  (offset -2) - Instrument key : " + atm2Leg.get("instrument_key"));

            List<Map<String, Object>> atm3Instruments = (List<Map<String, Object>>)
                instrumentsApi.searchInstrument("Nifty 50", "NSE", "FO", "PE", "next_week", -3, null, null).getData();
            Map<String, Object> atm3Leg = atm3Instruments.get(0);
            System.out.println("ATM-3  (offset -3) - Trading symbol : " + atm3Leg.get("trading_symbol"));
            System.out.println("ATM-3  (offset -3) - Instrument key : " + atm3Leg.get("instrument_key"));

            // Step 2: Buy the ATM put
            PlaceOrderV3Request buyAtmOrder = new PlaceOrderV3Request();
            buyAtmOrder.setInstrumentToken((String) atmLeg.get("instrument_key"));
            buyAtmOrder.setQuantity(((Double) atmLeg.get("lot_size")).intValue());
            buyAtmOrder.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.BUY);
            buyAtmOrder.setOrderType(PlaceOrderV3Request.OrderTypeEnum.MARKET);
            buyAtmOrder.setProduct(PlaceOrderV3Request.ProductEnum.D);
            buyAtmOrder.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
            buyAtmOrder.setPrice(0F);
            buyAtmOrder.setDisclosedQuantity(0);
            buyAtmOrder.setTriggerPrice(0F);
            buyAtmOrder.setMarketProtection(-1F);
            buyAtmOrder.setIsAmo(false);

            PlaceOrderV3Response buyAtmResult = orderApi.placeOrder(buyAtmOrder);
            System.out.println("Buy ATM PE order placed. Order ID: " + buyAtmResult);

            // Step 3: Sell the ATM-1 put
            PlaceOrderV3Request sellAtm1Order = new PlaceOrderV3Request();
            sellAtm1Order.setInstrumentToken((String) atm1Leg.get("instrument_key"));
            sellAtm1Order.setQuantity(((Double) atm1Leg.get("lot_size")).intValue());
            sellAtm1Order.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.SELL);
            sellAtm1Order.setOrderType(PlaceOrderV3Request.OrderTypeEnum.MARKET);
            sellAtm1Order.setProduct(PlaceOrderV3Request.ProductEnum.D);
            sellAtm1Order.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
            sellAtm1Order.setPrice(0F);
            sellAtm1Order.setDisclosedQuantity(0);
            sellAtm1Order.setTriggerPrice(0F);
            sellAtm1Order.setMarketProtection(-1F);
            sellAtm1Order.setIsAmo(false);

            PlaceOrderV3Response sellAtm1Result = orderApi.placeOrder(sellAtm1Order);
            System.out.println("Sell ATM-1 PE order placed. Order ID: " + sellAtm1Result);

            // Step 4: Sell the ATM-2 put
            PlaceOrderV3Request sellAtm2Order = new PlaceOrderV3Request();
            sellAtm2Order.setInstrumentToken((String) atm2Leg.get("instrument_key"));
            sellAtm2Order.setQuantity(((Double) atm2Leg.get("lot_size")).intValue());
            sellAtm2Order.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.SELL);
            sellAtm2Order.setOrderType(PlaceOrderV3Request.OrderTypeEnum.MARKET);
            sellAtm2Order.setProduct(PlaceOrderV3Request.ProductEnum.D);
            sellAtm2Order.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
            sellAtm2Order.setPrice(0F);
            sellAtm2Order.setDisclosedQuantity(0);
            sellAtm2Order.setTriggerPrice(0F);
            sellAtm2Order.setMarketProtection(-1F);
            sellAtm2Order.setIsAmo(false);

            PlaceOrderV3Response sellAtm2Result = orderApi.placeOrder(sellAtm2Order);
            System.out.println("Sell ATM-2 PE order placed. Order ID: " + sellAtm2Result);

            // Step 5: Buy the ATM-3 put
            PlaceOrderV3Request buyAtm3Order = new PlaceOrderV3Request();
            buyAtm3Order.setInstrumentToken((String) atm3Leg.get("instrument_key"));
            buyAtm3Order.setQuantity(((Double) atm3Leg.get("lot_size")).intValue());
            buyAtm3Order.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.BUY);
            buyAtm3Order.setOrderType(PlaceOrderV3Request.OrderTypeEnum.MARKET);
            buyAtm3Order.setProduct(PlaceOrderV3Request.ProductEnum.D);
            buyAtm3Order.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
            buyAtm3Order.setPrice(0F);
            buyAtm3Order.setDisclosedQuantity(0);
            buyAtm3Order.setTriggerPrice(0F);
            buyAtm3Order.setMarketProtection(-1F);
            buyAtm3Order.setIsAmo(false);

            PlaceOrderV3Response buyAtm3Result = orderApi.placeOrder(buyAtm3Order);
            System.out.println("Buy ATM-3 PE order placed. Order ID: " + buyAtm3Result);

        } catch (ApiException e) {
            System.err.println("API error: " + e.getMessage());
        }
    }
}
