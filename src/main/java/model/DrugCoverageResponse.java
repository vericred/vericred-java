package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import model.Drug;
import model.DrugCoverage;
import model.DrugPackage;
import model.Meta;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-31T08:54:42.900-04:00")
public class DrugCoverageResponse  implements Serializable {
  
  private Meta meta = null;
  private List<DrugCoverage> drugCoverages = new ArrayList<DrugCoverage>();
  private List<Drug> drugs = new ArrayList<Drug>();
  private List<DrugPackage> drugPackages = new ArrayList<DrugPackage>();

  
  /**
   * Metadata for query
   **/
  public DrugCoverageResponse meta(Meta meta) {
    this.meta = meta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Metadata for query")
  @JsonProperty("meta")
  public Meta getMeta() {
    return meta;
  }
  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  /**
   * DrugCoverage search results
   **/
  public DrugCoverageResponse drugCoverages(List<DrugCoverage> drugCoverages) {
    this.drugCoverages = drugCoverages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "DrugCoverage search results")
  @JsonProperty("drug_coverages")
  public List<DrugCoverage> getDrugCoverages() {
    return drugCoverages;
  }
  public void setDrugCoverages(List<DrugCoverage> drugCoverages) {
    this.drugCoverages = drugCoverages;
  }


  /**
   * Drug
   **/
  public DrugCoverageResponse drugs(List<Drug> drugs) {
    this.drugs = drugs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Drug")
  @JsonProperty("drugs")
  public List<Drug> getDrugs() {
    return drugs;
  }
  public void setDrugs(List<Drug> drugs) {
    this.drugs = drugs;
  }


  /**
   * Drug Packages
   **/
  public DrugCoverageResponse drugPackages(List<DrugPackage> drugPackages) {
    this.drugPackages = drugPackages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Drug Packages")
  @JsonProperty("drug_packages")
  public List<DrugPackage> getDrugPackages() {
    return drugPackages;
  }
  public void setDrugPackages(List<DrugPackage> drugPackages) {
    this.drugPackages = drugPackages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrugCoverageResponse drugCoverageResponse = (DrugCoverageResponse) o;
    return Objects.equals(this.meta, drugCoverageResponse.meta) &&
        Objects.equals(this.drugCoverages, drugCoverageResponse.drugCoverages) &&
        Objects.equals(this.drugs, drugCoverageResponse.drugs) &&
        Objects.equals(this.drugPackages, drugCoverageResponse.drugPackages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, drugCoverages, drugs, drugPackages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrugCoverageResponse {\n");
    
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    drugCoverages: ").append(toIndentedString(drugCoverages)).append("\n");
    sb.append("    drugs: ").append(toIndentedString(drugs)).append("\n");
    sb.append("    drugPackages: ").append(toIndentedString(drugPackages)).append("\n");
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

