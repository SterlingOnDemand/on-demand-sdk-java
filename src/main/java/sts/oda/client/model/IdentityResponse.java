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
import sts.oda.client.model.KnowledgeBasedAnswer;

/**
 * IdentityResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-17T11:27:12.738-08:00")
public class IdentityResponse {
  @SerializedName("candidateId")
  private String candidateId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("kba")
  private KnowledgeBasedAnswer kba = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("type")
  private String type = null;

  public IdentityResponse candidateId(String candidateId) {
    this.candidateId = candidateId;
    return this;
  }

   /**
   * Get candidateId
   * @return candidateId
  **/
  @ApiModelProperty(value = "")
  public String getCandidateId() {
    return candidateId;
  }

  public void setCandidateId(String candidateId) {
    this.candidateId = candidateId;
  }

  public IdentityResponse id(String id) {
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

  public IdentityResponse kba(KnowledgeBasedAnswer kba) {
    this.kba = kba;
    return this;
  }

   /**
   * Get kba
   * @return kba
  **/
  @ApiModelProperty(value = "")
  public KnowledgeBasedAnswer getKba() {
    return kba;
  }

  public void setKba(KnowledgeBasedAnswer kba) {
    this.kba = kba;
  }

  public IdentityResponse status(String status) {
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

  public IdentityResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityResponse identityResponse = (IdentityResponse) o;
    return Objects.equals(this.candidateId, identityResponse.candidateId) &&
        Objects.equals(this.id, identityResponse.id) &&
        Objects.equals(this.kba, identityResponse.kba) &&
        Objects.equals(this.status, identityResponse.status) &&
        Objects.equals(this.type, identityResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidateId, id, kba, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityResponse {\n");
    
    sb.append("    candidateId: ").append(toIndentedString(candidateId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kba: ").append(toIndentedString(kba)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

