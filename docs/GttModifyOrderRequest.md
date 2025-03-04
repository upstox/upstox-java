# GttModifyOrderRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Type of GTT order. It can be one of the following: SINGLE refers to a single-leg GTT order MULTIPLE refers to a multi-leg GTT order | 
**quantity** | **Integer** | Quantity with which the order is to be placed | 
**rules** | [**List&lt;GttRule&gt;**](GttRule.md) | List of rules defining the conditions for each leg in the GTT order | 
**gttOrderId** | **String** | Unique identifier of the GTT order to be modified | 

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SINGLE | &quot;SINGLE&quot;
MULTIPLE | &quot;MULTIPLE&quot;
