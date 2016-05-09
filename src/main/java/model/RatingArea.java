package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T13:18:42.423-04:00")
public class RatingArea  implements Serializable {
  
  private Integer id = null;
  private Integer stateId = null;

  
  /**
   * Primary key
   **/
  public RatingArea id(Integer id) {
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
   * Foreign key to state
   **/
  public RatingArea stateId(Integer stateId) {
    this.stateId = stateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Foreign key to state")
  @JsonProperty("state_id")
  public Integer getStateId() {
    return stateId;
  }
  public void setStateId(Integer stateId) {
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

