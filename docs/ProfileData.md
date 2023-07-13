# ProfileData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | E-mail address of the user |  [optional]
**exchanges** | [**List&lt;ExchangesEnum&gt;**](#List&lt;ExchangesEnum&gt;) | Lists the exchanges to which the user has access |  [optional]
**products** | [**List&lt;ProductsEnum&gt;**](#List&lt;ProductsEnum&gt;) | Lists the products types to which the user has access |  [optional]
**broker** | **String** | The broker ID |  [optional]
**userId** | **String** | Uniquely identifies the user |  [optional]
**userName** | **String** | Name of the user |  [optional]
**orderTypes** | [**List&lt;OrderTypesEnum&gt;**](#List&lt;OrderTypesEnum&gt;) | Order types enabled for the user |  [optional]
**userType** | **String** |   Identifies the user&#x27;s registered role at the broker. This will be individual for all retail users |  [optional]
**poa** | **Boolean** |   To depict if the user has given power of attorney for transactions |  [optional]
**isActive** | **Boolean** |   Whether the status of account is active or not |  [optional]

<a name="List<ExchangesEnum>"></a>
## Enum: List&lt;ExchangesEnum&gt;
Name | Value
---- | -----
NSE | &quot;NSE&quot;
NFO | &quot;NFO&quot;
CDS | &quot;CDS&quot;
BSE | &quot;BSE&quot;
BCD | &quot;BCD&quot;
MCX | &quot;MCX&quot;

<a name="List<ProductsEnum>"></a>
## Enum: List&lt;ProductsEnum&gt;
Name | Value
---- | -----
I | &quot;I&quot;
D | &quot;D&quot;
CO | &quot;CO&quot;
OCO | &quot;OCO&quot;
MTF | &quot;MTF&quot;

<a name="List<OrderTypesEnum>"></a>
## Enum: List&lt;OrderTypesEnum&gt;
Name | Value
---- | -----
MARKET | &quot;MARKET&quot;
LIMIT | &quot;LIMIT&quot;
SL | &quot;SL&quot;
SL_M | &quot;SL-M&quot;
