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
| [**strategies/**](strategies/) | Ready-to-run options strategy examples for Nifty 50 (bullish, bearish, neutral, others). |

### Options Strategies

Each strategy file searches for the required Nifty 50 option legs using the Instruments API and places market orders via the v3 Order API.

#### [Bullish](strategies/bullish/)

| File | Strategy | Legs |
|------|----------|------|
| [BuyCall.java](strategies/bullish/code/BuyCall.java) | **Buy Call** | BUY ATM CE |
| [SellPut.java](strategies/bullish/code/SellPut.java) | **Sell Put** | SELL ATM PE |
| [BullCallSpread.java](strategies/bullish/code/BullCallSpread.java) | **Bull Call Spread** | BUY ATM CE + SELL ATM+1 CE |
| [BullPutSpread.java](strategies/bullish/code/BullPutSpread.java) | **Bull Put Spread** | SELL ATM PE + BUY ATM-1 PE |
| [BullButterfly.java](strategies/bullish/code/BullButterfly.java) | **Bull Butterfly** | BUY ATM CE + SELL 2× ATM+1 CE + BUY ATM+2 CE |
| [BullCondor.java](strategies/bullish/code/BullCondor.java) | **Bull Condor** | BUY ATM CE + SELL ATM+1 CE + SELL ATM+2 CE + BUY ATM+3 CE |
| [LongCalendarCall.java](strategies/bullish/code/LongCalendarCall.java) | **Long Calendar with Calls** | SELL current-week ATM CE + BUY next-week ATM CE |
| [LongSyntheticFuture.java](strategies/bullish/code/LongSyntheticFuture.java) | **Long Synthetic Future** | BUY ATM CE + SELL ATM PE |
| [CallRatioBackSpread.java](strategies/bullish/code/CallRatioBackSpread.java) | **Call Ratio Back Spread** | SELL 1× ATM CE + BUY 2× ATM+1 CE |
| [RangeForward.java](strategies/bullish/code/RangeForward.java) | **Range Forward** | SELL ATM-1 PE + BUY ATM+1 CE |

#### [Bearish](strategies/bearish/)

| File | Strategy | Legs |
|------|----------|------|
| [BuyPut.java](strategies/bearish/code/BuyPut.java) | **Buy Put** | BUY ATM PE |
| [SellCall.java](strategies/bearish/code/SellCall.java) | **Sell Call** | SELL ATM CE |
| [BearCallSpread.java](strategies/bearish/code/BearCallSpread.java) | **Bear Call Spread** | SELL ATM CE + BUY ATM+1 CE |
| [BearPutSpread.java](strategies/bearish/code/BearPutSpread.java) | **Bear Put Spread** | BUY ATM PE + SELL ATM-1 PE |
| [BearButterfly.java](strategies/bearish/code/BearButterfly.java) | **Bear Butterfly** | BUY ATM PE + SELL 2× ATM-1 PE + BUY ATM-2 PE |
| [BearCondor.java](strategies/bearish/code/BearCondor.java) | **Bear Condor** | BUY ATM PE + SELL ATM-1 PE + SELL ATM-2 PE + BUY ATM-3 PE |
| [LongCalendarPut.java](strategies/bearish/code/LongCalendarPut.java) | **Long Calendar with Puts** | SELL current-week ATM PE + BUY next-week ATM PE |
| [ShortSyntheticFuture.java](strategies/bearish/code/ShortSyntheticFuture.java) | **Short Synthetic Future** | SELL ATM CE + BUY ATM PE |
| [PutRatioBackSpread.java](strategies/bearish/code/PutRatioBackSpread.java) | **Put Ratio Back Spread** | SELL 1× ATM PE + BUY 2× ATM-1 PE |
| [RiskReversal.java](strategies/bearish/code/RiskReversal.java) | **Risk Reversal** | SELL ATM+1 CE + BUY ATM-1 PE |

#### [Neutral](strategies/neutral/)

| File | Strategy | Legs |
|------|----------|------|
| [ShortStraddle.java](strategies/neutral/code/ShortStraddle.java) | **Short Straddle** | SELL ATM CE + SELL ATM PE |
| [ShortStrangle.java](strategies/neutral/code/ShortStrangle.java) | **Short Strangle** | SELL ATM+1 CE + SELL ATM-1 PE |
| [IronButterfly.java](strategies/neutral/code/IronButterfly.java) | **Iron Butterfly** | SELL ATM CE + SELL ATM PE + BUY ATM+2 CE + BUY ATM-2 PE |
| [Batman.java](strategies/neutral/code/Batman.java) | **Batman** | BUY ATM CE + SELL 2× ATM+1 CE + BUY ATM+2 CE + BUY ATM PE + SELL 2× ATM-1 PE + BUY ATM-2 PE |
| [ShortIronCondor.java](strategies/neutral/code/ShortIronCondor.java) | **Short Iron Condor** | SELL ATM+1 CE + BUY ATM+2 CE + SELL ATM-1 PE + BUY ATM-2 PE |

#### [Others](strategies/others/)

| File | Strategy | Legs |
|------|----------|------|
| [LongStraddle.java](strategies/others/code/LongStraddle.java) | **Long Straddle** | BUY ATM CE + BUY ATM PE |
| [LongStrangle.java](strategies/others/code/LongStrangle.java) | **Long Strangle** | BUY ATM+1 CE + BUY ATM-1 PE |
| [CallRatioSpread.java](strategies/others/code/CallRatioSpread.java) | **Call Ratio Spread** | BUY 1× ATM CE + SELL 2× ATM+1 CE |
| [PutRatioSpread.java](strategies/others/code/PutRatioSpread.java) | **Put Ratio Spread** | BUY 1× ATM PE + SELL 2× ATM-1 PE |
| [LongIronButterfly.java](strategies/others/code/LongIronButterfly.java) | **Long Iron Butterfly** | BUY ATM CE + BUY ATM PE + SELL ATM+2 CE + SELL ATM-2 PE |
| [LongIronCondor.java](strategies/others/code/LongIronCondor.java) | **Long Iron Condor** | BUY ATM+1 CE + SELL ATM+2 CE + BUY ATM-1 PE + SELL ATM-2 PE |
| [Strip.java](strategies/others/code/Strip.java) | **Strip** | BUY 1× ATM CE + BUY 2× ATM PE |
| [Strap.java](strategies/others/code/Strap.java) | **Strap** | BUY 2× ATM CE + BUY 1× ATM PE |
