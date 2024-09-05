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
 * Response data for instrument margin details
 */
@Schema(description = "Response data for instrument margin details")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-04T13:38:59.557899+05:30[Asia/Kolkata]")

public class Margin {
  @SerializedName("span_margin")
  private Double spanMargin = null;

  @SerializedName("exposure_margin")
  private Double exposureMargin = null;

  @SerializedName("equity_margin")
  private Double equityMargin = null;

  @SerializedName("net_buy_premium")
  private Double netBuyPremium = null;

  @SerializedName("additional_margin")
  private Double additionalMargin = null;

  @SerializedName("total_margin")
  private Double totalMargin = null;

  @SerializedName("tender_margin")
  private Double tenderMargin = null;

   /**
   * Upfront margin mandatory by exchange for derivatives trade applicable on only FNO trade
   * @return spanMargin
  **/
  @Schema(description = "Upfront margin mandatory by exchange for derivatives trade applicable on only FNO trade")
  public Double getSpanMargin() {
    return spanMargin;
  }

   /**
   * Based on ELM percentage values provided by exchange, applicable on only FNO trade
   * @return exposureMargin
  **/
  @Schema(description = "Based on ELM percentage values provided by exchange, applicable on only FNO trade")
  public Double getExposureMargin() {
    return exposureMargin;
  }

   /**
   * Margin applicable for any equity trade
   * @return equityMargin
  **/
  @Schema(description = "Margin applicable for any equity trade")
  public Double getEquityMargin() {
    return equityMargin;
  }

   /**
   * Option premium required.
   * @return netBuyPremium
  **/
  @Schema(description = "Option premium required.")
  public Double getNetBuyPremium() {
    return netBuyPremium;
  }

   /**
   * Application margin applicable on MCX FNO trade for certain commodities
   * @return additionalMargin
  **/
  @Schema(description = "Application margin applicable on MCX FNO trade for certain commodities")
  public Double getAdditionalMargin() {
    return additionalMargin;
  }

   /**
   * Total margin required for the basket
   * @return totalMargin
  **/
  @Schema(description = "Total margin required for the basket")
  public Double getTotalMargin() {
    return totalMargin;
  }

   /**
   * Tender margin
   * @return tenderMargin
  **/
  @Schema(description = "Tender margin")
  public Double getTenderMargin() {
    return tenderMargin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Margin margin = (Margin) o;
    return Objects.equals(this.spanMargin, margin.spanMargin) &&
        Objects.equals(this.exposureMargin, margin.exposureMargin) &&
        Objects.equals(this.equityMargin, margin.equityMargin) &&
        Objects.equals(this.netBuyPremium, margin.netBuyPremium) &&
        Objects.equals(this.additionalMargin, margin.additionalMargin) &&
        Objects.equals(this.totalMargin, margin.totalMargin) &&
        Objects.equals(this.tenderMargin, margin.tenderMargin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spanMargin, exposureMargin, equityMargin, netBuyPremium, additionalMargin, totalMargin, tenderMargin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Margin {\n");
    
    sb.append("    spanMargin: ").append(toIndentedString(spanMargin)).append("\n");
    sb.append("    exposureMargin: ").append(toIndentedString(exposureMargin)).append("\n");
    sb.append("    equityMargin: ").append(toIndentedString(equityMargin)).append("\n");
    sb.append("    netBuyPremium: ").append(toIndentedString(netBuyPremium)).append("\n");
    sb.append("    additionalMargin: ").append(toIndentedString(additionalMargin)).append("\n");
    sb.append("    totalMargin: ").append(toIndentedString(totalMargin)).append("\n");
    sb.append("    tenderMargin: ").append(toIndentedString(tenderMargin)).append("\n");
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
