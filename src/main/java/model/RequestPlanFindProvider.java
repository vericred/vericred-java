package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-27T13:45:11.284-04:00")
public class RequestPlanFindProvider  implements Serializable {
  
  private Integer npi = null;

  
  /**
   * NPI of provider to search for
   **/
  public RequestPlanFindProvider npi(Integer npi) {
    this.npi = npi;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "NPI of provider to search for")
  @JsonProperty("npi")
  public Integer getNpi() {
    return npi;
  }
  public void setNpi(Integer npi) {
    this.npi = npi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestPlanFindProvider requestPlanFindProvider = (RequestPlanFindProvider) o;
    return Objects.equals(this.npi, requestPlanFindProvider.npi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(npi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestPlanFindProvider {\n");
    
    sb.append("    npi: ").append(toIndentedString(npi)).append("\n");
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

