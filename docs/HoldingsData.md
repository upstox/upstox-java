# HoldingsData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isin** | **String** | The standard ISIN representing stocks listed on multiple exchanges |  [optional]
**cncUsedQuantity** | **Integer** | Quantity either blocked towards open or completed order |  [optional]
**collateralType** | **String** | Category of collateral assigned by RMS |  [optional]
**companyName** | **String** | Name of the company |  [optional]
**haircut** | **Float** | This is the haircut percentage applied from RMS (applicable incase of collateral) |  [optional]
**product** | **String** | Shows if the order was either Intraday, Delivery, CO or OCO |  [optional]
**quantity** | **Integer** | The total holding qty |  [optional]
**tradingsymbol** | **String** | Shows the trading symbol of the instrument |  [optional]
**lastPrice** | **Float** | The last traded price of the instrument |  [optional]
**closePrice** | **Float** | Closing price of the instrument from the last trading day |  [optional]
**pnl** | **Float** | Profit and Loss |  [optional]
**dayChange** | **Float** | Day&#x27;s change in absolute value for the stock |  [optional]
**dayChangePercentage** | **Float** | Day&#x27;s change in percentage for the stock |  [optional]
**instrumentToken** | **String** | Key issued by Upstox for the instrument |  [optional]
**averagePrice** | **Float** | Average price at which the net holding quantity was acquired |  [optional]
**collateralQuantity** | **Integer** | Quantity marked as collateral by RMS on users request |  [optional]
**collateralUpdateQuantity** | **Integer** |  |  [optional]
**t1Quantity** | **Integer** | Quantity on T+1 day after order execution |  [optional]
**exchange** | [**ExchangeEnum**](#ExchangeEnum) | Exchange of the trading symbol |  [optional]

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
