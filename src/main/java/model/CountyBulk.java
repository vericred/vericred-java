package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-27T13:45:11.284-04:00")
public class CountyBulk  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String stateId = null;

  
  /**
   * FIPs code for the county
   **/
  public CountyBulk id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "FIPs code for the county")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Name of the county
   **/
  public CountyBulk name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the county")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * State code
   **/
  public CountyBulk stateId(String stateId) {
    this.stateId = stateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "State code")
  @JsonProperty("state_id")
  public String getStateId() {
    return stateId;
  }
  public void setStateId(String stateId) {
    this.stateId = stateId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountyBulk countyBulk = (CountyBulk) o;
    return Objects.equals(this.id, countyBulk.id) &&
        Objects.equals(this.name, countyBulk.name) &&
        Objects.equals(this.stateId, countyBulk.stateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, stateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountyBulk {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
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

