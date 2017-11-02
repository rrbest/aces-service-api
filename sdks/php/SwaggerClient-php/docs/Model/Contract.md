# Contract

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The globally unique Contract ID. | [optional] 
**created_at** | [**\DateTime**](\DateTime.md) | Date the Contract was created. | [optional] 
**expires_at** | [**\DateTime**](\DateTime.md) | Date the Contract will expire. Any expired contracts will no longer attempt execution. | [optional] 
**correlation_id** | **string** | Requestor generated globally unique identifier for correleating requests. | [optional] 
**status** | **string** |  | [optional] 
**results** | [**\Swagger\Client\Model\Result[]**](Result.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


