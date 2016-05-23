package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T16:44:52.285-04:00")
public class PlanCountyBulk  implements Serializable {
  
  private Integer id = null;
  private Integer planId = null;
  private Integer countyId = null;

  
  /**
   * Primary key
   **/
  public PlanCountyBulk id(Integer id) {
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
  public PlanCountyBulk planId(Integer planId) {
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
  public PlanCountyBulk countyId(Integer countyId) {
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
    PlanCountyBulk planCountyBulk = (PlanCountyBulk) o;
    return Objects.equals(this.id, planCountyBulk.id) &&
        Objects.equals(this.planId, planCountyBulk.planId) &&
        Objects.equals(this.countyId, planCountyBulk.countyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, planId, countyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanCountyBulk {\n");
    
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

