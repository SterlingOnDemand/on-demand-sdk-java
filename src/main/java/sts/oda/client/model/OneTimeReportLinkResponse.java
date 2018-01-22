/*
 * kennect-api
 * The Sterling On Demand API allows you to integrate background checks into your platform and manage the process form end-to-end.
 *
 * OpenAPI spec version: 2018-01-18T13:42:32.656-08:00
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
 * OneTimeReportLinkResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-22T10:28:10.147-08:00")
public class OneTimeReportLinkResponse {
  @SerializedName("html")
  private String html = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("pdf")
  private String pdf = null;

  @SerializedName("token")
  private String token = null;

  public OneTimeReportLinkResponse html(String html) {
    this.html = html;
    return this;
  }

   /**
   * Get html
   * @return html
  **/
  @ApiModelProperty(value = "")
  public String getHtml() {
    return html;
  }

  public void setHtml(String html) {
    this.html = html;
  }

  public OneTimeReportLinkResponse link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(value = "")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public OneTimeReportLinkResponse pdf(String pdf) {
    this.pdf = pdf;
    return this;
  }

   /**
   * Get pdf
   * @return pdf
  **/
  @ApiModelProperty(value = "")
  public String getPdf() {
    return pdf;
  }

  public void setPdf(String pdf) {
    this.pdf = pdf;
  }

  public OneTimeReportLinkResponse token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OneTimeReportLinkResponse oneTimeReportLinkResponse = (OneTimeReportLinkResponse) o;
    return Objects.equals(this.html, oneTimeReportLinkResponse.html) &&
        Objects.equals(this.link, oneTimeReportLinkResponse.link) &&
        Objects.equals(this.pdf, oneTimeReportLinkResponse.pdf) &&
        Objects.equals(this.token, oneTimeReportLinkResponse.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(html, link, pdf, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OneTimeReportLinkResponse {\n");
    
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    pdf: ").append(toIndentedString(pdf)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

