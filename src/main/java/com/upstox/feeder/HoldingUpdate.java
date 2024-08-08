package com.upstox.feeder;


import com.google.gson.annotations.SerializedName;

public class HoldingUpdate {
    @SerializedName("instrument_token")
    private String instrumentToken;

    @SerializedName("instrument_key")
    private String instrumentKey;

    @SerializedName("average_price")
    private Double averagePrice;

    @SerializedName("isin")
    private String isin;

    @SerializedName("cnc_used_quantity")
    private Integer cncUsedQuantity;

    @SerializedName("collateral_quantity")
    private Integer collateralQuantity;

    @SerializedName("collateral_type")
    private String collateralType;

    @SerializedName("collateral_update_quantity")
    private String collateralUpdateQuantity;

    @SerializedName("company_name")
    private String companyName;

    @SerializedName("haircut")
    private Double haircut;

    @SerializedName("product")
    private String product;

    @SerializedName("quantity")
    private Integer quantity;

    @SerializedName("t1_quantity")
    private Integer t1Quantity;

    @SerializedName("exchange")
    private String exchange;

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

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public Integer getCncUsedQuantity() {
        return cncUsedQuantity;
    }

    public void setCncUsedQuantity(Integer cncUsedQuantity) {
        this.cncUsedQuantity = cncUsedQuantity;
    }

    public Integer getCollateralQuantity() {
        return collateralQuantity;
    }

    public void setCollateralQuantity(Integer collateralQuantity) {
        this.collateralQuantity = collateralQuantity;
    }

    public String getCollateralType() {
        return collateralType;
    }

    public void setCollateralType(String collateralType) {
        this.collateralType = collateralType;
    }

    public String getCollateralUpdateQuantity() {
        return collateralUpdateQuantity;
    }

    public void setCollateralUpdateQuantity(String collateralUpdateQuantity) {
        this.collateralUpdateQuantity = collateralUpdateQuantity;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Double getHaircut() {
        return haircut;
    }

    public void setHaircut(Double haircut) {
        this.haircut = haircut;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getT1Quantity() {
        return t1Quantity;
    }

    public void setT1Quantity(Integer t1Quantity) {
        this.t1Quantity = t1Quantity;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    @Override
    public String toString() {
        return "HoldingUpdate [instrumentToken=" + instrumentToken + ", instrumentKey=" + instrumentKey
                + ", averagePrice=" + averagePrice + ", isin=" + isin + ", cncUsedQuantity=" + cncUsedQuantity
                + ", collateralQuantity=" + collateralQuantity + ", collateralType=" + collateralType
                + ", collateralUpdateQuantity=" + collateralUpdateQuantity + ", companyName=" + companyName
                + ", haircut=" + haircut + ", product=" + product + ", quantity=" + quantity + ", t1Quantity="
                + t1Quantity + ", exchange=" + exchange + "]";
    }

}
