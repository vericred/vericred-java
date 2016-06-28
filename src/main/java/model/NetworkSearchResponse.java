package model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import model.Meta;
import model.Network;

import java.io.Serializable;
/**
 * NetworkSearchResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-28T10:14:26.235-04:00")
public class NetworkSearchResponse  implements Serializable {
  
  private Meta meta = null;
  private List<Network> networks = new ArrayList<Network>();

  
  /**
   * Metadata for query
   **/
  public NetworkSearchResponse meta(Meta meta) {
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
   * Networks that fit the requested criterion.
   **/
  public NetworkSearchResponse networks(List<Network> networks) {
    this.networks = networks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Networks that fit the requested criterion.")
  @JsonProperty("networks")
  public List<Network> getNetworks() {
    return networks;
  }
  public void setNetworks(List<Network> networks) {
    this.networks = networks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkSearchResponse networkSearchResponse = (NetworkSearchResponse) o;
    return Objects.equals(this.meta, networkSearchResponse.meta) &&
        Objects.equals(this.networks, networkSearchResponse.networks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, networks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkSearchResponse {\n");
    
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
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

