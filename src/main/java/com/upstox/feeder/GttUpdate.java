package com.upstox.feeder;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class GttUpdate {

    @SerializedName("type")
    private String type;

    @SerializedName("exchange")
    private String exchange;

    @SerializedName("instrument_token")
    private String instrumentToken;

    @SerializedName("quantity")
    private int quantity;

    @SerializedName("product")
    private String product;

    @SerializedName("gtt_order_id")
    private String gttOrderId;

    @SerializedName("expires_at")
    private long expiresAt;

    @SerializedName("created_at")
    private long createdAt;

    @SerializedName("rules")
    private List<Rule> rules;

    public static class Rule {

        @SerializedName("strategy")
        private String strategy;

        @SerializedName("trigger_type")
        private String triggerType;

        @SerializedName("trigger_price")
        private double triggerPrice;

        @SerializedName("transaction_type")
        private String transactionType;

        @SerializedName("status")
        private String status;

        @SerializedName("order_id")
        private String orderId;

        @SerializedName("message")
        private String message;

        // Getters and Setters
        public String getStrategy() {
            return strategy;
        }

        public void setStrategy(String strategy) {
            this.strategy = strategy;
        }

        public String getTriggerType() {
            return triggerType;
        }

        public void setTriggerType(String triggerType) {
            this.triggerType = triggerType;
        }

        public double getTriggerPrice() {
            return triggerPrice;
        }

        public void setTriggerPrice(double triggerPrice) {
            this.triggerPrice = triggerPrice;
        }

        public String getTransactionType() {
            return transactionType;
        }

        public void setTransactionType(String transactionType) {
            this.transactionType = transactionType;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        @Override
        public String toString() {
            return "Rule{" +
                    "strategy='" + strategy + '\'' +
                    ", triggerType='" + triggerType + '\'' +
                    ", triggerPrice=" + triggerPrice +
                    ", transactionType='" + transactionType + '\'' +
                    ", status='" + status + '\'' +
                    ", message='" + message + '\'' +
                    ", orderId='" + orderId + '\'' +
                    '}';
        }
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getGttOrderId() {
        return gttOrderId;
    }

    public void setGttOrderId(String gttOrderId) {
        this.gttOrderId = gttOrderId;
    }

    public long getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(long expiresAt) {
        this.expiresAt = expiresAt;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    @Override
    public String toString() {
        return "GttUpdate{" +
                "type='" + type + '\'' +
                ", exchange='" + exchange + '\'' +
                ", instrumentToken='" + instrumentToken + '\'' +
                ", quantity=" + quantity +
                ", product='" + product + '\'' +
                ", gttOrderId='" + gttOrderId + '\'' +
                ", expiresAt=" + expiresAt +
                ", createdAt=" + createdAt +
                ", rules=" + rules +
                '}';
    }
}