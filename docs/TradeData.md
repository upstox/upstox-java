# TradeData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exchange** | [**ExchangeEnum**](#ExchangeEnum) | Exchange to which the order is associated |  [optional]
**product** | [**ProductEnum**](#ProductEnum) | Shows if the order was either Intraday, Delivery, CO or OCO |  [optional]
**tradingsymbol** | **String** | Shows the trading symbol which could be a combination of symbol name, instrument, expiry date etc |  [optional]
**instrumentToken** | **String** | Identifier issued by Upstox used for subscribing to live market quotes |  [optional]
**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) | Type of order. It can be one of the following MARKET refers to market order&lt;br&gt;LIMIT refers to Limit Order&lt;br&gt;SL refers to Stop Loss Limit&lt;br&gt;SL-M refers to Stop loss market |  [optional]
**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) | Indicates whether the order was a buy or sell order |  [optional]
**quantity** | **Integer** | The total quantity traded from this particular order |  [optional]
**exchangeOrderId** | **String** | Unique order ID assigned by the exchange for the order placed |  [optional]
**orderId** | **String** | Unique order ID assigned internally for the order placed |  [optional]
**exchangeTimestamp** | **String** | User readable time at when the trade occurred |  [optional]
**averagePrice** | **Float** | Price at which the traded quantity is traded |  [optional]
**tradeId** | **String** | Trade ID generated from exchange towards traded transaction |  [optional]
**orderRefId** | **String** | The order reference ID for which the order must be modified |  [optional]
**orderTimestamp** | **String** | User readable timestamp at which the order was placed |  [optional]

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

<a name="TransactionTypeEnum"></a>
## Enum: TransactionTypeEnum
Name | Value
---- | -----
BUY | &quot;BUY&quot;
SELL | &quot;SELL&quot;
