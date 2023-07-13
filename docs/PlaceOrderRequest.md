# PlaceOrderRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantity** | **Integer** | Quantity with which the order is to be placed | 
**product** | [**ProductEnum**](#ProductEnum) | Signifies if the order was either Intraday, Delivery, CO or OCO | 
**validity** | [**ValidityEnum**](#ValidityEnum) | It can be one of the following - DAY(default), IOC | 
**price** | **Float** | Price at which the order will be placed | 
**tag** | **String** | Tag for a particular order |  [optional]
**instrumentToken** | **String** | Key of the instrument | 
**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) | Type of order. It can be one of the following MARKET refers to market order LIMIT refers to Limit Order SL refers to Stop Loss Limit SL-M refers to Stop Loss Market | 
**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) | Indicates whether its a buy or sell order | 
**disclosedQuantity** | **Integer** | The quantity that should be disclosed in the market depth | 
**triggerPrice** | **Float** | If the order is a stop loss order then the trigger price to be set is mentioned here | 
**isAmo** | **Boolean** | Signifies if the order is an After Market Order | 

<a name="ProductEnum"></a>
## Enum: ProductEnum
Name | Value
---- | -----
I | &quot;I&quot;
D | &quot;D&quot;
CO | &quot;CO&quot;
OCO | &quot;OCO&quot;
MTF | &quot;MTF&quot;

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

<a name="TransactionTypeEnum"></a>
## Enum: TransactionTypeEnum
Name | Value
---- | -----
BUY | &quot;BUY&quot;
SELL | &quot;SELL&quot;
