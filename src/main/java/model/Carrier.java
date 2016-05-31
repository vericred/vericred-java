package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-31T08:54:42.900-04:00")
public class Carrier  implements Serializable {
  
  private Integer id = null;
  private String name = null;
  private String logoPath = null;

  
  /**
   * Primary key
   **/
  public Carrier id(Integer id) {
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
   * Name of the Carrier
   **/
  public Carrier name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the Carrier")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * URL for the Carrier's logo
   **/
  public Carrier logoPath(String logoPath) {
    this.logoPath = logoPath;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL for the Carrier's logo")
  @JsonProperty("logo_path")
  public String getLogoPath() {
    return logoPath;
  }
  public void setLogoPath(String logoPath) {
    this.logoPath = logoPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Carrier carrier = (Carrier) o;
    return Objects.equals(this.id, carrier.id) &&
        Objects.equals(this.name, carrier.name) &&
        Objects.equals(this.logoPath, carrier.logoPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, logoPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Carrier {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    logoPath: ").append(toIndentedString(logoPath)).append("\n");
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

