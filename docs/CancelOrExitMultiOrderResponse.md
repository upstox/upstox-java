# CancelOrExitMultiOrderResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**data** | [**CancelOrExitMultiOrderData**](CancelOrExitMultiOrderData.md) |  |  [optional]
**errors** | [**List&lt;CancelOrExitOrderErrorData&gt;**](CancelOrExitOrderErrorData.md) | Error data for cancel or exit order request |  [optional]
**summary** | [**BatchExecutionSummary**](BatchExecutionSummary.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;success&quot;
ERROR | &quot;error&quot;
PARTIAL_SUCCESS | &quot;partial_success&quot;
