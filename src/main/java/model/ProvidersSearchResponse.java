package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import model.Meta;
import model.Provider;
import model.State;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-31T08:54:42.900-04:00")
public class ProvidersSearchResponse  implements Serializable {
  
  private Meta meta = null;
  private List<Provider> providers = new ArrayList<Provider>();
  private List<State> states = new ArrayList<State>();

  
  /**
   * Metadata for query
   **/
  public ProvidersSearchResponse meta(Meta meta) {
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


  /**
   * Providers that fit the requested criterion.
   **/
  public ProvidersSearchResponse providers(List<Provider> providers) {
    this.providers = providers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Providers that fit the requested criterion.")
  @JsonProperty("providers")
  public List<Provider> getProviders() {
    return providers;
  }
  public void setProviders(List<Provider> providers) {
    this.providers = providers;
  }


  /**
   * States that fit the requested criterion.
   **/
  public ProvidersSearchResponse states(List<State> states) {
    this.states = states;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "States that fit the requested criterion.")
  @JsonProperty("states")
  public List<State> getStates() {
    return states;
  }
  public void setStates(List<State> states) {
    this.states = states;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvidersSearchResponse providersSearchResponse = (ProvidersSearchResponse) o;
    return Objects.equals(this.meta, providersSearchResponse.meta) &&
        Objects.equals(this.providers, providersSearchResponse.providers) &&
        Objects.equals(this.states, providersSearchResponse.states);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, providers, states);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvidersSearchResponse {\n");
    
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
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

