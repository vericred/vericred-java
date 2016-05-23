package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T16:44:52.285-04:00")
public class DrugCoverage  implements Serializable {
  
  private String planId = null;
  private String drugPackageId = null;
  private String tier = null;
  private Boolean quantityLimit = null;
  private Boolean priorAuthorization = null;
  private Boolean stepTherapy = null;

  
  /**
   * Health Insurance Oversight System id
   **/
  public DrugCoverage planId(String planId) {
    this.planId = planId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Health Insurance Oversight System id")
  @JsonProperty("plan_id")
  public String getPlanId() {
    return planId;
  }
  public void setPlanId(String planId) {
    this.planId = planId;
  }


  /**
   * NDC package code
   **/
  public DrugCoverage drugPackageId(String drugPackageId) {
    this.drugPackageId = drugPackageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "NDC package code")
  @JsonProperty("drug_package_id")
  public String getDrugPackageId() {
    return drugPackageId;
  }
  public void setDrugPackageId(String drugPackageId) {
    this.drugPackageId = drugPackageId;
  }


  /**
   * Tier Name
   **/
  public DrugCoverage tier(String tier) {
    this.tier = tier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tier Name")
  @JsonProperty("tier")
  public String getTier() {
    return tier;
  }
  public void setTier(String tier) {
    this.tier = tier;
  }


  /**
   * Quantity limit exists
   **/
  public DrugCoverage quantityLimit(Boolean quantityLimit) {
    this.quantityLimit = quantityLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantity limit exists")
  @JsonProperty("quantity_limit")
  public Boolean getQuantityLimit() {
    return quantityLimit;
  }
  public void setQuantityLimit(Boolean quantityLimit) {
    this.quantityLimit = quantityLimit;
  }


  /**
   * Prior authorization required
   **/
  public DrugCoverage priorAuthorization(Boolean priorAuthorization) {
    this.priorAuthorization = priorAuthorization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Prior authorization required")
  @JsonProperty("prior_authorization")
  public Boolean getPriorAuthorization() {
    return priorAuthorization;
  }
  public void setPriorAuthorization(Boolean priorAuthorization) {
    this.priorAuthorization = priorAuthorization;
  }


  /**
   * Step Treatment required
   **/
  public DrugCoverage stepTherapy(Boolean stepTherapy) {
    this.stepTherapy = stepTherapy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Step Treatment required")
  @JsonProperty("step_therapy")
  public Boolean getStepTherapy() {
    return stepTherapy;
  }
  public void setStepTherapy(Boolean stepTherapy) {
    this.stepTherapy = stepTherapy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrugCoverage drugCoverage = (DrugCoverage) o;
    return Objects.equals(this.planId, drugCoverage.planId) &&
        Objects.equals(this.drugPackageId, drugCoverage.drugPackageId) &&
        Objects.equals(this.tier, drugCoverage.tier) &&
        Objects.equals(this.quantityLimit, drugCoverage.quantityLimit) &&
        Objects.equals(this.priorAuthorization, drugCoverage.priorAuthorization) &&
        Objects.equals(this.stepTherapy, drugCoverage.stepTherapy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planId, drugPackageId, tier, quantityLimit, priorAuthorization, stepTherapy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrugCoverage {\n");
    
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    drugPackageId: ").append(toIndentedString(drugPackageId)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    quantityLimit: ").append(toIndentedString(quantityLimit)).append("\n");
    sb.append("    priorAuthorization: ").append(toIndentedString(priorAuthorization)).append("\n");
    sb.append("    stepTherapy: ").append(toIndentedString(stepTherapy)).append("\n");
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

