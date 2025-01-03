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
import com.upstox.api.Margin;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Response data for margin
 */
@Schema(description = "Response data for margin")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-04T13:38:59.557899+05:30[Asia/Kolkata]")

public class MarginData {
  @SerializedName("margins")
  private List<Margin> margins = null;

  @SerializedName("required_margin")
  private Double requiredMargin = null;

  @SerializedName("final_margin")
  private Double finalMargin = null;

   /**
   * Response data for instrument margin details
   * @return margins
  **/
  @Schema(description = "Response data for instrument margin details")
  public List<Margin> getMargins() {
    return margins;
  }

   /**
   * Total margin required to execute the orders
   * @return requiredMargin
  **/
  @Schema(description = "Total margin required to execute the orders")
  public Double getRequiredMargin() {
    return requiredMargin;
  }

   /**
   * Total margin after margin benefit
   * @return finalMargin
  **/
  @Schema(description = "Total margin after margin benefit")
  public Double getFinalMargin() {
    return finalMargin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarginData marginData = (MarginData) o;
    return Objects.equals(this.margins, marginData.margins) &&
        Objects.equals(this.requiredMargin, marginData.requiredMargin) &&
        Objects.equals(this.finalMargin, marginData.finalMargin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(margins, requiredMargin, finalMargin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarginData {\n");
    
    sb.append("    margins: ").append(toIndentedString(margins)).append("\n");
    sb.append("    requiredMargin: ").append(toIndentedString(requiredMargin)).append("\n");
    sb.append("    finalMargin: ").append(toIndentedString(finalMargin)).append("\n");
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