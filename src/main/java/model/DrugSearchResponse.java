package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import model.Drug;
import model.DrugPackage;
import model.Meta;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T16:44:52.285-04:00")
public class DrugSearchResponse  implements Serializable {
  
  private Meta meta = null;
  private List<Drug> drugs = new ArrayList<Drug>();
  private List<DrugPackage> drugPackages = new ArrayList<DrugPackage>();

  
  /**
   * Metadata for query
   **/
  public DrugSearchResponse meta(Meta meta) {
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
   * Drugs found in query
   **/
  public DrugSearchResponse drugs(List<Drug> drugs) {
    this.drugs = drugs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Drugs found in query")
  @JsonProperty("drugs")
  public List<Drug> getDrugs() {
    return drugs;
  }
  public void setDrugs(List<Drug> drugs) {
    this.drugs = drugs;
  }


  /**
   * DrugPackages
   **/
  public DrugSearchResponse drugPackages(List<DrugPackage> drugPackages) {
    this.drugPackages = drugPackages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "DrugPackages")
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
    DrugSearchResponse drugSearchResponse = (DrugSearchResponse) o;
    return Objects.equals(this.meta, drugSearchResponse.meta) &&
        Objects.equals(this.drugs, drugSearchResponse.drugs) &&
        Objects.equals(this.drugPackages, drugSearchResponse.drugPackages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, drugs, drugPackages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrugSearchResponse {\n");
    
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

