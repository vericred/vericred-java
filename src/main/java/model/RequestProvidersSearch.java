package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-27T13:45:11.284-04:00")
public class RequestProvidersSearch  implements Serializable {
  
  private Boolean acceptsInsurance = null;
  private List<String> hiosIds = new ArrayList<String>();
  private Integer page = null;
  private Integer perPage = null;
  private Integer radius = null;
  private String searchTerm = null;
  private String zipCode = null;
  private String type = null;

  
  /**
   * Limit results to Providers who accept at least one insurance        plan.  Note that the inverse of this filter is not supported and        any value will evaluate to true
   **/
  public RequestProvidersSearch acceptsInsurance(Boolean acceptsInsurance) {
    this.acceptsInsurance = acceptsInsurance;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Limit results to Providers who accept at least one insurance        plan.  Note that the inverse of this filter is not supported and        any value will evaluate to true")
  @JsonProperty("accepts_insurance")
  public Boolean getAcceptsInsurance() {
    return acceptsInsurance;
  }
  public void setAcceptsInsurance(Boolean acceptsInsurance) {
    this.acceptsInsurance = acceptsInsurance;
  }


  /**
   * List of HIOS ids
   **/
  public RequestProvidersSearch hiosIds(List<String> hiosIds) {
    this.hiosIds = hiosIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of HIOS ids")
  @JsonProperty("hios_ids")
  public List<String> getHiosIds() {
    return hiosIds;
  }
  public void setHiosIds(List<String> hiosIds) {
    this.hiosIds = hiosIds;
  }


  /**
   * Page number
   **/
  public RequestProvidersSearch page(Integer page) {
    this.page = page;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Page number")
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }
  public void setPage(Integer page) {
    this.page = page;
  }


  /**
   * Number of records to return per page
   **/
  public RequestProvidersSearch perPage(Integer perPage) {
    this.perPage = perPage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of records to return per page")
  @JsonProperty("per_page")
  public Integer getPerPage() {
    return perPage;
  }
  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }


  /**
   * Radius (in miles) to use to limit results
   **/
  public RequestProvidersSearch radius(Integer radius) {
    this.radius = radius;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Radius (in miles) to use to limit results")
  @JsonProperty("radius")
  public Integer getRadius() {
    return radius;
  }
  public void setRadius(Integer radius) {
    this.radius = radius;
  }


  /**
   * String to search by
   **/
  public RequestProvidersSearch searchTerm(String searchTerm) {
    this.searchTerm = searchTerm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "String to search by")
  @JsonProperty("search_term")
  public String getSearchTerm() {
    return searchTerm;
  }
  public void setSearchTerm(String searchTerm) {
    this.searchTerm = searchTerm;
  }


  /**
   * Zip Code to search near
   **/
  public RequestProvidersSearch zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Zip Code to search near")
  @JsonProperty("zip_code")
  public String getZipCode() {
    return zipCode;
  }
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  /**
   * Either organization or individual
   **/
  public RequestProvidersSearch type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Either organization or individual")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestProvidersSearch requestProvidersSearch = (RequestProvidersSearch) o;
    return Objects.equals(this.acceptsInsurance, requestProvidersSearch.acceptsInsurance) &&
        Objects.equals(this.hiosIds, requestProvidersSearch.hiosIds) &&
        Objects.equals(this.page, requestProvidersSearch.page) &&
        Objects.equals(this.perPage, requestProvidersSearch.perPage) &&
        Objects.equals(this.radius, requestProvidersSearch.radius) &&
        Objects.equals(this.searchTerm, requestProvidersSearch.searchTerm) &&
        Objects.equals(this.zipCode, requestProvidersSearch.zipCode) &&
        Objects.equals(this.type, requestProvidersSearch.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptsInsurance, hiosIds, page, perPage, radius, searchTerm, zipCode, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestProvidersSearch {\n");
    
    sb.append("    acceptsInsurance: ").append(toIndentedString(acceptsInsurance)).append("\n");
    sb.append("    hiosIds: ").append(toIndentedString(hiosIds)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
    sb.append("    searchTerm: ").append(toIndentedString(searchTerm)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

