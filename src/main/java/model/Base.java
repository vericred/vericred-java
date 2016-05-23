package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import model.Meta;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T16:44:52.285-04:00")
public class Base  implements Serializable {
  
  private Meta meta = null;

  
  /**
   * Metadata for query
   **/
  public Base meta(Meta meta) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Base base = (Base) o;
    return Objects.equals(this.meta, base.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Base {\n");
    
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

