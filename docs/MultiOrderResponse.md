# MultiOrderResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**data** | [**List&lt;MultiOrderData&gt;**](MultiOrderData.md) | Response data for multi order request |  [optional]
**errors** | [**List&lt;MultiOrderError&gt;**](MultiOrderError.md) | Error details for multi order request |  [optional]
**summary** | [**MultiOrderSummary**](MultiOrderSummary.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;success&quot;
ERROR | &quot;error&quot;
PARTIAL_SUCCESS | &quot;partial_success&quot;
