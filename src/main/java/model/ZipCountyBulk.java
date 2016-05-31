package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-31T08:54:42.900-04:00")
public class ZipCountyBulk  implements Serializable {
  
  private Integer id = null;
  private String ratingAreaId = null;
  private String countyId = null;
  private String zipCodeId = null;

  
  /**
   * Primary key
   **/
  public ZipCountyBulk id(Integer id) {
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
   * Foreign key for rating area
   **/
  public ZipCountyBulk ratingAreaId(String ratingAreaId) {
    this.ratingAreaId = ratingAreaId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Foreign key for rating area")
  @JsonProperty("rating_area_id")
  public String getRatingAreaId() {
    return ratingAreaId;
  }
  public void setRatingAreaId(String ratingAreaId) {
    this.ratingAreaId = ratingAreaId;
  }


  /**
   * Foreign key for county (fips code)
   **/
  public ZipCountyBulk countyId(String countyId) {
    this.countyId = countyId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Foreign key for county (fips code)")
  @JsonProperty("county_id")
  public String getCountyId() {
    return countyId;
  }
  public void setCountyId(String countyId) {
    this.countyId = countyId;
  }


  /**
   * Foreign key for zip code (zip code)
   **/
  public ZipCountyBulk zipCodeId(String zipCodeId) {
    this.zipCodeId = zipCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Foreign key for zip code (zip code)")
  @JsonProperty("zip_code_id")
  public String getZipCodeId() {
    return zipCodeId;
  }
  public void setZipCodeId(String zipCodeId) {
    this.zipCodeId = zipCodeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZipCountyBulk zipCountyBulk = (ZipCountyBulk) o;
    return Objects.equals(this.id, zipCountyBulk.id) &&
        Objects.equals(this.ratingAreaId, zipCountyBulk.ratingAreaId) &&
        Objects.equals(this.countyId, zipCountyBulk.countyId) &&
        Objects.equals(this.zipCodeId, zipCountyBulk.zipCodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ratingAreaId, countyId, zipCodeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZipCountyBulk {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ratingAreaId: ").append(toIndentedString(ratingAreaId)).append("\n");
    sb.append("    countyId: ").append(toIndentedString(countyId)).append("\n");
    sb.append("    zipCodeId: ").append(toIndentedString(zipCodeId)).append("\n");
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

