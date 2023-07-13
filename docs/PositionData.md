# PositionData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exchange** | [**ExchangeEnum**](#ExchangeEnum) | Exchange to which the order is associated |  [optional]
**multiplier** | **Float** | The quantity/lot size multiplier used for calculating P&amp;Ls |  [optional]
**value** | **Float** | Net value of the position |  [optional]
**pnl** | **Float** | Profit and loss - net returns on the position |  [optional]
**product** | **String** | Shows if the order was either Intraday, Delivery, CO or OCO |  [optional]
**instrumentToken** | **String** | Key issued by Upstox for the instrument |  [optional]
**averagePrice** | **Float** | Average price at which the net position quantity was acquired |  [optional]
**buyValue** | **Float** | Net value of the bought quantities |  [optional]
**overnightQuantity** | **Integer** | Quantity held previously and carried forward over night |  [optional]
**dayBuyValue** | **Float** | Amount at which the quantity is bought during the day |  [optional]
**dayBuyPrice** | **Float** | Average price at which the day qty was bought. Default is empty string |  [optional]
**overnightBuyAmount** | **Float** | Amount at which the quantity was bought in the previous session |  [optional]
**overnightBuyQuantity** | **Integer** | Quantity bought in the previous session |  [optional]
**dayBuyQuantity** | **Integer** | Quantity bought during the day |  [optional]
**daySellValue** | **Float** | Amount at which the quantity is sold during the day |  [optional]
**daySellPrice** | **Float** | Average price at which the day quantity was sold |  [optional]
**overnightSellAmount** | **Float** | Amount at which the quantity was sold in the previous session |  [optional]
**overnightSellQuantity** | **Integer** | Quantity sold short in the previous session |  [optional]
**daySellQuantity** | **Integer** | Quantity sold during the day |  [optional]
**quantity** | **Integer** | Quantity left after nullifying Day and CF buy quantity towards Day and CF sell quantity |  [optional]
**lastPrice** | **Float** | Last traded market price of the instrument |  [optional]
**unrealised** | **Float** | Day PnL generated against open positions |  [optional]
**realised** | **Float** | Day PnL generated against closed positions |  [optional]
**sellValue** | **Float** | Net value of the sold quantities |  [optional]
**tradingsymbol** | **String** | Shows the trading symbol of the instrument |  [optional]
**closePrice** | **Float** | Closing price of the instrument from the last trading day |  [optional]
**buyPrice** | **Float** | Average price at which quantities were bought |  [optional]
**sellPrice** | **Float** | Average price at which quantities were sold |  [optional]

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
