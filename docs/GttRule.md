# GttRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**strategy** | [**StrategyEnum**](#StrategyEnum) | Defines the strategy for the GTT order leg: ENTRY - First leg order STOPLOSS - Stop-loss order TARGET - Target order | 
**triggerType** | [**TriggerTypeEnum**](#TriggerTypeEnum) | Trigger type for each leg of the order | 
**triggerPrice** | **Double** | Trigger price for the GTT order leg | 

<a name="StrategyEnum"></a>
## Enum: StrategyEnum
Name | Value
---- | -----
ENTRY | &quot;ENTRY&quot;
STOPLOSS | &quot;STOPLOSS&quot;
TARGET | &quot;TARGET&quot;

<a name="TriggerTypeEnum"></a>
## Enum: TriggerTypeEnum
Name | Value
---- | -----
ABOVE | &quot;ABOVE&quot;
BELOW | &quot;BELOW&quot;
IMMEDIATE | &quot;IMMEDIATE&quot;
