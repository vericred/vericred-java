package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T13:18:42.423-04:00")
public class Pricing  implements Serializable {
  
  private Integer age = null;
  private LocalDate effectiveDate = null;
  private LocalDate expirationDate = null;
  private Integer planId = null;
  private Integer ratingAreaId = null;

  
  /**
   * Age of applicant
   **/
  public Pricing age(Integer age) {
    this.age = age;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Age of applicant")
  @JsonProperty("age")
  public Integer getAge() {
    return age;
  }
  public void setAge(Integer age) {
    this.age = age;
  }


  /**
   * Effective date of plan
   **/
  public Pricing effectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Effective date of plan")
  @JsonProperty("effective_date")
  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }
  public void setEffectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
  }


  /**
   * Plan expiration date
   **/
  public Pricing expirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Plan expiration date")
  @JsonProperty("expiration_date")
  public LocalDate getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }


  /**
   * Foreign key to plans
   **/
  public Pricing planId(Integer planId) {
    this.planId = planId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Foreign key to plans")
  @JsonProperty("plan_id")
  public Integer getPlanId() {
    return planId;
  }
  public void setPlanId(Integer planId) {
    this.planId = planId;
  }


  /**
   * Foreign key to rating areas
   **/
  public Pricing ratingAreaId(Integer ratingAreaId) {
    this.ratingAreaId = ratingAreaId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Foreign key to rating areas")
  @JsonProperty("rating_area_id")
  public Integer getRatingAreaId() {
    return ratingAreaId;
  }
  public void setRatingAreaId(Integer ratingAreaId) {
    this.ratingAreaId = ratingAreaId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pricing pricing = (Pricing) o;
    return Objects.equals(this.age, pricing.age) &&
        Objects.equals(this.effectiveDate, pricing.effectiveDate) &&
        Objects.equals(this.expirationDate, pricing.expirationDate) &&
        Objects.equals(this.planId, pricing.planId) &&
        Objects.equals(this.ratingAreaId, pricing.ratingAreaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, effectiveDate, expirationDate, planId, ratingAreaId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pricing {\n");
    
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    ratingAreaId: ").append(toIndentedString(ratingAreaId)).append("\n");
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

