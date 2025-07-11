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
 * Response data for order Book
 */
@Schema(description = "Response data for order Book")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-12T20:29:09.823661+05:30[Asia/Kolkata]")

public class OrderBookData {
  /**
   * Exchange to which the order is associated
   */

  @SerializedName("exchange")
  private String exchange = null;

  /**
   * Shows if the order was either Intraday, Delivery, CoverOrder or OneCancelsOther
   */
  @SerializedName("product")
  private String product = null;

  @SerializedName("price")
  private Float price = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("instrument_token")
  private String instrumentToken = null;

  @SerializedName("placed_by")
  private String placedBy = null;

  @SerializedName("tradingsymbol")
  private String tradingsymbol = null;

  @SerializedName("trading_symbol")
  private String tradingSymbol = null;

  /**
   * Type of order. It can be one of the following MARKET refers to market order&lt;br&gt;LIMIT refers to Limit Order&lt;br&gt;SL refers to Stop Loss Limit&lt;br&gt;SL-M refers to Stop loss market
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
   * Order validity (DAY- Day and IOC- Immediate or Cancel (IOC) order)
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

  @SerializedName("trigger_price")
  private Float triggerPrice = null;

  @SerializedName("disclosed_quantity")
  private Integer disclosedQuantity = null;

  /**
   * Indicates whether the order was a buy or sell order
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

  @SerializedName("average_price")
  private Float averagePrice = null;

  @SerializedName("filled_quantity")
  private Integer filledQuantity = null;

  @SerializedName("pending_quantity")
  private Integer pendingQuantity = null;

  @SerializedName("status_message")
  private String statusMessage = null;

  @SerializedName("status_message_raw")
  private String statusMessageRaw = null;

  @SerializedName("exchange_order_id")
  private String exchangeOrderId = null;

  @SerializedName("parent_order_id")
  private String parentOrderId = null;

  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("variety")
  private String variety = null;

  @SerializedName("order_timestamp")
  private String orderTimestamp = null;

  @SerializedName("exchange_timestamp")
  private String exchangeTimestamp = null;

  @SerializedName("is_amo")
  private Boolean isAmo = null;

  @SerializedName("order_request_id")
  private String orderRequestId = null;

  @SerializedName("order_ref_id")
  private String orderRefId = null;

   /**
   * Exchange to which the order is associated
   * @return exchange
  **/
  @Schema(example = "NSE", description = "Exchange to which the order is associated")
  public String getExchange() {
    return exchange;
  }

   /**
   * Shows if the order was either Intraday, Delivery, CoverOrder or OneCancelsOther
   * @return product
  **/
  @Schema(example = "D", description = "Shows if the order was either Intraday, Delivery, CoverOrder or OneCancelsOther")
  public String getProduct() {
    return product;
  }

   /**
   * Price at which the order was placed
   * @return price
  **/
  @Schema(example = "120.01", description = "Price at which the order was placed")
  public Float getPrice() {
    return price;
  }

   /**
   * Quantity with which the order was placed
   * @return quantity
  **/
  @Schema(example = "1", description = "Quantity with which the order was placed")
  public Integer getQuantity() {
    return quantity;
  }

   /**
   * Indicates the current status of the order. Valid order status’ are outlined in the table below
   * @return status
  **/
  @Schema(example = "Complete", description = "Indicates the current status of the order. Valid order status’ are outlined in the table below")
  public String getStatus() {
    return status;
  }

   /**
   * Get guid
   * @return guid
  **/
  @Schema(description = "")
  public String getGuid() {
    return guid;
  }

   /**
   * Tag to uniquely identify an order
   * @return tag
  **/
  @Schema(description = "Tag to uniquely identify an order")
  public String getTag() {
    return tag;
  }

   /**
   * Identifier issued by Upstox used for subscribing to live market quotes
   * @return instrumentToken
  **/
  @Schema(example = "151064324", description = "Identifier issued by Upstox used for subscribing to live market quotes")
  public String getInstrumentToken() {
    return instrumentToken;
  }

   /**
   * Uniquely identifies the user
   * @return placedBy
  **/
  @Schema(example = "200123", description = "Uniquely identifies the user")
  public String getPlacedBy() {
    return placedBy;
  }

   /**
   * Shows the trading symbol of the instrument
   * @return tradingsymbol
  **/
  @Schema(example = "GMR", description = "Shows the trading symbol of the instrument")
  public String getTradingsymbol() {
    return tradingsymbol;
  }

   /**
   * Shows the trading symbol of the instrument
   * @return tradingSymbol
  **/
  @Schema(example = "GMR", description = "Shows the trading symbol of the instrument")
  public String getTradingSymbol() {
    return tradingSymbol;
  }

   /**
   * Type of order. It can be one of the following MARKET refers to market order&lt;br&gt;LIMIT refers to Limit Order&lt;br&gt;SL refers to Stop Loss Limit&lt;br&gt;SL-M refers to Stop loss market
   * @return orderType
  **/
  @Schema(example = "MARKET", description = "Type of order. It can be one of the following MARKET refers to market order<br>LIMIT refers to Limit Order<br>SL refers to Stop Loss Limit<br>SL-M refers to Stop loss market")
  public OrderTypeEnum getOrderType() {
    return orderType;
  }

   /**
   * Order validity (DAY- Day and IOC- Immediate or Cancel (IOC) order)
   * @return validity
  **/
  @Schema(example = "DAY", description = "Order validity (DAY- Day and IOC- Immediate or Cancel (IOC) order)")
  public ValidityEnum getValidity() {
    return validity;
  }

   /**
   * If the order was a stop loss order then the trigger price set is mentioned here
   * @return triggerPrice
  **/
  @Schema(example = "120", description = "If the order was a stop loss order then the trigger price set is mentioned here")
  public Float getTriggerPrice() {
    return triggerPrice;
  }

   /**
   * The quantity that should be disclosed in the market depth
   * @return disclosedQuantity
  **/
  @Schema(example = "1", description = "The quantity that should be disclosed in the market depth")
  public Integer getDisclosedQuantity() {
    return disclosedQuantity;
  }

   /**
   * Indicates whether the order was a buy or sell order
   * @return transactionType
  **/
  @Schema(example = "BUY", description = "Indicates whether the order was a buy or sell order")
  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }

   /**
   * Average price at which the qty got traded
   * @return averagePrice
  **/
  @Schema(example = "120.01", description = "Average price at which the qty got traded")
  public Float getAveragePrice() {
    return averagePrice;
  }

   /**
   * The total quantity traded from this particular order
   * @return filledQuantity
  **/
  @Schema(description = "The total quantity traded from this particular order")
  public Integer getFilledQuantity() {
    return filledQuantity;
  }

   /**
   * Pending quantity to be filled
   * @return pendingQuantity
  **/
  @Schema(example = "1", description = "Pending quantity to be filled")
  public Integer getPendingQuantity() {
    return pendingQuantity;
  }

   /**
   * Indicates the reason when any order is rejected, not modified or cancelled
   * @return statusMessage
  **/
  @Schema(description = "Indicates the reason when any order is rejected, not modified or cancelled")
  public String getStatusMessage() {
    return statusMessage;
  }

   /**
   * Description of the order&#x27;s status as received from RMS
   * @return statusMessageRaw
  **/
  @Schema(description = "Description of the order's status as received from RMS")
  public String getStatusMessageRaw() {
    return statusMessageRaw;
  }

   /**
   * Unique order ID assigned by the exchange for the order placed
   * @return exchangeOrderId
  **/
  @Schema(example = "221013001021540", description = "Unique order ID assigned by the exchange for the order placed")
  public String getExchangeOrderId() {
    return exchangeOrderId;
  }

   /**
   * In case the order is part of the second or third leg of a CO or OCO, the parent order ID is indicated here
   * @return parentOrderId
  **/
  @Schema(example = "221013001021541", description = "In case the order is part of the second or third leg of a CO or OCO, the parent order ID is indicated here")
  public String getParentOrderId() {
    return parentOrderId;
  }

   /**
   * Unique order ID assigned internally for the order placed
   * @return orderId
  **/
  @Schema(example = "221013001021541", description = "Unique order ID assigned internally for the order placed")
  public String getOrderId() {
    return orderId;
  }

   /**
   * Order complexity
   * @return variety
  **/
  @Schema(example = "SIMPLE", description = "Order complexity")
  public String getVariety() {
    return variety;
  }

   /**
   * User readable timestamp at which the order was placed
   * @return orderTimestamp
  **/
  @Schema(example = "23-Apr-2021 14:22:06", description = "User readable timestamp at which the order was placed")
  public String getOrderTimestamp() {
    return orderTimestamp;
  }

   /**
   * User readable time at which the order was placed or updated
   * @return exchangeTimestamp
  **/
  @Schema(example = "24-Apr-2021 14:22:06", description = "User readable time at which the order was placed or updated")
  public String getExchangeTimestamp() {
    return exchangeTimestamp;
  }

   /**
   * Signifies if the order is an After Market Order
   * @return isAmo
  **/
  @Schema(example = "false", description = "Signifies if the order is an After Market Order")
  public Boolean isIsAmo() {
    return isAmo;
  }

   /**
   * Apart from 1st order it shows the count of how many requests were sent
   * @return orderRequestId
  **/
  @Schema(example = "221013001021542", description = "Apart from 1st order it shows the count of how many requests were sent")
  public String getOrderRequestId() {
    return orderRequestId;
  }

   /**
   * The order reference ID for which the order must be modified
   * @return orderRefId
  **/
  @Schema(example = "udapi-12345abcd", description = "The order reference ID for which the order must be modified")
  public String getOrderRefId() {
    return orderRefId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderBookData orderBookData = (OrderBookData) o;
    return Objects.equals(this.exchange, orderBookData.exchange) &&
        Objects.equals(this.product, orderBookData.product) &&
        Objects.equals(this.price, orderBookData.price) &&
        Objects.equals(this.quantity, orderBookData.quantity) &&
        Objects.equals(this.status, orderBookData.status) &&
        Objects.equals(this.guid, orderBookData.guid) &&
        Objects.equals(this.tag, orderBookData.tag) &&
        Objects.equals(this.instrumentToken, orderBookData.instrumentToken) &&
        Objects.equals(this.placedBy, orderBookData.placedBy) &&
        Objects.equals(this.tradingsymbol, orderBookData.tradingsymbol) &&
        Objects.equals(this.tradingSymbol, orderBookData.tradingSymbol) &&
        Objects.equals(this.orderType, orderBookData.orderType) &&
        Objects.equals(this.validity, orderBookData.validity) &&
        Objects.equals(this.triggerPrice, orderBookData.triggerPrice) &&
        Objects.equals(this.disclosedQuantity, orderBookData.disclosedQuantity) &&
        Objects.equals(this.transactionType, orderBookData.transactionType) &&
        Objects.equals(this.averagePrice, orderBookData.averagePrice) &&
        Objects.equals(this.filledQuantity, orderBookData.filledQuantity) &&
        Objects.equals(this.pendingQuantity, orderBookData.pendingQuantity) &&
        Objects.equals(this.statusMessage, orderBookData.statusMessage) &&
        Objects.equals(this.statusMessageRaw, orderBookData.statusMessageRaw) &&
        Objects.equals(this.exchangeOrderId, orderBookData.exchangeOrderId) &&
        Objects.equals(this.parentOrderId, orderBookData.parentOrderId) &&
        Objects.equals(this.orderId, orderBookData.orderId) &&
        Objects.equals(this.variety, orderBookData.variety) &&
        Objects.equals(this.orderTimestamp, orderBookData.orderTimestamp) &&
        Objects.equals(this.exchangeTimestamp, orderBookData.exchangeTimestamp) &&
        Objects.equals(this.isAmo, orderBookData.isAmo) &&
        Objects.equals(this.orderRequestId, orderBookData.orderRequestId) &&
        Objects.equals(this.orderRefId, orderBookData.orderRefId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchange, product, price, quantity, status, guid, tag, instrumentToken, placedBy, tradingsymbol, tradingSymbol, orderType, validity, triggerPrice, disclosedQuantity, transactionType, averagePrice, filledQuantity, pendingQuantity, statusMessage, statusMessageRaw, exchangeOrderId, parentOrderId, orderId, variety, orderTimestamp, exchangeTimestamp, isAmo, orderRequestId, orderRefId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBookData {\n");
    
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    instrumentToken: ").append(toIndentedString(instrumentToken)).append("\n");
    sb.append("    placedBy: ").append(toIndentedString(placedBy)).append("\n");
    sb.append("    tradingsymbol: ").append(toIndentedString(tradingsymbol)).append("\n");
    sb.append("    tradingSymbol: ").append(toIndentedString(tradingSymbol)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    triggerPrice: ").append(toIndentedString(triggerPrice)).append("\n");
    sb.append("    disclosedQuantity: ").append(toIndentedString(disclosedQuantity)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    averagePrice: ").append(toIndentedString(averagePrice)).append("\n");
    sb.append("    filledQuantity: ").append(toIndentedString(filledQuantity)).append("\n");
    sb.append("    pendingQuantity: ").append(toIndentedString(pendingQuantity)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    statusMessageRaw: ").append(toIndentedString(statusMessageRaw)).append("\n");
    sb.append("    exchangeOrderId: ").append(toIndentedString(exchangeOrderId)).append("\n");
    sb.append("    parentOrderId: ").append(toIndentedString(parentOrderId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    variety: ").append(toIndentedString(variety)).append("\n");
    sb.append("    orderTimestamp: ").append(toIndentedString(orderTimestamp)).append("\n");
    sb.append("    exchangeTimestamp: ").append(toIndentedString(exchangeTimestamp)).append("\n");
    sb.append("    isAmo: ").append(toIndentedString(isAmo)).append("\n");
    sb.append("    orderRequestId: ").append(toIndentedString(orderRequestId)).append("\n");
    sb.append("    orderRefId: ").append(toIndentedString(orderRefId)).append("\n");
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
