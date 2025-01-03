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
import com.upstox.api.BatchExecutionSummary;
import com.upstox.api.CancelOrExitMultiOrderData;
import com.upstox.api.CancelOrExitOrderErrorData;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * CancelOrExitMultiOrderResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-10-09T09:11:10.678079+05:30[Asia/Kolkata]")

public class CancelOrExitMultiOrderResponse {
  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    @SerializedName("success")
    SUCCESS("success"),
    @SerializedName("error")
    ERROR("error"),
    @SerializedName("partial_success")
    PARTIAL_SUCCESS("partial_success");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("data")
  private CancelOrExitMultiOrderData data = null;

  @SerializedName("errors")
  private List<CancelOrExitOrderErrorData> errors = null;

  @SerializedName("summary")
  private BatchExecutionSummary summary = null;

  public CancelOrExitMultiOrderResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CancelOrExitMultiOrderResponse data(CancelOrExitMultiOrderData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public CancelOrExitMultiOrderData getData() {
    return data;
  }

  public void setData(CancelOrExitMultiOrderData data) {
    this.data = data;
  }

  public CancelOrExitMultiOrderResponse errors(List<CancelOrExitOrderErrorData> errors) {
    this.errors = errors;
    return this;
  }

  public CancelOrExitMultiOrderResponse addErrorsItem(CancelOrExitOrderErrorData errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<CancelOrExitOrderErrorData>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Error data for cancel or exit order request
   * @return errors
  **/
  @Schema(description = "Error data for cancel or exit order request")
  public List<CancelOrExitOrderErrorData> getErrors() {
    return errors;
  }

  public void setErrors(List<CancelOrExitOrderErrorData> errors) {
    this.errors = errors;
  }

  public CancelOrExitMultiOrderResponse summary(BatchExecutionSummary summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @Schema(description = "")
  public BatchExecutionSummary getSummary() {
    return summary;
  }

  public void setSummary(BatchExecutionSummary summary) {
    this.summary = summary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelOrExitMultiOrderResponse cancelOrExitMultiOrderResponse = (CancelOrExitMultiOrderResponse) o;
    return Objects.equals(this.status, cancelOrExitMultiOrderResponse.status) &&
        Objects.equals(this.data, cancelOrExitMultiOrderResponse.data) &&
        Objects.equals(this.errors, cancelOrExitMultiOrderResponse.errors) &&
        Objects.equals(this.summary, cancelOrExitMultiOrderResponse.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, data, errors, summary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelOrExitMultiOrderResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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