# Java Sample Implementation

## Websocket

### Market stream feed

Java code to connect to the Upstox Websocket API for streaming live market data. It fetches market data for a list of instrument keys. When the client receives updates from the server, it decodes the incoming protobuf data into a FeedResponse object.

[Market updates using Upstox's websocket](websocket/market_data/v3)

### Porfolio stream feed

Java code to connect to the Upstox WebSocket API for streaming live order updates. It fetches the order updates and prints them to the console.

[Order updates using Upstox's websocket](websocket/order_updates/)