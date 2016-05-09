package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T13:18:42.423-04:00")
public class ZipCounty  implements Serializable {
  
  private Integer countyId = null;
  private Integer id = null;
  private Integer zipCodeId = null;

  
  /**
   * ID of the parent County in Vericred's API
   **/
  public ZipCounty countyId(Integer countyId) {
    this.countyId = countyId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the parent County in Vericred's API")
  @JsonProperty("county_id")
  public Integer getCountyId() {
    return countyId;
  }
  public void setCountyId(Integer countyId) {
    this.countyId = countyId;
  }


  /**
   * Primary key
   **/
  public ZipCounty id(Integer id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Primary key")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   * ID of the parent Zip Code in Vericred's API
   **/
  public ZipCounty zipCodeId(Integer zipCodeId) {
    this.zipCodeId = zipCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the parent Zip Code in Vericred's API")
  @JsonProperty("zip_code_id")
  public Integer getZipCodeId() {
    return zipCodeId;
  }
  public void setZipCodeId(Integer zipCodeId) {
    this.zipCodeId = zipCodeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZipCounty zipCounty = (ZipCounty) o;
    return Objects.equals(this.countyId, zipCounty.countyId) &&
        Objects.equals(this.id, zipCounty.id) &&
        Objects.equals(this.zipCodeId, zipCounty.zipCodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countyId, id, zipCodeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZipCounty {\n");
    
    sb.append("    countyId: ").append(toIndentedString(countyId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    zipCodeId: ").append(toIndentedString(zipCodeId)).append("\n");
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

