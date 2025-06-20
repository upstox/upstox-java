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
 * MarketQuoteSymbolLtpV3
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-05-11T15:38:03.274098+05:30[Asia/Kolkata]")

public class MarketQuoteSymbolLtpV3 {
  @SerializedName("last_price")
  private Double lastPrice = null;

  @SerializedName("instrument_token")
  private String instrumentToken = null;

  @SerializedName("ltq")
  private Long ltq = null;

  @SerializedName("volume")
  private Long volume = null;

  @SerializedName("cp")
  private Double cp = null;

  public MarketQuoteSymbolLtpV3 lastPrice(Double lastPrice) {
    this.lastPrice = lastPrice;
    return this;
  }

   /**
   * Get lastPrice
   * @return lastPrice
  **/
  @Schema(description = "")
  public Double getLastPrice() {
    return lastPrice;
  }

  public void setLastPrice(Double lastPrice) {
    this.lastPrice = lastPrice;
  }

  public MarketQuoteSymbolLtpV3 instrumentToken(String instrumentToken) {
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

  public MarketQuoteSymbolLtpV3 ltq(Long ltq) {
    this.ltq = ltq;
    return this;
  }

   /**
   * Get ltq
   * @return ltq
  **/
  @Schema(description = "")
  public Long getLtq() {
    return ltq;
  }

  public void setLtq(Long ltq) {
    this.ltq = ltq;
  }

  public MarketQuoteSymbolLtpV3 volume(Long volume) {
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

  public MarketQuoteSymbolLtpV3 cp(Double cp) {
    this.cp = cp;
    return this;
  }

   /**
   * Get cp
   * @return cp
  **/
  @Schema(description = "")
  public Double getCp() {
    return cp;
  }

  public void setCp(Double cp) {
    this.cp = cp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketQuoteSymbolLtpV3 marketQuoteSymbolLtpV3 = (MarketQuoteSymbolLtpV3) o;
    return Objects.equals(this.lastPrice, marketQuoteSymbolLtpV3.lastPrice) &&
        Objects.equals(this.instrumentToken, marketQuoteSymbolLtpV3.instrumentToken) &&
        Objects.equals(this.ltq, marketQuoteSymbolLtpV3.ltq) &&
        Objects.equals(this.volume, marketQuoteSymbolLtpV3.volume) &&
        Objects.equals(this.cp, marketQuoteSymbolLtpV3.cp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastPrice, instrumentToken, ltq, volume, cp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketQuoteSymbolLtpV3 {\n");
    
    sb.append("    lastPrice: ").append(toIndentedString(lastPrice)).append("\n");
    sb.append("    instrumentToken: ").append(toIndentedString(instrumentToken)).append("\n");
    sb.append("    ltq: ").append(toIndentedString(ltq)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    cp: ").append(toIndentedString(cp)).append("\n");
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
