# OrderBookData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exchange** | [**ExchangeEnum**](#ExchangeEnum) | Exchange to which the order is associated |  [optional]
**product** | [**ProductEnum**](#ProductEnum) | Shows if the order was either Intraday, Delivery, CoverOrder or OneCancelsOther |  [optional]
**price** | **Float** | Price at which the order was placed |  [optional]
**quantity** | **Integer** | Quantity with which the order was placed |  [optional]
**status** | **String** | Indicates the current status of the order. Valid order status’ are outlined in the table below |  [optional]
**guid** | **String** |  |  [optional]
**tag** | **String** | Tag to uniquely identify an order |  [optional]
**instrumentToken** | **String** | Identifier issued by Upstox used for subscribing to live market quotes |  [optional]
**placedBy** | **String** | Uniquely identifies the user |  [optional]
**tradingsymbol** | **String** | Shows the trading symbol of the instrument |  [optional]
**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) | Type of order. It can be one of the following MARKET refers to market order&lt;br&gt;LIMIT refers to Limit Order&lt;br&gt;SL refers to Stop Loss Limit&lt;br&gt;SL-M refers to Stop loss market |  [optional]
**validity** | [**ValidityEnum**](#ValidityEnum) | Order validity (DAY- Day and IOC- Immediate or Cancel (IOC) order) |  [optional]
**triggerPrice** | **Float** | If the order was a stop loss order then the trigger price set is mentioned here |  [optional]
**disclosedQuantity** | **Integer** | The quantity that should be disclosed in the market depth |  [optional]
**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) | Indicates whether the order was a buy or sell order |  [optional]
**averagePrice** | **Float** | Average price at which the qty got traded |  [optional]
**filledQuantity** | **Integer** | The total quantity traded from this particular order |  [optional]
**pendingQuantity** | **Integer** | Pending quantity to be filled |  [optional]
**statusMessage** | **String** | Indicates the reason when any order is rejected, not modified or cancelled |  [optional]
**statusMessageRaw** | **String** | Description of the order&#x27;s status as received from RMS |  [optional]
**exchangeOrderId** | **String** | Unique order ID assigned by the exchange for the order placed |  [optional]
**parentOrderId** | **String** | In case the order is part of the second or third leg of a CO or OCO, the parent order ID is indicated here |  [optional]
**orderId** | **String** | Unique order ID assigned internally for the order placed |  [optional]
**variety** | **String** | Order complexity |  [optional]
**orderTimestamp** | **String** | User readable timestamp at which the order was placed |  [optional]
**exchangeTimestamp** | **String** | User readable time at which the order was placed or updated |  [optional]
**isAmo** | **Boolean** | Signifies if the order is an After Market Order |  [optional]
**orderRequestId** | **String** | Apart from 1st order it shows the count of how many requests were sent |  [optional]
**orderRefId** | **String** | The order reference ID for which the order must be modified |  [optional]

<a name="ExchangeEnum"></a>
## Enum: ExchangeEnum
Name | Value
---- | -----
NSE | &quot;NSE&quot;
NFO | &quot;NFO&quot;
CDS | &quot;CDS&quot;
BSE | &quot;BSE&quot;
BCD | &quot;BCD&quot;
MCX | &quot;MCX&quot;

<a name="ProductEnum"></a>
## Enum: ProductEnum
Name | Value
---- | -----
I | &quot;I&quot;
D | &quot;D&quot;
CO | &quot;CO&quot;
OCO | &quot;OCO&quot;
MTF | &quot;MTF&quot;

<a name="OrderTypeEnum"></a>
## Enum: OrderTypeEnum
Name | Value
---- | -----
MARKET | &quot;MARKET&quot;
LIMIT | &quot;LIMIT&quot;
SL | &quot;SL&quot;
SL_M | &quot;SL-M&quot;

<a name="ValidityEnum"></a>
## Enum: ValidityEnum
Name | Value
---- | -----
DAY | &quot;DAY&quot;
IOC | &quot;IOC&quot;

<a name="TransactionTypeEnum"></a>
## Enum: TransactionTypeEnum
Name | Value
---- | -----
BUY | &quot;BUY&quot;
SELL | &quot;SELL&quot;
