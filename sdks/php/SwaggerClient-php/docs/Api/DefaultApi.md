# Swagger\Client\DefaultApi

All URIs are relative to *https://localhost/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contractsIdGet**](DefaultApi.md#contractsIdGet) | **GET** /contracts/{id} | Get Service Contract.
[**contractsPost**](DefaultApi.md#contractsPost) | **POST** /contracts | Create Service Contract
[**infoGet**](DefaultApi.md#infoGet) | **GET** /info | Get Service Info.
[**statusGet**](DefaultApi.md#statusGet) | **GET** /status | Get Health of node.


# **contractsIdGet**
> \Swagger\Client\Model\Contract contractsIdGet($id)

Get Service Contract.

Gets service contract info for a contract.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\DefaultApi(new \Http\Adapter\Guzzle6\Client());
$id = "id_example"; // string | Contract identifier.

try {
    $result = $api_instance->contractsIdGet($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->contractsIdGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| Contract identifier. |

### Return type

[**\Swagger\Client\Model\Contract**](../Model/Contract.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **contractsPost**
> \Swagger\Client\Model\Contract contractsPost($contract_request)

Create Service Contract

Creates a new service contract.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\DefaultApi(new \Http\Adapter\Guzzle6\Client());
$contract_request = new \Swagger\Client\Model\ContractRequest(); // \Swagger\Client\Model\ContractRequest | The request to create a new contract.

try {
    $result = $api_instance->contractsPost($contract_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->contractsPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract_request** | [**\Swagger\Client\Model\ContractRequest**](../Model/ContractRequest.md)| The request to create a new contract. | [optional]

### Return type

[**\Swagger\Client\Model\Contract**](../Model/Contract.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **infoGet**
> \Swagger\Client\Model\Info infoGet()

Get Service Info.

Gets Service Info object.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\DefaultApi(new \Http\Adapter\Guzzle6\Client());

try {
    $result = $api_instance->infoGet();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->infoGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\Info**](../Model/Info.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **statusGet**
> \Swagger\Client\Model\Health statusGet()

Get Health of node.

Get application health information.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\DefaultApi(new \Http\Adapter\Guzzle6\Client());

try {
    $result = $api_instance->statusGet();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->statusGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\Health**](../Model/Health.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

