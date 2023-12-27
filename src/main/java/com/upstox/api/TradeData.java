/*
 * Upstox Developer API
 * Build your App on the Upstox platform  ![Banner](https://api-v2.upstox.com/api-docs/images/banner.jpg \"banner\")  # Introduction  Upstox API is a set of rest APIs that provide data required to build a complete investment and trading platform. Execute orders in real time, manage user portfolio, stream live market data (using Websocket), and more, with the easy to understand API collection.  All requests are over HTTPS and the requests are sent with the content-type ‘application/json’. Developers have the option of choosing the response type as JSON or CSV for a few API calls.  To be able to use these APIs you need to create an App in the Developer Console and generate your **apiKey** and **apiSecret**. You can use a redirect URL which will be called after the login flow.  If you are a **trader**, you can directly create apps from Upstox mobile app or the desktop platform itself from **Apps** sections inside the **Account** Tab. Head over to <a href=\"http://account.upstox.com/developer/apps\" target=\"_blank\">account.upstox.com/developer/apps</a>.</br> If you are a **business** looking to integrate Upstox APIs, reach out to us and we will get a custom app created for you in no time.  It is highly recommended that you do not embed the **apiSecret** in your frontend app. Create a remote backend which does the handshake on behalf of the frontend app. Marking the apiSecret in the frontend app will make your app vulnerable to threats and potential issues. 
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
 * Response data for trades
 */
@Schema(description = "Response data for trades")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-12T20:29:09.823661+05:30[Asia/Kolkata]")

public class TradeData {
  /**
   * Exchange to which the order is associated
   */
  @JsonAdapter(ExchangeEnum.Adapter.class)
  public enum ExchangeEnum {
    @SerializedName("NSE")
    NSE("NSE"),
    @SerializedName("NFO")
    NFO("NFO"),
    @SerializedName("CDS")
    CDS("CDS"),
    @SerializedName("BSE")
    BSE("BSE"),
    @SerializedName("BCD")
    BCD("BCD"),
    @SerializedName("BFO")
    BFO("BFO"),
    @SerializedName("MCX")
    MCX("MCX");

    private String value;

    ExchangeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ExchangeEnum fromValue(String input) {
      for (ExchangeEnum b : ExchangeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ExchangeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExchangeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ExchangeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ExchangeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("exchange")
  private ExchangeEnum exchange = null;

  /**
   * Shows if the order was either Intraday, Delivery, CO or OCO
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

  @SerializedName("tradingsymbol")
  private String tradingsymbol = null;

  @SerializedName("trading_symbol")
  private String tradingSymbol = null;

  @SerializedName("instrument_token")
  private String instrumentToken = null;

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

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("exchange_order_id")
  private String exchangeOrderId = null;

  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("exchange_timestamp")
  private String exchangeTimestamp = null;

  @SerializedName("average_price")
  private Float averagePrice = null;

  @SerializedName("trade_id")
  private String tradeId = null;

  @SerializedName("order_ref_id")
  private String orderRefId = null;

  @SerializedName("order_timestamp")
  private String orderTimestamp = null;

   /**
   * Exchange to which the order is associated
   * @return exchange
  **/
  @Schema(example = "NSE", description = "Exchange to which the order is associated")
  public ExchangeEnum getExchange() {
    return exchange;
  }

   /**
   * Shows if the order was either Intraday, Delivery, CO or OCO
   * @return product
  **/
  @Schema(example = "D", description = "Shows if the order was either Intraday, Delivery, CO or OCO")
  public ProductEnum getProduct() {
    return product;
  }

   /**
   * Shows the trading symbol which could be a combination of symbol name, instrument, expiry date etc
   * @return tradingsymbol
  **/
  @Schema(example = "GMRINFRA-EQ", description = "Shows the trading symbol which could be a combination of symbol name, instrument, expiry date etc")
  public String getTradingsymbol() {
    return tradingsymbol;
  }

   /**
   * Shows the trading symbol which could be a combination of symbol name, instrument, expiry date etc
   * @return tradingSymbol
  **/
  @Schema(example = "GMRINFRA-EQ", description = "Shows the trading symbol which could be a combination of symbol name, instrument, expiry date etc")
  public String getTradingSymbol() {
    return tradingSymbol;
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
   * Type of order. It can be one of the following MARKET refers to market order&lt;br&gt;LIMIT refers to Limit Order&lt;br&gt;SL refers to Stop Loss Limit&lt;br&gt;SL-M refers to Stop loss market
   * @return orderType
  **/
  @Schema(example = "MARKET", description = "Type of order. It can be one of the following MARKET refers to market order<br>LIMIT refers to Limit Order<br>SL refers to Stop Loss Limit<br>SL-M refers to Stop loss market")
  public OrderTypeEnum getOrderType() {
    return orderType;
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
   * The total quantity traded from this particular order
   * @return quantity
  **/
  @Schema(example = "1", description = "The total quantity traded from this particular order")
  public Integer getQuantity() {
    return quantity;
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
   * Unique order ID assigned internally for the order placed
   * @return orderId
  **/
  @Schema(example = "221013001021539", description = "Unique order ID assigned internally for the order placed")
  public String getOrderId() {
    return orderId;
  }

   /**
   * User readable time at when the trade occurred
   * @return exchangeTimestamp
  **/
  @Schema(example = "03-Aug-2017 15:03:42", description = "User readable time at when the trade occurred")
  public String getExchangeTimestamp() {
    return exchangeTimestamp;
  }

   /**
   * Price at which the traded quantity is traded
   * @return averagePrice
  **/
  @Schema(example = "299.4", description = "Price at which the traded quantity is traded")
  public Float getAveragePrice() {
    return averagePrice;
  }

   /**
   * Trade ID generated from exchange towards traded transaction
   * @return tradeId
  **/
  @Schema(example = "50091502", description = "Trade ID generated from exchange towards traded transaction")
  public String getTradeId() {
    return tradeId;
  }

   /**
   * The order reference ID for which the order must be modified
   * @return orderRefId
  **/
  @Schema(example = "udapi-aqwsed14356", description = "The order reference ID for which the order must be modified")
  public String getOrderRefId() {
    return orderRefId;
  }

   /**
   * User readable timestamp at which the order was placed
   * @return orderTimestamp
  **/
  @Schema(example = "23-Apr-2021 14:22:06", description = "User readable timestamp at which the order was placed")
  public String getOrderTimestamp() {
    return orderTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeData tradeData = (TradeData) o;
    return Objects.equals(this.exchange, tradeData.exchange) &&
        Objects.equals(this.product, tradeData.product) &&
        Objects.equals(this.tradingsymbol, tradeData.tradingsymbol) &&
        Objects.equals(this.tradingSymbol, tradeData.tradingSymbol) &&
        Objects.equals(this.instrumentToken, tradeData.instrumentToken) &&
        Objects.equals(this.orderType, tradeData.orderType) &&
        Objects.equals(this.transactionType, tradeData.transactionType) &&
        Objects.equals(this.quantity, tradeData.quantity) &&
        Objects.equals(this.exchangeOrderId, tradeData.exchangeOrderId) &&
        Objects.equals(this.orderId, tradeData.orderId) &&
        Objects.equals(this.exchangeTimestamp, tradeData.exchangeTimestamp) &&
        Objects.equals(this.averagePrice, tradeData.averagePrice) &&
        Objects.equals(this.tradeId, tradeData.tradeId) &&
        Objects.equals(this.orderRefId, tradeData.orderRefId) &&
        Objects.equals(this.orderTimestamp, tradeData.orderTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchange, product, tradingsymbol, tradingSymbol, instrumentToken, orderType, transactionType, quantity, exchangeOrderId, orderId, exchangeTimestamp, averagePrice, tradeId, orderRefId, orderTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeData {\n");
    
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    tradingsymbol: ").append(toIndentedString(tradingsymbol)).append("\n");
    sb.append("    tradingSymbol: ").append(toIndentedString(tradingSymbol)).append("\n");
    sb.append("    instrumentToken: ").append(toIndentedString(instrumentToken)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    exchangeOrderId: ").append(toIndentedString(exchangeOrderId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    exchangeTimestamp: ").append(toIndentedString(exchangeTimestamp)).append("\n");
    sb.append("    averagePrice: ").append(toIndentedString(averagePrice)).append("\n");
    sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
    sb.append("    orderRefId: ").append(toIndentedString(orderRefId)).append("\n");
    sb.append("    orderTimestamp: ").append(toIndentedString(orderTimestamp)).append("\n");
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
