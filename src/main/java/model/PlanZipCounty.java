package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-27T13:45:11.284-04:00")
public class PlanZipCounty  implements Serializable {
  
  private Integer planId = null;
  private Integer countyId = null;
  private Integer zipCodeId = null;

  
  /**
   * Foreign key to plan
   **/
  public PlanZipCounty planId(Integer planId) {
    this.planId = planId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Foreign key to plan")
  @JsonProperty("plan_id")
  public Integer getPlanId() {
    return planId;
  }
  public void setPlanId(Integer planId) {
    this.planId = planId;
  }


  /**
   * Foreign key to county
   **/
  public PlanZipCounty countyId(Integer countyId) {
    this.countyId = countyId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Foreign key to county")
  @JsonProperty("county_id")
  public Integer getCountyId() {
    return countyId;
  }
  public void setCountyId(Integer countyId) {
    this.countyId = countyId;
  }


  /**
   * Foreign key to zip code
   **/
  public PlanZipCounty zipCodeId(Integer zipCodeId) {
    this.zipCodeId = zipCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Foreign key to zip code")
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
    PlanZipCounty planZipCounty = (PlanZipCounty) o;
    return Objects.equals(this.planId, planZipCounty.planId) &&
        Objects.equals(this.countyId, planZipCounty.countyId) &&
        Objects.equals(this.zipCodeId, planZipCounty.zipCodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planId, countyId, zipCodeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanZipCounty {\n");
    
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    countyId: ").append(toIndentedString(countyId)).append("\n");
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

