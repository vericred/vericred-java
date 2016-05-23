package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.LocalDate;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T16:44:52.285-04:00")
public class Pricing  implements Serializable {
  
  private Integer age = null;
  private LocalDate effectiveDate = null;
  private LocalDate expirationDate = null;
  private Integer planId = null;
  private BigDecimal premiumChildOnly = null;
  private BigDecimal premiumFamily = null;
  private BigDecimal premiumSingle = null;
  private BigDecimal premiumSingleAndChildren = null;
  private BigDecimal premiumSingleAndSpouse = null;
  private BigDecimal premiumSingleSmoker = null;
  private String ratingAreaId = null;

  
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
   * Child-only premium
   **/
  public Pricing premiumChildOnly(BigDecimal premiumChildOnly) {
    this.premiumChildOnly = premiumChildOnly;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Child-only premium")
  @JsonProperty("premium_child_only")
  public BigDecimal getPremiumChildOnly() {
    return premiumChildOnly;
  }
  public void setPremiumChildOnly(BigDecimal premiumChildOnly) {
    this.premiumChildOnly = premiumChildOnly;
  }


  /**
   * Family premium
   **/
  public Pricing premiumFamily(BigDecimal premiumFamily) {
    this.premiumFamily = premiumFamily;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Family premium")
  @JsonProperty("premium_family")
  public BigDecimal getPremiumFamily() {
    return premiumFamily;
  }
  public void setPremiumFamily(BigDecimal premiumFamily) {
    this.premiumFamily = premiumFamily;
  }


  /**
   * Single-person premium
   **/
  public Pricing premiumSingle(BigDecimal premiumSingle) {
    this.premiumSingle = premiumSingle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Single-person premium")
  @JsonProperty("premium_single")
  public BigDecimal getPremiumSingle() {
    return premiumSingle;
  }
  public void setPremiumSingle(BigDecimal premiumSingle) {
    this.premiumSingle = premiumSingle;
  }


  /**
   * Single person including children premium
   **/
  public Pricing premiumSingleAndChildren(BigDecimal premiumSingleAndChildren) {
    this.premiumSingleAndChildren = premiumSingleAndChildren;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Single person including children premium")
  @JsonProperty("premium_single_and_children")
  public BigDecimal getPremiumSingleAndChildren() {
    return premiumSingleAndChildren;
  }
  public void setPremiumSingleAndChildren(BigDecimal premiumSingleAndChildren) {
    this.premiumSingleAndChildren = premiumSingleAndChildren;
  }


  /**
   * Person with spouse premium
   **/
  public Pricing premiumSingleAndSpouse(BigDecimal premiumSingleAndSpouse) {
    this.premiumSingleAndSpouse = premiumSingleAndSpouse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Person with spouse premium")
  @JsonProperty("premium_single_and_spouse")
  public BigDecimal getPremiumSingleAndSpouse() {
    return premiumSingleAndSpouse;
  }
  public void setPremiumSingleAndSpouse(BigDecimal premiumSingleAndSpouse) {
    this.premiumSingleAndSpouse = premiumSingleAndSpouse;
  }


  /**
   * Premium for single smoker
   **/
  public Pricing premiumSingleSmoker(BigDecimal premiumSingleSmoker) {
    this.premiumSingleSmoker = premiumSingleSmoker;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Premium for single smoker")
  @JsonProperty("premium_single_smoker")
  public BigDecimal getPremiumSingleSmoker() {
    return premiumSingleSmoker;
  }
  public void setPremiumSingleSmoker(BigDecimal premiumSingleSmoker) {
    this.premiumSingleSmoker = premiumSingleSmoker;
  }


  /**
   * Foreign key to rating areas
   **/
  public Pricing ratingAreaId(String ratingAreaId) {
    this.ratingAreaId = ratingAreaId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Foreign key to rating areas")
  @JsonProperty("rating_area_id")
  public String getRatingAreaId() {
    return ratingAreaId;
  }
  public void setRatingAreaId(String ratingAreaId) {
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
        Objects.equals(this.premiumChildOnly, pricing.premiumChildOnly) &&
        Objects.equals(this.premiumFamily, pricing.premiumFamily) &&
        Objects.equals(this.premiumSingle, pricing.premiumSingle) &&
        Objects.equals(this.premiumSingleAndChildren, pricing.premiumSingleAndChildren) &&
        Objects.equals(this.premiumSingleAndSpouse, pricing.premiumSingleAndSpouse) &&
        Objects.equals(this.premiumSingleSmoker, pricing.premiumSingleSmoker) &&
        Objects.equals(this.ratingAreaId, pricing.ratingAreaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, effectiveDate, expirationDate, planId, premiumChildOnly, premiumFamily, premiumSingle, premiumSingleAndChildren, premiumSingleAndSpouse, premiumSingleSmoker, ratingAreaId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pricing {\n");
    
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    premiumChildOnly: ").append(toIndentedString(premiumChildOnly)).append("\n");
    sb.append("    premiumFamily: ").append(toIndentedString(premiumFamily)).append("\n");
    sb.append("    premiumSingle: ").append(toIndentedString(premiumSingle)).append("\n");
    sb.append("    premiumSingleAndChildren: ").append(toIndentedString(premiumSingleAndChildren)).append("\n");
    sb.append("    premiumSingleAndSpouse: ").append(toIndentedString(premiumSingleAndSpouse)).append("\n");
    sb.append("    premiumSingleSmoker: ").append(toIndentedString(premiumSingleSmoker)).append("\n");
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

