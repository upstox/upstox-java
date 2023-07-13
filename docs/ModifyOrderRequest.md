# ModifyOrderRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantity** | **Integer** | Quantity with which the order was placed |  [optional]
**validity** | [**ValidityEnum**](#ValidityEnum) | Order validity (DAY- Day and IOC- Immediate or Cancel (IOC) order) | 
**price** | **Float** | Price at which the order was placed | 
**orderId** | **String** | The order ID for which the order must be modified | 
**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) | Type of order. It can be one of the following MARKET refers to market order LIMILT refers to Limit Order SL refers to Stop Loss Limit SL-M refers to Stop Loss Market | 
**disclosedQuantity** | **Integer** | The quantity that should be disclosed in the market depth |  [optional]
**triggerPrice** | **Float** | If the order is a stop loss order then the trigger price to be set is mentioned here | 

<a name="ValidityEnum"></a>
## Enum: ValidityEnum
Name | Value
---- | -----
DAY | &quot;DAY&quot;
IOC | &quot;IOC&quot;

<a name="OrderTypeEnum"></a>
## Enum: OrderTypeEnum
Name | Value
---- | -----
MARKET | &quot;MARKET&quot;
LIMIT | &quot;LIMIT&quot;
SL | &quot;SL&quot;
SL_M | &quot;SL-M&quot;
