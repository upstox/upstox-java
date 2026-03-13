# Upstox Java SDK Examples

This directory contains Java SDK code examples for the Upstox API, organized by category.

## Prerequisites

- Java 8 or higher
- Maven or Gradle
- An Upstox account with API access
- A valid access token

## Maven Dependency

Add the following dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>com.upstox.api</groupId>
    <artifactId>upstox-java-api</artifactId>
    <version>LATEST</version>
    <scope>compile</scope>
</dependency>
```

## Folder Structure

| Category | Description |
|----------|-------------|
| [login](./login/) | Authentication — get access token and logout |
| [user](./user/) | User profile and fund/margin details |
| [orders](./orders/) | Place, modify, cancel orders and fetch order details |
| [portfolio](./portfolio/) | Positions, holdings, MTF positions, and position conversion |
| [market-quote](./market-quote/) | LTP, OHLC, full market quotes, and option greeks |
| [historical-data](./historical-data/) | Historical and intra-day candle data |
| [option-chain](./option-chain/) | Option contracts and put/call option chain |
| [expired-instruments](./expired-instruments/) | Expired instrument data and historical candles |
| [market-information](./market-information/) | Exchange status, market timings, and holidays |
| [gtt-orders](./gtt-orders/) | Good Till Triggered (GTT) order management |
| [margins](./margins/) | Order margin calculations |
| [charges](./charges/) | Brokerage charge calculations |
| [trade-profit-and-loss](./trade-profit-and-loss/) | Trade-wise profit and loss reports |
