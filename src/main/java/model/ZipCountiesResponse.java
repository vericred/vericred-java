package model;

import com.fasterxml.jackson.annotation.JsonValue;
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
/**
 * ZipCountiesResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-28T10:14:26.235-04:00")
public class ZipCountiesResponse  implements Serializable {
  
  private List<County> counties = new ArrayList<County>();
  private List<State> states = new ArrayList<State>();
  private List<ZipCounty> zipCounties = new ArrayList<ZipCounty>();
  private List<ZipCode> zipCodes = new ArrayList<ZipCode>();

  
  /**
   * Counties that exist in the provided zip prefix.
   **/
  public ZipCountiesResponse counties(List<County> counties) {
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
  public ZipCountiesResponse states(List<State> states) {
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
   * ZipCounties that exist in the provided zip prefix.
   **/
  public ZipCountiesResponse zipCounties(List<ZipCounty> zipCounties) {
    this.zipCounties = zipCounties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ZipCounties that exist in the provided zip prefix.")
  @JsonProperty("zip_counties")
  public List<ZipCounty> getZipCounties() {
    return zipCounties;
  }
  public void setZipCounties(List<ZipCounty> zipCounties) {
    this.zipCounties = zipCounties;
  }


  /**
   * ZipCodes that exist in the provided zip prefix.
   **/
  public ZipCountiesResponse zipCodes(List<ZipCode> zipCodes) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZipCountiesResponse zipCountiesResponse = (ZipCountiesResponse) o;
    return Objects.equals(this.counties, zipCountiesResponse.counties) &&
        Objects.equals(this.states, zipCountiesResponse.states) &&
        Objects.equals(this.zipCounties, zipCountiesResponse.zipCounties) &&
        Objects.equals(this.zipCodes, zipCountiesResponse.zipCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counties, states, zipCounties, zipCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZipCountiesResponse {\n");
    
    sb.append("    counties: ").append(toIndentedString(counties)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    zipCounties: ").append(toIndentedString(zipCounties)).append("\n");
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

