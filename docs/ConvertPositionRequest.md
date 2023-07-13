# ConvertPositionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentToken** | **String** | Key of the instrument | 
**newProduct** | [**NewProductEnum**](#NewProductEnum) | Indicates the new product to use for the convert positions | 
**oldProduct** | [**OldProductEnum**](#OldProductEnum) | Indicates the old product to use for the convert positions | 
**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) | Indicates whether its a buy(b) or sell(s) order | 
**quantity** | **Integer** | Quantity with which the position to convert | 

<a name="NewProductEnum"></a>
## Enum: NewProductEnum
Name | Value
---- | -----
I | &quot;I&quot;
D | &quot;D&quot;
CO | &quot;CO&quot;
OCO | &quot;OCO&quot;
MTF | &quot;MTF&quot;

<a name="OldProductEnum"></a>
## Enum: OldProductEnum
Name | Value
---- | -----
I | &quot;I&quot;
D | &quot;D&quot;
CO | &quot;CO&quot;
OCO | &quot;OCO&quot;
MTF | &quot;MTF&quot;

<a name="TransactionTypeEnum"></a>
## Enum: TransactionTypeEnum
Name | Value
---- | -----
BUY | &quot;BUY&quot;
SELL | &quot;SELL&quot;
