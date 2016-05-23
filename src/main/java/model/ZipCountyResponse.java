package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import model.County;
import model.State;
import model.ZipCode;
import model.ZipCounty;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T16:44:52.285-04:00")
public class ZipCountyResponse  implements Serializable {
  
  private List<County> counties = new ArrayList<County>();
  private List<State> states = new ArrayList<State>();
  private List<ZipCode> zipCodes = new ArrayList<ZipCode>();
  private ZipCounty zipCounty = null;

  
  /**
   * Counties that exist in the provided zip prefix.
   **/
  public ZipCountyResponse counties(List<County> counties) {
    this.counties = counties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Counties that exist in the provided zip prefix.")
  @JsonProperty("counties")
  public List<County> getCounties() {
    return counties;
  }
  public void setCounties(List<County> counties) {
    this.counties = counties;
  }


  /**
   * States that exist in the provided zip prefix.
   **/
  public ZipCountyResponse states(List<State> states) {
    this.states = states;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "States that exist in the provided zip prefix.")
  @JsonProperty("states")
  public List<State> getStates() {
    return states;
  }
  public void setStates(List<State> states) {
    this.states = states;
  }


  /**
   * ZipCodes that exist in the provided zip prefix.
   **/
  public ZipCountyResponse zipCodes(List<ZipCode> zipCodes) {
    this.zipCodes = zipCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ZipCodes that exist in the provided zip prefix.")
  @JsonProperty("zip_codes")
  public List<ZipCode> getZipCodes() {
    return zipCodes;
  }
  public void setZipCodes(List<ZipCode> zipCodes) {
    this.zipCodes = zipCodes;
  }


  /**
   * ZipCounty data
   **/
  public ZipCountyResponse zipCounty(ZipCounty zipCounty) {
    this.zipCounty = zipCounty;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ZipCounty data")
  @JsonProperty("zip_county")
  public ZipCounty getZipCounty() {
    return zipCounty;
  }
  public void setZipCounty(ZipCounty zipCounty) {
    this.zipCounty = zipCounty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZipCountyResponse zipCountyResponse = (ZipCountyResponse) o;
    return Objects.equals(this.counties, zipCountyResponse.counties) &&
        Objects.equals(this.states, zipCountyResponse.states) &&
        Objects.equals(this.zipCodes, zipCountyResponse.zipCodes) &&
        Objects.equals(this.zipCounty, zipCountyResponse.zipCounty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counties, states, zipCodes, zipCounty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZipCountyResponse {\n");
    
    sb.append("    counties: ").append(toIndentedString(counties)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    zipCodes: ").append(toIndentedString(zipCodes)).append("\n");
    sb.append("    zipCounty: ").append(toIndentedString(zipCounty)).append("\n");
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

