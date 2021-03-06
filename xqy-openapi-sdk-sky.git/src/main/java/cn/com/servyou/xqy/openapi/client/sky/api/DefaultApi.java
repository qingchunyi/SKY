/**
 * 小企业财税开放平台API Gateway 后端服务RestApi标准文档说明
 * http://www.17dz.com
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.com.servyou.xqy.openapi.client.sky.api;

import cn.com.servyou.xqy.openapi.client.sky.*;
import cn.com.servyou.xqy.openapi.client.sky.model.ApiResponseobject;
import cn.com.servyou.xqy.openapi.client.sky.utils.SdkConstant;
import cn.com.servyou.xqy.openapi.client.sky.utils.sign.SignUtils;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {

    /** API请求客户端  */
    private ApiClient apiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 检查请求参数
     *
     * @param companyTaxPayerId
     * @param customerTaxPayerId
     * @param period
     * @throws ApiException
     */
    private void checkRequestParam(String companyTaxPayerId, String customerTaxPayerId,
                                   String period) throws ApiException {

        // verify the required parameter 'companyTaxPayerId' is set
        if (companyTaxPayerId == null) {
            throw new ApiException(
                "Missing the required parameter 'companyTaxPayerId' when calling getAssetsDebtSheetUsingGET(Async)");
        }

        // verify the required parameter 'customerTaxPayerId' is set
        if (customerTaxPayerId == null) {
            throw new ApiException(
                "Missing the required parameter 'customerTaxPayerId' when calling getAssetsDebtSheetUsingGET(Async)");
        }

        // verify the required parameter 'period' is set
        if (period == null) {
            throw new ApiException(
                "Missing the required parameter 'period' when calling getAssetsDebtSheetUsingGET(Async)");
        }

    }

    private String getSignature(String companyTaxPayerId, String customerTaxPayerId, String period,
                                long timestamp) throws ApiException {
        String appKey = apiClient.getAppKey();
        if (appKey == null || appKey.length() == 0)
            throw new ApiException("ApiClient未设置appKey");

        String appKeySecret = apiClient.getAppKeySecret();
        if (appKeySecret == null || appKeySecret.length() == 0)
            throw new ApiException("ApiClient未设置appKeySecret");

        HashMap<String, Object> signMap = new HashMap<>();
        signMap.put("companyTaxPayerId", companyTaxPayerId);
        signMap.put("customerTaxPayerId", customerTaxPayerId);
        signMap.put("period", period);
        signMap.put(SdkConstant.VERSION, SdkConstant.SDK_VERSION);
        signMap.put(SdkConstant.TIMESTAMP, timestamp);
        signMap.put(SdkConstant.APP_KEY, appKey);

        String signature = SignUtils.sign(signMap, appKeySecret);
        return signature;
    }

    /* Build call for getAssetsDebtSheetUsingGET */
    private com.squareup.okhttp.Call getAssetsDebtSheetUsingGETCall(String companyTaxPayerId,
                                                                    String customerTaxPayerId,
                                                                    String period,
                                                                    final ProgressResponseBody.ProgressListener progressListener,
                                                                    final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        checkRequestParam(companyTaxPayerId, customerTaxPayerId, period);

        // create path and map variables
        String localVarPath = "/getAssetsDebtSheet".replaceAll("\\{format\\}", "json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (companyTaxPayerId != null)
            localVarQueryParams
                .addAll(apiClient.parameterToPairs("", "companyTaxPayerId", companyTaxPayerId));
        if (customerTaxPayerId != null)
            localVarQueryParams
                .addAll(apiClient.parameterToPairs("", "customerTaxPayerId", customerTaxPayerId));
        if (period != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "period", period));

        //appKey
        String appKey = apiClient.getAppKey();
        if (appKey == null || appKey.length() == 0)
            throw new ApiException("AppKey能为空");
        localVarQueryParams
                .addAll(apiClient.parameterToPairs("", SdkConstant.APP_KEY, apiClient.getAppKey()));

        //version
        localVarQueryParams
            .addAll(apiClient.parameterToPairs("", SdkConstant.VERSION, SdkConstant.SDK_VERSION));
        //timestamp
        long timestamp = System.currentTimeMillis();
        localVarQueryParams
            .addAll(apiClient.parameterToPairs("", SdkConstant.TIMESTAMP, timestamp));

        //signature
        String signature = getSignature(companyTaxPayerId, customerTaxPayerId, period, timestamp);
        localVarQueryParams
            .addAll(apiClient.parameterToPairs("", SdkConstant.SIGNATURE, signature));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = { "application/form-data",
                                                "application/x-www-form-urlencoded" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors()
                .add(new com.squareup.okhttp.Interceptor() {
                    @Override
                    public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                        com.squareup.okhttp.Response originalResponse = chain
                            .proceed(chain.request());
                        return originalResponse.newBuilder()
                            .body(
                                new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                    }
                });
        }

        String[] localVarAuthNames = new String[] {};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody,
            localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 返回资产负债表
     * 根据公司的税号、客户税号以及会计期查询资产负债表
     * @param companyTaxPayerId companyTaxPayerId (required)
     * @param customerTaxPayerId customerTaxPayerId (required)
     * @param period period (required)
     * @return ApiResponseobject
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseobject getAssetsDebtSheetUsingGET(String companyTaxPayerId,
                                                        String customerTaxPayerId,
                                                        String period) throws ApiException {
        ApiResponse<ApiResponseobject> resp = getAssetsDebtSheetUsingGETWithHttpInfo(
            companyTaxPayerId, customerTaxPayerId, period);
        return resp.getData();
    }

    /**
     * 返回资产负债表
     * 根据公司的税号、客户税号以及会计期查询资产负债表
     * @param companyTaxPayerId companyTaxPayerId (required)
     * @param customerTaxPayerId customerTaxPayerId (required)
     * @param period period (required)
     * @return ApiResponse&lt;ApiResponseobject&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseobject> getAssetsDebtSheetUsingGETWithHttpInfo(String companyTaxPayerId,
                                                                                 String customerTaxPayerId,
                                                                                 String period) throws ApiException {
        com.squareup.okhttp.Call call = getAssetsDebtSheetUsingGETCall(companyTaxPayerId,
            customerTaxPayerId, period, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseobject>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 返回资产负债表 (asynchronously)
     * 根据公司的税号、客户税号以及会计期查询资产负债表
     * @param companyTaxPayerId companyTaxPayerId (required)
     * @param customerTaxPayerId customerTaxPayerId (required)
     * @param period period (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAssetsDebtSheetUsingGETAsync(String companyTaxPayerId,
                                                                    String customerTaxPayerId,
                                                                    String period,
                                                                    final ApiCallback<ApiResponseobject> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAssetsDebtSheetUsingGETCall(companyTaxPayerId,
            customerTaxPayerId, period, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseobject>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;

    }

    /* Build call for getAssetsDebtSheetUsingPOST */
    private com.squareup.okhttp.Call getAssetsDebtSheetUsingPOSTCall(String companyTaxPayerId,
                                                                     String customerTaxPayerId,
                                                                     String period,
                                                                     final ProgressResponseBody.ProgressListener progressListener,
                                                                     final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        checkRequestParam(companyTaxPayerId, customerTaxPayerId, period);

        // create path and map variables
        String localVarPath = "/getAssetsDebtSheet".replaceAll("\\{format\\}", "json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (companyTaxPayerId != null)
            localVarQueryParams
                .addAll(apiClient.parameterToPairs("", "companyTaxPayerId", companyTaxPayerId));
        if (customerTaxPayerId != null)
            localVarQueryParams
                .addAll(apiClient.parameterToPairs("", "customerTaxPayerId", customerTaxPayerId));
        if (period != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "period", period));

        //appKey
        String appKey = apiClient.getAppKey();
        if (appKey == null || appKey.length() == 0)
            throw new ApiException("AppKey能为空");
        localVarQueryParams
                .addAll(apiClient.parameterToPairs("", SdkConstant.APP_KEY, apiClient.getAppKey()));

        //version
        localVarQueryParams
            .addAll(apiClient.parameterToPairs("", SdkConstant.VERSION, SdkConstant.SDK_VERSION));
        //timestamp
        long timestamp = System.currentTimeMillis();
        localVarQueryParams
            .addAll(apiClient.parameterToPairs("", SdkConstant.TIMESTAMP, timestamp));
        //signature
        String signature = getSignature(companyTaxPayerId, customerTaxPayerId, period, timestamp);
        localVarQueryParams
            .addAll(apiClient.parameterToPairs("", SdkConstant.SIGNATURE, signature));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = { "application/form-data",
                                                "application/x-www-form-urlencoded" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors()
                .add(new com.squareup.okhttp.Interceptor() {
                    @Override
                    public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                        com.squareup.okhttp.Response originalResponse = chain
                            .proceed(chain.request());
                        return originalResponse.newBuilder()
                            .body(
                                new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                    }
                });
        }

        String[] localVarAuthNames = new String[] {};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody,
            localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 返回资产负债表
     * 根据公司的税号、客户税号以及会计期查询资产负债表
     * @param companyTaxPayerId companyTaxPayerId (required)
     * @param customerTaxPayerId customerTaxPayerId (required)
     * @param period period (required)
     * @return ApiResponseobject
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseobject getAssetsDebtSheetUsingPOST(String companyTaxPayerId,
                                                         String customerTaxPayerId,
                                                         String period) throws ApiException {
        ApiResponse<ApiResponseobject> resp = getAssetsDebtSheetUsingPOSTWithHttpInfo(
            companyTaxPayerId, customerTaxPayerId, period);
        return resp.getData();
    }

    /**
     * 返回资产负债表
     * 根据公司的税号、客户税号以及会计期查询资产负债表
     * @param companyTaxPayerId companyTaxPayerId (required)
     * @param customerTaxPayerId customerTaxPayerId (required)
     * @param period period (required)
     * @return ApiResponse&lt;ApiResponseobject&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseobject> getAssetsDebtSheetUsingPOSTWithHttpInfo(String companyTaxPayerId,
                                                                                  String customerTaxPayerId,
                                                                                  String period) throws ApiException {
        com.squareup.okhttp.Call call = getAssetsDebtSheetUsingPOSTCall(companyTaxPayerId,
            customerTaxPayerId, period, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseobject>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 返回资产负债表 (asynchronously)
     * 根据公司的税号、客户税号以及会计期查询资产负债表
     * @param companyTaxPayerId companyTaxPayerId (required)
     * @param customerTaxPayerId customerTaxPayerId (required)
     * @param period period (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAssetsDebtSheetUsingPOSTAsync(String companyTaxPayerId,
                                                                     String customerTaxPayerId,
                                                                     String period,
                                                                     final ApiCallback<ApiResponseobject> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAssetsDebtSheetUsingPOSTCall(companyTaxPayerId,
            customerTaxPayerId, period, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseobject>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;

    }

    /* Build call for getIncomeSheetUsingGET */
    private com.squareup.okhttp.Call getIncomeSheetUsingGETCall(String companyTaxPayerId,
                                                                String customerTaxPayerId,
                                                                String period,
                                                                final ProgressResponseBody.ProgressListener progressListener,
                                                                final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        checkRequestParam(companyTaxPayerId, customerTaxPayerId, period);

        // create path and map variables
        String localVarPath = "/getIncomeSheet".replaceAll("\\{format\\}", "json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (companyTaxPayerId != null)
            localVarQueryParams
                .addAll(apiClient.parameterToPairs("", "companyTaxPayerId", companyTaxPayerId));
        if (customerTaxPayerId != null)
            localVarQueryParams
                .addAll(apiClient.parameterToPairs("", "customerTaxPayerId", customerTaxPayerId));
        if (period != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "period", period));

        //appKey
        String appKey = apiClient.getAppKey();
        if (appKey == null || appKey.length() == 0)
            throw new ApiException("AppKey能为空");
        localVarQueryParams
                .addAll(apiClient.parameterToPairs("", SdkConstant.APP_KEY, apiClient.getAppKey()));

        //version
        localVarQueryParams
            .addAll(apiClient.parameterToPairs("", SdkConstant.VERSION, SdkConstant.SDK_VERSION));
        //timestamp
        long timestamp = System.currentTimeMillis();
        localVarQueryParams
            .addAll(apiClient.parameterToPairs("", SdkConstant.TIMESTAMP, timestamp));

        String signature = getSignature(companyTaxPayerId, customerTaxPayerId, period, timestamp);
        localVarQueryParams
            .addAll(apiClient.parameterToPairs("", SdkConstant.SIGNATURE, signature));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = { "application/form-data",
                                                "application/x-www-form-urlencoded" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors()
                .add(new com.squareup.okhttp.Interceptor() {
                    @Override
                    public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                        com.squareup.okhttp.Response originalResponse = chain
                            .proceed(chain.request());
                        return originalResponse.newBuilder()
                            .body(
                                new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                    }
                });
        }

        String[] localVarAuthNames = new String[] {};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody,
            localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 返回利润表
     * 根据公司的税号、客户税号以及会计期查询利润表
     * @param companyTaxPayerId companyTaxPayerId (required)
     * @param customerTaxPayerId customerTaxPayerId (required)
     * @param period period (required)
     * @return ApiResponseobject
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseobject getIncomeSheetUsingGET(String companyTaxPayerId,
                                                    String customerTaxPayerId,
                                                    String period) throws ApiException {
        ApiResponse<ApiResponseobject> resp = getIncomeSheetUsingGETWithHttpInfo(companyTaxPayerId,
            customerTaxPayerId, period);
        return resp.getData();
    }

    /**
     * 返回利润表
     * 根据公司的税号、客户税号以及会计期查询利润表
     * @param companyTaxPayerId companyTaxPayerId (required)
     * @param customerTaxPayerId customerTaxPayerId (required)
     * @param period period (required)
     * @return ApiResponse&lt;ApiResponseobject&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseobject> getIncomeSheetUsingGETWithHttpInfo(String companyTaxPayerId,
                                                                             String customerTaxPayerId,
                                                                             String period) throws ApiException {
        com.squareup.okhttp.Call call = getIncomeSheetUsingGETCall(companyTaxPayerId,
            customerTaxPayerId, period, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseobject>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 返回利润表 (asynchronously)
     * 根据公司的税号、客户税号以及会计期查询利润表
     * @param companyTaxPayerId companyTaxPayerId (required)
     * @param customerTaxPayerId customerTaxPayerId (required)
     * @param period period (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getIncomeSheetUsingGETAsync(String companyTaxPayerId,
                                                                String customerTaxPayerId,
                                                                String period,
                                                                final ApiCallback<ApiResponseobject> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getIncomeSheetUsingGETCall(companyTaxPayerId,
            customerTaxPayerId, period, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseobject>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;

    }

    /* Build call for getIncomeSheetUsingPOST */
    private com.squareup.okhttp.Call getIncomeSheetUsingPOSTCall(String companyTaxPayerId,
                                                                 String customerTaxPayerId,
                                                                 String period,
                                                                 final ProgressResponseBody.ProgressListener progressListener,
                                                                 final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        checkRequestParam(companyTaxPayerId, customerTaxPayerId, period);

        // create path and map variables
        String localVarPath = "/getIncomeSheet".replaceAll("\\{format\\}", "json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (companyTaxPayerId != null)
            localVarQueryParams
                .addAll(apiClient.parameterToPairs("", "companyTaxPayerId", companyTaxPayerId));
        if (customerTaxPayerId != null)
            localVarQueryParams
                .addAll(apiClient.parameterToPairs("", "customerTaxPayerId", customerTaxPayerId));
        if (period != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "period", period));

        //appKey
        String appKey = apiClient.getAppKey();
        if (appKey == null || appKey.length() == 0)
            throw new ApiException("AppKey能为空");
        localVarQueryParams
                .addAll(apiClient.parameterToPairs("", SdkConstant.APP_KEY, apiClient.getAppKey()));

        //version
        localVarQueryParams
            .addAll(apiClient.parameterToPairs("", SdkConstant.VERSION, SdkConstant.SDK_VERSION));
        //timestamp
        long timestamp = System.currentTimeMillis();
        localVarQueryParams
            .addAll(apiClient.parameterToPairs("", SdkConstant.TIMESTAMP, timestamp));

        String signature = getSignature(companyTaxPayerId, customerTaxPayerId, period, timestamp);
        localVarQueryParams
            .addAll(apiClient.parameterToPairs("", SdkConstant.SIGNATURE, signature));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = { "application/form-data",
                                                "application/x-www-form-urlencoded" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors()
                .add(new com.squareup.okhttp.Interceptor() {
                    @Override
                    public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                        com.squareup.okhttp.Response originalResponse = chain
                            .proceed(chain.request());
                        return originalResponse.newBuilder()
                            .body(
                                new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                    }
                });
        }

        String[] localVarAuthNames = new String[] {};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody,
            localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 返回利润表
     * 根据公司的税号、客户税号以及会计期查询利润表
     * @param companyTaxPayerId companyTaxPayerId (required)
     * @param customerTaxPayerId customerTaxPayerId (required)
     * @param period period (required)
     * @return ApiResponseobject
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseobject getIncomeSheetUsingPOST(String companyTaxPayerId,
                                                     String customerTaxPayerId,
                                                     String period) throws ApiException {
        ApiResponse<ApiResponseobject> resp = getIncomeSheetUsingPOSTWithHttpInfo(companyTaxPayerId,
            customerTaxPayerId, period);
        return resp.getData();
    }

    /**
     * 返回利润表
     * 根据公司的税号、客户税号以及会计期查询利润表
     * @param companyTaxPayerId companyTaxPayerId (required)
     * @param customerTaxPayerId customerTaxPayerId (required)
     * @param period period (required)
     * @return ApiResponse&lt;ApiResponseobject&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseobject> getIncomeSheetUsingPOSTWithHttpInfo(String companyTaxPayerId,
                                                                              String customerTaxPayerId,
                                                                              String period) throws ApiException {
        com.squareup.okhttp.Call call = getIncomeSheetUsingPOSTCall(companyTaxPayerId,
            customerTaxPayerId, period, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseobject>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 返回利润表 (asynchronously)
     * 根据公司的税号、客户税号以及会计期查询利润表
     * @param companyTaxPayerId companyTaxPayerId (required)
     * @param customerTaxPayerId customerTaxPayerId (required)
     * @param period period (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getIncomeSheetUsingPOSTAsync(String companyTaxPayerId,
                                                                 String customerTaxPayerId,
                                                                 String period,
                                                                 final ApiCallback<ApiResponseobject> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getIncomeSheetUsingPOSTCall(companyTaxPayerId,
            customerTaxPayerId, period, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseobject>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
