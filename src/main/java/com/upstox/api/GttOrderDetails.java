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
import com.upstox.api.Rule;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Response data for order details
 */
@Schema(description = "Response data for order details")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-04T13:05:45.049908+05:30[Asia/Kolkata]")

public class GttOrderDetails {
  @SerializedName("type")
  private String type = null;

  @SerializedName("exchange")
  private String exchange = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("product")
  private String product = null;

  @SerializedName("rules")
  private List<Rule> rules = null;

  @SerializedName("trading_symbol")
  private String tradingSymbol = null;

  @SerializedName("instrument_token")
  private String instrumentToken = null;

  @SerializedName("gtt_order_id")
  private String gttOrderId = null;

  @SerializedName("expires_at")
  private Long expiresAt = null;

  @SerializedName("created_at")
  private Long createdAt = null;

  public GttOrderDetails type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GttOrderDetails exchange(String exchange) {
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

  public GttOrderDetails quantity(Integer quantity) {
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

  public GttOrderDetails product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @Schema(description = "")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public GttOrderDetails rules(List<Rule> rules) {
    this.rules = rules;
    return this;
  }

  public GttOrderDetails addRulesItem(Rule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<Rule>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @Schema(description = "")
  public List<Rule> getRules() {
    return rules;
  }

  public void setRules(List<Rule> rules) {
    this.rules = rules;
  }

  public GttOrderDetails tradingSymbol(String tradingSymbol) {
    this.tradingSymbol = tradingSymbol;
    return this;
  }

   /**
   * Get tradingSymbol
   * @return tradingSymbol
  **/
  @Schema(description = "")
  public String getTradingSymbol() {
    return tradingSymbol;
  }

  public void setTradingSymbol(String tradingSymbol) {
    this.tradingSymbol = tradingSymbol;
  }

  public GttOrderDetails instrumentToken(String instrumentToken) {
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

  public GttOrderDetails gttOrderId(String gttOrderId) {
    this.gttOrderId = gttOrderId;
    return this;
  }

   /**
   * Get gttOrderId
   * @return gttOrderId
  **/
  @Schema(description = "")
  public String getGttOrderId() {
    return gttOrderId;
  }

  public void setGttOrderId(String gttOrderId) {
    this.gttOrderId = gttOrderId;
  }

  public GttOrderDetails expiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @Schema(description = "")
  public Long getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
  }

  public GttOrderDetails createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GttOrderDetails gttOrderDetails = (GttOrderDetails) o;
    return Objects.equals(this.type, gttOrderDetails.type) &&
        Objects.equals(this.exchange, gttOrderDetails.exchange) &&
        Objects.equals(this.quantity, gttOrderDetails.quantity) &&
        Objects.equals(this.product, gttOrderDetails.product) &&
        Objects.equals(this.rules, gttOrderDetails.rules) &&
        Objects.equals(this.tradingSymbol, gttOrderDetails.tradingSymbol) &&
        Objects.equals(this.instrumentToken, gttOrderDetails.instrumentToken) &&
        Objects.equals(this.gttOrderId, gttOrderDetails.gttOrderId) &&
        Objects.equals(this.expiresAt, gttOrderDetails.expiresAt) &&
        Objects.equals(this.createdAt, gttOrderDetails.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, exchange, quantity, product, rules, tradingSymbol, instrumentToken, gttOrderId, expiresAt, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GttOrderDetails {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    tradingSymbol: ").append(toIndentedString(tradingSymbol)).append("\n");
    sb.append("    instrumentToken: ").append(toIndentedString(instrumentToken)).append("\n");
    sb.append("    gttOrderId: ").append(toIndentedString(gttOrderId)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
