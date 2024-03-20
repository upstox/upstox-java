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
import com.upstox.api.ExchangeTimingData;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * Response data for holiday list
 */
@Schema(description = "Response data for holiday list")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-18T16:48:30.501580+05:30[Asia/Kolkata]")

public class HolidayData {
  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("description")
  private String description = null;

  /**
   * Gets or Sets holidayType
   */
  @JsonAdapter(HolidayTypeEnum.Adapter.class)
  public enum HolidayTypeEnum {
    @SerializedName("ALL")
    ALL("ALL"),
    @SerializedName("SETTLEMENT_HOLIDAY")
    SETTLEMENT_HOLIDAY("SETTLEMENT_HOLIDAY"),
    @SerializedName("TRADING_HOLIDAY")
    TRADING_HOLIDAY("TRADING_HOLIDAY"),
    @SerializedName("SPECIAL_TIMING")
    SPECIAL_TIMING("SPECIAL_TIMING");

    private String value;

    HolidayTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static HolidayTypeEnum fromValue(String input) {
      for (HolidayTypeEnum b : HolidayTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<HolidayTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HolidayTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public HolidayTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return HolidayTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("holiday_type")
  private HolidayTypeEnum holidayType = null;

  @SerializedName("closed_exchanges")
  private List<String> closedExchanges = null;

  @SerializedName("open_exchanges")
  private List<ExchangeTimingData> openExchanges = null;

  public HolidayData date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @Schema(description = "")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public HolidayData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public HolidayData holidayType(HolidayTypeEnum holidayType) {
    this.holidayType = holidayType;
    return this;
  }

   /**
   * Get holidayType
   * @return holidayType
  **/
  @Schema(description = "")
  public HolidayTypeEnum getHolidayType() {
    return holidayType;
  }

  public void setHolidayType(HolidayTypeEnum holidayType) {
    this.holidayType = holidayType;
  }

  public HolidayData closedExchanges(List<String> closedExchanges) {
    this.closedExchanges = closedExchanges;
    return this;
  }

  public HolidayData addClosedExchangesItem(String closedExchangesItem) {
    if (this.closedExchanges == null) {
      this.closedExchanges = new ArrayList<String>();
    }
    this.closedExchanges.add(closedExchangesItem);
    return this;
  }

   /**
   * Get closedExchanges
   * @return closedExchanges
  **/
  @Schema(description = "")
  public List<String> getClosedExchanges() {
    return closedExchanges;
  }

  public void setClosedExchanges(List<String> closedExchanges) {
    this.closedExchanges = closedExchanges;
  }

  public HolidayData openExchanges(List<ExchangeTimingData> openExchanges) {
    this.openExchanges = openExchanges;
    return this;
  }

  public HolidayData addOpenExchangesItem(ExchangeTimingData openExchangesItem) {
    if (this.openExchanges == null) {
      this.openExchanges = new ArrayList<ExchangeTimingData>();
    }
    this.openExchanges.add(openExchangesItem);
    return this;
  }

   /**
   * Get openExchanges
   * @return openExchanges
  **/
  @Schema(description = "")
  public List<ExchangeTimingData> getOpenExchanges() {
    return openExchanges;
  }

  public void setOpenExchanges(List<ExchangeTimingData> openExchanges) {
    this.openExchanges = openExchanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HolidayData holidayData = (HolidayData) o;
    return Objects.equals(this.date, holidayData.date) &&
        Objects.equals(this.description, holidayData.description) &&
        Objects.equals(this.holidayType, holidayData.holidayType) &&
        Objects.equals(this.closedExchanges, holidayData.closedExchanges) &&
        Objects.equals(this.openExchanges, holidayData.openExchanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, description, holidayType, closedExchanges, openExchanges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HolidayData {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    holidayType: ").append(toIndentedString(holidayType)).append("\n");
    sb.append("    closedExchanges: ").append(toIndentedString(closedExchanges)).append("\n");
    sb.append("    openExchanges: ").append(toIndentedString(openExchanges)).append("\n");
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