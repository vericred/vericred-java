package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-27T13:45:11.284-04:00")
public class County  implements Serializable {
  
  private Integer id = null;
  private String fipsCode = null;
  private String name = null;
  private String stateCode = null;
  private Integer stateId = null;
  private Boolean stateLive = null;
  private Boolean stateLiveForBusiness = null;

  
  /**
   * Primary key
   **/
  public County id(Integer id) {
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
   * State FIPS code
   **/
  public County fipsCode(String fipsCode) {
    this.fipsCode = fipsCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "State FIPS code")
  @JsonProperty("fips_code")
  public String getFipsCode() {
    return fipsCode;
  }
  public void setFipsCode(String fipsCode) {
    this.fipsCode = fipsCode;
  }


  /**
   * Human-readable name
   **/
  public County name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Human-readable name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Two-character state code
   **/
  public County stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Two-character state code")
  @JsonProperty("state_code")
  public String getStateCode() {
    return stateCode;
  }
  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }


  /**
   * state relationship
   **/
  public County stateId(Integer stateId) {
    this.stateId = stateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "state relationship")
  @JsonProperty("state_id")
  public Integer getStateId() {
    return stateId;
  }
  public void setStateId(Integer stateId) {
    this.stateId = stateId;
  }


  /**
   * Is the state containing this county active for consumers?(deprecated in favor of last_date_for_individual)
   **/
  public County stateLive(Boolean stateLive) {
    this.stateLive = stateLive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is the state containing this county active for consumers?(deprecated in favor of last_date_for_individual)")
  @JsonProperty("state_live")
  public Boolean getStateLive() {
    return stateLive;
  }
  public void setStateLive(Boolean stateLive) {
    this.stateLive = stateLive;
  }


  /**
   * Is the state containing this county active for business?(deprecated in favor of last_date_for_shop)
   **/
  public County stateLiveForBusiness(Boolean stateLiveForBusiness) {
    this.stateLiveForBusiness = stateLiveForBusiness;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is the state containing this county active for business?(deprecated in favor of last_date_for_shop)")
  @JsonProperty("state_live_for_business")
  public Boolean getStateLiveForBusiness() {
    return stateLiveForBusiness;
  }
  public void setStateLiveForBusiness(Boolean stateLiveForBusiness) {
    this.stateLiveForBusiness = stateLiveForBusiness;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    County county = (County) o;
    return Objects.equals(this.id, county.id) &&
        Objects.equals(this.fipsCode, county.fipsCode) &&
        Objects.equals(this.name, county.name) &&
        Objects.equals(this.stateCode, county.stateCode) &&
        Objects.equals(this.stateId, county.stateId) &&
        Objects.equals(this.stateLive, county.stateLive) &&
        Objects.equals(this.stateLiveForBusiness, county.stateLiveForBusiness);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fipsCode, name, stateCode, stateId, stateLive, stateLiveForBusiness);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class County {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fipsCode: ").append(toIndentedString(fipsCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
    sb.append("    stateLive: ").append(toIndentedString(stateLive)).append("\n");
    sb.append("    stateLiveForBusiness: ").append(toIndentedString(stateLiveForBusiness)).append("\n");
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

