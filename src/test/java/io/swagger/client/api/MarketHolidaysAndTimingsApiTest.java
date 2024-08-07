/*
 * OpenAPI definition
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import com.upstox.api.ApiGatewayErrorResponse;
import com.upstox.api.GetExchangeTimingResponse;
import com.upstox.api.GetHolidayResponse;
import com.upstox.api.GetMarketStatusResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for MarketHolidaysAndTimingsApi
 */
@Ignore
public class MarketHolidaysAndTimingsApiTest {

    private final MarketHolidaysAndTimingsApi api = new MarketHolidaysAndTimingsApi();

    /**
     * Get Exchange Timings on particular date
     *
     * This API provides the functionality to retrieve the exchange timings on particular date
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getExchangeTimingsTest() throws Exception {
        String date = null;
        GetExchangeTimingResponse response = api.getExchangeTimings(date);

        // TODO: test validations
    }
    /**
     * Get Holiday on particular date
     *
     * This API provides the functionality to retrieve the holiday on particular date
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getHolidayTest() throws Exception {
        String date = null;
        GetHolidayResponse response = api.getHoliday(date);

        // TODO: test validations
    }
    /**
     * Get Holiday list of current year
     *
     * This API provides the functionality to retrieve the holiday list of current year
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getHolidaysTest() throws Exception {
        GetHolidayResponse response = api.getHolidays();

        // TODO: test validations
    }
    /**
     * Get Market status for particular exchange
     *
     * This API provides the functionality to retrieve the market status for particular exchange
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMarketStatusTest() throws Exception {
        String exchange = null;
        GetMarketStatusResponse response = api.getMarketStatus(exchange);
        System.out.println(response);
        // TODO: test validations
    }
}
