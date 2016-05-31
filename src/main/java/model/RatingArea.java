package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-31T08:54:42.900-04:00")
public class RatingArea  implements Serializable {
  
  private String id = null;
  private String stateId = null;

  
  /**
   * Name of the Rating Area
   **/
  public RatingArea id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the Rating Area")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * State Code
   **/
  public RatingArea stateId(String stateId) {
    this.stateId = stateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "State Code")
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
    RatingArea ratingArea = (RatingArea) o;
    return Objects.equals(this.id, ratingArea.id) &&
        Objects.equals(this.stateId, ratingArea.stateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, stateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingArea {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

