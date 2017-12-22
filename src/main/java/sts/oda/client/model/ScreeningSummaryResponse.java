/*
 * Kennect-API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2017-12-08T12:41:25.475-08:00
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
import sts.oda.client.model.CandidateResponse;

/**
 * ScreeningSummaryResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-22T14:35:26.371-08:00")
public class ScreeningSummaryResponse {
  @SerializedName("candidate")
  private CandidateResponse candidate = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("submittedAt")
  private DateTime submittedAt = null;

  @SerializedName("updatedAt")
  private DateTime updatedAt = null;

  public ScreeningSummaryResponse candidate(CandidateResponse candidate) {
    this.candidate = candidate;
    return this;
  }

   /**
   * Get candidate
   * @return candidate
  **/
  @ApiModelProperty(value = "")
  public CandidateResponse getCandidate() {
    return candidate;
  }

  public void setCandidate(CandidateResponse candidate) {
    this.candidate = candidate;
  }

  public ScreeningSummaryResponse id(String id) {
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

  public ScreeningSummaryResponse status(String status) {
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

  public ScreeningSummaryResponse submittedAt(DateTime submittedAt) {
    this.submittedAt = submittedAt;
    return this;
  }

   /**
   * Get submittedAt
   * @return submittedAt
  **/
  @ApiModelProperty(value = "")
  public DateTime getSubmittedAt() {
    return submittedAt;
  }

  public void setSubmittedAt(DateTime submittedAt) {
    this.submittedAt = submittedAt;
  }

  public ScreeningSummaryResponse updatedAt(DateTime updatedAt) {
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
    ScreeningSummaryResponse screeningSummaryResponse = (ScreeningSummaryResponse) o;
    return Objects.equals(this.candidate, screeningSummaryResponse.candidate) &&
        Objects.equals(this.id, screeningSummaryResponse.id) &&
        Objects.equals(this.status, screeningSummaryResponse.status) &&
        Objects.equals(this.submittedAt, screeningSummaryResponse.submittedAt) &&
        Objects.equals(this.updatedAt, screeningSummaryResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidate, id, status, submittedAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreeningSummaryResponse {\n");
    
    sb.append("    candidate: ").append(toIndentedString(candidate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
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
