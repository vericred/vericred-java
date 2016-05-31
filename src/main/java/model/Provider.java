package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-31T08:54:42.900-04:00")
public class Provider  implements Serializable {
  
  private Boolean acceptingChangeOfPayorPatients = null;
  private Boolean acceptingMedicaidPatients = null;
  private Boolean acceptingMedicarePatients = null;
  private Boolean acceptingPrivatePatients = null;
  private Boolean acceptingReferralPatients = null;
  private String city = null;
  private String email = null;
  private String gender = null;
  private String firstName = null;
  private List<String> hiosIds = new ArrayList<String>();
  private Integer id = null;
  private String lastName = null;
  private BigDecimal latitude = null;
  private BigDecimal longitude = null;
  private String middleName = null;
  private List<Integer> networkIds = new ArrayList<Integer>();
  private String personalPhone = null;
  private String phone = null;
  private String presentationName = null;
  private String specialty = null;
  private String state = null;
  private Integer stateId = null;
  private String streetLine1 = null;
  private String streetLine2 = null;
  private String suffix = null;
  private String title = null;
  private String type = null;
  private String zipCode = null;

  
  /**
   * Is this provider accepting patients with a change of insurance?
   **/
  public Provider acceptingChangeOfPayorPatients(Boolean acceptingChangeOfPayorPatients) {
    this.acceptingChangeOfPayorPatients = acceptingChangeOfPayorPatients;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is this provider accepting patients with a change of insurance?")
  @JsonProperty("accepting_change_of_payor_patients")
  public Boolean getAcceptingChangeOfPayorPatients() {
    return acceptingChangeOfPayorPatients;
  }
  public void setAcceptingChangeOfPayorPatients(Boolean acceptingChangeOfPayorPatients) {
    this.acceptingChangeOfPayorPatients = acceptingChangeOfPayorPatients;
  }


  /**
   * Is this provider accepting new Medicaid patients?
   **/
  public Provider acceptingMedicaidPatients(Boolean acceptingMedicaidPatients) {
    this.acceptingMedicaidPatients = acceptingMedicaidPatients;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is this provider accepting new Medicaid patients?")
  @JsonProperty("accepting_medicaid_patients")
  public Boolean getAcceptingMedicaidPatients() {
    return acceptingMedicaidPatients;
  }
  public void setAcceptingMedicaidPatients(Boolean acceptingMedicaidPatients) {
    this.acceptingMedicaidPatients = acceptingMedicaidPatients;
  }


  /**
   * Is this provider accepting new Medicare patients?
   **/
  public Provider acceptingMedicarePatients(Boolean acceptingMedicarePatients) {
    this.acceptingMedicarePatients = acceptingMedicarePatients;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is this provider accepting new Medicare patients?")
  @JsonProperty("accepting_medicare_patients")
  public Boolean getAcceptingMedicarePatients() {
    return acceptingMedicarePatients;
  }
  public void setAcceptingMedicarePatients(Boolean acceptingMedicarePatients) {
    this.acceptingMedicarePatients = acceptingMedicarePatients;
  }


  /**
   * Is this provider accepting new patients with private insurance?
   **/
  public Provider acceptingPrivatePatients(Boolean acceptingPrivatePatients) {
    this.acceptingPrivatePatients = acceptingPrivatePatients;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is this provider accepting new patients with private insurance?")
  @JsonProperty("accepting_private_patients")
  public Boolean getAcceptingPrivatePatients() {
    return acceptingPrivatePatients;
  }
  public void setAcceptingPrivatePatients(Boolean acceptingPrivatePatients) {
    this.acceptingPrivatePatients = acceptingPrivatePatients;
  }


  /**
   * Is this provider accepting new patients via referrals?
   **/
  public Provider acceptingReferralPatients(Boolean acceptingReferralPatients) {
    this.acceptingReferralPatients = acceptingReferralPatients;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is this provider accepting new patients via referrals?")
  @JsonProperty("accepting_referral_patients")
  public Boolean getAcceptingReferralPatients() {
    return acceptingReferralPatients;
  }
  public void setAcceptingReferralPatients(Boolean acceptingReferralPatients) {
    this.acceptingReferralPatients = acceptingReferralPatients;
  }


  /**
   * City name (e.g. Springfield).
   **/
  public Provider city(String city) {
    this.city = city;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "City name (e.g. Springfield).")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }


  /**
   * Primary email address to contact the provider.
   **/
  public Provider email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Primary email address to contact the provider.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * Provider's gender (M or F)
   **/
  public Provider gender(String gender) {
    this.gender = gender;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provider's gender (M or F)")
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }


  /**
   * Given name for the provider.
   **/
  public Provider firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Given name for the provider.")
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   * List of HIOS ids for this provider
   **/
  public Provider hiosIds(List<String> hiosIds) {
    this.hiosIds = hiosIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of HIOS ids for this provider")
  @JsonProperty("hios_ids")
  public List<String> getHiosIds() {
    return hiosIds;
  }
  public void setHiosIds(List<String> hiosIds) {
    this.hiosIds = hiosIds;
  }


  /**
   * National Provider Index (NPI) number
   **/
  public Provider id(Integer id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "National Provider Index (NPI) number")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   * Family name for the provider.
   **/
  public Provider lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Family name for the provider.")
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   * Latitude of provider
   **/
  public Provider latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Latitude of provider")
  @JsonProperty("latitude")
  public BigDecimal getLatitude() {
    return latitude;
  }
  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }


  /**
   * Longitude of provider
   **/
  public Provider longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Longitude of provider")
  @JsonProperty("longitude")
  public BigDecimal getLongitude() {
    return longitude;
  }
  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }


  /**
   * Middle name for the provider.
   **/
  public Provider middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Middle name for the provider.")
  @JsonProperty("middle_name")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  /**
   * Array of network ids
   **/
  public Provider networkIds(List<Integer> networkIds) {
    this.networkIds = networkIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Array of network ids")
  @JsonProperty("network_ids")
  public List<Integer> getNetworkIds() {
    return networkIds;
  }
  public void setNetworkIds(List<Integer> networkIds) {
    this.networkIds = networkIds;
  }


  /**
   * Personal contact phone for the provider.
   **/
  public Provider personalPhone(String personalPhone) {
    this.personalPhone = personalPhone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Personal contact phone for the provider.")
  @JsonProperty("personal_phone")
  public String getPersonalPhone() {
    return personalPhone;
  }
  public void setPersonalPhone(String personalPhone) {
    this.personalPhone = personalPhone;
  }


  /**
   * Office phone for the provider
   **/
  public Provider phone(String phone) {
    this.phone = phone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Office phone for the provider")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }


  /**
   * Preferred name for display (e.g. Dr. Francis White may prefer Dr. Frank White)
   **/
  public Provider presentationName(String presentationName) {
    this.presentationName = presentationName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Preferred name for display (e.g. Dr. Francis White may prefer Dr. Frank White)")
  @JsonProperty("presentation_name")
  public String getPresentationName() {
    return presentationName;
  }
  public void setPresentationName(String presentationName) {
    this.presentationName = presentationName;
  }


  /**
   * Name of the primary Specialty
   **/
  public Provider specialty(String specialty) {
    this.specialty = specialty;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the primary Specialty")
  @JsonProperty("specialty")
  public String getSpecialty() {
    return specialty;
  }
  public void setSpecialty(String specialty) {
    this.specialty = specialty;
  }


  /**
   * State code for the provider's address (e.g. NY).
   **/
  public Provider state(String state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "State code for the provider's address (e.g. NY).")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }


  /**
   * Foreign key to States
   **/
  public Provider stateId(Integer stateId) {
    this.stateId = stateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Foreign key to States")
  @JsonProperty("state_id")
  public Integer getStateId() {
    return stateId;
  }
  public void setStateId(Integer stateId) {
    this.stateId = stateId;
  }


  /**
   * First line of the provider's street address.
   **/
  public Provider streetLine1(String streetLine1) {
    this.streetLine1 = streetLine1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "First line of the provider's street address.")
  @JsonProperty("street_line_1")
  public String getStreetLine1() {
    return streetLine1;
  }
  public void setStreetLine1(String streetLine1) {
    this.streetLine1 = streetLine1;
  }


  /**
   * Second line of the provider's street address.
   **/
  public Provider streetLine2(String streetLine2) {
    this.streetLine2 = streetLine2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Second line of the provider's street address.")
  @JsonProperty("street_line_2")
  public String getStreetLine2() {
    return streetLine2;
  }
  public void setStreetLine2(String streetLine2) {
    this.streetLine2 = streetLine2;
  }


  /**
   * Suffix for the provider's name (e.g. Jr)
   **/
  public Provider suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Suffix for the provider's name (e.g. Jr)")
  @JsonProperty("suffix")
  public String getSuffix() {
    return suffix;
  }
  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }


  /**
   * Professional title for the provider (e.g. Dr).
   **/
  public Provider title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Professional title for the provider (e.g. Dr).")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Type of NPI number (individual provider vs organization).
   **/
  public Provider type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of NPI number (individual provider vs organization).")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Postal code for the provider's address (e.g. 11215)
   **/
  public Provider zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Postal code for the provider's address (e.g. 11215)")
  @JsonProperty("zip_code")
  public String getZipCode() {
    return zipCode;
  }
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Provider provider = (Provider) o;
    return Objects.equals(this.acceptingChangeOfPayorPatients, provider.acceptingChangeOfPayorPatients) &&
        Objects.equals(this.acceptingMedicaidPatients, provider.acceptingMedicaidPatients) &&
        Objects.equals(this.acceptingMedicarePatients, provider.acceptingMedicarePatients) &&
        Objects.equals(this.acceptingPrivatePatients, provider.acceptingPrivatePatients) &&
        Objects.equals(this.acceptingReferralPatients, provider.acceptingReferralPatients) &&
        Objects.equals(this.city, provider.city) &&
        Objects.equals(this.email, provider.email) &&
        Objects.equals(this.gender, provider.gender) &&
        Objects.equals(this.firstName, provider.firstName) &&
        Objects.equals(this.hiosIds, provider.hiosIds) &&
        Objects.equals(this.id, provider.id) &&
        Objects.equals(this.lastName, provider.lastName) &&
        Objects.equals(this.latitude, provider.latitude) &&
        Objects.equals(this.longitude, provider.longitude) &&
        Objects.equals(this.middleName, provider.middleName) &&
        Objects.equals(this.networkIds, provider.networkIds) &&
        Objects.equals(this.personalPhone, provider.personalPhone) &&
        Objects.equals(this.phone, provider.phone) &&
        Objects.equals(this.presentationName, provider.presentationName) &&
        Objects.equals(this.specialty, provider.specialty) &&
        Objects.equals(this.state, provider.state) &&
        Objects.equals(this.stateId, provider.stateId) &&
        Objects.equals(this.streetLine1, provider.streetLine1) &&
        Objects.equals(this.streetLine2, provider.streetLine2) &&
        Objects.equals(this.suffix, provider.suffix) &&
        Objects.equals(this.title, provider.title) &&
        Objects.equals(this.type, provider.type) &&
        Objects.equals(this.zipCode, provider.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptingChangeOfPayorPatients, acceptingMedicaidPatients, acceptingMedicarePatients, acceptingPrivatePatients, acceptingReferralPatients, city, email, gender, firstName, hiosIds, id, lastName, latitude, longitude, middleName, networkIds, personalPhone, phone, presentationName, specialty, state, stateId, streetLine1, streetLine2, suffix, title, type, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Provider {\n");
    
    sb.append("    acceptingChangeOfPayorPatients: ").append(toIndentedString(acceptingChangeOfPayorPatients)).append("\n");
    sb.append("    acceptingMedicaidPatients: ").append(toIndentedString(acceptingMedicaidPatients)).append("\n");
    sb.append("    acceptingMedicarePatients: ").append(toIndentedString(acceptingMedicarePatients)).append("\n");
    sb.append("    acceptingPrivatePatients: ").append(toIndentedString(acceptingPrivatePatients)).append("\n");
    sb.append("    acceptingReferralPatients: ").append(toIndentedString(acceptingReferralPatients)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    hiosIds: ").append(toIndentedString(hiosIds)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    networkIds: ").append(toIndentedString(networkIds)).append("\n");
    sb.append("    personalPhone: ").append(toIndentedString(personalPhone)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    presentationName: ").append(toIndentedString(presentationName)).append("\n");
    sb.append("    specialty: ").append(toIndentedString(specialty)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
    sb.append("    streetLine1: ").append(toIndentedString(streetLine1)).append("\n");
    sb.append("    streetLine2: ").append(toIndentedString(streetLine2)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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

