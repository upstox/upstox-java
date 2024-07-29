# HolidayData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**description** | **String** |  |  [optional]
**holidayType** | [**HolidayTypeEnum**](#HolidayTypeEnum) |  |  [optional]
**closedExchanges** | **List&lt;String&gt;** |  |  [optional]
**openExchanges** | [**List&lt;ExchangeTimingData&gt;**](ExchangeTimingData.md) |  |  [optional]

<a name="HolidayTypeEnum"></a>
## Enum: HolidayTypeEnum
Name | Value
---- | -----
ALL | &quot;ALL&quot;
SETTLEMENT_HOLIDAY | &quot;SETTLEMENT_HOLIDAY&quot;
TRADING_HOLIDAY | &quot;TRADING_HOLIDAY&quot;
SPECIAL_TIMING | &quot;SPECIAL_TIMING&quot;
