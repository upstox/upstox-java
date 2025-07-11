/*
 * Upstox Developer API
 * Build your App on the Upstox platform  ![Banner](https://api.upstox.com/api-docs/images/banner.jpg \"banner\")  # Introduction  Upstox API is a set of rest APIs that provide data required to build a complete investment and trading platform. Execute orders in real time, manage user portfolio, stream live market data (using Websocket), and more, with the easy to understand API collection.  All requests are over HTTPS and the requests are sent with the content-type ‘application/json’. Developers have the option of choosing the response type as JSON or CSV for a few API calls.  To be able to use these APIs you need to create an App in the Developer Console and generate your **apiKey** and **apiSecret**. You can use a redirect URL which will be called after the login flow.  If you are a **trader**, you can directly create apps from Upstox mobile app or the desktop platform itself from **Apps** sections inside the **Account** Tab. Head over to <a href=\"http://account.upstox.com/developer/apps\" target=\"_blank\">account.upstox.com/developer/apps</a>.</br> If you are a **business** looking to integrate Upstox APIs, reach out to us and we will get a custom app created for you in no time.  It is highly recommended that you do not embed the **apiSecret** in your frontend app. Create a remote backend which does the handshake on behalf of the frontend app. Marking the apiSecret in the frontend app will make your app vulnerable to threats and potential issues. 
 *
 * OpenAPI spec version: v2
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
 * PlaceOrderRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-12T20:29:09.823661+05:30[Asia/Kolkata]")

public class PlaceOrderRequest {
  @SerializedName("quantity")
  private Integer quantity = null;

  /**
   * Signifies if the order was either Intraday, Delivery, CO or OCO
   */
  @JsonAdapter(ProductEnum.Adapter.class)
  public enum ProductEnum {
    @SerializedName("I")
    I("I"),
    @SerializedName("D")
    D("D"),
    @SerializedName("CO")
    CO("CO"),
    @SerializedName("OCO")
    OCO("OCO"),
    @SerializedName("MTF")
    MTF("MTF");

    private String value;

    ProductEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ProductEnum fromValue(String input) {
      for (ProductEnum b : ProductEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ProductEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProductEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ProductEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ProductEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("product")
  private ProductEnum product = null;

  /**
   * It can be one of the following - DAY(default), IOC
   */
  @JsonAdapter(ValidityEnum.Adapter.class)
  public enum ValidityEnum {
    @SerializedName("DAY")
    DAY("DAY"),
    @SerializedName("IOC")
    IOC("IOC");

    private String value;

    ValidityEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ValidityEnum fromValue(String input) {
      for (ValidityEnum b : ValidityEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ValidityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValidityEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ValidityEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ValidityEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("validity")
  private ValidityEnum validity = null;

  @SerializedName("price")
  private Float price = null;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("instrument_token")
  private String instrumentToken = null;

  /**
   * Type of order. It can be one of the following MARKET refers to market order LIMIT refers to Limit Order SL refers to Stop Loss Limit SL-M refers to Stop Loss Market
   */
  @JsonAdapter(OrderTypeEnum.Adapter.class)
  public enum OrderTypeEnum {
    @SerializedName("MARKET")
    MARKET("MARKET"),
    @SerializedName("LIMIT")
    LIMIT("LIMIT"),
    @SerializedName("SL")
    SL("SL"),
    @SerializedName("SL-M")
    SL_M("SL-M");

    private String value;

    OrderTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OrderTypeEnum fromValue(String input) {
      for (OrderTypeEnum b : OrderTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<OrderTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public OrderTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return OrderTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("order_type")
  private OrderTypeEnum orderType = null;

  /**
   * Indicates whether its a buy or sell order
   */
  @JsonAdapter(TransactionTypeEnum.Adapter.class)
  public enum TransactionTypeEnum {
    @SerializedName("BUY")
    BUY("BUY"),
    @SerializedName("SELL")
    SELL("SELL");

    private String value;

    TransactionTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TransactionTypeEnum fromValue(String input) {
      for (TransactionTypeEnum b : TransactionTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TransactionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransactionTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TransactionTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TransactionTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("transaction_type")
  private TransactionTypeEnum transactionType = null;

  @SerializedName("disclosed_quantity")
  private Integer disclosedQuantity = null;

  @SerializedName("trigger_price")
  private Float triggerPrice = null;

  @SerializedName("is_amo")
  private Boolean isAmo = null;

  public PlaceOrderRequest quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Quantity with which the order is to be placed
   * @return quantity
  **/
  @Schema(example = "1", required = true, description = "Quantity with which the order is to be placed")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public PlaceOrderRequest product(ProductEnum product) {
    this.product = product;
    return this;
  }

   /**
   * Signifies if the order was either Intraday, Delivery, CO or OCO
   * @return product
  **/
  @Schema(example = "D", required = true, description = "Signifies if the order was either Intraday, Delivery, CO or OCO")
  public ProductEnum getProduct() {
    return product;
  }

  public void setProduct(ProductEnum product) {
    this.product = product;
  }

  public PlaceOrderRequest validity(ValidityEnum validity) {
    this.validity = validity;
    return this;
  }

   /**
   * It can be one of the following - DAY(default), IOC
   * @return validity
  **/
  @Schema(example = "DAY", required = true, description = "It can be one of the following - DAY(default), IOC")
  public ValidityEnum getValidity() {
    return validity;
  }

  public void setValidity(ValidityEnum validity) {
    this.validity = validity;
  }

  public PlaceOrderRequest price(Float price) {
    this.price = price;
    return this;
  }

   /**
   * Price at which the order will be placed
   * @return price
  **/
  @Schema(example = "0", required = true, description = "Price at which the order will be placed")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public PlaceOrderRequest tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Tag for a particular order
   * @return tag
  **/
  @Schema(description = "Tag for a particular order")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public PlaceOrderRequest instrumentToken(String instrumentToken) {
    this.instrumentToken = instrumentToken;
    return this;
  }

   /**
   * Key of the instrument
   * @return instrumentToken
  **/
  @Schema(example = "NSE_EQ|INE848E01016", required = true, description = "Key of the instrument")
  public String getInstrumentToken() {
    return instrumentToken;
  }

  public void setInstrumentToken(String instrumentToken) {
    this.instrumentToken = instrumentToken;
  }

  public PlaceOrderRequest orderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * Type of order. It can be one of the following MARKET refers to market order LIMIT refers to Limit Order SL refers to Stop Loss Limit SL-M refers to Stop Loss Market
   * @return orderType
  **/
  @Schema(example = "MARKET", required = true, description = "Type of order. It can be one of the following MARKET refers to market order LIMIT refers to Limit Order SL refers to Stop Loss Limit SL-M refers to Stop Loss Market")
  public OrderTypeEnum getOrderType() {
    return orderType;
  }

  public void setOrderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
  }

  public PlaceOrderRequest transactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Indicates whether its a buy or sell order
   * @return transactionType
  **/
  @Schema(example = "BUY", required = true, description = "Indicates whether its a buy or sell order")
  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }

  public PlaceOrderRequest disclosedQuantity(Integer disclosedQuantity) {
    this.disclosedQuantity = disclosedQuantity;
    return this;
  }

   /**
   * The quantity that should be disclosed in the market depth
   * @return disclosedQuantity
  **/
  @Schema(example = "0", required = true, description = "The quantity that should be disclosed in the market depth")
  public Integer getDisclosedQuantity() {
    return disclosedQuantity;
  }

  public void setDisclosedQuantity(Integer disclosedQuantity) {
    this.disclosedQuantity = disclosedQuantity;
  }

  public PlaceOrderRequest triggerPrice(Float triggerPrice) {
    this.triggerPrice = triggerPrice;
    return this;
  }

   /**
   * If the order is a stop loss order then the trigger price to be set is mentioned here
   * @return triggerPrice
  **/
  @Schema(example = "0", required = true, description = "If the order is a stop loss order then the trigger price to be set is mentioned here")
  public Float getTriggerPrice() {
    return triggerPrice;
  }

  public void setTriggerPrice(Float triggerPrice) {
    this.triggerPrice = triggerPrice;
  }

  public PlaceOrderRequest isAmo(Boolean isAmo) {
    this.isAmo = isAmo;
    return this;
  }

   /**
   * Signifies if the order is an After Market Order
   * @return isAmo
  **/
  @Schema(example = "false", required = true, description = "Signifies if the order is an After Market Order")
  public Boolean isIsAmo() {
    return isAmo;
  }

  public void setIsAmo(Boolean isAmo) {
    this.isAmo = isAmo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaceOrderRequest placeOrderRequest = (PlaceOrderRequest) o;
    return Objects.equals(this.quantity, placeOrderRequest.quantity) &&
        Objects.equals(this.product, placeOrderRequest.product) &&
        Objects.equals(this.validity, placeOrderRequest.validity) &&
        Objects.equals(this.price, placeOrderRequest.price) &&
        Objects.equals(this.tag, placeOrderRequest.tag) &&
        Objects.equals(this.instrumentToken, placeOrderRequest.instrumentToken) &&
        Objects.equals(this.orderType, placeOrderRequest.orderType) &&
        Objects.equals(this.transactionType, placeOrderRequest.transactionType) &&
        Objects.equals(this.disclosedQuantity, placeOrderRequest.disclosedQuantity) &&
        Objects.equals(this.triggerPrice, placeOrderRequest.triggerPrice) &&
        Objects.equals(this.isAmo, placeOrderRequest.isAmo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, product, validity, price, tag, instrumentToken, orderType, transactionType, disclosedQuantity, triggerPrice, isAmo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceOrderRequest {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    instrumentToken: ").append(toIndentedString(instrumentToken)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    disclosedQuantity: ").append(toIndentedString(disclosedQuantity)).append("\n");
    sb.append("    triggerPrice: ").append(toIndentedString(triggerPrice)).append("\n");
    sb.append("    isAmo: ").append(toIndentedString(isAmo)).append("\n");
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
