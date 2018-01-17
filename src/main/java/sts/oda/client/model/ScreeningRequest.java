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
import java.util.ArrayList;
import java.util.List;
import sts.oda.client.model.CallbackRequest;
import sts.oda.client.model.Invite;
import sts.oda.client.model.ReferenceCode;

/**
 * ScreeningRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-17T11:27:12.738-08:00")
public class ScreeningRequest {
  @SerializedName("billingCode")
  private String billingCode = null;

  @SerializedName("callback")
  private CallbackRequest callback = null;

  @SerializedName("candidateId")
  private String candidateId = null;

  @SerializedName("invite")
  private Invite invite = null;

  @SerializedName("packageId")
  private String packageId = null;

  @SerializedName("referenceCodes")
  private List<ReferenceCode> referenceCodes = null;

  @SerializedName("trustedUserId")
  private String trustedUserId = null;

  public ScreeningRequest billingCode(String billingCode) {
    this.billingCode = billingCode;
    return this;
  }

   /**
   * Get billingCode
   * @return billingCode
  **/
  @ApiModelProperty(value = "")
  public String getBillingCode() {
    return billingCode;
  }

  public void setBillingCode(String billingCode) {
    this.billingCode = billingCode;
  }

  public ScreeningRequest callback(CallbackRequest callback) {
    this.callback = callback;
    return this;
  }

   /**
   * Get callback
   * @return callback
  **/
  @ApiModelProperty(value = "")
  public CallbackRequest getCallback() {
    return callback;
  }

  public void setCallback(CallbackRequest callback) {
    this.callback = callback;
  }

  public ScreeningRequest candidateId(String candidateId) {
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

  public ScreeningRequest invite(Invite invite) {
    this.invite = invite;
    return this;
  }

   /**
   * Get invite
   * @return invite
  **/
  @ApiModelProperty(value = "")
  public Invite getInvite() {
    return invite;
  }

  public void setInvite(Invite invite) {
    this.invite = invite;
  }

  public ScreeningRequest packageId(String packageId) {
    this.packageId = packageId;
    return this;
  }

   /**
   * Get packageId
   * @return packageId
  **/
  @ApiModelProperty(value = "")
  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }

  public ScreeningRequest referenceCodes(List<ReferenceCode> referenceCodes) {
    this.referenceCodes = referenceCodes;
    return this;
  }

  public ScreeningRequest addReferenceCodesItem(ReferenceCode referenceCodesItem) {
    if (this.referenceCodes == null) {
      this.referenceCodes = new ArrayList<ReferenceCode>();
    }
    this.referenceCodes.add(referenceCodesItem);
    return this;
  }

   /**
   * Get referenceCodes
   * @return referenceCodes
  **/
  @ApiModelProperty(value = "")
  public List<ReferenceCode> getReferenceCodes() {
    return referenceCodes;
  }

  public void setReferenceCodes(List<ReferenceCode> referenceCodes) {
    this.referenceCodes = referenceCodes;
  }

  public ScreeningRequest trustedUserId(String trustedUserId) {
    this.trustedUserId = trustedUserId;
    return this;
  }

   /**
   * Get trustedUserId
   * @return trustedUserId
  **/
  @ApiModelProperty(value = "")
  public String getTrustedUserId() {
    return trustedUserId;
  }

  public void setTrustedUserId(String trustedUserId) {
    this.trustedUserId = trustedUserId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreeningRequest screeningRequest = (ScreeningRequest) o;
    return Objects.equals(this.billingCode, screeningRequest.billingCode) &&
        Objects.equals(this.callback, screeningRequest.callback) &&
        Objects.equals(this.candidateId, screeningRequest.candidateId) &&
        Objects.equals(this.invite, screeningRequest.invite) &&
        Objects.equals(this.packageId, screeningRequest.packageId) &&
        Objects.equals(this.referenceCodes, screeningRequest.referenceCodes) &&
        Objects.equals(this.trustedUserId, screeningRequest.trustedUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingCode, callback, candidateId, invite, packageId, referenceCodes, trustedUserId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreeningRequest {\n");
    
    sb.append("    billingCode: ").append(toIndentedString(billingCode)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    candidateId: ").append(toIndentedString(candidateId)).append("\n");
    sb.append("    invite: ").append(toIndentedString(invite)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    referenceCodes: ").append(toIndentedString(referenceCodes)).append("\n");
    sb.append("    trustedUserId: ").append(toIndentedString(trustedUserId)).append("\n");
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

