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
import java.util.ArrayList;
import java.util.List;
/**
 * Response data for cancel or exit order request
 */
@Schema(description = "Response data for cancel or exit order request")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-10-09T09:11:10.678079+05:30[Asia/Kolkata]")

public class CancelOrExitMultiOrderData {
  @SerializedName("order_ids")
  private List<String> orderIds = null;

   /**
   * Reference order IDs
   * @return orderIds
  **/
  @Schema(example = "['1644490272000']", description = "Reference order IDs")
  public List<String> getOrderIds() {
    return orderIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelOrExitMultiOrderData cancelOrExitMultiOrderData = (CancelOrExitMultiOrderData) o;
    return Objects.equals(this.orderIds, cancelOrExitMultiOrderData.orderIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelOrExitMultiOrderData {\n");
    
    sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
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
