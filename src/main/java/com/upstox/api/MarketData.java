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
 * MarketData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-25T15:59:27.509882+05:30[Asia/Kolkata]")

public class MarketData {
  @SerializedName("ltp")
  private Double ltp = null;

  @SerializedName("volume")
  private Long volume = null;

  @SerializedName("oi")
  private Double oi = null;

  @SerializedName("close_price")
  private Double closePrice = null;

  @SerializedName("bid_price")
  private Double bidPrice = null;

  @SerializedName("bid_qty")
  private Integer bidQty = null;

  @SerializedName("ask_price")
  private Double askPrice = null;

  @SerializedName("ask_qty")
  private Integer askQty = null;

  @SerializedName("prev_oi")
  private Double prevOi = null;

  public MarketData ltp(Double ltp) {
    this.ltp = ltp;
    return this;
  }

   /**
   * Get ltp
   * @return ltp
  **/
  @Schema(description = "")
  public Double getLtp() {
    return ltp;
  }

  public void setLtp(Double ltp) {
    this.ltp = ltp;
  }

  public MarketData volume(Long volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @Schema(description = "")
  public Long getVolume() {
    return volume;
  }

  public void setVolume(Long volume) {
    this.volume = volume;
  }

  public MarketData oi(Double oi) {
    this.oi = oi;
    return this;
  }

   /**
   * Get oi
   * @return oi
  **/
  @Schema(description = "")
  public Double getOi() {
    return oi;
  }

  public void setOi(Double oi) {
    this.oi = oi;
  }

  public MarketData closePrice(Double closePrice) {
    this.closePrice = closePrice;
    return this;
  }

   /**
   * Get closePrice
   * @return closePrice
  **/
  @Schema(description = "")
  public Double getClosePrice() {
    return closePrice;
  }

  public void setClosePrice(Double closePrice) {
    this.closePrice = closePrice;
  }

  public MarketData bidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
    return this;
  }

   /**
   * Get bidPrice
   * @return bidPrice
  **/
  @Schema(description = "")
  public Double getBidPrice() {
    return bidPrice;
  }

  public void setBidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
  }

  public MarketData bidQty(Integer bidQty) {
    this.bidQty = bidQty;
    return this;
  }

   /**
   * Get bidQty
   * @return bidQty
  **/
  @Schema(description = "")
  public Integer getBidQty() {
    return bidQty;
  }

  public void setBidQty(Integer bidQty) {
    this.bidQty = bidQty;
  }

  public MarketData askPrice(Double askPrice) {
    this.askPrice = askPrice;
    return this;
  }

   /**
   * Get askPrice
   * @return askPrice
  **/
  @Schema(description = "")
  public Double getAskPrice() {
    return askPrice;
  }

  public void setAskPrice(Double askPrice) {
    this.askPrice = askPrice;
  }

  public MarketData askQty(Integer askQty) {
    this.askQty = askQty;
    return this;
  }

   /**
   * Get askQty
   * @return askQty
  **/
  @Schema(description = "")
  public Integer getAskQty() {
    return askQty;
  }

  public void setAskQty(Integer askQty) {
    this.askQty = askQty;
  }

  public MarketData prevOi(Double prevOi) {
    this.prevOi = prevOi;
    return this;
  }

   /**
   * Get prevOi
   * @return prevOi
  **/
  @Schema(description = "")
  public Double getPrevOi() {
    return prevOi;
  }

  public void setPrevOi(Double prevOi) {
    this.prevOi = prevOi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketData marketData = (MarketData) o;
    return Objects.equals(this.ltp, marketData.ltp) &&
        Objects.equals(this.volume, marketData.volume) &&
        Objects.equals(this.oi, marketData.oi) &&
        Objects.equals(this.closePrice, marketData.closePrice) &&
        Objects.equals(this.bidPrice, marketData.bidPrice) &&
        Objects.equals(this.bidQty, marketData.bidQty) &&
        Objects.equals(this.askPrice, marketData.askPrice) &&
        Objects.equals(this.askQty, marketData.askQty) &&
        Objects.equals(this.prevOi, marketData.prevOi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ltp, volume, oi, closePrice, bidPrice, bidQty, askPrice, askQty, prevOi);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketData {\n");
    
    sb.append("    ltp: ").append(toIndentedString(ltp)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    oi: ").append(toIndentedString(oi)).append("\n");
    sb.append("    closePrice: ").append(toIndentedString(closePrice)).append("\n");
    sb.append("    bidPrice: ").append(toIndentedString(bidPrice)).append("\n");
    sb.append("    bidQty: ").append(toIndentedString(bidQty)).append("\n");
    sb.append("    askPrice: ").append(toIndentedString(askPrice)).append("\n");
    sb.append("    askQty: ").append(toIndentedString(askQty)).append("\n");
    sb.append("    prevOi: ").append(toIndentedString(prevOi)).append("\n");
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
