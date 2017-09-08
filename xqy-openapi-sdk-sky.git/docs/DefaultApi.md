# DefaultApi

All URIs are relative to *https://open.17dz.com/sky*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAssetsDebtSheetUsingGET**](DefaultApi.md#getAssetsDebtSheetUsingGET) | **GET** /getAssetsDebtSheet | 返回资产负债表
[**getAssetsDebtSheetUsingPOST**](DefaultApi.md#getAssetsDebtSheetUsingPOST) | **POST** /getAssetsDebtSheet | 返回资产负债表
[**getIncomeSheetUsingGET**](DefaultApi.md#getIncomeSheetUsingGET) | **GET** /getIncomeSheet | 返回利润表
[**getIncomeSheetUsingPOST**](DefaultApi.md#getIncomeSheetUsingPOST) | **POST** /getIncomeSheet | 返回利润表


<a name="getAssetsDebtSheetUsingGET"></a>
# **getAssetsDebtSheetUsingGET**
> ApiResponseobject getAssetsDebtSheetUsingGET(companyTaxPayerId, customerTaxPayerId, period)

返回资产负债表

根据公司的税号、客户税号以及会计期查询资产负债表

### Example
```java
// Import classes:
//import cn.com.servyou.xqy.openapi.client.sky.ApiException;
//import cn.com.servyou.xqy.openapi.client.sky.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
//设定appKey和appKeySecret
String appKey = "appKey";
String appKeySecret = "appKeySecret";
ApiClient apiClient = api.getApiClient();
apiClient.setAppKey(appKey);
apiClient.setAppKeySecret("appKeySecret);

String companyTaxPayerId = "companyTaxPayerId_example"; // String | companyTaxPayerId
String customerTaxPayerId = "customerTaxPayerId_example"; // String | customerTaxPayerId
String period = "period_example"; // String | period
try {
    ApiResponseobject result = apiInstance.getAssetsDebtSheetUsingGET(companyTaxPayerId, customerTaxPayerId, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAssetsDebtSheetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyTaxPayerId** | **String**| companyTaxPayerId |
 **customerTaxPayerId** | **String**| customerTaxPayerId |
 **period** | **String**| period |

### Return type

[**ApiResponseobject**](ApiResponseobject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/form-data, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getAssetsDebtSheetUsingPOST"></a>
# **getAssetsDebtSheetUsingPOST**
> ApiResponseobject getAssetsDebtSheetUsingPOST(companyTaxPayerId, customerTaxPayerId, period)

返回资产负债表

根据公司的税号、客户税号以及会计期查询资产负债表

### Example
```java
// Import classes:
//import cn.com.servyou.xqy.openapi.client.sky.ApiException;
//import cn.com.servyou.xqy.openapi.client.sky.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
//设定appKey和appKeySecret
String appKey = "appKey";
String appKeySecret = "appKeySecret";
ApiClient apiClient = api.getApiClient();
apiClient.setAppKey(appKey);
apiClient.setAppKeySecret("appKeySecret);

String companyTaxPayerId = "companyTaxPayerId_example"; // String | companyTaxPayerId
String customerTaxPayerId = "customerTaxPayerId_example"; // String | customerTaxPayerId
String period = "period_example"; // String | period
try {
    ApiResponseobject result = apiInstance.getAssetsDebtSheetUsingPOST(companyTaxPayerId, customerTaxPayerId, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAssetsDebtSheetUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyTaxPayerId** | **String**| companyTaxPayerId |
 **customerTaxPayerId** | **String**| customerTaxPayerId |
 **period** | **String**| period |

### Return type

[**ApiResponseobject**](ApiResponseobject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/form-data, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getIncomeSheetUsingGET"></a>
# **getIncomeSheetUsingGET**
> ApiResponseobject getIncomeSheetUsingGET(companyTaxPayerId, customerTaxPayerId, period)

返回利润表

根据公司的税号、客户税号以及会计期查询利润表

### Example
```java
// Import classes:
//import cn.com.servyou.xqy.openapi.client.sky.ApiException;
//import cn.com.servyou.xqy.openapi.client.sky.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
//设定appKey和appKeySecret
String appKey = "appKey";
String appKeySecret = "appKeySecret";
ApiClient apiClient = api.getApiClient();
apiClient.setAppKey(appKey);
apiClient.setAppKeySecret("appKeySecret);

String companyTaxPayerId = "companyTaxPayerId_example"; // String | companyTaxPayerId
String customerTaxPayerId = "customerTaxPayerId_example"; // String | customerTaxPayerId
String period = "period_example"; // String | period
try {
    ApiResponseobject result = apiInstance.getIncomeSheetUsingGET(companyTaxPayerId, customerTaxPayerId, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getIncomeSheetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyTaxPayerId** | **String**| companyTaxPayerId |
 **customerTaxPayerId** | **String**| customerTaxPayerId |
 **period** | **String**| period |

### Return type

[**ApiResponseobject**](ApiResponseobject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/form-data, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getIncomeSheetUsingPOST"></a>
# **getIncomeSheetUsingPOST**
> ApiResponseobject getIncomeSheetUsingPOST(companyTaxPayerId, customerTaxPayerId, period)

返回利润表

根据公司的税号、客户税号以及会计期查询利润表

### Example
```java
// Import classes:
//import cn.com.servyou.xqy.openapi.client.sky.ApiException;
//import cn.com.servyou.xqy.openapi.client.sky.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
//设定appKey和appKeySecret
String appKey = "appKey";
String appKeySecret = "appKeySecret";
ApiClient apiClient = api.getApiClient();
apiClient.setAppKey(appKey);
apiClient.setAppKeySecret("appKeySecret);

String companyTaxPayerId = "companyTaxPayerId_example"; // String | companyTaxPayerId
String customerTaxPayerId = "customerTaxPayerId_example"; // String | customerTaxPayerId
String period = "period_example"; // String | period
try {
    ApiResponseobject result = apiInstance.getIncomeSheetUsingPOST(companyTaxPayerId, customerTaxPayerId, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getIncomeSheetUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyTaxPayerId** | **String**| companyTaxPayerId |
 **customerTaxPayerId** | **String**| customerTaxPayerId |
 **period** | **String**| period |

### Return type

[**ApiResponseobject**](ApiResponseobject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/form-data, application/x-www-form-urlencoded
 - **Accept**: application/json

