package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Applicant;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T13:18:42.423-04:00")
public class Query  implements Serializable {
  
  private List<Applicant> applicants = new ArrayList<Applicant>();
  private LocalDate enrollmentDate = null;
  private String fipsCode = null;
  private String householdIncome = null;
  private String householdSize = null;
  private String market = null;
  private List<String> providers = new ArrayList<String>();
  private String zipCode = null;

  
  /**
   **/
  public Query applicants(List<Applicant> applicants) {
    this.applicants = applicants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("applicants")
  public List<Applicant> getApplicants() {
    return applicants;
  }
  public void setApplicants(List<Applicant> applicants) {
    this.applicants = applicants;
  }


  /**
   **/
  public Query enrollmentDate(LocalDate enrollmentDate) {
    this.enrollmentDate = enrollmentDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enrollment_date")
  public LocalDate getEnrollmentDate() {
    return enrollmentDate;
  }
  public void setEnrollmentDate(LocalDate enrollmentDate) {
    this.enrollmentDate = enrollmentDate;
  }


  /**
   **/
  public Query fipsCode(String fipsCode) {
    this.fipsCode = fipsCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fips_code")
  public String getFipsCode() {
    return fipsCode;
  }
  public void setFipsCode(String fipsCode) {
    this.fipsCode = fipsCode;
  }


  /**
   **/
  public Query householdIncome(String householdIncome) {
    this.householdIncome = householdIncome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("household_income")
  public String getHouseholdIncome() {
    return householdIncome;
  }
  public void setHouseholdIncome(String householdIncome) {
    this.householdIncome = householdIncome;
  }


  /**
   **/
  public Query householdSize(String householdSize) {
    this.householdSize = householdSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("household_size")
  public String getHouseholdSize() {
    return householdSize;
  }
  public void setHouseholdSize(String householdSize) {
    this.householdSize = householdSize;
  }


  /**
   **/
  public Query market(String market) {
    this.market = market;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("market")
  public String getMarket() {
    return market;
  }
  public void setMarket(String market) {
    this.market = market;
  }


  /**
   **/
  public Query providers(List<String> providers) {
    this.providers = providers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("providers")
  public List<String> getProviders() {
    return providers;
  }
  public void setProviders(List<String> providers) {
    this.providers = providers;
  }


  /**
   **/
  public Query zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    Query query = (Query) o;
    return Objects.equals(this.applicants, query.applicants) &&
        Objects.equals(this.enrollmentDate, query.enrollmentDate) &&
        Objects.equals(this.fipsCode, query.fipsCode) &&
        Objects.equals(this.householdIncome, query.householdIncome) &&
        Objects.equals(this.householdSize, query.householdSize) &&
        Objects.equals(this.market, query.market) &&
        Objects.equals(this.providers, query.providers) &&
        Objects.equals(this.zipCode, query.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicants, enrollmentDate, fipsCode, householdIncome, householdSize, market, providers, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Query {\n");
    
    sb.append("    applicants: ").append(toIndentedString(applicants)).append("\n");
    sb.append("    enrollmentDate: ").append(toIndentedString(enrollmentDate)).append("\n");
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

