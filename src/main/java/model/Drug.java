package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T13:18:42.423-04:00")
public class Drug  implements Serializable {
  
  private String ndc = null;
  private String proprietaryName = null;
  private String nonProprietaryName = null;

  
  /**
   * National Drug Code ID
   **/
  public Drug ndc(String ndc) {
    this.ndc = ndc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "National Drug Code ID")
  @JsonProperty("ndc")
  public String getNdc() {
    return ndc;
  }
  public void setNdc(String ndc) {
    this.ndc = ndc;
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Drug drug = (Drug) o;
    return Objects.equals(this.ndc, drug.ndc) &&
        Objects.equals(this.proprietaryName, drug.proprietaryName) &&
        Objects.equals(this.nonProprietaryName, drug.nonProprietaryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ndc, proprietaryName, nonProprietaryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Drug {\n");
    
    sb.append("    ndc: ").append(toIndentedString(ndc)).append("\n");
    sb.append("    proprietaryName: ").append(toIndentedString(proprietaryName)).append("\n");
    sb.append("    nonProprietaryName: ").append(toIndentedString(nonProprietaryName)).append("\n");
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

