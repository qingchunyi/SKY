# xqy-openapi-sdk-sky

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>cn.com.servyou</groupId>
    <artifactId>xqy-openapi-sdk-sky</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "cn.com.servyou:xqy-openapi-sdk-sky:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/xqy-openapi-sdk-sky.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import cn.com.servyou.xqy.openapi.client.sky.*;
import cn.com.servyou.xqy.openapi.client.sky.auth.*;
import cn.com.servyou.xqy.openapi.client.sky.model.*;
import cn.com.servyou.xqy.openapi.client.sky.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        DefaultApi apiInstance = new DefaultApi();

        //设定appKey和appKeySecret
        String appKey = "appKey";
        String appKeySecret = "appKeySecret";
        ApiClient apiClient = api.getApiClient();
        apiClient.setAppKey(appKey);
        apiClient.setAppKeySecret(appKeySecret);

        String companyTaxPayerId = "companyTaxPayerId_example"; // String | companyTaxPayerId
        String customerTaxPayerId = "customerTaxPayerId_example"; // String | customerTaxPayerId
        String period = "201706"; // String | period
        try {
            ApiResponseobject result = apiInstance.getAssetsDebtSheetUsingGET(companyTaxPayerId, customerTaxPayerId, period);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getAssetsDebtSheetUsingGET");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://open.17dz.com/sky*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**getAssetsDebtSheetUsingGET**](docs/DefaultApi.md#getAssetsDebtSheetUsingGET) | **GET** /getAssetsDebtSheet | 返回资产负债表
*DefaultApi* | [**getAssetsDebtSheetUsingPOST**](docs/DefaultApi.md#getAssetsDebtSheetUsingPOST) | **POST** /getAssetsDebtSheet | 返回资产负债表
*DefaultApi* | [**getIncomeSheetUsingGET**](docs/DefaultApi.md#getIncomeSheetUsingGET) | **GET** /getIncomeSheet | 返回利润表
*DefaultApi* | [**getIncomeSheetUsingPOST**](docs/DefaultApi.md#getIncomeSheetUsingPOST) | **POST** /getIncomeSheet | 返回利润表


## Documentation for Models

 - [ApiResponseobject](docs/ApiResponseobject.md)
 - [Head](docs/Head.md)
 - [Sheet](docs/Sheet.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



