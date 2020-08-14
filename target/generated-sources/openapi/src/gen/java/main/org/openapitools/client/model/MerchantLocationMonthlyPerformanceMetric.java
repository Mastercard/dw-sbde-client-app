/*
 * Small Business Decision Enhancer API
 * API for retrieving small business performance metrics such as daily, weekly, monthly and yearly metrics. These metrics detail information such as the number of transactions, amount spent and the breakdown of types of transactions at these locations.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.PerformanceMetricsCardProduct;

/**
 * Metrics for this location over this month such as number of transactions, average frequency of transactions and the percent of repeat customers
 */
@ApiModel(description = "Metrics for this location over this month such as number of transactions, average frequency of transactions and the percent of repeat customers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-14T12:14:35.054+01:00[Europe/London]")
public class MerchantLocationMonthlyPerformanceMetric {
  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private LocalDate period;

  public static final String SERIALIZED_NAME_TOTAL_NUMBER_OF_TRXS = "totalNumberOfTrxs";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUMBER_OF_TRXS)
  private Long totalNumberOfTrxs;

  public static final String SERIALIZED_NAME_TOTAL_TRXS_SPEND = "totalTrxsSpend";
  @SerializedName(SERIALIZED_NAME_TOTAL_TRXS_SPEND)
  private Double totalTrxsSpend;

  public static final String SERIALIZED_NAME_AVG_FREQUENCY = "avgFrequency";
  @SerializedName(SERIALIZED_NAME_AVG_FREQUENCY)
  private Double avgFrequency;

  public static final String SERIALIZED_NAME_PCT_REPEAT_CUSTOMERS30_DAYS = "pctRepeatCustomers30Days";
  @SerializedName(SERIALIZED_NAME_PCT_REPEAT_CUSTOMERS30_DAYS)
  private Double pctRepeatCustomers30Days;

  public static final String SERIALIZED_NAME_PCT_REPEAT_CUSTOMERS60_DAYS = "pctRepeatCustomers60Days";
  @SerializedName(SERIALIZED_NAME_PCT_REPEAT_CUSTOMERS60_DAYS)
  private Double pctRepeatCustomers60Days;

  public static final String SERIALIZED_NAME_PCT_REPEAT_CUSTOMERS90_DAYS = "pctRepeatCustomers90Days";
  @SerializedName(SERIALIZED_NAME_PCT_REPEAT_CUSTOMERS90_DAYS)
  private Double pctRepeatCustomers90Days;

  public static final String SERIALIZED_NAME_CARD_PRODUCTS = "cardProducts";
  @SerializedName(SERIALIZED_NAME_CARD_PRODUCTS)
  private List<PerformanceMetricsCardProduct> cardProducts = null;

  public MerchantLocationMonthlyPerformanceMetric period(LocalDate period) {
    this.period = period;
    return this;
  }

   /**
   * The time period that a metric is associated with
   * @return period
  **/
  @ApiModelProperty(required = true, value = "The time period that a metric is associated with")
  public LocalDate getPeriod() {
    return period;
  }

  public void setPeriod(LocalDate period) {
    this.period = period;
  }

  public MerchantLocationMonthlyPerformanceMetric totalNumberOfTrxs(Long totalNumberOfTrxs) {
    this.totalNumberOfTrxs = totalNumberOfTrxs;
    return this;
  }

   /**
   * The number of transactions that occurred at this location during this month
   * @return totalNumberOfTrxs
  **/
  @ApiModelProperty(example = "19", required = true, value = "The number of transactions that occurred at this location during this month")
  public Long getTotalNumberOfTrxs() {
    return totalNumberOfTrxs;
  }

  public void setTotalNumberOfTrxs(Long totalNumberOfTrxs) {
    this.totalNumberOfTrxs = totalNumberOfTrxs;
  }

  public MerchantLocationMonthlyPerformanceMetric totalTrxsSpend(Double totalTrxsSpend) {
    this.totalTrxsSpend = totalTrxsSpend;
    return this;
  }

   /**
   * The total amount spent at this location during this month
   * @return totalTrxsSpend
  **/
  @ApiModelProperty(example = "344.04", required = true, value = "The total amount spent at this location during this month")
  public Double getTotalTrxsSpend() {
    return totalTrxsSpend;
  }

  public void setTotalTrxsSpend(Double totalTrxsSpend) {
    this.totalTrxsSpend = totalTrxsSpend;
  }

  public MerchantLocationMonthlyPerformanceMetric avgFrequency(Double avgFrequency) {
    this.avgFrequency = avgFrequency;
    return this;
  }

   /**
   * The average frequency of transactions at this location during this month
   * @return avgFrequency
  **/
  @ApiModelProperty(example = "0.0", required = true, value = "The average frequency of transactions at this location during this month")
  public Double getAvgFrequency() {
    return avgFrequency;
  }

  public void setAvgFrequency(Double avgFrequency) {
    this.avgFrequency = avgFrequency;
  }

  public MerchantLocationMonthlyPerformanceMetric pctRepeatCustomers30Days(Double pctRepeatCustomers30Days) {
    this.pctRepeatCustomers30Days = pctRepeatCustomers30Days;
    return this;
  }

   /**
   * Percentage of repeat customer spend over the previous 30 day period during this month
   * @return pctRepeatCustomers30Days
  **/
  @ApiModelProperty(example = "39.68", required = true, value = "Percentage of repeat customer spend over the previous 30 day period during this month")
  public Double getPctRepeatCustomers30Days() {
    return pctRepeatCustomers30Days;
  }

  public void setPctRepeatCustomers30Days(Double pctRepeatCustomers30Days) {
    this.pctRepeatCustomers30Days = pctRepeatCustomers30Days;
  }

  public MerchantLocationMonthlyPerformanceMetric pctRepeatCustomers60Days(Double pctRepeatCustomers60Days) {
    this.pctRepeatCustomers60Days = pctRepeatCustomers60Days;
    return this;
  }

   /**
   * Percentage of repeat customer spend over the previous 60 day period during this month
   * @return pctRepeatCustomers60Days
  **/
  @ApiModelProperty(example = "42.04", required = true, value = "Percentage of repeat customer spend over the previous 60 day period during this month")
  public Double getPctRepeatCustomers60Days() {
    return pctRepeatCustomers60Days;
  }

  public void setPctRepeatCustomers60Days(Double pctRepeatCustomers60Days) {
    this.pctRepeatCustomers60Days = pctRepeatCustomers60Days;
  }

  public MerchantLocationMonthlyPerformanceMetric pctRepeatCustomers90Days(Double pctRepeatCustomers90Days) {
    this.pctRepeatCustomers90Days = pctRepeatCustomers90Days;
    return this;
  }

   /**
   * Percentage of repeat customer spend over the previous 90 day period during this month
   * @return pctRepeatCustomers90Days
  **/
  @ApiModelProperty(example = "44.49", required = true, value = "Percentage of repeat customer spend over the previous 90 day period during this month")
  public Double getPctRepeatCustomers90Days() {
    return pctRepeatCustomers90Days;
  }

  public void setPctRepeatCustomers90Days(Double pctRepeatCustomers90Days) {
    this.pctRepeatCustomers90Days = pctRepeatCustomers90Days;
  }

  public MerchantLocationMonthlyPerformanceMetric cardProducts(List<PerformanceMetricsCardProduct> cardProducts) {
    this.cardProducts = cardProducts;
    return this;
  }

  public MerchantLocationMonthlyPerformanceMetric addCardProductsItem(PerformanceMetricsCardProduct cardProductsItem) {
    if (this.cardProducts == null) {
      this.cardProducts = new ArrayList<>();
    }
    this.cardProducts.add(cardProductsItem);
    return this;
  }

   /**
   * List of card products for all transactions during this month
   * @return cardProducts
  **/
  @ApiModelProperty(value = "List of card products for all transactions during this month")
  public List<PerformanceMetricsCardProduct> getCardProducts() {
    return cardProducts;
  }

  public void setCardProducts(List<PerformanceMetricsCardProduct> cardProducts) {
    this.cardProducts = cardProducts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantLocationMonthlyPerformanceMetric merchantLocationMonthlyPerformanceMetric = (MerchantLocationMonthlyPerformanceMetric) o;
    return Objects.equals(this.period, merchantLocationMonthlyPerformanceMetric.period) &&
        Objects.equals(this.totalNumberOfTrxs, merchantLocationMonthlyPerformanceMetric.totalNumberOfTrxs) &&
        Objects.equals(this.totalTrxsSpend, merchantLocationMonthlyPerformanceMetric.totalTrxsSpend) &&
        Objects.equals(this.avgFrequency, merchantLocationMonthlyPerformanceMetric.avgFrequency) &&
        Objects.equals(this.pctRepeatCustomers30Days, merchantLocationMonthlyPerformanceMetric.pctRepeatCustomers30Days) &&
        Objects.equals(this.pctRepeatCustomers60Days, merchantLocationMonthlyPerformanceMetric.pctRepeatCustomers60Days) &&
        Objects.equals(this.pctRepeatCustomers90Days, merchantLocationMonthlyPerformanceMetric.pctRepeatCustomers90Days) &&
        Objects.equals(this.cardProducts, merchantLocationMonthlyPerformanceMetric.cardProducts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, totalNumberOfTrxs, totalTrxsSpend, avgFrequency, pctRepeatCustomers30Days, pctRepeatCustomers60Days, pctRepeatCustomers90Days, cardProducts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantLocationMonthlyPerformanceMetric {\n");
    
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    totalNumberOfTrxs: ").append(toIndentedString(totalNumberOfTrxs)).append("\n");
    sb.append("    totalTrxsSpend: ").append(toIndentedString(totalTrxsSpend)).append("\n");
    sb.append("    avgFrequency: ").append(toIndentedString(avgFrequency)).append("\n");
    sb.append("    pctRepeatCustomers30Days: ").append(toIndentedString(pctRepeatCustomers30Days)).append("\n");
    sb.append("    pctRepeatCustomers60Days: ").append(toIndentedString(pctRepeatCustomers60Days)).append("\n");
    sb.append("    pctRepeatCustomers90Days: ").append(toIndentedString(pctRepeatCustomers90Days)).append("\n");
    sb.append("    cardProducts: ").append(toIndentedString(cardProducts)).append("\n");
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
