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
 * Rule
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-04T13:05:45.049908+05:30[Asia/Kolkata]")

public class Rule {
  @SerializedName("strategy")
  private String strategy = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("trigger_type")
  private String triggerType = null;

  @SerializedName("trigger_price")
  private Double triggerPrice = null;

  @SerializedName("transaction_type")
  private String transactionType = null;

  @SerializedName("order_id")
  private String orderId = null;

  public Rule strategy(String strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * Get strategy
   * @return strategy
  **/
  @Schema(description = "")
  public String getStrategy() {
    return strategy;
  }

  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }

  public Rule status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Rule triggerType(String triggerType) {
    this.triggerType = triggerType;
    return this;
  }

   /**
   * Get triggerType
   * @return triggerType
  **/
  @Schema(description = "")
  public String getTriggerType() {
    return triggerType;
  }

  public void setTriggerType(String triggerType) {
    this.triggerType = triggerType;
  }

  public Rule triggerPrice(Double triggerPrice) {
    this.triggerPrice = triggerPrice;
    return this;
  }

   /**
   * Get triggerPrice
   * @return triggerPrice
  **/
  @Schema(description = "")
  public Double getTriggerPrice() {
    return triggerPrice;
  }

  public void setTriggerPrice(Double triggerPrice) {
    this.triggerPrice = triggerPrice;
  }

  public Rule transactionType(String transactionType) {
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

  public Rule orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @Schema(description = "")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rule rule = (Rule) o;
    return Objects.equals(this.strategy, rule.strategy) &&
        Objects.equals(this.status, rule.status) &&
        Objects.equals(this.triggerType, rule.triggerType) &&
        Objects.equals(this.triggerPrice, rule.triggerPrice) &&
        Objects.equals(this.transactionType, rule.transactionType) &&
        Objects.equals(this.orderId, rule.orderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strategy, status, triggerType, triggerPrice, transactionType, orderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rule {\n");
    
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
    sb.append("    triggerPrice: ").append(toIndentedString(triggerPrice)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
