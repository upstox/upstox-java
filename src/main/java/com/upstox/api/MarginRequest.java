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
import com.upstox.api.Instrument;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * MarginRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-04T13:38:59.557899+05:30[Asia/Kolkata]")

public class MarginRequest {
  @SerializedName("instruments")
  private List<Instrument> instruments = new ArrayList<Instrument>();

  public MarginRequest instruments(List<Instrument> instruments) {
    this.instruments = instruments;
    return this;
  }

  public MarginRequest addInstrumentsItem(Instrument instrumentsItem) {
    this.instruments.add(instrumentsItem);
    return this;
  }

   /**
   * instruments
   * @return instruments
  **/
  @Schema(example = "[{\"instrument_key\":\"NSE_EQ|INE669E01016\",\"quantity\":2,\"transaction_type\":\"BUY\",\"product\":\"D\"},{\"instrument_key\":\"NSE_EQ|INE848E01016\",\"quantity\":5,\"transaction_type\":\"BUY\",\"product\":\"D\"}]", required = true, description = "instruments")
  public List<Instrument> getInstruments() {
    return instruments;
  }

  public void setInstruments(List<Instrument> instruments) {
    this.instruments = instruments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarginRequest marginRequest = (MarginRequest) o;
    return Objects.equals(this.instruments, marginRequest.instruments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instruments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarginRequest {\n");
    
    sb.append("    instruments: ").append(toIndentedString(instruments)).append("\n");
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