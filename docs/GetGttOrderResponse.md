# GetGttOrderResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**data** | [**List&lt;GttOrderDetails&gt;**](GttOrderDetails.md) | Response data for order details |  [optional]
**metadata** | [**OrderMetadata**](OrderMetadata.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;success&quot;
ERROR | &quot;error&quot;
PARTIAL_SUCCESS | &quot;partial_success&quot;
