package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import model.Provider;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T13:18:42.423-04:00")
public class InlineResponse200  implements Serializable {
  
  private Object meta = null;
  private List<Provider> providers = new ArrayList<Provider>();

  
  /**
   **/
  public InlineResponse200 meta(Object meta) {
    this.meta = meta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("meta")
  public Object getMeta() {
    return meta;
  }
  public void setMeta(Object meta) {
    this.meta = meta;
  }


  /**
   **/
  public InlineResponse200 providers(List<Provider> providers) {
    this.providers = providers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("providers")
  public List<Provider> getProviders() {
    return providers;
  }
  public void setProviders(List<Provider> providers) {
    this.providers = providers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.meta, inlineResponse200.meta) &&
        Objects.equals(this.providers, inlineResponse200.providers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, providers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
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

