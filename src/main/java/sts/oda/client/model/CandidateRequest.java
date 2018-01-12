/*
 * kennect-api
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2018-01-03T11:31:31.343-08:00
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
import sts.oda.client.model.Address;
import sts.oda.client.model.CandidateAlias;
import sts.oda.client.model.DriversLicense;

/**
 * CandidateRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-12T12:11:57.321-08:00")
public class CandidateRequest {
  @SerializedName("address")
  private Address address = null;

  @SerializedName("aliases")
  private List<CandidateAlias> aliases = null;

  @SerializedName("clientReferenceId")
  private String clientReferenceId = null;

  @SerializedName("confirmedNoMiddleName")
  private Boolean confirmedNoMiddleName = null;

  @SerializedName("dob")
  private String dob = null;

  @SerializedName("driversLicense")
  private DriversLicense driversLicense = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("familyName")
  private String familyName = null;

  @SerializedName("givenName")
  private String givenName = null;

  @SerializedName("middleName")
  private String middleName = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("ssn")
  private String ssn = null;

  public CandidateRequest address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public CandidateRequest aliases(List<CandidateAlias> aliases) {
    this.aliases = aliases;
    return this;
  }

  public CandidateRequest addAliasesItem(CandidateAlias aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<CandidateAlias>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * Get aliases
   * @return aliases
  **/
  @ApiModelProperty(value = "")
  public List<CandidateAlias> getAliases() {
    return aliases;
  }

  public void setAliases(List<CandidateAlias> aliases) {
    this.aliases = aliases;
  }

  public CandidateRequest clientReferenceId(String clientReferenceId) {
    this.clientReferenceId = clientReferenceId;
    return this;
  }

   /**
   * Get clientReferenceId
   * @return clientReferenceId
  **/
  @ApiModelProperty(value = "")
  public String getClientReferenceId() {
    return clientReferenceId;
  }

  public void setClientReferenceId(String clientReferenceId) {
    this.clientReferenceId = clientReferenceId;
  }

  public CandidateRequest confirmedNoMiddleName(Boolean confirmedNoMiddleName) {
    this.confirmedNoMiddleName = confirmedNoMiddleName;
    return this;
  }

   /**
   * Get confirmedNoMiddleName
   * @return confirmedNoMiddleName
  **/
  @ApiModelProperty(value = "")
  public Boolean getConfirmedNoMiddleName() {
    return confirmedNoMiddleName;
  }

  public void setConfirmedNoMiddleName(Boolean confirmedNoMiddleName) {
    this.confirmedNoMiddleName = confirmedNoMiddleName;
  }

  public CandidateRequest dob(String dob) {
    this.dob = dob;
    return this;
  }

   /**
   * Get dob
   * @return dob
  **/
  @ApiModelProperty(value = "")
  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public CandidateRequest driversLicense(DriversLicense driversLicense) {
    this.driversLicense = driversLicense;
    return this;
  }

   /**
   * Get driversLicense
   * @return driversLicense
  **/
  @ApiModelProperty(value = "")
  public DriversLicense getDriversLicense() {
    return driversLicense;
  }

  public void setDriversLicense(DriversLicense driversLicense) {
    this.driversLicense = driversLicense;
  }

  public CandidateRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CandidateRequest familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * Get familyName
   * @return familyName
  **/
  @ApiModelProperty(value = "")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public CandidateRequest givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * Get givenName
   * @return givenName
  **/
  @ApiModelProperty(value = "")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public CandidateRequest middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @ApiModelProperty(value = "")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public CandidateRequest phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public CandidateRequest ssn(String ssn) {
    this.ssn = ssn;
    return this;
  }

   /**
   * Get ssn
   * @return ssn
  **/
  @ApiModelProperty(value = "")
  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CandidateRequest candidateRequest = (CandidateRequest) o;
    return Objects.equals(this.address, candidateRequest.address) &&
        Objects.equals(this.aliases, candidateRequest.aliases) &&
        Objects.equals(this.clientReferenceId, candidateRequest.clientReferenceId) &&
        Objects.equals(this.confirmedNoMiddleName, candidateRequest.confirmedNoMiddleName) &&
        Objects.equals(this.dob, candidateRequest.dob) &&
        Objects.equals(this.driversLicense, candidateRequest.driversLicense) &&
        Objects.equals(this.email, candidateRequest.email) &&
        Objects.equals(this.familyName, candidateRequest.familyName) &&
        Objects.equals(this.givenName, candidateRequest.givenName) &&
        Objects.equals(this.middleName, candidateRequest.middleName) &&
        Objects.equals(this.phone, candidateRequest.phone) &&
        Objects.equals(this.ssn, candidateRequest.ssn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, aliases, clientReferenceId, confirmedNoMiddleName, dob, driversLicense, email, familyName, givenName, middleName, phone, ssn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandidateRequest {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    clientReferenceId: ").append(toIndentedString(clientReferenceId)).append("\n");
    sb.append("    confirmedNoMiddleName: ").append(toIndentedString(confirmedNoMiddleName)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    driversLicense: ").append(toIndentedString(driversLicense)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
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

