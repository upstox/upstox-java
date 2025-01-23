# PlaceOrderV3Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**data** | [**MultiOrderV3Data**](MultiOrderV3Data.md) |  |  [optional]
**metadata** | [**OrderMetadata**](OrderMetadata.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;success&quot;
ERROR | &quot;error&quot;
PARTIAL_SUCCESS | &quot;partial_success&quot;
