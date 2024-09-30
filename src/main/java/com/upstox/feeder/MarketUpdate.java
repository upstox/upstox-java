package com.upstox.feeder;

import java.util.List;
import java.util.Map;

public class MarketUpdate {

    private Type type;
    private Map<String, Feed> feeds;
    private long currentTs;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Map<String, Feed> getFeeds() {
        return feeds;
    }

    public void setFeeds(Map<String, Feed> feeds) {
        this.feeds = feeds;
    }

    public long getCurrentTs() {
        return currentTs;
    }

    public void setCurrentTs(long currentTs) {
        this.currentTs = currentTs;
    }

    @Override
    public String toString() {
        return "FeedResponse [type=" + type + ", feeds=" + feeds +", currentTs=" + currentTs +  "]";
    }

    public static class LTPC {
        private double ltp;
        private long ltt;
        private long ltq;
        private double cp; // close price

        public double getLtp() {
            return ltp;
        }

        public void setLtp(double ltp) {
            this.ltp = ltp;
        }

        public long getLtt() {
            return ltt;
        }

        public void setLtt(long ltt) {
            this.ltt = ltt;
        }

        public long getLtq() {
            return ltq;
        }

        public void setLtq(long ltq) {
            this.ltq = ltq;
        }

        public double getCp() {
            return cp;
        }

        public void setCp(double cp) {
            this.cp = cp;
        }

        @Override
        public String toString() {
            return "LTPC [ltp=" + ltp + ", ltt=" + ltt + ", ltq=" + ltq + ", cp=" + cp + "]";
        }

    }

    public static class Quote {
        private int bq; // bid quantity
        private double bp; // bid price
        private int bno; // bid number of orders
        private int aq; // ask quantity
        private double ap; // ask price
        private int ano; // ask number of orders
        private long bidQ;  // bid quantity long
        private long askQ;  // ask quantity long

        public int getBq() {
            return bq;
        }

        public void setBq(int bq) {
            this.bq = bq;
        }

        public double getBp() {
            return bp;
        }

        public void setBp(double bp) {
            this.bp = bp;
        }

        public int getBno() {
            return bno;
        }

        public void setBno(int bno) {
            this.bno = bno;
        }

        public int getAq() {
            return aq;
        }

        public void setAq(int aq) {
            this.aq = aq;
        }

        public double getAp() {
            return ap;
        }

        public void setAp(double ap) {
            this.ap = ap;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public long getAskQ() {
            return askQ;
        }

        public void setAskQ(long askQ) {
            this.askQ = askQ;
        }

        public long getBidQ() {
            return bidQ;
        }

        public void setBidQ(long bidQ) {
            this.bidQ = bidQ;
        }
        @Override
        public String toString() {
            return "Quote [bq=" + bq + ", bp=" + bp + ", bno=" + bno + ", aq=" + aq + ", ap=" + ap + ", ano=" + ano
                    + ", askQ=" + askQ + ", bidQ=" + bidQ + "]";
        }

    }

    public static class OptionGreeks {
        private double op; // option price
        private double up; // underlying price
        private double iv; // implied volatility
        private double delta;
        private double theta;
        private double gamma;
        private double vega;
        private double rho;

        public double getOp() {
            return op;
        }

        public void setOp(double op) {
            this.op = op;
        }

        public double getUp() {
            return up;
        }

        public void setUp(double up) {
            this.up = up;
        }

        public double getIv() {
            return iv;
        }

        public void setIv(double iv) {
            this.iv = iv;
        }

        public double getDelta() {
            return delta;
        }

        public void setDelta(double delta) {
            this.delta = delta;
        }

        public double getTheta() {
            return theta;
        }

        public void setTheta(double theta) {
            this.theta = theta;
        }

        public double getGamma() {
            return gamma;
        }

        public void setGamma(double gamma) {
            this.gamma = gamma;
        }

        public double getVega() {
            return vega;
        }

        public void setVega(double vega) {
            this.vega = vega;
        }

        public double getRho() {
            return rho;
        }

        public void setRho(double rho) {
            this.rho = rho;
        }

        @Override
        public String toString() {
            return "OptionGreeks [op=" + op + ", up=" + up + ", iv=" + iv + ", delta=" + delta + ", theta=" + theta
                    + ", gamma=" + gamma + ", vega=" + vega + ", rho=" + rho + "]";
        }

    }

    public static class OHLC {
        private String interval;
        private double open;
        private double high;
        private double low;
        private double close;
        private int volume;
        private long ts;
        private long vol;

        public String getInterval() {
            return interval;
        }

        public void setInterval(String interval) {
            this.interval = interval;
        }

        public double getOpen() {
            return open;
        }

        public void setOpen(double open) {
            this.open = open;
        }

        public double getHigh() {
            return high;
        }

        public void setHigh(double high) {
            this.high = high;
        }

        public double getLow() {
            return low;
        }

        public void setLow(double low) {
            this.low = low;
        }

        public double getClose() {
            return close;
        }

        public void setClose(double close) {
            this.close = close;
        }

        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }

        public long getTs() {
            return ts;
        }

        public void setTs(long ts) {
            this.ts = ts;
        }

        public long getVol() {
            return vol;
        }

        public void setVol(long vol) {
            this.vol = vol;
        }
        @Override
        public String toString() {
            return "OHLC [interval=" + interval + ", open=" + open + ", high=" + high + ", low=" + low + ", close="
                    + close + ", volume=" + volume + ", ts=" + ts + ", vol=" + vol + "]";
        }

    }

    public static class MarketLevel {
        private List<Quote> bidAskQuote;

        public List<Quote> getBidAskQuote() {
            return bidAskQuote;
        }

        public void setBidAskQuote(List<Quote> bidAskQuote) {
            this.bidAskQuote = bidAskQuote;
        }

        @Override
        public String toString() {
            return "MarketLevel [bidAskQuote=" + bidAskQuote + "]";
        }

    }

    public static class MarketOHLC {
        private List<OHLC> ohlc;

        public List<OHLC> getOhlc() {
            return ohlc;
        }

        public void setOhlc(List<OHLC> ohlc) {
            this.ohlc = ohlc;
        }

        @Override
        public String toString() {
            return "MarketOHLC [ohlc=" + ohlc + "]";
        }

    }

    public static class ExtendedFeedDetails {
        private double atp; // Average traded price
        private double cp; // Close price
        private long vtt; // Volume traded today
        private double oi; // Open interest
        private double changeOi; // Change in open interest
        private double lastClose; // Last closing price
        private double tbq; // Total buy quantity
        private double tsq; // Total sell quantity
        private double close; // Close price
        private double lc; // Lower circuit limit
        private double uc; // Upper circuit limit
        private double yh; // Yearly high
        private double yl; // Yearly low
        private double fp; // Fill price
        private int fv; // Fill volume
        private long mbpBuy; // Market Best Price (Buy)
        private long mbpSell; // Market Best Price (Sell)
        private long tv; // Traded volume
        private double dhoi; // Day high open interest
        private double dloi; // Day low open interest
        private double sp; // Spot price
        private double poi; // Previous open interest

        public double getAtp() {
            return atp;
        }

        public void setAtp(double atp) {
            this.atp = atp;
        }

        public double getCp() {
            return cp;
        }

        public void setCp(double cp) {
            this.cp = cp;
        }

        public long getVtt() {
            return vtt;
        }

        public void setVtt(long vtt) {
            this.vtt = vtt;
        }

        public double getOi() {
            return oi;
        }

        public void setOi(double oi) {
            this.oi = oi;
        }

        public double getChangeOi() {
            return changeOi;
        }

        public void setChangeOi(double changeOi) {
            this.changeOi = changeOi;
        }

        public double getLastClose() {
            return lastClose;
        }

        public void setLastClose(double lastClose) {
            this.lastClose = lastClose;
        }

        public double getTbq() {
            return tbq;
        }

        public void setTbq(double tbq) {
            this.tbq = tbq;
        }

        public double getTsq() {
            return tsq;
        }

        public void setTsq(double tsq) {
            this.tsq = tsq;
        }

        public double getClose() {
            return close;
        }

        public void setClose(double close) {
            this.close = close;
        }

        public double getLc() {
            return lc;
        }

        public void setLc(double lc) {
            this.lc = lc;
        }

        public double getUc() {
            return uc;
        }

        public void setUc(double uc) {
            this.uc = uc;
        }

        public double getYh() {
            return yh;
        }

        public void setYh(double yh) {
            this.yh = yh;
        }

        public double getYl() {
            return yl;
        }

        public void setYl(double yl) {
            this.yl = yl;
        }

        public double getFp() {
            return fp;
        }

        public void setFp(double fp) {
            this.fp = fp;
        }

        public int getFv() {
            return fv;
        }

        public void setFv(int fv) {
            this.fv = fv;
        }

        public long getMbpBuy() {
            return mbpBuy;
        }

        public void setMbpBuy(long mbpBuy) {
            this.mbpBuy = mbpBuy;
        }

        public long getMbpSell() {
            return mbpSell;
        }

        public void setMbpSell(long mbpSell) {
            this.mbpSell = mbpSell;
        }

        public long getTv() {
            return tv;
        }

        public void setTv(long tv) {
            this.tv = tv;
        }

        public double getDhoi() {
            return dhoi;
        }

        public void setDhoi(double dhoi) {
            this.dhoi = dhoi;
        }

        public double getDloi() {
            return dloi;
        }

        public void setDloi(double dloi) {
            this.dloi = dloi;
        }

        public double getSp() {
            return sp;
        }

        public void setSp(double sp) {
            this.sp = sp;
        }

        public double getPoi() {
            return poi;
        }

        public void setPoi(double poi) {
            this.poi = poi;
        }

        @Override
        public String toString() {
            return "ExtendedFeedDetails [atp=" + atp + ", cp=" + cp + ", vtt=" + vtt + ", oi=" + oi + ", changeOi="
                    + changeOi + ", lastClose=" + lastClose + ", tbq=" + tbq + ", tsq=" + tsq + ", close=" + close
                    + ", lc=" + lc + ", uc=" + uc + ", yh=" + yh + ", yl=" + yl + ", fp=" + fp + ", fv=" + fv
                    + ", mbpBuy=" + mbpBuy + ", mbpSell=" + mbpSell + ", tv=" + tv + ", dhoi=" + dhoi + ", dloi=" + dloi
                    + ", sp=" + sp + ", poi=" + poi + "]";
        }

    }

    public enum Type {
        initial_feed, live_feed
    }

    public static class MarketFullFeed {
        private LTPC ltpc;
        private MarketLevel marketLevel;
        private OptionGreeks optionGreeks;
        private MarketOHLC marketOHLC;
        private ExtendedFeedDetails eFeedDetails;

        public LTPC getLtpc() {
            return ltpc;
        }

        public void setLtpc(LTPC ltpc) {
            this.ltpc = ltpc;
        }

        public MarketLevel getMarketLevel() {
            return marketLevel;
        }

        public void setMarketLevel(MarketLevel marketLevel) {
            this.marketLevel = marketLevel;
        }

        public OptionGreeks getOptionGreeks() {
            return optionGreeks;
        }

        public void setOptionGreeks(OptionGreeks optionGreeks) {
            this.optionGreeks = optionGreeks;
        }

        public MarketOHLC getMarketOHLC() {
            return marketOHLC;
        }

        public void setMarketOHLC(MarketOHLC marketOHLC) {
            this.marketOHLC = marketOHLC;
        }

        public ExtendedFeedDetails geteFeedDetails() {
            return eFeedDetails;
        }

        public void seteFeedDetails(ExtendedFeedDetails eFeedDetails) {
            this.eFeedDetails = eFeedDetails;
        }

        @Override
        public String toString() {
            return "MarketFullFeed [ltpc=" + ltpc + ", marketLevel=" + marketLevel + ", optionGreeks=" + optionGreeks
                    + ", marketOHLC=" + marketOHLC + ", eFeedDetails=" + eFeedDetails + "]";
        }

    }

    public static class IndexFullFeed {
        private LTPC ltpc;
        private MarketOHLC marketOHLC;
        private double lastClose;
        private double yh; // yearly high
        private double yl; // yearly low

        public LTPC getLtpc() {
            return ltpc;
        }

        public void setLtpc(LTPC ltpc) {
            this.ltpc = ltpc;
        }

        public MarketOHLC getMarketOHLC() {
            return marketOHLC;
        }

        public void setMarketOHLC(MarketOHLC marketOHLC) {
            this.marketOHLC = marketOHLC;
        }

        public double getLastClose() {
            return lastClose;
        }

        public void setLastClose(double lastClose) {
            this.lastClose = lastClose;
        }

        public double getYh() {
            return yh;
        }

        public void setYh(double yh) {
            this.yh = yh;
        }

        public double getYl() {
            return yl;
        }

        public void setYl(double yl) {
            this.yl = yl;
        }

        @Override
        public String toString() {
            return "IndexFullFeed [ltpc=" + ltpc + ", marketOHLC=" + marketOHLC + ", lastClose=" + lastClose + ", yh="
                    + yh + ", yl=" + yl + "]";
        }

    }

    public static class FullFeed {
        private MarketFullFeed marketFF;
        private IndexFullFeed indexFF;

        public MarketFullFeed getMarketFF() {
            return marketFF;
        }

        public void setMarketFF(MarketFullFeed marketFF) {
            this.marketFF = marketFF;
        }

        public IndexFullFeed getIndexFF() {
            return indexFF;
        }

        public void setIndexFF(IndexFullFeed indexFF) {
            this.indexFF = indexFF;
        }

        @Override
        public String toString() {
            return "FullFeed [marketFF=" + marketFF + ", indexFF=" + indexFF + "]";
        }

    }

    public static class OptionChain {
        private LTPC ltpc;
        private Quote bidAskQuote;
        private OptionGreeks optionGreeks;
        private ExtendedFeedDetails eFeedDetails;

        public LTPC getLtpc() {
            return ltpc;
        }

        public void setLtpc(LTPC ltpc) {
            this.ltpc = ltpc;
        }

        public Quote getBidAskQuote() {
            return bidAskQuote;
        }

        public void setBidAskQuote(Quote bidAskQuote) {
            this.bidAskQuote = bidAskQuote;
        }

        public OptionGreeks getOptionGreeks() {
            return optionGreeks;
        }

        public void setOptionGreeks(OptionGreeks optionGreeks) {
            this.optionGreeks = optionGreeks;
        }

        public ExtendedFeedDetails geteFeedDetails() {
            return eFeedDetails;
        }

        public void seteFeedDetails(ExtendedFeedDetails eFeedDetails) {
            this.eFeedDetails = eFeedDetails;
        }

        @Override
        public String toString() {
            return "OptionChain [ltpc=" + ltpc + ", bidAskQuote=" + bidAskQuote + ", optionGreeks=" + optionGreeks
                    + ", eFeedDetails=" + eFeedDetails + "]";
        }

    }

    public static class Feed {
        private LTPC ltpc;
        private FullFeed ff;
        private OptionChain oc;

        public LTPC getLtpc() {
            return ltpc;
        }

        public void setLtpc(LTPC ltpc) {
            this.ltpc = ltpc;
        }

        public FullFeed getFf() {
            return ff;
        }

        public void setFf(FullFeed ff) {
            this.ff = ff;
        }

        public OptionChain getOc() {
            return oc;
        }

        public void setOc(OptionChain oc) {
            this.oc = oc;
        }

        @Override
        public String toString() {
            return "Feed [ltpc=" + ltpc + ", ff=" + ff + ", oc=" + oc + "]";
        }

    }
}
