# GttPlaceOrderRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Type of GTT order. It can be one of the following: SINGLE refers to a single-leg GTT order MULTIPLE refers to a multi-leg GTT order | 
**quantity** | **Integer** | Quantity with which the order is to be placed | 
**product** | [**ProductEnum**](#ProductEnum) | Signifies if the order was either Intraday, Delivery, CO or OCO | 
**rules** | [**List&lt;GttRule&gt;**](GttRule.md) | List of rules defining the conditions for each leg in the GTT order | 
**instrumentToken** | **String** | Key of the instrument | 
**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) | Indicates whether its a buy or sell order | 

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SINGLE | &quot;SINGLE&quot;
MULTIPLE | &quot;MULTIPLE&quot;

<a name="ProductEnum"></a>
## Enum: ProductEnum
Name | Value
---- | -----
I | &quot;I&quot;
D | &quot;D&quot;

<a name="TransactionTypeEnum"></a>
## Enum: TransactionTypeEnum
Name | Value
---- | -----
BUY | &quot;BUY&quot;
SELL | &quot;SELL&quot;
