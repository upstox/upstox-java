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
 * instruments
 */
@Schema(description = "instruments")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-04T13:38:59.557899+05:30[Asia/Kolkata]")

public class Instrument {
  @SerializedName("instrument_key")
  private String instrumentKey = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("product")
  private String product = null;

  @SerializedName("transaction_type")
  private String transactionType = null;

  @SerializedName("price")
  private Double price = null;

  public Instrument instrumentKey(String instrumentKey) {
    this.instrumentKey = instrumentKey;
    return this;
  }

   /**
   * Instrument Key of the Instrument
   * @return instrumentKey
  **/
  @Schema(example = "NSE_EQ|INE848E01016", required = true, description = "Instrument Key of the Instrument")
  public String getInstrumentKey() {
    return instrumentKey;
  }

  public void setInstrumentKey(String instrumentKey) {
    this.instrumentKey = instrumentKey;
  }

  public Instrument quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Quantity of the instrument to buy or sell for margin calculation
   * minimum: 1
   * @return quantity
  **/
  @Schema(example = "1", required = true, description = "Quantity of the instrument to buy or sell for margin calculation")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Instrument product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Product with which the order is to be placed
   * @return product
  **/
  @Schema(example = "D", required = true, description = "Product with which the order is to be placed")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public Instrument transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Indicates whether its a BUY or SELL order
   * @return transactionType
  **/
  @Schema(example = "BUY", required = true, description = "Indicates whether its a BUY or SELL order")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public Instrument price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * price
   * minimum: 0
   * @return price
  **/
  @Schema(example = "123.9", description = "price")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instrument instrument = (Instrument) o;
    return Objects.equals(this.instrumentKey, instrument.instrumentKey) &&
        Objects.equals(this.quantity, instrument.quantity) &&
        Objects.equals(this.product, instrument.product) &&
        Objects.equals(this.transactionType, instrument.transactionType) &&
        Objects.equals(this.price, instrument.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentKey, quantity, product, transactionType, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instrument {\n");
    
    sb.append("    instrumentKey: ").append(toIndentedString(instrumentKey)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
