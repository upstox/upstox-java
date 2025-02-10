package com.upstox.feeder;

import java.util.List;
import java.util.Map;

public class MarketUpdateV3 {

    private Type type;
    private Map<String, Feed> feeds;
    private long currentTs;
    private MarketInfo marketInfo;

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

    public MarketInfo getMarketInfo() {
        return marketInfo;
    }

    public void setMarketInfo(MarketInfo marketInfo) {
        this.marketInfo = marketInfo;
    }

    @Override
    public String toString() {
        return "MarketUpdateV3{" +
                "type=" + type +
                ", feeds=" + feeds +
                ", currentTs=" + currentTs +
                ", marketInfo=" + marketInfo +
                '}';
    }

    public static class LTPC {
        private double ltp;
        private long ltt;
        private long ltq;
        private double cp;

        public double getLtp() {
            return ltp;
        }

        public void setLtp(double ltp) {
            this.ltp = ltp;
        }

        public long getLtt() {
            return ltt;
        }

        public long getLtq() {
            return ltq;
        }

        public void setLtt(long ltt) {
            this.ltt = ltt;
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
            return "LTPC{" +
                    "ltp=" + ltp +
                    ", ltt=" + ltt +
                    ", ltq=" + ltq +
                    ", cp=" + cp +
                    '}';
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
            return "MarketLevel{" +
                    "bidAskQuote=" + bidAskQuote +
                    '}';
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
            return "MarketOHLC{" +
                    "ohlc=" + ohlc +
                    '}';
        }
    }

    public static class Quote {
        private long bidQ;
        private double bidP;
        private long askQ;
        private double askP;

        public long getBidQ() {
            return bidQ;
        }

        public void setBidQ(long bidQ) {
            this.bidQ = bidQ;
        }

        public double getBidP() {
            return bidP;
        }

        public void setBidP(double bidP) {
            this.bidP = bidP;
        }

        public long getAskQ() {
            return askQ;
        }

        public void setAskQ(long askQ) {
            this.askQ = askQ;
        }

        public double getAskP() {
            return askP;
        }

        public void setAskP(double askP) {
            this.askP = askP;
        }

        @Override
        public String toString() {
            return "Quote{" +
                    "bidQ=" + bidQ +
                    ", bidP=" + bidP +
                    ", askQ=" + askQ +
                    ", askP=" + askP +
                    '}';
        }
    }

    public static class OptionGreeks {
        private double delta;
        private double theta;
        private double gamma;
        private double vega;
        private double rho;

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
            return "OptionGreeks{" +
                    "delta=" + delta +
                    ", theta=" + theta +
                    ", gamma=" + gamma +
                    ", vega=" + vega +
                    ", rho=" + rho +
                    '}';
        }
    }

    public static class OHLC {
        private String interval;
        private double open;
        private double high;
        private double low;
        private double close;
        private long vol;
        private long ts;

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

        public long getVol() {
            return vol;
        }

        public void setVol(long vol) {
            this.vol = vol;
        }

        public long getTs() {
            return ts;
        }

        public void setTs(long ts) {
            this.ts = ts;
        }

        @Override
        public String toString() {
            return "OHLC{" +
                    "interval='" + interval + '\'' +
                    ", open=" + open +
                    ", high=" + high +
                    ", low=" + low +
                    ", close=" + close +
                    ", vol=" + vol +
                    ", ts=" + ts +
                    '}';
        }
    }

    public static class MarketFullFeed {
        private LTPC ltpc;
        private MarketLevel marketLevel;
        private OptionGreeks optionGreeks;
        private MarketOHLC marketOHLC;
        private double atp;
        private long vtt;
        private double oi;
        private double iv;
        private double tbq;
        private double tsq;

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

        public double getAtp() {
            return atp;
        }

        public void setAtp(double atp) {
            this.atp = atp;
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

        public double getIv() {
            return iv;
        }

        public void setIv(double iv) {
            this.iv = iv;
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

        @Override
        public String toString() {
            return "MarketFullFeed{" +
                    "ltpc=" + ltpc +
                    ", marketLevel=" + marketLevel +
                    ", optionGreeks=" + optionGreeks +
                    ", marketOHLC=" + marketOHLC +
                    ", atp=" + atp +
                    ", vtt=" + vtt +
                    ", oi=" + oi +
                    ", iv=" + iv +
                    ", tbq=" + tbq +
                    ", tsq=" + tsq +
                    '}';
        }
    }

    public static class IndexFullFeed {
        private LTPC ltpc;
        private MarketOHLC marketOHLC;

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

        @Override
        public String toString() {
            return "IndexFullFeed{" +
                    "ltpc=" + ltpc +
                    ", marketOHLC=" + marketOHLC +
                    '}';
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
            return "FullFeed{" +
                    "marketFF=" + marketFF +
                    ", indexFF=" + indexFF +
                    '}';
        }
    }

    public static class FirstLevelWithGreeks {
        private LTPC ltpc;
        private Quote firstDepth;
        private OptionGreeks optionGreeks;
        private long vtt;
        private double oi;
        private double iv;

        public LTPC getLtpc() {
            return ltpc;
        }

        public void setLtpc(LTPC ltpc) {
            this.ltpc = ltpc;
        }

        public Quote getFirstDepth() {
            return firstDepth;
        }

        public void setFirstDepth(Quote firstDepth) {
            this.firstDepth = firstDepth;
        }

        public OptionGreeks getOptionGreeks() {
            return optionGreeks;
        }

        public void setOptionGreeks(OptionGreeks optionGreeks) {
            this.optionGreeks = optionGreeks;
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

        public double getIv() {
            return iv;
        }

        public void setIv(double iv) {
            this.iv = iv;
        }

        @Override
        public String toString() {
            return "FirstLevelWithGreeks{" +
                    "ltpc=" + ltpc +
                    ", firstDepth=" + firstDepth +
                    ", optionGreeks=" + optionGreeks +
                    ", vtt=" + vtt +
                    ", oi=" + oi +
                    ", iv=" + iv +
                    '}';
        }
    }

    public static class Feed {
        private LTPC ltpc;
        private FullFeed fullFeed;
        private FirstLevelWithGreeks firstLevelWithGreeks;
        private RequestMode requestMode;

        public LTPC getLtpc() {
            return ltpc;
        }

        public void setLtpc(LTPC ltpc) {
            this.ltpc = ltpc;
        }

        public FullFeed getFullFeed() {
            return fullFeed;
        }

        public void setFullFeed(FullFeed fullFeed) {
            this.fullFeed = fullFeed;
        }

        public FirstLevelWithGreeks getFirstLevelWithGreeks() {
            return firstLevelWithGreeks;
        }

        public void setFirstLevelWithGreeks(FirstLevelWithGreeks firstLevelWithGreeks) {
            this.firstLevelWithGreeks = firstLevelWithGreeks;
        }

        public RequestMode getRequestMode() {
            return requestMode;
        }

        public void setRequestMode(RequestMode requestMode) {
            this.requestMode = requestMode;
        }

        @Override
        public String toString() {
            return "Feed{" +
                    "ltpc=" + ltpc +
                    ", fullFeed=" + fullFeed +
                    ", firstLevelWithGreeks=" + firstLevelWithGreeks +
                    ", requestMode=" + requestMode +
                    '}';
        }
    }

    public static class MarketInfo {
        private Map<String, MarketStatus> segmentStatus;

        public Map<String, MarketStatus> getSegmentStatus() {
            return segmentStatus;
        }

        public void setSegmentStatus(Map<String, MarketStatus> segmentStatus) {
            this.segmentStatus = segmentStatus;
        }

        @Override
        public String toString() {
            return "MarketInfo{" +
                    "segmentStatus=" + segmentStatus +
                    '}';
        }
    }

    public enum Type {
        initial_feed, live_feed, market_info
    }

    public enum RequestMode {
        ltpc, full_d5, option_greeks
    }

    public enum MarketStatus {
        PRE_OPEN_START, PRE_OPEN_END, NORMAL_OPEN, NORMAL_CLOSE, CLOSING_START, CLOSING_END
    }
}