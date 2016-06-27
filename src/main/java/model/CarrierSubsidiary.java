package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-27T13:45:11.284-04:00")
public class CarrierSubsidiary  implements Serializable {
  
  private Integer id = null;
  private String name = null;
  private String alternateName = null;

  
  /**
   * Primary key
   **/
  public CarrierSubsidiary id(Integer id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Primary key")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   * Subsidiary name
   **/
  public CarrierSubsidiary name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Subsidiary name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Parent Carrier Name
   **/
  public CarrierSubsidiary alternateName(String alternateName) {
    this.alternateName = alternateName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parent Carrier Name")
  @JsonProperty("alternate_name")
  public String getAlternateName() {
    return alternateName;
  }
  public void setAlternateName(String alternateName) {
    this.alternateName = alternateName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarrierSubsidiary carrierSubsidiary = (CarrierSubsidiary) o;
    return Objects.equals(this.id, carrierSubsidiary.id) &&
        Objects.equals(this.name, carrierSubsidiary.name) &&
        Objects.equals(this.alternateName, carrierSubsidiary.alternateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, alternateName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarrierSubsidiary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alternateName: ").append(toIndentedString(alternateName)).append("\n");
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

