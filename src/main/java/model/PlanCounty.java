package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-31T08:54:42.900-04:00")
public class PlanCounty  implements Serializable {
  
  private Integer id = null;
  private Integer planId = null;
  private Integer countyId = null;

  
  /**
   * Primary key
   **/
  public PlanCounty id(Integer id) {
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
   * Foreign key to plan
   **/
  public PlanCounty planId(Integer planId) {
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
  public PlanCounty countyId(Integer countyId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanCounty planCounty = (PlanCounty) o;
    return Objects.equals(this.id, planCounty.id) &&
        Objects.equals(this.planId, planCounty.planId) &&
        Objects.equals(this.countyId, planCounty.countyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, planId, countyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanCounty {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    countyId: ").append(toIndentedString(countyId)).append("\n");
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

