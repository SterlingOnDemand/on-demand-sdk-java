/*
 * kennect-api
 * The Sterling On Demand API allows you to integrate background checks into your platform and manage the process form end-to-end.
 *
 * OpenAPI spec version: 2018-01-17T10:44:23.086-08:00
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package sts.oda.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;
import sts.oda.client.model.Metrics;
import sts.oda.client.model.Schedule;
import sts.oda.client.model.ScreeningRequest;

/**
 * SubscriptionResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-17T11:27:12.738-08:00")
public class SubscriptionResponse {
  @SerializedName("createdAt")
  private DateTime createdAt = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("metrics")
  private Metrics metrics = null;

  @SerializedName("nextRunAt")
  private DateTime nextRunAt = null;

  @SerializedName("schedule")
  private Schedule schedule = null;

  @SerializedName("screening")
  private ScreeningRequest screening = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("updatedAt")
  private DateTime updatedAt = null;

  public SubscriptionResponse createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public SubscriptionResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SubscriptionResponse metrics(Metrics metrics) {
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @ApiModelProperty(value = "")
  public Metrics getMetrics() {
    return metrics;
  }

  public void setMetrics(Metrics metrics) {
    this.metrics = metrics;
  }

  public SubscriptionResponse nextRunAt(DateTime nextRunAt) {
    this.nextRunAt = nextRunAt;
    return this;
  }

   /**
   * Get nextRunAt
   * @return nextRunAt
  **/
  @ApiModelProperty(value = "")
  public DateTime getNextRunAt() {
    return nextRunAt;
  }

  public void setNextRunAt(DateTime nextRunAt) {
    this.nextRunAt = nextRunAt;
  }

  public SubscriptionResponse schedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @ApiModelProperty(value = "")
  public Schedule getSchedule() {
    return schedule;
  }

  public void setSchedule(Schedule schedule) {
    this.schedule = schedule;
  }

  public SubscriptionResponse screening(ScreeningRequest screening) {
    this.screening = screening;
    return this;
  }

   /**
   * Get screening
   * @return screening
  **/
  @ApiModelProperty(value = "")
  public ScreeningRequest getScreening() {
    return screening;
  }

  public void setScreening(ScreeningRequest screening) {
    this.screening = screening;
  }

  public SubscriptionResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SubscriptionResponse updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionResponse subscriptionResponse = (SubscriptionResponse) o;
    return Objects.equals(this.createdAt, subscriptionResponse.createdAt) &&
        Objects.equals(this.id, subscriptionResponse.id) &&
        Objects.equals(this.metrics, subscriptionResponse.metrics) &&
        Objects.equals(this.nextRunAt, subscriptionResponse.nextRunAt) &&
        Objects.equals(this.schedule, subscriptionResponse.schedule) &&
        Objects.equals(this.screening, subscriptionResponse.screening) &&
        Objects.equals(this.status, subscriptionResponse.status) &&
        Objects.equals(this.updatedAt, subscriptionResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, metrics, nextRunAt, schedule, screening, status, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionResponse {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    nextRunAt: ").append(toIndentedString(nextRunAt)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    screening: ").append(toIndentedString(screening)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

