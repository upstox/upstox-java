/*
 * OpenAPI definition
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.upstox.api;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * TradeHistoryResponseTradeData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-25T15:59:27.509882+05:30[Asia/Kolkata]")

public class TradeHistoryResponseTradeData {
  @SerializedName("exchange")
  private String exchange = null;

  @SerializedName("segment")
  private String segment = null;

  @SerializedName("option_type")
  private String optionType = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("amount")
  private Float amount = null;

  @SerializedName("trade_id")
  private String tradeId = null;

  @SerializedName("trade_date")
  private String tradeDate = null;

  @SerializedName("transaction_type")
  private String transactionType = null;

  @SerializedName("scrip_name")
  private String scripName = null;

  @SerializedName("strike_price")
  private String strikePrice = null;

  @SerializedName("expiry")
  private String expiry = null;

  @SerializedName("price")
  private Float price = null;

  @SerializedName("isin")
  private String isin = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("instrument_token")
  private String instrumentToken = null;

  public TradeHistoryResponseTradeData exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * Get exchange
   * @return exchange
  **/
  @Schema(description = "")
  public String getExchange() {
    return exchange;
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
  }

  public TradeHistoryResponseTradeData segment(String segment) {
    this.segment = segment;
    return this;
  }

   /**
   * Get segment
   * @return segment
  **/
  @Schema(description = "")
  public String getSegment() {
    return segment;
  }

  public void setSegment(String segment) {
    this.segment = segment;
  }

  public TradeHistoryResponseTradeData optionType(String optionType) {
    this.optionType = optionType;
    return this;
  }

   /**
   * Get optionType
   * @return optionType
  **/
  @Schema(description = "")
  public String getOptionType() {
    return optionType;
  }

  public void setOptionType(String optionType) {
    this.optionType = optionType;
  }

  public TradeHistoryResponseTradeData quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @Schema(description = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public TradeHistoryResponseTradeData amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @Schema(description = "")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public TradeHistoryResponseTradeData tradeId(String tradeId) {
    this.tradeId = tradeId;
    return this;
  }

   /**
   * Get tradeId
   * @return tradeId
  **/
  @Schema(description = "")
  public String getTradeId() {
    return tradeId;
  }

  public void setTradeId(String tradeId) {
    this.tradeId = tradeId;
  }

  public TradeHistoryResponseTradeData tradeDate(String tradeDate) {
    this.tradeDate = tradeDate;
    return this;
  }

   /**
   * Get tradeDate
   * @return tradeDate
  **/
  @Schema(description = "")
  public String getTradeDate() {
    return tradeDate;
  }

  public void setTradeDate(String tradeDate) {
    this.tradeDate = tradeDate;
  }

  public TradeHistoryResponseTradeData transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @Schema(description = "")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public TradeHistoryResponseTradeData scripName(String scripName) {
    this.scripName = scripName;
    return this;
  }

   /**
   * Get scripName
   * @return scripName
  **/
  @Schema(description = "")
  public String getScripName() {
    return scripName;
  }

  public void setScripName(String scripName) {
    this.scripName = scripName;
  }

  public TradeHistoryResponseTradeData strikePrice(String strikePrice) {
    this.strikePrice = strikePrice;
    return this;
  }

   /**
   * Get strikePrice
   * @return strikePrice
  **/
  @Schema(description = "")
  public String getStrikePrice() {
    return strikePrice;
  }

  public void setStrikePrice(String strikePrice) {
    this.strikePrice = strikePrice;
  }

  public TradeHistoryResponseTradeData expiry(String expiry) {
    this.expiry = expiry;
    return this;
  }

   /**
   * Get expiry
   * @return expiry
  **/
  @Schema(description = "")
  public String getExpiry() {
    return expiry;
  }

  public void setExpiry(String expiry) {
    this.expiry = expiry;
  }

  public TradeHistoryResponseTradeData price(Float price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(description = "")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public TradeHistoryResponseTradeData isin(String isin) {
    this.isin = isin;
    return this;
  }

   /**
   * Get isin
   * @return isin
  **/
  @Schema(description = "")
  public String getIsin() {
    return isin;
  }

  public void setIsin(String isin) {
    this.isin = isin;
  }

  public TradeHistoryResponseTradeData symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @Schema(description = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public TradeHistoryResponseTradeData instrumentToken(String instrumentToken) {
    this.instrumentToken = instrumentToken;
    return this;
  }

   /**
   * Get instrumentToken
   * @return instrumentToken
  **/
  @Schema(description = "")
  public String getInstrumentToken() {
    return instrumentToken;
  }

  public void setInstrumentToken(String instrumentToken) {
    this.instrumentToken = instrumentToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeHistoryResponseTradeData tradeHistoryResponseTradeData = (TradeHistoryResponseTradeData) o;
    return Objects.equals(this.exchange, tradeHistoryResponseTradeData.exchange) &&
        Objects.equals(this.segment, tradeHistoryResponseTradeData.segment) &&
        Objects.equals(this.optionType, tradeHistoryResponseTradeData.optionType) &&
        Objects.equals(this.quantity, tradeHistoryResponseTradeData.quantity) &&
        Objects.equals(this.amount, tradeHistoryResponseTradeData.amount) &&
        Objects.equals(this.tradeId, tradeHistoryResponseTradeData.tradeId) &&
        Objects.equals(this.tradeDate, tradeHistoryResponseTradeData.tradeDate) &&
        Objects.equals(this.transactionType, tradeHistoryResponseTradeData.transactionType) &&
        Objects.equals(this.scripName, tradeHistoryResponseTradeData.scripName) &&
        Objects.equals(this.strikePrice, tradeHistoryResponseTradeData.strikePrice) &&
        Objects.equals(this.expiry, tradeHistoryResponseTradeData.expiry) &&
        Objects.equals(this.price, tradeHistoryResponseTradeData.price) &&
        Objects.equals(this.isin, tradeHistoryResponseTradeData.isin) &&
        Objects.equals(this.symbol, tradeHistoryResponseTradeData.symbol) &&
        Objects.equals(this.instrumentToken, tradeHistoryResponseTradeData.instrumentToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchange, segment, optionType, quantity, amount, tradeId, tradeDate, transactionType, scripName, strikePrice, expiry, price, isin, symbol, instrumentToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeHistoryResponseTradeData {\n");
    
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    optionType: ").append(toIndentedString(optionType)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
    sb.append("    tradeDate: ").append(toIndentedString(tradeDate)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    scripName: ").append(toIndentedString(scripName)).append("\n");
    sb.append("    strikePrice: ").append(toIndentedString(strikePrice)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    instrumentToken: ").append(toIndentedString(instrumentToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
