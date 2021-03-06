/*
 * kennect-api
 * The Sterling On Demand API allows you to integrate background checks into your platform and manage the process form end-to-end.
 *
 * OpenAPI spec version: 2018-01-29T12:48:56.083-08:00
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

/**
 * Metrics
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-05T12:21:25.201-08:00")
public class Metrics {
  @SerializedName("failureCount")
  private Long failureCount = null;

  @SerializedName("runCount")
  private Long runCount = null;

  public Metrics failureCount(Long failureCount) {
    this.failureCount = failureCount;
    return this;
  }

   /**
   * Get failureCount
   * @return failureCount
  **/
  @ApiModelProperty(value = "")
  public Long getFailureCount() {
    return failureCount;
  }

  public void setFailureCount(Long failureCount) {
    this.failureCount = failureCount;
  }

  public Metrics runCount(Long runCount) {
    this.runCount = runCount;
    return this;
  }

   /**
   * Get runCount
   * @return runCount
  **/
  @ApiModelProperty(value = "")
  public Long getRunCount() {
    return runCount;
  }

  public void setRunCount(Long runCount) {
    this.runCount = runCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metrics metrics = (Metrics) o;
    return Objects.equals(this.failureCount, metrics.failureCount) &&
        Objects.equals(this.runCount, metrics.runCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failureCount, runCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metrics {\n");
    
    sb.append("    failureCount: ").append(toIndentedString(failureCount)).append("\n");
    sb.append("    runCount: ").append(toIndentedString(runCount)).append("\n");
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

