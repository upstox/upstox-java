# MultiOrderSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **Integer** | The total number of order lines present in the payload. |  [optional]
**success** | **Integer** | The number of order lines that were successfully placed without any errors. |  [optional]
**error** | **Integer** | The number of order lines that encountered errors during processing, despite their payloads being valid. |  [optional]
**payloadError** | **Integer** | The number of order lines with payload errors, indicating formatting or data validity issues.&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Note&lt;/b&gt;: Orders are processed only if the entire batch is free of payload_error, ensuring error-free transactions. |  [optional]
