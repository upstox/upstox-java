/*
 * Upstox Developer API
 * Build your App on the Upstox platform  ![Banner](https://api-v2.upstox.com/api-docs/images/banner.jpg \"banner\")  # Introduction  Upstox API is a set of rest APIs that provide data required to build a complete investment and trading platform. Execute orders in real time, manage user portfolio, stream live market data (using Websocket), and more, with the easy to understand API collection.  All requests are over HTTPS and the requests are sent with the content-type ‘application/json’. Developers have the option of choosing the response type as JSON or CSV for a few API calls.  To be able to use these APIs you need to create an App in the Developer Console and generate your **apiKey** and **apiSecret**. You can use a redirect URL which will be called after the login flow.  If you are a **trader**, you can directly create apps from Upstox mobile app or the desktop platform itself from **Apps** sections inside the **Account** Tab. Head over to <a href=\"http://account.upstox.com/developer/apps\" target=\"_blank\">account.upstox.com/developer/apps</a>.</br> If you are a **business** looking to integrate Upstox APIs, reach out to us and we will get a custom app created for you in no time.  It is highly recommended that you do not embed the **apiSecret** in your frontend app. Create a remote backend which does the handshake on behalf of the frontend app. Marking the apiSecret in the frontend app will make your app vulnerable to threats and potential issues. 
 *
 * OpenAPI spec version: v2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import com.upstox.ApiCallback;
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.ApiResponse;
import com.upstox.Configuration;
import com.upstox.Pair;
import com.upstox.ProgressRequestBody;
import com.upstox.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.upstox.api.ApiGatewayErrorResponse;
import com.upstox.api.GetHistoricalCandleResponse;
import com.upstox.api.GetIntraDayCandleResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HistoryApi {
    private ApiClient apiClient;

    public HistoryApi() {
        this(Configuration.getDefaultApiClient());
    }

    public HistoryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getHistoricalCandleData
     * @param instrumentKey  (required)
     * @param interval  (required)
     * @param toDate  (required)
     * @param apiVersion API Version Header (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getHistoricalCandleDataCall(String instrumentKey, String interval, String toDate, String apiVersion, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v2/historical-candle/{instrumentKey}/{interval}/{to_date}"
            .replaceAll("\\{" + "instrumentKey" + "\\}", apiClient.escapeString(instrumentKey.toString()))
            .replaceAll("\\{" + "interval" + "\\}", apiClient.escapeString(interval.toString()))
            .replaceAll("\\{" + "to_date" + "\\}", apiClient.escapeString(toDate.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiVersion != null)
        localVarHeaderParams.put("Api-Version", apiClient.parameterToString(apiVersion));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getHistoricalCandleDataValidateBeforeCall(String instrumentKey, String interval, String toDate, String apiVersion, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'instrumentKey' is set
        if (instrumentKey == null) {
            throw new ApiException("Missing the required parameter 'instrumentKey' when calling getHistoricalCandleData(Async)");
        }
        // verify the required parameter 'interval' is set
        if (interval == null) {
            throw new ApiException("Missing the required parameter 'interval' when calling getHistoricalCandleData(Async)");
        }
        // verify the required parameter 'toDate' is set
        if (toDate == null) {
            throw new ApiException("Missing the required parameter 'toDate' when calling getHistoricalCandleData(Async)");
        }
        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException("Missing the required parameter 'apiVersion' when calling getHistoricalCandleData(Async)");
        }
        
        com.squareup.okhttp.Call call = getHistoricalCandleDataCall(instrumentKey, interval, toDate, apiVersion, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Historical candle data
     * Get OHLC values for all instruments across various timeframes. Historical data can be fetched for the following durations. 1minute: last 1 month candles till endDate 30minute: last 1 year candles till endDate day: last 1 year candles till endDate week: last 10 year candles till endDate month: last 10 year candles till endDate
     * @param instrumentKey  (required)
     * @param interval  (required)
     * @param toDate  (required)
     * @param apiVersion API Version Header (required)
     * @return GetHistoricalCandleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetHistoricalCandleResponse getHistoricalCandleData(String instrumentKey, String interval, String toDate, String apiVersion) throws ApiException {
        ApiResponse<GetHistoricalCandleResponse> resp = getHistoricalCandleDataWithHttpInfo(instrumentKey, interval, toDate, apiVersion);
        return resp.getData();
    }

    /**
     * Historical candle data
     * Get OHLC values for all instruments across various timeframes. Historical data can be fetched for the following durations. 1minute: last 1 month candles till endDate 30minute: last 1 year candles till endDate day: last 1 year candles till endDate week: last 10 year candles till endDate month: last 10 year candles till endDate
     * @param instrumentKey  (required)
     * @param interval  (required)
     * @param toDate  (required)
     * @param apiVersion API Version Header (required)
     * @return ApiResponse&lt;GetHistoricalCandleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetHistoricalCandleResponse> getHistoricalCandleDataWithHttpInfo(String instrumentKey, String interval, String toDate, String apiVersion) throws ApiException {
        com.squareup.okhttp.Call call = getHistoricalCandleDataValidateBeforeCall(instrumentKey, interval, toDate, apiVersion, null, null);
        Type localVarReturnType = new TypeToken<GetHistoricalCandleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Historical candle data (asynchronously)
     * Get OHLC values for all instruments across various timeframes. Historical data can be fetched for the following durations. 1minute: last 1 month candles till endDate 30minute: last 1 year candles till endDate day: last 1 year candles till endDate week: last 10 year candles till endDate month: last 10 year candles till endDate
     * @param instrumentKey  (required)
     * @param interval  (required)
     * @param toDate  (required)
     * @param apiVersion API Version Header (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getHistoricalCandleDataAsync(String instrumentKey, String interval, String toDate, String apiVersion, final ApiCallback<GetHistoricalCandleResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getHistoricalCandleDataValidateBeforeCall(instrumentKey, interval, toDate, apiVersion, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetHistoricalCandleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getHistoricalCandleData1
     * @param instrumentKey  (required)
     * @param interval  (required)
     * @param toDate  (required)
     * @param fromDate  (required)
     * @param apiVersion API Version Header (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getHistoricalCandleData1Call(String instrumentKey, String interval, String toDate, String fromDate, String apiVersion, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v2/historical-candle/{instrumentKey}/{interval}/{to_date}/{from_date}"
            .replaceAll("\\{" + "instrumentKey" + "\\}", apiClient.escapeString(instrumentKey.toString()))
            .replaceAll("\\{" + "interval" + "\\}", apiClient.escapeString(interval.toString()))
            .replaceAll("\\{" + "to_date" + "\\}", apiClient.escapeString(toDate.toString()))
            .replaceAll("\\{" + "from_date" + "\\}", apiClient.escapeString(fromDate.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiVersion != null)
        localVarHeaderParams.put("Api-Version", apiClient.parameterToString(apiVersion));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getHistoricalCandleData1ValidateBeforeCall(String instrumentKey, String interval, String toDate, String fromDate, String apiVersion, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'instrumentKey' is set
        if (instrumentKey == null) {
            throw new ApiException("Missing the required parameter 'instrumentKey' when calling getHistoricalCandleData1(Async)");
        }
        // verify the required parameter 'interval' is set
        if (interval == null) {
            throw new ApiException("Missing the required parameter 'interval' when calling getHistoricalCandleData1(Async)");
        }
        // verify the required parameter 'toDate' is set
        if (toDate == null) {
            throw new ApiException("Missing the required parameter 'toDate' when calling getHistoricalCandleData1(Async)");
        }
        // verify the required parameter 'fromDate' is set
        if (fromDate == null) {
            throw new ApiException("Missing the required parameter 'fromDate' when calling getHistoricalCandleData1(Async)");
        }
        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException("Missing the required parameter 'apiVersion' when calling getHistoricalCandleData1(Async)");
        }
        
        com.squareup.okhttp.Call call = getHistoricalCandleData1Call(instrumentKey, interval, toDate, fromDate, apiVersion, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Historical candle data
     * Get OHLC values for all instruments across various timeframes. Historical data can be fetched for the following durations. 1minute: last 1 month candles till endDate 30minute: last 1 year candles till endDate day: last 1 year candles till endDate week: last 10 year candles till endDate month: last 10 year candles till endDate
     * @param instrumentKey  (required)
     * @param interval  (required)
     * @param toDate  (required)
     * @param fromDate  (required)
     * @param apiVersion API Version Header (required)
     * @return GetHistoricalCandleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetHistoricalCandleResponse getHistoricalCandleData1(String instrumentKey, String interval, String toDate, String fromDate, String apiVersion) throws ApiException {
        ApiResponse<GetHistoricalCandleResponse> resp = getHistoricalCandleData1WithHttpInfo(instrumentKey, interval, toDate, fromDate, apiVersion);
        return resp.getData();
    }

    /**
     * Historical candle data
     * Get OHLC values for all instruments across various timeframes. Historical data can be fetched for the following durations. 1minute: last 1 month candles till endDate 30minute: last 1 year candles till endDate day: last 1 year candles till endDate week: last 10 year candles till endDate month: last 10 year candles till endDate
     * @param instrumentKey  (required)
     * @param interval  (required)
     * @param toDate  (required)
     * @param fromDate  (required)
     * @param apiVersion API Version Header (required)
     * @return ApiResponse&lt;GetHistoricalCandleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetHistoricalCandleResponse> getHistoricalCandleData1WithHttpInfo(String instrumentKey, String interval, String toDate, String fromDate, String apiVersion) throws ApiException {
        com.squareup.okhttp.Call call = getHistoricalCandleData1ValidateBeforeCall(instrumentKey, interval, toDate, fromDate, apiVersion, null, null);
        Type localVarReturnType = new TypeToken<GetHistoricalCandleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Historical candle data (asynchronously)
     * Get OHLC values for all instruments across various timeframes. Historical data can be fetched for the following durations. 1minute: last 1 month candles till endDate 30minute: last 1 year candles till endDate day: last 1 year candles till endDate week: last 10 year candles till endDate month: last 10 year candles till endDate
     * @param instrumentKey  (required)
     * @param interval  (required)
     * @param toDate  (required)
     * @param fromDate  (required)
     * @param apiVersion API Version Header (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getHistoricalCandleData1Async(String instrumentKey, String interval, String toDate, String fromDate, String apiVersion, final ApiCallback<GetHistoricalCandleResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getHistoricalCandleData1ValidateBeforeCall(instrumentKey, interval, toDate, fromDate, apiVersion, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetHistoricalCandleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getIntraDayCandleData
     * @param instrumentKey  (required)
     * @param interval  (required)
     * @param apiVersion API Version Header (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getIntraDayCandleDataCall(String instrumentKey, String interval, String apiVersion, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v2/historical-candle/intraday/{instrumentKey}/{interval}"
            .replaceAll("\\{" + "instrumentKey" + "\\}", apiClient.escapeString(instrumentKey.toString()))
            .replaceAll("\\{" + "interval" + "\\}", apiClient.escapeString(interval.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiVersion != null)
        localVarHeaderParams.put("Api-Version", apiClient.parameterToString(apiVersion));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getIntraDayCandleDataValidateBeforeCall(String instrumentKey, String interval, String apiVersion, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'instrumentKey' is set
        if (instrumentKey == null) {
            throw new ApiException("Missing the required parameter 'instrumentKey' when calling getIntraDayCandleData(Async)");
        }
        // verify the required parameter 'interval' is set
        if (interval == null) {
            throw new ApiException("Missing the required parameter 'interval' when calling getIntraDayCandleData(Async)");
        }
        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException("Missing the required parameter 'apiVersion' when calling getIntraDayCandleData(Async)");
        }
        
        com.squareup.okhttp.Call call = getIntraDayCandleDataCall(instrumentKey, interval, apiVersion, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Intra day candle data
     * Get OHLC values for all instruments for the present trading day
     * @param instrumentKey  (required)
     * @param interval  (required)
     * @param apiVersion API Version Header (required)
     * @return GetIntraDayCandleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetIntraDayCandleResponse getIntraDayCandleData(String instrumentKey, String interval, String apiVersion) throws ApiException {
        ApiResponse<GetIntraDayCandleResponse> resp = getIntraDayCandleDataWithHttpInfo(instrumentKey, interval, apiVersion);
        return resp.getData();
    }

    /**
     * Intra day candle data
     * Get OHLC values for all instruments for the present trading day
     * @param instrumentKey  (required)
     * @param interval  (required)
     * @param apiVersion API Version Header (required)
     * @return ApiResponse&lt;GetIntraDayCandleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetIntraDayCandleResponse> getIntraDayCandleDataWithHttpInfo(String instrumentKey, String interval, String apiVersion) throws ApiException {
        com.squareup.okhttp.Call call = getIntraDayCandleDataValidateBeforeCall(instrumentKey, interval, apiVersion, null, null);
        Type localVarReturnType = new TypeToken<GetIntraDayCandleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Intra day candle data (asynchronously)
     * Get OHLC values for all instruments for the present trading day
     * @param instrumentKey  (required)
     * @param interval  (required)
     * @param apiVersion API Version Header (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getIntraDayCandleDataAsync(String instrumentKey, String interval, String apiVersion, final ApiCallback<GetIntraDayCandleResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getIntraDayCandleDataValidateBeforeCall(instrumentKey, interval, apiVersion, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetIntraDayCandleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
