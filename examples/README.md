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
| [BuyCall.java](strategies/bullish/code/BuyCall.java) | [**Buy Call**](strategies/bullish/README.md#buy-call--codebuycalljava) | BUY ATM CE |
| [SellPut.java](strategies/bullish/code/SellPut.java) | [**Sell Put**](strategies/bullish/README.md#sell-put--codesellputjava) | SELL ATM PE |
| [BullCallSpread.java](strategies/bullish/code/BullCallSpread.java) | [**Bull Call Spread**](strategies/bullish/README.md#bull-call-spread--codebullcallspreadjava) | BUY ATM CE + SELL ATM+1 CE |
| [BullPutSpread.java](strategies/bullish/code/BullPutSpread.java) | [**Bull Put Spread**](strategies/bullish/README.md#bull-put-spread--codebullputspreadjava) | SELL ATM PE + BUY ATM-1 PE |
| [BullButterfly.java](strategies/bullish/code/BullButterfly.java) | [**Bull Butterfly**](strategies/bullish/README.md#bull-butterfly--codebullbutterflyjava) | BUY ATM CE + SELL 2× ATM+1 CE + BUY ATM+2 CE |
| [BullCondor.java](strategies/bullish/code/BullCondor.java) | [**Bull Condor**](strategies/bullish/README.md#bull-condor--codebullcondorjava) | BUY ATM CE + SELL ATM+1 CE + SELL ATM+2 CE + BUY ATM+3 CE |
| [LongCalendarCall.java](strategies/bullish/code/LongCalendarCall.java) | [**Long Calendar with Calls**](strategies/bullish/README.md#long-calendar-with-calls--codelongcalendarcalljava) | SELL current-week ATM CE + BUY next-week ATM CE |
| [LongSyntheticFuture.java](strategies/bullish/code/LongSyntheticFuture.java) | [**Long Synthetic Future**](strategies/bullish/README.md#long-synthetic-future--codelongsyntheticfuturejava) | BUY ATM CE + SELL ATM PE |
| [CallRatioBackSpread.java](strategies/bullish/code/CallRatioBackSpread.java) | [**Call Ratio Back Spread**](strategies/bullish/README.md#call-ratio-back-spread--codecallratiobackspreadjava) | SELL 1× ATM CE + BUY 2× ATM+1 CE |
| [RangeForward.java](strategies/bullish/code/RangeForward.java) | [**Range Forward**](strategies/bullish/README.md#range-forward--coderangeforwardjava) | SELL ATM-1 PE + BUY ATM+1 CE |

#### [Bearish](strategies/bearish/)

| File | Strategy | Legs |
|------|----------|------|
| [BuyPut.java](strategies/bearish/code/BuyPut.java) | [**Buy Put**](strategies/bearish/README.md#buy-put--codebuyputjava) | BUY ATM PE |
| [SellCall.java](strategies/bearish/code/SellCall.java) | [**Sell Call**](strategies/bearish/README.md#sell-call--codesellcalljava) | SELL ATM CE |
| [BearCallSpread.java](strategies/bearish/code/BearCallSpread.java) | [**Bear Call Spread**](strategies/bearish/README.md#bear-call-spread--codebearcallspreadjava) | SELL ATM CE + BUY ATM+1 CE |
| [BearPutSpread.java](strategies/bearish/code/BearPutSpread.java) | [**Bear Put Spread**](strategies/bearish/README.md#bear-put-spread--codebearputspreadjava) | BUY ATM PE + SELL ATM-1 PE |
| [BearButterfly.java](strategies/bearish/code/BearButterfly.java) | [**Bear Butterfly**](strategies/bearish/README.md#bear-butterfly--codebearbutterflyjava) | BUY ATM PE + SELL 2× ATM-1 PE + BUY ATM-2 PE |
| [BearCondor.java](strategies/bearish/code/BearCondor.java) | [**Bear Condor**](strategies/bearish/README.md#bear-condor--codebearcondorjava) | BUY ATM PE + SELL ATM-1 PE + SELL ATM-2 PE + BUY ATM-3 PE |
| [LongCalendarPut.java](strategies/bearish/code/LongCalendarPut.java) | [**Long Calendar with Puts**](strategies/bearish/README.md#long-calendar-with-puts--codelongcalendarputjava) | SELL current-week ATM PE + BUY next-week ATM PE |
| [ShortSyntheticFuture.java](strategies/bearish/code/ShortSyntheticFuture.java) | [**Short Synthetic Future**](strategies/bearish/README.md#short-synthetic-future--codeshortsyntheticfuturejava) | SELL ATM CE + BUY ATM PE |
| [PutRatioBackSpread.java](strategies/bearish/code/PutRatioBackSpread.java) | [**Put Ratio Back Spread**](strategies/bearish/README.md#put-ratio-back-spread--codeputratiobackspreadjava) | SELL 1× ATM PE + BUY 2× ATM-1 PE |
| [RiskReversal.java](strategies/bearish/code/RiskReversal.java) | [**Risk Reversal**](strategies/bearish/README.md#risk-reversal--coderiskreversaljava) | SELL ATM+1 CE + BUY ATM-1 PE |

#### [Neutral](strategies/neutral/)

| File | Strategy | Legs |
|------|----------|------|
| [ShortStraddle.java](strategies/neutral/code/ShortStraddle.java) | [**Short Straddle**](strategies/neutral/README.md#short-straddle--codeshortstraddlejava) | SELL ATM CE + SELL ATM PE |
| [ShortStrangle.java](strategies/neutral/code/ShortStrangle.java) | [**Short Strangle**](strategies/neutral/README.md#short-strangle--codeshortstranglejava) | SELL ATM+1 CE + SELL ATM-1 PE |
| [IronButterfly.java](strategies/neutral/code/IronButterfly.java) | [**Iron Butterfly**](strategies/neutral/README.md#iron-butterfly--codeironbutterflyjava) | SELL ATM CE + SELL ATM PE + BUY ATM+2 CE + BUY ATM-2 PE |
| [Batman.java](strategies/neutral/code/Batman.java) | [**Batman**](strategies/neutral/README.md#batman--codebatmanjava) | BUY ATM CE + SELL 2× ATM+1 CE + BUY ATM+2 CE + BUY ATM PE + SELL 2× ATM-1 PE + BUY ATM-2 PE |
| [ShortIronCondor.java](strategies/neutral/code/ShortIronCondor.java) | [**Short Iron Condor**](strategies/neutral/README.md#short-iron-condor--codeshortironcondorjava) | SELL ATM+1 CE + BUY ATM+2 CE + SELL ATM-1 PE + BUY ATM-2 PE |

#### [Others](strategies/others/)

| File | Strategy | Legs |
|------|----------|------|
| [LongStraddle.java](strategies/others/code/LongStraddle.java) | [**Long Straddle**](strategies/others/README.md#long-straddle--codelongstraddlejava) | BUY ATM CE + BUY ATM PE |
| [LongStrangle.java](strategies/others/code/LongStrangle.java) | [**Long Strangle**](strategies/others/README.md#long-strangle--codelongstranglejava) | BUY ATM+1 CE + BUY ATM-1 PE |
| [CallRatioSpread.java](strategies/others/code/CallRatioSpread.java) | [**Call Ratio Spread**](strategies/others/README.md#call-ratio-spread--codecallratiospreadjava) | BUY 1× ATM CE + SELL 2× ATM+1 CE |
| [PutRatioSpread.java](strategies/others/code/PutRatioSpread.java) | [**Put Ratio Spread**](strategies/others/README.md#put-ratio-spread--codeputratiospreadjava) | BUY 1× ATM PE + SELL 2× ATM-1 PE |
| [LongIronButterfly.java](strategies/others/code/LongIronButterfly.java) | [**Long Iron Butterfly**](strategies/others/README.md#long-iron-butterfly--codelongironbutterflyjava) | BUY ATM CE + BUY ATM PE + SELL ATM+2 CE + SELL ATM-2 PE |
| [LongIronCondor.java](strategies/others/code/LongIronCondor.java) | [**Long Iron Condor**](strategies/others/README.md#long-iron-condor--codelongironcondorjava) | BUY ATM+1 CE + SELL ATM+2 CE + BUY ATM-1 PE + SELL ATM-2 PE |
| [Strip.java](strategies/others/code/Strip.java) | [**Strip**](strategies/others/README.md#strip--codestripjava) | BUY 1× ATM CE + BUY 2× ATM PE |
| [Strap.java](strategies/others/code/Strap.java) | [**Strap**](strategies/others/README.md#strap--codestrapjava) | BUY 2× ATM CE + BUY 1× ATM PE |
