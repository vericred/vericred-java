package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-31T08:54:42.900-04:00")
public class State  implements Serializable {
  
  private Integer id = null;
  private String name = null;
  private String code = null;
  private String fipsNumber = null;
  private LocalDate lastDateForIndividual = null;
  private LocalDate lastDateForShop = null;
  private Boolean liveForBusiness = null;
  private Boolean liveForConsumers = null;

  
  /**
   * Primary Key of State
   **/
  public State id(Integer id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Primary Key of State")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   * Name of state
   **/
  public State name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of state")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * 2 letter code for state
   **/
  public State code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "2 letter code for state")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }


  /**
   * National FIPs number
   **/
  public State fipsNumber(String fipsNumber) {
    this.fipsNumber = fipsNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "National FIPs number")
  @JsonProperty("fips_number")
  public String getFipsNumber() {
    return fipsNumber;
  }
  public void setFipsNumber(String fipsNumber) {
    this.fipsNumber = fipsNumber;
  }


  /**
   * Last date this state is live for individuals
   **/
  public State lastDateForIndividual(LocalDate lastDateForIndividual) {
    this.lastDateForIndividual = lastDateForIndividual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Last date this state is live for individuals")
  @JsonProperty("last_date_for_individual")
  public LocalDate getLastDateForIndividual() {
    return lastDateForIndividual;
  }
  public void setLastDateForIndividual(LocalDate lastDateForIndividual) {
    this.lastDateForIndividual = lastDateForIndividual;
  }


  /**
   * Last date this state is live for shop
   **/
  public State lastDateForShop(LocalDate lastDateForShop) {
    this.lastDateForShop = lastDateForShop;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Last date this state is live for shop")
  @JsonProperty("last_date_for_shop")
  public LocalDate getLastDateForShop() {
    return lastDateForShop;
  }
  public void setLastDateForShop(LocalDate lastDateForShop) {
    this.lastDateForShop = lastDateForShop;
  }


  /**
   * Is this State available for businesses
   **/
  public State liveForBusiness(Boolean liveForBusiness) {
    this.liveForBusiness = liveForBusiness;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is this State available for businesses")
  @JsonProperty("live_for_business")
  public Boolean getLiveForBusiness() {
    return liveForBusiness;
  }
  public void setLiveForBusiness(Boolean liveForBusiness) {
    this.liveForBusiness = liveForBusiness;
  }


  /**
   * Is this State available for individuals
   **/
  public State liveForConsumers(Boolean liveForConsumers) {
    this.liveForConsumers = liveForConsumers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is this State available for individuals")
  @JsonProperty("live_for_consumers")
  public Boolean getLiveForConsumers() {
    return liveForConsumers;
  }
  public void setLiveForConsumers(Boolean liveForConsumers) {
    this.liveForConsumers = liveForConsumers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    State state = (State) o;
    return Objects.equals(this.id, state.id) &&
        Objects.equals(this.name, state.name) &&
        Objects.equals(this.code, state.code) &&
        Objects.equals(this.fipsNumber, state.fipsNumber) &&
        Objects.equals(this.lastDateForIndividual, state.lastDateForIndividual) &&
        Objects.equals(this.lastDateForShop, state.lastDateForShop) &&
        Objects.equals(this.liveForBusiness, state.liveForBusiness) &&
        Objects.equals(this.liveForConsumers, state.liveForConsumers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, code, fipsNumber, lastDateForIndividual, lastDateForShop, liveForBusiness, liveForConsumers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class State {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    fipsNumber: ").append(toIndentedString(fipsNumber)).append("\n");
    sb.append("    lastDateForIndividual: ").append(toIndentedString(lastDateForIndividual)).append("\n");
    sb.append("    lastDateForShop: ").append(toIndentedString(lastDateForShop)).append("\n");
    sb.append("    liveForBusiness: ").append(toIndentedString(liveForBusiness)).append("\n");
    sb.append("    liveForConsumers: ").append(toIndentedString(liveForConsumers)).append("\n");
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

