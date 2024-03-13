package com.upstox.feeder;

import com.google.gson.annotations.SerializedName;

public class OrderUpdate {

    @SerializedName("user_id")
    private String userId;

    @SerializedName("exchange")
    private String exchange;

    @SerializedName("instrument_token")
    private String instrumentToken;

    @SerializedName("instrument_key")
    private String instrumentKey;

    @SerializedName("trading_symbol")
    private String tradingSymbol;

    @SerializedName("product")
    private String product;

    @SerializedName("order_type")
    private String orderType;

    @SerializedName("average_price")
    private double averagePrice;

    @SerializedName("price")
    private double price;

    @SerializedName("trigger_price")
    private double triggerPrice;

    @SerializedName("quantity")
    private int quantity;

    @SerializedName("disclosed_quantity")
    private int disclosedQuantity;

    @SerializedName("pending_quantity")
    private int pendingQuantity;

    @SerializedName("transaction_type")
    private String transactionType;

    @SerializedName("order_ref_id")
    private String orderRefId;

    @SerializedName("exchange_order_id")
    private String exchangeOrderId;

    @SerializedName("parent_order_id")
    private String parentOrderId;

    @SerializedName("validity")
    private String validity;

    @SerializedName("status")
    private String status;

    @SerializedName("is_amo")
    private boolean isAmo;

    @SerializedName("variety")
    private String variety;

    @SerializedName("tag")
    private String tag;

    @SerializedName("exchange_timestamp")
    private String exchangeTimestamp;

    @SerializedName("status_message")
    private String statusMessage;

    @SerializedName("order_id")
    private String orderId;

    @SerializedName("order_request_id")
    private String orderRequestId;

    @SerializedName("order_timestamp")
    private String orderTimestamp;

    @SerializedName("filled_quantity")
    private int filledQuantity;

    @SerializedName("guid")
    private String guid;

    @SerializedName("placed_by")
    private String placedBy;

    @SerializedName("status_message_raw")
    private String statusMessageRaw;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

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

    public String getTradingSymbol() {
        return tradingSymbol;
    }

    public void setTradingSymbol(String tradingSymbol) {
        this.tradingSymbol = tradingSymbol;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTriggerPrice() {
        return triggerPrice;
    }

    public void setTriggerPrice(double triggerPrice) {
        this.triggerPrice = triggerPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDisclosedQuantity() {
        return disclosedQuantity;
    }

    public void setDisclosedQuantity(int disclosedQuantity) {
        this.disclosedQuantity = disclosedQuantity;
    }

    public int getPendingQuantity() {
        return pendingQuantity;
    }

    public void setPendingQuantity(int pendingQuantity) {
        this.pendingQuantity = pendingQuantity;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getOrderRefId() {
        return orderRefId;
    }

    public void setOrderRefId(String orderRefId) {
        this.orderRefId = orderRefId;
    }

    public String getExchangeOrderId() {
        return exchangeOrderId;
    }

    public void setExchangeOrderId(String exchangeOrderId) {
        this.exchangeOrderId = exchangeOrderId;
    }

    public String getParentOrderId() {
        return parentOrderId;
    }

    public void setParentOrderId(String parentOrderId) {
        this.parentOrderId = parentOrderId;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isAmo() {
        return isAmo;
    }

    public void setAmo(boolean isAmo) {
        this.isAmo = isAmo;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getExchangeTimestamp() {
        return exchangeTimestamp;
    }

    public void setExchangeTimestamp(String exchangeTimestamp) {
        this.exchangeTimestamp = exchangeTimestamp;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderRequestId() {
        return orderRequestId;
    }

    public void setOrderRequestId(String orderRequestId) {
        this.orderRequestId = orderRequestId;
    }

    public String getOrderTimestamp() {
        return orderTimestamp;
    }

    public void setOrderTimestamp(String orderTimestamp) {
        this.orderTimestamp = orderTimestamp;
    }

    public int getFilledQuantity() {
        return filledQuantity;
    }

    public void setFilledQuantity(int filledQuantity) {
        this.filledQuantity = filledQuantity;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getPlacedBy() {
        return placedBy;
    }

    public void setPlacedBy(String placedBy) {
        this.placedBy = placedBy;
    }

    public String getStatusMessageRaw() {
        return statusMessageRaw;
    }

    public void setStatusMessageRaw(String statusMessageRaw) {
        this.statusMessageRaw = statusMessageRaw;
    }

    @Override
    public String toString() {
        return "OrderUpdate [userId=" + userId + ", exchange=" + exchange + ", instrumentToken=" + instrumentToken
                + ", instrumentKey=" + instrumentKey + ", tradingSymbol=" + tradingSymbol + ", product=" + product
                + ", orderType=" + orderType + ", averagePrice=" + averagePrice + ", price=" + price + ", triggerPrice="
                + triggerPrice + ", quantity=" + quantity + ", disclosedQuantity=" + disclosedQuantity
                + ", pendingQuantity=" + pendingQuantity + ", transactionType=" + transactionType + ", orderRefId="
                + orderRefId + ", exchangeOrderId=" + exchangeOrderId + ", parentOrderId=" + parentOrderId
                + ", validity=" + validity + ", status=" + status + ", isAmo=" + isAmo + ", variety=" + variety
                + ", tag=" + tag + ", exchangeTimestamp=" + exchangeTimestamp + ", statusMessage=" + statusMessage
                + ", orderId=" + orderId + ", orderRequestId=" + orderRequestId + ", orderTimestamp=" + orderTimestamp
                + ", filledQuantity=" + filledQuantity + ", guid=" + guid + ", placedBy=" + placedBy
                + ", statusMessageRaw=" + statusMessageRaw + "]";
    }

}
