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
 * Error data for cancel or exit order request
 */
@Schema(description = "Error data for cancel or exit order request")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-10-09T09:11:10.678079+05:30[Asia/Kolkata]")

public class CancelOrExitOrderErrorData {

  @SerializedName("message")
  private String message = null;

  @SerializedName("error_code")
  private String errorCode = null;

  @SerializedName("property_path")
  private String propertyPath = null;

  @SerializedName("invalid_value")
  private Object invalidValue = null;

  @SerializedName("instrument_key")
  private String instrumentKey = null;

  @SerializedName("order_id")
  private String orderId = null;

  public CancelOrExitOrderErrorData message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Verbose message for the error state
   * @return message
  **/
  @Schema(description = "Verbose message for the error state")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CancelOrExitOrderErrorData errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(description = "")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public CancelOrExitOrderErrorData propertyPath(String propertyPath) {
    this.propertyPath = propertyPath;
    return this;
  }

   /**
   * Get propertyPath
   * @return propertyPath
  **/
  @Schema(description = "")
  public String getPropertyPath() {
    return propertyPath;
  }

  public void setPropertyPath(String propertyPath) {
    this.propertyPath = propertyPath;
  }

  public CancelOrExitOrderErrorData invalidValue(Object invalidValue) {
    this.invalidValue = invalidValue;
    return this;
  }

   /**
   * Get invalidValue
   * @return invalidValue
  **/
  @Schema(description = "")
  public Object getInvalidValue() {
    return invalidValue;
  }

  public void setInvalidValue(Object invalidValue) {
    this.invalidValue = invalidValue;
  }

   /**
   * Key of instrument
   * @return instrumentKey
  **/
  @Schema(example = "NSE_EQ|INE002A01018", description = "Key of instrument")
  public String getInstrumentKey() {
    return instrumentKey;
  }

   /**
   * Reference order ID
   * @return orderId
  **/
  @Schema(example = "1644490272000", description = "Reference order ID")
  public String getOrderId() {
    return orderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelOrExitOrderErrorData cancelOrExitOrderErrorData = (CancelOrExitOrderErrorData) o;
    return Objects.equals(this.errorCode, cancelOrExitOrderErrorData.errorCode) &&
        Objects.equals(this.message, cancelOrExitOrderErrorData.message) &&
        Objects.equals(this.propertyPath, cancelOrExitOrderErrorData.propertyPath) &&
        Objects.equals(this.invalidValue, cancelOrExitOrderErrorData.invalidValue) &&
        Objects.equals(this.errorCode, cancelOrExitOrderErrorData.errorCode) &&
        Objects.equals(this.propertyPath, cancelOrExitOrderErrorData.propertyPath) &&
        Objects.equals(this.invalidValue, cancelOrExitOrderErrorData.invalidValue) &&
        Objects.equals(this.instrumentKey, cancelOrExitOrderErrorData.instrumentKey) &&
        Objects.equals(this.orderId, cancelOrExitOrderErrorData.orderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message, propertyPath, invalidValue, errorCode, propertyPath, invalidValue, instrumentKey, orderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelOrExitOrderErrorData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    propertyPath: ").append(toIndentedString(propertyPath)).append("\n");
    sb.append("    invalidValue: ").append(toIndentedString(invalidValue)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    propertyPath: ").append(toIndentedString(propertyPath)).append("\n");
    sb.append("    invalidValue: ").append(toIndentedString(invalidValue)).append("\n");
    sb.append("    instrumentKey: ").append(toIndentedString(instrumentKey)).append("\n");
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