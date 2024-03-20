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
 * AnalyticsData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-18T16:48:30.501580+05:30[Asia/Kolkata]")

public class AnalyticsData {
  @SerializedName("vega")
  private Double vega = null;

  @SerializedName("theta")
  private Double theta = null;

  @SerializedName("gamma")
  private Double gamma = null;

  @SerializedName("delta")
  private Double delta = null;

  @SerializedName("iv")
  private Double iv = null;

  @SerializedName("pop")
  private Double pop = null;

  public AnalyticsData vega(Double vega) {
    this.vega = vega;
    return this;
  }

   /**
   * Get vega
   * @return vega
  **/
  @Schema(description = "")
  public Double getVega() {
    return vega;
  }

  public void setVega(Double vega) {
    this.vega = vega;
  }

  public AnalyticsData theta(Double theta) {
    this.theta = theta;
    return this;
  }

   /**
   * Get theta
   * @return theta
  **/
  @Schema(description = "")
  public Double getTheta() {
    return theta;
  }

  public void setTheta(Double theta) {
    this.theta = theta;
  }

  public AnalyticsData gamma(Double gamma) {
    this.gamma = gamma;
    return this;
  }

   /**
   * Get gamma
   * @return gamma
  **/
  @Schema(description = "")
  public Double getGamma() {
    return gamma;
  }

  public void setGamma(Double gamma) {
    this.gamma = gamma;
  }

  public AnalyticsData delta(Double delta) {
    this.delta = delta;
    return this;
  }

   /**
   * Get delta
   * @return delta
  **/
  @Schema(description = "")
  public Double getDelta() {
    return delta;
  }

  public void setDelta(Double delta) {
    this.delta = delta;
  }

  public AnalyticsData iv(Double iv) {
    this.iv = iv;
    return this;
  }

   /**
   * Get iv
   * @return iv
  **/
  @Schema(description = "")
  public Double getIv() {
    return iv;
  }

  public void setIv(Double iv) {
    this.iv = iv;
  }

  public AnalyticsData pop(Double pop) {
    this.pop = pop;
    return this;
  }

   /**
   * Get pop
   * @return pop
  **/
  @Schema(description = "")
  public Double getPop() {
    return pop;
  }

  public void setPop(Double pop) {
    this.pop = pop;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsData analyticsData = (AnalyticsData) o;
    return Objects.equals(this.vega, analyticsData.vega) &&
        Objects.equals(this.theta, analyticsData.theta) &&
        Objects.equals(this.gamma, analyticsData.gamma) &&
        Objects.equals(this.delta, analyticsData.delta) &&
        Objects.equals(this.iv, analyticsData.iv) &&
        Objects.equals(this.pop, analyticsData.pop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vega, theta, gamma, delta, iv, pop);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsData {\n");
    
    sb.append("    vega: ").append(toIndentedString(vega)).append("\n");
    sb.append("    theta: ").append(toIndentedString(theta)).append("\n");
    sb.append("    gamma: ").append(toIndentedString(gamma)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
    sb.append("    iv: ").append(toIndentedString(iv)).append("\n");
    sb.append("    pop: ").append(toIndentedString(pop)).append("\n");
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
