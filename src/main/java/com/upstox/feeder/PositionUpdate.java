package com.upstox.feeder;

import com.google.gson.annotations.SerializedName;

public class PositionUpdate {

    @SerializedName("instrument_token")
    private String instrumentToken;

    @SerializedName("instrument_key")
    private String instrumentKey;

    @SerializedName("average_price")
    private Double averagePrice;

    @SerializedName("buy_value")
    private Double buyValue;

    @SerializedName("overnight_quantity")
    private Integer overnightQuantity;

    @SerializedName("exchange")
    private String exchange;

    @SerializedName("day_buy_value")
    private Double dayBuyValue;

    @SerializedName("day_buy_price")
    private Double dayBuyPrice;

    @SerializedName("overnight_buy_amount")
    private Double overnightBuyAmount;

    @SerializedName("overnight_buy_quantity")
    private Integer overnightBuyQuantity;

    @SerializedName("day_buy_quantity")
    private Integer dayBuyQuantity;

    @SerializedName("day_sell_value")
    private Double daySellValue;

    @SerializedName("day_sell_price")
    private Double daySellPrice;

    @SerializedName("overnight_sell_amount")
    private Double overnightSellAmount;

    @SerializedName("overnight_sell_quantity")
    private Integer overnightSellQuantity;

    @SerializedName("day_sell_quantity")
    private Integer daySellQuantity;

    @SerializedName("multiplier")
    private Integer multiplier;

    @SerializedName("quantity")
    private Integer quantity;

    @SerializedName("product")
    private String product;

    @SerializedName("sell_value")
    private Double sellValue;

    @SerializedName("buy_price")
    private Double buyPrice;

    @SerializedName("sell_price")
    private Double sellPrice;

    public String getInstrumentToken() {
        return instrumentToken;
    }

    public void setInstrumentToken(String instrumentToken) {
        this.instrumentToken = instrumentToken;
    }

    public String getInstrumentKey() {
        return instrumentKey;
    }

    public void setInstrumentKey(String instrumentKey) {
        this.instrumentKey = instrumentKey;
    }

    public Double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(Double averagePrice) {
        this.averagePrice = averagePrice;
    }

    public Double getBuyValue() {
        return buyValue;
    }

    public void setBuyValue(Double buyValue) {
        this.buyValue = buyValue;
    }

    public Integer getOvernightQuantity() {
        return overnightQuantity;
    }

    public void setOvernightQuantity(Integer overnightQuantity) {
        this.overnightQuantity = overnightQuantity;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public Double getDayBuyValue() {
        return dayBuyValue;
    }

    public void setDayBuyValue(Double dayBuyValue) {
        this.dayBuyValue = dayBuyValue;
    }

    public Double getDayBuyPrice() {
        return dayBuyPrice;
    }

    public void setDayBuyPrice(Double dayBuyPrice) {
        this.dayBuyPrice = dayBuyPrice;
    }

    public Double getOvernightBuyAmount() {
        return overnightBuyAmount;
    }

    public void setOvernightBuyAmount(Double overnightBuyAmount) {
        this.overnightBuyAmount = overnightBuyAmount;
    }

    public Integer getOvernightBuyQuantity() {
        return overnightBuyQuantity;
    }

    public void setOvernightBuyQuantity(Integer overnightBuyQuantity) {
        this.overnightBuyQuantity = overnightBuyQuantity;
    }

    public Integer getDayBuyQuantity() {
        return dayBuyQuantity;
    }

    public void setDayBuyQuantity(Integer dayBuyQuantity) {
        this.dayBuyQuantity = dayBuyQuantity;
    }

    public Double getDaySellValue() {
        return daySellValue;
    }

    public void setDaySellValue(Double daySellValue) {
        this.daySellValue = daySellValue;
    }

    public Double getDaySellPrice() {
        return daySellPrice;
    }

    public void setDaySellPrice(Double daySellPrice) {
        this.daySellPrice = daySellPrice;
    }

    public Double getOvernightSellAmount() {
        return overnightSellAmount;
    }

    public void setOvernightSellAmount(Double overnightSellAmount) {
        this.overnightSellAmount = overnightSellAmount;
    }

    public Integer getOvernightSellQuantity() {
        return overnightSellQuantity;
    }

    public void setOvernightSellQuantity(Integer overnightSellQuantity) {
        this.overnightSellQuantity = overnightSellQuantity;
    }

    public Integer getDaySellQuantity() {
        return daySellQuantity;
    }

    public void setDaySellQuantity(Integer daySellQuantity) {
        this.daySellQuantity = daySellQuantity;
    }

    public Integer getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(Integer multiplier) {
        this.multiplier = multiplier;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Double getSellValue() {
        return sellValue;
    }

    public void setSellValue(Double sellValue) {
        this.sellValue = sellValue;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }
    @Override
    public String toString() {
        return "PositionUpdate [instrumentToken=" + instrumentToken +
                ", instrumentKey=" + instrumentKey +
                ", averagePrice=" + averagePrice +
                ", buyValue=" + buyValue +
                ", overnightQuantity=" + overnightQuantity +
                ", exchange=" + exchange +
                ", dayBuyValue=" + dayBuyValue +
                ", dayBuyPrice=" + dayBuyPrice +
                ", overnightBuyAmount=" + overnightBuyAmount +
                ", overnightBuyQuantity=" + overnightBuyQuantity +
                ", dayBuyQuantity=" + dayBuyQuantity +
                ", daySellValue=" + daySellValue +
                ", daySellPrice=" + daySellPrice +
                ", overnightSellAmount=" + overnightSellAmount +
                ", overnightSellQuantity=" + overnightSellQuantity +
                ", daySellQuantity=" + daySellQuantity +
                ", multiplier=" + multiplier +
                ", quantity=" + quantity +
                ", product=" + product +
                ", sellValue=" + sellValue +
                ", buyPrice=" + buyPrice +
                ", sellPrice=" + sellPrice + "]";
    }

}