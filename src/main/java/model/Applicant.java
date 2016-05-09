package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T13:18:42.423-04:00")
public class Applicant  implements Serializable {
  
  private Integer id = null;
  private LocalDate dob = null;
  private String memberId = null;
  private String name = null;
  private String relationship = null;
  private Boolean smoker = null;
  private String ssn = null;

  
  /**
   * Primary key
   **/
  public Applicant id(Integer id) {
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
   * Date of Birth
   **/
  public Applicant dob(LocalDate dob) {
    this.dob = dob;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date of Birth")
  @JsonProperty("dob")
  public LocalDate getDob() {
    return dob;
  }
  public void setDob(LocalDate dob) {
    this.dob = dob;
  }


  /**
   * Foreign key to members
   **/
  public Applicant memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Foreign key to members")
  @JsonProperty("member_id")
  public String getMemberId() {
    return memberId;
  }
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }


  /**
   * Full name of the Applicant
   **/
  public Applicant name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Full name of the Applicant")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Relationship of the Applicant to the Member
   **/
  public Applicant relationship(String relationship) {
    this.relationship = relationship;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Relationship of the Applicant to the Member")
  @JsonProperty("relationship")
  public String getRelationship() {
    return relationship;
  }
  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }


  /**
   * Does the Applicant smoke?
   **/
  public Applicant smoker(Boolean smoker) {
    this.smoker = smoker;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Does the Applicant smoke?")
  @JsonProperty("smoker")
  public Boolean getSmoker() {
    return smoker;
  }
  public void setSmoker(Boolean smoker) {
    this.smoker = smoker;
  }


  /**
   * Applicant's Social Security Number
   **/
  public Applicant ssn(String ssn) {
    this.ssn = ssn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Applicant's Social Security Number")
  @JsonProperty("ssn")
  public String getSsn() {
    return ssn;
  }
  public void setSsn(String ssn) {
    this.ssn = ssn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Applicant applicant = (Applicant) o;
    return Objects.equals(this.id, applicant.id) &&
        Objects.equals(this.dob, applicant.dob) &&
        Objects.equals(this.memberId, applicant.memberId) &&
        Objects.equals(this.name, applicant.name) &&
        Objects.equals(this.relationship, applicant.relationship) &&
        Objects.equals(this.smoker, applicant.smoker) &&
        Objects.equals(this.ssn, applicant.ssn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dob, memberId, name, relationship, smoker, ssn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Applicant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    smoker: ").append(toIndentedString(smoker)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
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

