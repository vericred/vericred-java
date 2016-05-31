package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import model.DrugPackage;
import model.RequestPlanFindApplicant;
import model.RequestPlanFindProvider;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-31T08:54:42.900-04:00")
public class RequestPlanFind  implements Serializable {
  
  private List<RequestPlanFindApplicant> applicants = new ArrayList<RequestPlanFindApplicant>();
  private String enrollmentDate = null;
  private List<DrugPackage> drugPackages = new ArrayList<DrugPackage>();
  private String fipsCode = null;
  private Integer householdIncome = null;
  private Integer householdSize = null;
  private String market = null;
  private List<RequestPlanFindProvider> providers = new ArrayList<RequestPlanFindProvider>();
  private String zipCode = null;

  
  /**
   * Applicants for desired plans.
   **/
  public RequestPlanFind applicants(List<RequestPlanFindApplicant> applicants) {
    this.applicants = applicants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Applicants for desired plans.")
  @JsonProperty("applicants")
  public List<RequestPlanFindApplicant> getApplicants() {
    return applicants;
  }
  public void setApplicants(List<RequestPlanFindApplicant> applicants) {
    this.applicants = applicants;
  }


  /**
   * Date of enrollment
   **/
  public RequestPlanFind enrollmentDate(String enrollmentDate) {
    this.enrollmentDate = enrollmentDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date of enrollment")
  @JsonProperty("enrollment_date")
  public String getEnrollmentDate() {
    return enrollmentDate;
  }
  public void setEnrollmentDate(String enrollmentDate) {
    this.enrollmentDate = enrollmentDate;
  }


  /**
   * National Drug Code Package Id
   **/
  public RequestPlanFind drugPackages(List<DrugPackage> drugPackages) {
    this.drugPackages = drugPackages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "National Drug Code Package Id")
  @JsonProperty("drug_packages")
  public List<DrugPackage> getDrugPackages() {
    return drugPackages;
  }
  public void setDrugPackages(List<DrugPackage> drugPackages) {
    this.drugPackages = drugPackages;
  }


  /**
   * County code to determine eligibility
   **/
  public RequestPlanFind fipsCode(String fipsCode) {
    this.fipsCode = fipsCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "County code to determine eligibility")
  @JsonProperty("fips_code")
  public String getFipsCode() {
    return fipsCode;
  }
  public void setFipsCode(String fipsCode) {
    this.fipsCode = fipsCode;
  }


  /**
   * Total household income.
   **/
  public RequestPlanFind householdIncome(Integer householdIncome) {
    this.householdIncome = householdIncome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total household income.")
  @JsonProperty("household_income")
  public Integer getHouseholdIncome() {
    return householdIncome;
  }
  public void setHouseholdIncome(Integer householdIncome) {
    this.householdIncome = householdIncome;
  }


  /**
   * Number of people living in household.
   **/
  public RequestPlanFind householdSize(Integer householdSize) {
    this.householdSize = householdSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of people living in household.")
  @JsonProperty("household_size")
  public Integer getHouseholdSize() {
    return householdSize;
  }
  public void setHouseholdSize(Integer householdSize) {
    this.householdSize = householdSize;
  }


  /**
   * Type of plan to search for.
   **/
  public RequestPlanFind market(String market) {
    this.market = market;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of plan to search for.")
  @JsonProperty("market")
  public String getMarket() {
    return market;
  }
  public void setMarket(String market) {
    this.market = market;
  }


  /**
   * List of providers to search for.
   **/
  public RequestPlanFind providers(List<RequestPlanFindProvider> providers) {
    this.providers = providers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of providers to search for.")
  @JsonProperty("providers")
  public List<RequestPlanFindProvider> getProviders() {
    return providers;
  }
  public void setProviders(List<RequestPlanFindProvider> providers) {
    this.providers = providers;
  }


  /**
   * 5-digit zip code - this helps determine pricing.
   **/
  public RequestPlanFind zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "5-digit zip code - this helps determine pricing.")
  @JsonProperty("zip_code")
  public String getZipCode() {
    return zipCode;
  }
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestPlanFind requestPlanFind = (RequestPlanFind) o;
    return Objects.equals(this.applicants, requestPlanFind.applicants) &&
        Objects.equals(this.enrollmentDate, requestPlanFind.enrollmentDate) &&
        Objects.equals(this.drugPackages, requestPlanFind.drugPackages) &&
        Objects.equals(this.fipsCode, requestPlanFind.fipsCode) &&
        Objects.equals(this.householdIncome, requestPlanFind.householdIncome) &&
        Objects.equals(this.householdSize, requestPlanFind.householdSize) &&
        Objects.equals(this.market, requestPlanFind.market) &&
        Objects.equals(this.providers, requestPlanFind.providers) &&
        Objects.equals(this.zipCode, requestPlanFind.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicants, enrollmentDate, drugPackages, fipsCode, householdIncome, householdSize, market, providers, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestPlanFind {\n");
    
    sb.append("    applicants: ").append(toIndentedString(applicants)).append("\n");
    sb.append("    enrollmentDate: ").append(toIndentedString(enrollmentDate)).append("\n");
    sb.append("    drugPackages: ").append(toIndentedString(drugPackages)).append("\n");
    sb.append("    fipsCode: ").append(toIndentedString(fipsCode)).append("\n");
    sb.append("    householdIncome: ").append(toIndentedString(householdIncome)).append("\n");
    sb.append("    householdSize: ").append(toIndentedString(householdSize)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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

