package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import model.County;
import model.ZipCode;
import model.ZipCounty;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T13:18:42.423-04:00")
public class InlineResponse2002  implements Serializable {
  
  private List<ZipCounty> zipCounties = new ArrayList<ZipCounty>();
  private List<County> counties = new ArrayList<County>();
  private List<ZipCode> zipCodes = new ArrayList<ZipCode>();

  
  /**
   **/
  public InlineResponse2002 zipCounties(List<ZipCounty> zipCounties) {
    this.zipCounties = zipCounties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("zip_counties")
  public List<ZipCounty> getZipCounties() {
    return zipCounties;
  }
  public void setZipCounties(List<ZipCounty> zipCounties) {
    this.zipCounties = zipCounties;
  }


  /**
   **/
  public InlineResponse2002 counties(List<County> counties) {
    this.counties = counties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("counties")
  public List<County> getCounties() {
    return counties;
  }
  public void setCounties(List<County> counties) {
    this.counties = counties;
  }


  /**
   **/
  public InlineResponse2002 zipCodes(List<ZipCode> zipCodes) {
    this.zipCodes = zipCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("zip_codes")
  public List<ZipCode> getZipCodes() {
    return zipCodes;
  }
  public void setZipCodes(List<ZipCode> zipCodes) {
    this.zipCodes = zipCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this.zipCounties, inlineResponse2002.zipCounties) &&
        Objects.equals(this.counties, inlineResponse2002.counties) &&
        Objects.equals(this.zipCodes, inlineResponse2002.zipCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zipCounties, counties, zipCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    zipCounties: ").append(toIndentedString(zipCounties)).append("\n");
    sb.append("    counties: ").append(toIndentedString(counties)).append("\n");
    sb.append("    zipCodes: ").append(toIndentedString(zipCodes)).append("\n");
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

