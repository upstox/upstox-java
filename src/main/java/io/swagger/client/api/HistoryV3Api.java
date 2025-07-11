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

public class HistoryV3Api {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public HistoryV3Api() {
        this(Configuration.getDefaultApiClient());
    }

    public HistoryV3Api(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void setHeadersOverrides(Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * Build call for getHistoricalCandleData
     * @param instrumentKey  (required)
     * @param unit  (required)
     * @param interval  (required)
     * @param toDate  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getHistoricalCandleDataCall(String instrumentKey, String unit, Integer interval, String toDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v3/historical-candle/{instrumentKey}/{unit}/{interval}/{to_date}"
            .replaceAll("\\{" + "instrumentKey" + "\\}", apiClient.escapeString(instrumentKey.toString()))
            .replaceAll("\\{" + "unit" + "\\}", apiClient.escapeString(unit.toString()))
            .replaceAll("\\{" + "interval" + "\\}", apiClient.escapeString(interval.toString()))
            .replaceAll("\\{" + "to_date" + "\\}", apiClient.escapeString(toDate.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*", "application/json"
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
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getHistoricalCandleDataValidateBeforeCall(String instrumentKey, String unit, Integer interval, String toDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'instrumentKey' is set
        if (instrumentKey == null) {
            throw new ApiException("Missing the required parameter 'instrumentKey' when calling getHistoricalCandleData(Async)");
        }
        // verify the required parameter 'unit' is set
        if (unit == null) {
            throw new ApiException("Missing the required parameter 'unit' when calling getHistoricalCandleData(Async)");
        }
        // verify the required parameter 'interval' is set
        if (interval == null) {
            throw new ApiException("Missing the required parameter 'interval' when calling getHistoricalCandleData(Async)");
        }
        // verify the required parameter 'toDate' is set
        if (toDate == null) {
            throw new ApiException("Missing the required parameter 'toDate' when calling getHistoricalCandleData(Async)");
        }
        
        com.squareup.okhttp.Call call = getHistoricalCandleDataCall(instrumentKey, unit, interval, toDate, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Historical candle data
     * Get OHLC values for all instruments for the present trading day with expanded interval options.
     * @param instrumentKey  (required)
     * @param unit  (required)
     * @param interval  (required)
     * @param toDate  (required)
     * @return GetHistoricalCandleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetHistoricalCandleResponse getHistoricalCandleData(String instrumentKey, String unit, Integer interval, String toDate) throws ApiException {
        ApiResponse<GetHistoricalCandleResponse> resp = getHistoricalCandleDataWithHttpInfo(instrumentKey, unit, interval, toDate);
        return resp.getData();
    }

    /**
     * Historical candle data
     * Get OHLC values for all instruments for the present trading day with expanded interval options.
     * @param instrumentKey  (required)
     * @param unit  (required)
     * @param interval  (required)
     * @param toDate  (required)
     * @return ApiResponse&lt;GetHistoricalCandleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetHistoricalCandleResponse> getHistoricalCandleDataWithHttpInfo(String instrumentKey, String unit, Integer interval, String toDate) throws ApiException {
        com.squareup.okhttp.Call call = getHistoricalCandleDataValidateBeforeCall(instrumentKey, unit, interval, toDate, null, null);
        Type localVarReturnType = new TypeToken<GetHistoricalCandleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Historical candle data (asynchronously)
     * Get OHLC values for all instruments for the present trading day with expanded interval options.
     * @param instrumentKey  (required)
     * @param unit  (required)
     * @param interval  (required)
     * @param toDate  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getHistoricalCandleDataAsync(String instrumentKey, String unit, Integer interval, String toDate, final ApiCallback<GetHistoricalCandleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getHistoricalCandleDataValidateBeforeCall(instrumentKey, unit, interval, toDate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetHistoricalCandleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getHistoricalCandleData1
     * @param instrumentKey  (required)
     * @param unit  (required)
     * @param interval  (required)
     * @param toDate  (required)
     * @param fromDate  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getHistoricalCandleData1Call(String instrumentKey, String unit, Integer interval, String toDate, String fromDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v3/historical-candle/{instrumentKey}/{unit}/{interval}/{to_date}/{from_date}"
            .replaceAll("\\{" + "instrumentKey" + "\\}", apiClient.escapeString(instrumentKey.toString()))
            .replaceAll("\\{" + "unit" + "\\}", apiClient.escapeString(unit.toString()))
            .replaceAll("\\{" + "interval" + "\\}", apiClient.escapeString(interval.toString()))
            .replaceAll("\\{" + "to_date" + "\\}", apiClient.escapeString(toDate.toString()))
            .replaceAll("\\{" + "from_date" + "\\}", apiClient.escapeString(fromDate.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*", "application/json"
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
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getHistoricalCandleData1ValidateBeforeCall(String instrumentKey, String unit, Integer interval, String toDate, String fromDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'instrumentKey' is set
        if (instrumentKey == null) {
            throw new ApiException("Missing the required parameter 'instrumentKey' when calling getHistoricalCandleData1(Async)");
        }
        // verify the required parameter 'unit' is set
        if (unit == null) {
            throw new ApiException("Missing the required parameter 'unit' when calling getHistoricalCandleData1(Async)");
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
        
        com.squareup.okhttp.Call call = getHistoricalCandleData1Call(instrumentKey, unit, interval, toDate, fromDate, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Historical candle data
     * Get OHLC values for all instruments for the present trading day with expanded interval options
     * @param instrumentKey  (required)
     * @param unit  (required)
     * @param interval  (required)
     * @param toDate  (required)
     * @param fromDate  (required)
     * @return GetHistoricalCandleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetHistoricalCandleResponse getHistoricalCandleData1(String instrumentKey, String unit, Integer interval, String toDate, String fromDate) throws ApiException {
        ApiResponse<GetHistoricalCandleResponse> resp = getHistoricalCandleData1WithHttpInfo(instrumentKey, unit, interval, toDate, fromDate);
        return resp.getData();
    }

    /**
     * Historical candle data
     * Get OHLC values for all instruments for the present trading day with expanded interval options
     * @param instrumentKey  (required)
     * @param unit  (required)
     * @param interval  (required)
     * @param toDate  (required)
     * @param fromDate  (required)
     * @return ApiResponse&lt;GetHistoricalCandleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetHistoricalCandleResponse> getHistoricalCandleData1WithHttpInfo(String instrumentKey, String unit, Integer interval, String toDate, String fromDate) throws ApiException {
        com.squareup.okhttp.Call call = getHistoricalCandleData1ValidateBeforeCall(instrumentKey, unit, interval, toDate, fromDate, null, null);
        Type localVarReturnType = new TypeToken<GetHistoricalCandleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Historical candle data (asynchronously)
     * Get OHLC values for all instruments for the present trading day with expanded interval options
     * @param instrumentKey  (required)
     * @param unit  (required)
     * @param interval  (required)
     * @param toDate  (required)
     * @param fromDate  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getHistoricalCandleData1Async(String instrumentKey, String unit, Integer interval, String toDate, String fromDate, final ApiCallback<GetHistoricalCandleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getHistoricalCandleData1ValidateBeforeCall(instrumentKey, unit, interval, toDate, fromDate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetHistoricalCandleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getIntraDayCandleData
     * @param instrumentKey  (required)
     * @param unit  (required)
     * @param interval  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getIntraDayCandleDataCall(String instrumentKey, String unit, Integer interval, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v3/historical-candle/intraday/{instrumentKey}/{unit}/{interval}"
            .replaceAll("\\{" + "instrumentKey" + "\\}", apiClient.escapeString(instrumentKey.toString()))
            .replaceAll("\\{" + "unit" + "\\}", apiClient.escapeString(unit.toString()))
            .replaceAll("\\{" + "interval" + "\\}", apiClient.escapeString(interval.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*", "application/json"
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
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getIntraDayCandleDataValidateBeforeCall(String instrumentKey, String unit, Integer interval, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'instrumentKey' is set
        if (instrumentKey == null) {
            throw new ApiException("Missing the required parameter 'instrumentKey' when calling getIntraDayCandleData(Async)");
        }
        // verify the required parameter 'unit' is set
        if (unit == null) {
            throw new ApiException("Missing the required parameter 'unit' when calling getIntraDayCandleData(Async)");
        }
        // verify the required parameter 'interval' is set
        if (interval == null) {
            throw new ApiException("Missing the required parameter 'interval' when calling getIntraDayCandleData(Async)");
        }
        
        com.squareup.okhttp.Call call = getIntraDayCandleDataCall(instrumentKey, unit, interval, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Intra day candle data
     * Get OHLC values for all instruments for the present trading day
     * @param instrumentKey  (required)
     * @param unit  (required)
     * @param interval  (required)
     * @return GetIntraDayCandleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetIntraDayCandleResponse getIntraDayCandleData(String instrumentKey, String unit, Integer interval) throws ApiException {
        ApiResponse<GetIntraDayCandleResponse> resp = getIntraDayCandleDataWithHttpInfo(instrumentKey, unit, interval);
        return resp.getData();
    }

    /**
     * Intra day candle data
     * Get OHLC values for all instruments for the present trading day
     * @param instrumentKey  (required)
     * @param unit  (required)
     * @param interval  (required)
     * @return ApiResponse&lt;GetIntraDayCandleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetIntraDayCandleResponse> getIntraDayCandleDataWithHttpInfo(String instrumentKey, String unit, Integer interval) throws ApiException {
        com.squareup.okhttp.Call call = getIntraDayCandleDataValidateBeforeCall(instrumentKey, unit, interval, null, null);
        Type localVarReturnType = new TypeToken<GetIntraDayCandleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Intra day candle data (asynchronously)
     * Get OHLC values for all instruments for the present trading day
     * @param instrumentKey  (required)
     * @param unit  (required)
     * @param interval  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getIntraDayCandleDataAsync(String instrumentKey, String unit, Integer interval, final ApiCallback<GetIntraDayCandleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getIntraDayCandleDataValidateBeforeCall(instrumentKey, unit, interval, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetIntraDayCandleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
