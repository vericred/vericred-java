package model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Drug
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-28T10:14:26.235-04:00")
public class Drug  implements Serializable {
  
  private String id = null;
  private String proprietaryName = null;
  private String nonProprietaryName = null;
  private List<String> drugPackageIds = new ArrayList<String>();

  
  /**
   * National Drug Code ID
   **/
  public Drug id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "National Drug Code ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Proprietary name of drug
   **/
  public Drug proprietaryName(String proprietaryName) {
    this.proprietaryName = proprietaryName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Proprietary name of drug")
  @JsonProperty("proprietary_name")
  public String getProprietaryName() {
    return proprietaryName;
  }
  public void setProprietaryName(String proprietaryName) {
    this.proprietaryName = proprietaryName;
  }


  /**
   * Non-proprietary name of drug
   **/
  public Drug nonProprietaryName(String nonProprietaryName) {
    this.nonProprietaryName = nonProprietaryName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Non-proprietary name of drug")
  @JsonProperty("non_proprietary_name")
  public String getNonProprietaryName() {
    return nonProprietaryName;
  }
  public void setNonProprietaryName(String nonProprietaryName) {
    this.nonProprietaryName = nonProprietaryName;
  }


  /**
   * Array of drug package Ids
   **/
  public Drug drugPackageIds(List<String> drugPackageIds) {
    this.drugPackageIds = drugPackageIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Array of drug package Ids")
  @JsonProperty("drug_package_ids")
  public List<String> getDrugPackageIds() {
    return drugPackageIds;
  }
  public void setDrugPackageIds(List<String> drugPackageIds) {
    this.drugPackageIds = drugPackageIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Drug drug = (Drug) o;
    return Objects.equals(this.id, drug.id) &&
        Objects.equals(this.proprietaryName, drug.proprietaryName) &&
        Objects.equals(this.nonProprietaryName, drug.nonProprietaryName) &&
        Objects.equals(this.drugPackageIds, drug.drugPackageIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, proprietaryName, nonProprietaryName, drugPackageIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Drug {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    proprietaryName: ").append(toIndentedString(proprietaryName)).append("\n");
    sb.append("    nonProprietaryName: ").append(toIndentedString(nonProprietaryName)).append("\n");
    sb.append("    drugPackageIds: ").append(toIndentedString(drugPackageIds)).append("\n");
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

