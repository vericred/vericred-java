package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T16:44:52.285-04:00")
public class PlanSearchResult  implements Serializable {
  
  private Boolean adultDental = null;
  private String ambulance = null;
  private String benefitsSummaryUrl = null;
  private String buyLink = null;
  private String carrierName = null;
  private Boolean childDental = null;
  private String childEyewear = null;
  private String childEyeExam = null;
  private String customerServicePhoneNumber = null;
  private String durableMedicalEquipment = null;
  private String diagnosticTest = null;
  private String drugFormularyUrl = null;
  private String effectiveDate = null;
  private String expirationDate = null;
  private String emergencyRoom = null;
  private String familyDrugDeductible = null;
  private String familyDrugMoop = null;
  private String familyMedicalDeductible = null;
  private String familyMedicalMoop = null;
  private String genericDrugs = null;
  private String habilitationServices = null;
  private String hiosIssuerId = null;
  private String homeHealthCare = null;
  private String hospiceService = null;
  private String id = null;
  private String imaging = null;
  private List<Integer> inNetworkIds = new ArrayList<Integer>();
  private String individualDrugDeductible = null;
  private String individualDrugMoop = null;
  private String individualMedicalDeductible = null;
  private String individualMedicalMoop = null;
  private String inpatientBirth = null;
  private String inpatientFacility = null;
  private String inpatientMentalHealth = null;
  private String inpatientPhysician = null;
  private String inpatientSubstance = null;
  private String level = null;
  private String logoUrl = null;
  private String name = null;
  private String nonPreferredBrandDrugs = null;
  private Boolean onMarket = null;
  private Boolean offMarket = null;
  private Boolean outOfNetworkCoverage = null;
  private List<Integer> outOfNetworkIds = new ArrayList<Integer>();
  private String outpatientFacility = null;
  private String outpatientMentalHealth = null;
  private String outpatientPhysician = null;
  private String outpatientSubstance = null;
  private String planMarket = null;
  private String planType = null;
  private String preferredBrandDrugs = null;
  private String prenatalPostnatalCare = null;
  private String preventativeCare = null;
  private BigDecimal premiumSubsidized = null;
  private BigDecimal premium = null;
  private String primaryCarePhysician = null;
  private String rehabilitationServices = null;
  private String skilledNursing = null;
  private String specialist = null;
  private String specialtyDrugs = null;
  private String urgentCare = null;
  private Integer matchPercentage = null;
  private Integer perfectMatchPercentage = null;
  private BigDecimal employeePremium = null;
  private BigDecimal dependentPremium = null;

  
  /**
   * Does the plan provide dental coverage for adults?
   **/
  public PlanSearchResult adultDental(Boolean adultDental) {
    this.adultDental = adultDental;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Does the plan provide dental coverage for adults?")
  @JsonProperty("adult_dental")
  public Boolean getAdultDental() {
    return adultDental;
  }
  public void setAdultDental(Boolean adultDental) {
    this.adultDental = adultDental;
  }


  /**
   * Benefits string for ambulance coverage
   **/
  public PlanSearchResult ambulance(String ambulance) {
    this.ambulance = ambulance;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Benefits string for ambulance coverage")
  @JsonProperty("ambulance")
  public String getAmbulance() {
    return ambulance;
  }
  public void setAmbulance(String ambulance) {
    this.ambulance = ambulance;
  }


  /**
   * Link to the summary of benefits and coverage (SBC) document.
   **/
  public PlanSearchResult benefitsSummaryUrl(String benefitsSummaryUrl) {
    this.benefitsSummaryUrl = benefitsSummaryUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Link to the summary of benefits and coverage (SBC) document.")
  @JsonProperty("benefits_summary_url")
  public String getBenefitsSummaryUrl() {
    return benefitsSummaryUrl;
  }
  public void setBenefitsSummaryUrl(String benefitsSummaryUrl) {
    this.benefitsSummaryUrl = benefitsSummaryUrl;
  }


  /**
   * Link to a location to purchase the plan.
   **/
  public PlanSearchResult buyLink(String buyLink) {
    this.buyLink = buyLink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Link to a location to purchase the plan.")
  @JsonProperty("buy_link")
  public String getBuyLink() {
    return buyLink;
  }
  public void setBuyLink(String buyLink) {
    this.buyLink = buyLink;
  }


  /**
   * Name of the insurance carrier
   **/
  public PlanSearchResult carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the insurance carrier")
  @JsonProperty("carrier_name")
  public String getCarrierName() {
    return carrierName;
  }
  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }


  /**
   * Does the plan provide dental coverage for children?
   **/
  public PlanSearchResult childDental(Boolean childDental) {
    this.childDental = childDental;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Does the plan provide dental coverage for children?")
  @JsonProperty("child_dental")
  public Boolean getChildDental() {
    return childDental;
  }
  public void setChildDental(Boolean childDental) {
    this.childDental = childDental;
  }


  /**
   * Child eyewear benefits summary
   **/
  public PlanSearchResult childEyewear(String childEyewear) {
    this.childEyewear = childEyewear;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Child eyewear benefits summary")
  @JsonProperty("child_eyewear")
  public String getChildEyewear() {
    return childEyewear;
  }
  public void setChildEyewear(String childEyewear) {
    this.childEyewear = childEyewear;
  }


  /**
   * Child eye exam benefits summary
   **/
  public PlanSearchResult childEyeExam(String childEyeExam) {
    this.childEyeExam = childEyeExam;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Child eye exam benefits summary")
  @JsonProperty("child_eye_exam")
  public String getChildEyeExam() {
    return childEyeExam;
  }
  public void setChildEyeExam(String childEyeExam) {
    this.childEyeExam = childEyeExam;
  }


  /**
   * Phone number to contact the insurance carrier
   **/
  public PlanSearchResult customerServicePhoneNumber(String customerServicePhoneNumber) {
    this.customerServicePhoneNumber = customerServicePhoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Phone number to contact the insurance carrier")
  @JsonProperty("customer_service_phone_number")
  public String getCustomerServicePhoneNumber() {
    return customerServicePhoneNumber;
  }
  public void setCustomerServicePhoneNumber(String customerServicePhoneNumber) {
    this.customerServicePhoneNumber = customerServicePhoneNumber;
  }


  /**
   * Benefits summary for durable medical equipment
   **/
  public PlanSearchResult durableMedicalEquipment(String durableMedicalEquipment) {
    this.durableMedicalEquipment = durableMedicalEquipment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Benefits summary for durable medical equipment")
  @JsonProperty("durable_medical_equipment")
  public String getDurableMedicalEquipment() {
    return durableMedicalEquipment;
  }
  public void setDurableMedicalEquipment(String durableMedicalEquipment) {
    this.durableMedicalEquipment = durableMedicalEquipment;
  }


  /**
   * Diagnostic tests benefit summary
   **/
  public PlanSearchResult diagnosticTest(String diagnosticTest) {
    this.diagnosticTest = diagnosticTest;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Diagnostic tests benefit summary")
  @JsonProperty("diagnostic_test")
  public String getDiagnosticTest() {
    return diagnosticTest;
  }
  public void setDiagnosticTest(String diagnosticTest) {
    this.diagnosticTest = diagnosticTest;
  }


  /**
   * Link to the summary of drug benefits for the plan
   **/
  public PlanSearchResult drugFormularyUrl(String drugFormularyUrl) {
    this.drugFormularyUrl = drugFormularyUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Link to the summary of drug benefits for the plan")
  @JsonProperty("drug_formulary_url")
  public String getDrugFormularyUrl() {
    return drugFormularyUrl;
  }
  public void setDrugFormularyUrl(String drugFormularyUrl) {
    this.drugFormularyUrl = drugFormularyUrl;
  }


  /**
   * Effective date of coverage.
   **/
  public PlanSearchResult effectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Effective date of coverage.")
  @JsonProperty("effective_date")
  public String getEffectiveDate() {
    return effectiveDate;
  }
  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }


  /**
   * Expiration date of coverage.
   **/
  public PlanSearchResult expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Expiration date of coverage.")
  @JsonProperty("expiration_date")
  public String getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  /**
   * Description of costs when visiting the ER
   **/
  public PlanSearchResult emergencyRoom(String emergencyRoom) {
    this.emergencyRoom = emergencyRoom;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of costs when visiting the ER")
  @JsonProperty("emergency_room")
  public String getEmergencyRoom() {
    return emergencyRoom;
  }
  public void setEmergencyRoom(String emergencyRoom) {
    this.emergencyRoom = emergencyRoom;
  }


  /**
   * Deductible for drugs when a family is on the plan.
   **/
  public PlanSearchResult familyDrugDeductible(String familyDrugDeductible) {
    this.familyDrugDeductible = familyDrugDeductible;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Deductible for drugs when a family is on the plan.")
  @JsonProperty("family_drug_deductible")
  public String getFamilyDrugDeductible() {
    return familyDrugDeductible;
  }
  public void setFamilyDrugDeductible(String familyDrugDeductible) {
    this.familyDrugDeductible = familyDrugDeductible;
  }


  /**
   * Maximum out-of-pocket for drugs when a family is on the plan
   **/
  public PlanSearchResult familyDrugMoop(String familyDrugMoop) {
    this.familyDrugMoop = familyDrugMoop;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum out-of-pocket for drugs when a family is on the plan")
  @JsonProperty("family_drug_moop")
  public String getFamilyDrugMoop() {
    return familyDrugMoop;
  }
  public void setFamilyDrugMoop(String familyDrugMoop) {
    this.familyDrugMoop = familyDrugMoop;
  }


  /**
   * Deductible when a family is on the plan
   **/
  public PlanSearchResult familyMedicalDeductible(String familyMedicalDeductible) {
    this.familyMedicalDeductible = familyMedicalDeductible;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Deductible when a family is on the plan")
  @JsonProperty("family_medical_deductible")
  public String getFamilyMedicalDeductible() {
    return familyMedicalDeductible;
  }
  public void setFamilyMedicalDeductible(String familyMedicalDeductible) {
    this.familyMedicalDeductible = familyMedicalDeductible;
  }


  /**
   * Maximum out-of-pocket when a family is on the plan
   **/
  public PlanSearchResult familyMedicalMoop(String familyMedicalMoop) {
    this.familyMedicalMoop = familyMedicalMoop;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum out-of-pocket when a family is on the plan")
  @JsonProperty("family_medical_moop")
  public String getFamilyMedicalMoop() {
    return familyMedicalMoop;
  }
  public void setFamilyMedicalMoop(String familyMedicalMoop) {
    this.familyMedicalMoop = familyMedicalMoop;
  }


  /**
   * Cost for generic drugs
   **/
  public PlanSearchResult genericDrugs(String genericDrugs) {
    this.genericDrugs = genericDrugs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cost for generic drugs")
  @JsonProperty("generic_drugs")
  public String getGenericDrugs() {
    return genericDrugs;
  }
  public void setGenericDrugs(String genericDrugs) {
    this.genericDrugs = genericDrugs;
  }


  /**
   * Habilitation services benefits summary
   **/
  public PlanSearchResult habilitationServices(String habilitationServices) {
    this.habilitationServices = habilitationServices;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Habilitation services benefits summary")
  @JsonProperty("habilitation_services")
  public String getHabilitationServices() {
    return habilitationServices;
  }
  public void setHabilitationServices(String habilitationServices) {
    this.habilitationServices = habilitationServices;
  }


  /**
   * 
   **/
  public PlanSearchResult hiosIssuerId(String hiosIssuerId) {
    this.hiosIssuerId = hiosIssuerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hios_issuer_id")
  public String getHiosIssuerId() {
    return hiosIssuerId;
  }
  public void setHiosIssuerId(String hiosIssuerId) {
    this.hiosIssuerId = hiosIssuerId;
  }


  /**
   * Home health care benefits summary
   **/
  public PlanSearchResult homeHealthCare(String homeHealthCare) {
    this.homeHealthCare = homeHealthCare;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Home health care benefits summary")
  @JsonProperty("home_health_care")
  public String getHomeHealthCare() {
    return homeHealthCare;
  }
  public void setHomeHealthCare(String homeHealthCare) {
    this.homeHealthCare = homeHealthCare;
  }


  /**
   * Hospice service benefits summary
   **/
  public PlanSearchResult hospiceService(String hospiceService) {
    this.hospiceService = hospiceService;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Hospice service benefits summary")
  @JsonProperty("hospice_service")
  public String getHospiceService() {
    return hospiceService;
  }
  public void setHospiceService(String hospiceService) {
    this.hospiceService = hospiceService;
  }


  /**
   * Government-issued HIOS plan ID
   **/
  public PlanSearchResult id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Government-issued HIOS plan ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Benefits summary for imaging coverage
   **/
  public PlanSearchResult imaging(String imaging) {
    this.imaging = imaging;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Benefits summary for imaging coverage")
  @JsonProperty("imaging")
  public String getImaging() {
    return imaging;
  }
  public void setImaging(String imaging) {
    this.imaging = imaging;
  }


  /**
   * List of NPI numbers for Providers passed in who accept this Plan
   **/
  public PlanSearchResult inNetworkIds(List<Integer> inNetworkIds) {
    this.inNetworkIds = inNetworkIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of NPI numbers for Providers passed in who accept this Plan")
  @JsonProperty("in_network_ids")
  public List<Integer> getInNetworkIds() {
    return inNetworkIds;
  }
  public void setInNetworkIds(List<Integer> inNetworkIds) {
    this.inNetworkIds = inNetworkIds;
  }


  /**
   * Deductible for drugs when an individual is on the plan
   **/
  public PlanSearchResult individualDrugDeductible(String individualDrugDeductible) {
    this.individualDrugDeductible = individualDrugDeductible;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Deductible for drugs when an individual is on the plan")
  @JsonProperty("individual_drug_deductible")
  public String getIndividualDrugDeductible() {
    return individualDrugDeductible;
  }
  public void setIndividualDrugDeductible(String individualDrugDeductible) {
    this.individualDrugDeductible = individualDrugDeductible;
  }


  /**
   * Maximum out-of-pocket for drugs when an individual is on the plan
   **/
  public PlanSearchResult individualDrugMoop(String individualDrugMoop) {
    this.individualDrugMoop = individualDrugMoop;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum out-of-pocket for drugs when an individual is on the plan")
  @JsonProperty("individual_drug_moop")
  public String getIndividualDrugMoop() {
    return individualDrugMoop;
  }
  public void setIndividualDrugMoop(String individualDrugMoop) {
    this.individualDrugMoop = individualDrugMoop;
  }


  /**
   * Deductible when an individual is on the plan
   **/
  public PlanSearchResult individualMedicalDeductible(String individualMedicalDeductible) {
    this.individualMedicalDeductible = individualMedicalDeductible;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Deductible when an individual is on the plan")
  @JsonProperty("individual_medical_deductible")
  public String getIndividualMedicalDeductible() {
    return individualMedicalDeductible;
  }
  public void setIndividualMedicalDeductible(String individualMedicalDeductible) {
    this.individualMedicalDeductible = individualMedicalDeductible;
  }


  /**
   * Maximum out-of-pocket when an individual is on the plan
   **/
  public PlanSearchResult individualMedicalMoop(String individualMedicalMoop) {
    this.individualMedicalMoop = individualMedicalMoop;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum out-of-pocket when an individual is on the plan")
  @JsonProperty("individual_medical_moop")
  public String getIndividualMedicalMoop() {
    return individualMedicalMoop;
  }
  public void setIndividualMedicalMoop(String individualMedicalMoop) {
    this.individualMedicalMoop = individualMedicalMoop;
  }


  /**
   * Inpatient birth benefits summary
   **/
  public PlanSearchResult inpatientBirth(String inpatientBirth) {
    this.inpatientBirth = inpatientBirth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Inpatient birth benefits summary")
  @JsonProperty("inpatient_birth")
  public String getInpatientBirth() {
    return inpatientBirth;
  }
  public void setInpatientBirth(String inpatientBirth) {
    this.inpatientBirth = inpatientBirth;
  }


  /**
   * Cost under the plan for an inpatient facility
   **/
  public PlanSearchResult inpatientFacility(String inpatientFacility) {
    this.inpatientFacility = inpatientFacility;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cost under the plan for an inpatient facility")
  @JsonProperty("inpatient_facility")
  public String getInpatientFacility() {
    return inpatientFacility;
  }
  public void setInpatientFacility(String inpatientFacility) {
    this.inpatientFacility = inpatientFacility;
  }


  /**
   * Inpatient mental helath benefits summary
   **/
  public PlanSearchResult inpatientMentalHealth(String inpatientMentalHealth) {
    this.inpatientMentalHealth = inpatientMentalHealth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Inpatient mental helath benefits summary")
  @JsonProperty("inpatient_mental_health")
  public String getInpatientMentalHealth() {
    return inpatientMentalHealth;
  }
  public void setInpatientMentalHealth(String inpatientMentalHealth) {
    this.inpatientMentalHealth = inpatientMentalHealth;
  }


  /**
   * Cost under the plan for an inpatient physician
   **/
  public PlanSearchResult inpatientPhysician(String inpatientPhysician) {
    this.inpatientPhysician = inpatientPhysician;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cost under the plan for an inpatient physician")
  @JsonProperty("inpatient_physician")
  public String getInpatientPhysician() {
    return inpatientPhysician;
  }
  public void setInpatientPhysician(String inpatientPhysician) {
    this.inpatientPhysician = inpatientPhysician;
  }


  /**
   * Inpatient substance abuse benefits summary
   **/
  public PlanSearchResult inpatientSubstance(String inpatientSubstance) {
    this.inpatientSubstance = inpatientSubstance;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Inpatient substance abuse benefits summary")
  @JsonProperty("inpatient_substance")
  public String getInpatientSubstance() {
    return inpatientSubstance;
  }
  public void setInpatientSubstance(String inpatientSubstance) {
    this.inpatientSubstance = inpatientSubstance;
  }


  /**
   * Plan metal grouping (e.g. platinum, gold, silver, etc)
   **/
  public PlanSearchResult level(String level) {
    this.level = level;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Plan metal grouping (e.g. platinum, gold, silver, etc)")
  @JsonProperty("level")
  public String getLevel() {
    return level;
  }
  public void setLevel(String level) {
    this.level = level;
  }


  /**
   * Link to a copy of the insurance carrier's logo
   **/
  public PlanSearchResult logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Link to a copy of the insurance carrier's logo")
  @JsonProperty("logo_url")
  public String getLogoUrl() {
    return logoUrl;
  }
  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  /**
   * Marketing name of the plan
   **/
  public PlanSearchResult name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Marketing name of the plan")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Cost under the plan for non-preferred brand drugs
   **/
  public PlanSearchResult nonPreferredBrandDrugs(String nonPreferredBrandDrugs) {
    this.nonPreferredBrandDrugs = nonPreferredBrandDrugs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cost under the plan for non-preferred brand drugs")
  @JsonProperty("non_preferred_brand_drugs")
  public String getNonPreferredBrandDrugs() {
    return nonPreferredBrandDrugs;
  }
  public void setNonPreferredBrandDrugs(String nonPreferredBrandDrugs) {
    this.nonPreferredBrandDrugs = nonPreferredBrandDrugs;
  }


  /**
   * Is the plan on-market?
   **/
  public PlanSearchResult onMarket(Boolean onMarket) {
    this.onMarket = onMarket;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is the plan on-market?")
  @JsonProperty("on_market")
  public Boolean getOnMarket() {
    return onMarket;
  }
  public void setOnMarket(Boolean onMarket) {
    this.onMarket = onMarket;
  }


  /**
   * Is the plan off-market?
   **/
  public PlanSearchResult offMarket(Boolean offMarket) {
    this.offMarket = offMarket;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is the plan off-market?")
  @JsonProperty("off_market")
  public Boolean getOffMarket() {
    return offMarket;
  }
  public void setOffMarket(Boolean offMarket) {
    this.offMarket = offMarket;
  }


  /**
   * Does this plan provide any out of network coverage?
   **/
  public PlanSearchResult outOfNetworkCoverage(Boolean outOfNetworkCoverage) {
    this.outOfNetworkCoverage = outOfNetworkCoverage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Does this plan provide any out of network coverage?")
  @JsonProperty("out_of_network_coverage")
  public Boolean getOutOfNetworkCoverage() {
    return outOfNetworkCoverage;
  }
  public void setOutOfNetworkCoverage(Boolean outOfNetworkCoverage) {
    this.outOfNetworkCoverage = outOfNetworkCoverage;
  }


  /**
   * List of NPI numbers for Providers passed in who do not accept this Plan
   **/
  public PlanSearchResult outOfNetworkIds(List<Integer> outOfNetworkIds) {
    this.outOfNetworkIds = outOfNetworkIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of NPI numbers for Providers passed in who do not accept this Plan")
  @JsonProperty("out_of_network_ids")
  public List<Integer> getOutOfNetworkIds() {
    return outOfNetworkIds;
  }
  public void setOutOfNetworkIds(List<Integer> outOfNetworkIds) {
    this.outOfNetworkIds = outOfNetworkIds;
  }


  /**
   * Benefits summary for outpatient facility coverage
   **/
  public PlanSearchResult outpatientFacility(String outpatientFacility) {
    this.outpatientFacility = outpatientFacility;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Benefits summary for outpatient facility coverage")
  @JsonProperty("outpatient_facility")
  public String getOutpatientFacility() {
    return outpatientFacility;
  }
  public void setOutpatientFacility(String outpatientFacility) {
    this.outpatientFacility = outpatientFacility;
  }


  /**
   * Benefits summary for outpatient mental health coverage
   **/
  public PlanSearchResult outpatientMentalHealth(String outpatientMentalHealth) {
    this.outpatientMentalHealth = outpatientMentalHealth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Benefits summary for outpatient mental health coverage")
  @JsonProperty("outpatient_mental_health")
  public String getOutpatientMentalHealth() {
    return outpatientMentalHealth;
  }
  public void setOutpatientMentalHealth(String outpatientMentalHealth) {
    this.outpatientMentalHealth = outpatientMentalHealth;
  }


  /**
   * Benefits summary for outpatient physician coverage
   **/
  public PlanSearchResult outpatientPhysician(String outpatientPhysician) {
    this.outpatientPhysician = outpatientPhysician;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Benefits summary for outpatient physician coverage")
  @JsonProperty("outpatient_physician")
  public String getOutpatientPhysician() {
    return outpatientPhysician;
  }
  public void setOutpatientPhysician(String outpatientPhysician) {
    this.outpatientPhysician = outpatientPhysician;
  }


  /**
   * Outpatient substance abuse benefits summary
   **/
  public PlanSearchResult outpatientSubstance(String outpatientSubstance) {
    this.outpatientSubstance = outpatientSubstance;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Outpatient substance abuse benefits summary")
  @JsonProperty("outpatient_substance")
  public String getOutpatientSubstance() {
    return outpatientSubstance;
  }
  public void setOutpatientSubstance(String outpatientSubstance) {
    this.outpatientSubstance = outpatientSubstance;
  }


  /**
   * Market in which the plan is offered (on_marketplace, shop, etc)
   **/
  public PlanSearchResult planMarket(String planMarket) {
    this.planMarket = planMarket;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Market in which the plan is offered (on_marketplace, shop, etc)")
  @JsonProperty("plan_market")
  public String getPlanMarket() {
    return planMarket;
  }
  public void setPlanMarket(String planMarket) {
    this.planMarket = planMarket;
  }


  /**
   * Category of the plan (e.g. EPO, HMO, PPO, POS, Indemnity)
   **/
  public PlanSearchResult planType(String planType) {
    this.planType = planType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Category of the plan (e.g. EPO, HMO, PPO, POS, Indemnity)")
  @JsonProperty("plan_type")
  public String getPlanType() {
    return planType;
  }
  public void setPlanType(String planType) {
    this.planType = planType;
  }


  /**
   * Cost under the plan for perferred brand drugs
   **/
  public PlanSearchResult preferredBrandDrugs(String preferredBrandDrugs) {
    this.preferredBrandDrugs = preferredBrandDrugs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cost under the plan for perferred brand drugs")
  @JsonProperty("preferred_brand_drugs")
  public String getPreferredBrandDrugs() {
    return preferredBrandDrugs;
  }
  public void setPreferredBrandDrugs(String preferredBrandDrugs) {
    this.preferredBrandDrugs = preferredBrandDrugs;
  }


  /**
   * Inpatient substance abuse benefits summary
   **/
  public PlanSearchResult prenatalPostnatalCare(String prenatalPostnatalCare) {
    this.prenatalPostnatalCare = prenatalPostnatalCare;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Inpatient substance abuse benefits summary")
  @JsonProperty("prenatal_postnatal_care")
  public String getPrenatalPostnatalCare() {
    return prenatalPostnatalCare;
  }
  public void setPrenatalPostnatalCare(String prenatalPostnatalCare) {
    this.prenatalPostnatalCare = prenatalPostnatalCare;
  }


  /**
   * Benefits summary for preventative care
   **/
  public PlanSearchResult preventativeCare(String preventativeCare) {
    this.preventativeCare = preventativeCare;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Benefits summary for preventative care")
  @JsonProperty("preventative_care")
  public String getPreventativeCare() {
    return preventativeCare;
  }
  public void setPreventativeCare(String preventativeCare) {
    this.preventativeCare = preventativeCare;
  }


  /**
   * Cumulative premium amount after subsidy
   **/
  public PlanSearchResult premiumSubsidized(BigDecimal premiumSubsidized) {
    this.premiumSubsidized = premiumSubsidized;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cumulative premium amount after subsidy")
  @JsonProperty("premium_subsidized")
  public BigDecimal getPremiumSubsidized() {
    return premiumSubsidized;
  }
  public void setPremiumSubsidized(BigDecimal premiumSubsidized) {
    this.premiumSubsidized = premiumSubsidized;
  }


  /**
   * Cumulative premium amount
   **/
  public PlanSearchResult premium(BigDecimal premium) {
    this.premium = premium;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cumulative premium amount")
  @JsonProperty("premium")
  public BigDecimal getPremium() {
    return premium;
  }
  public void setPremium(BigDecimal premium) {
    this.premium = premium;
  }


  /**
   * Cost under the plan to visit a Primary Care Physician
   **/
  public PlanSearchResult primaryCarePhysician(String primaryCarePhysician) {
    this.primaryCarePhysician = primaryCarePhysician;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cost under the plan to visit a Primary Care Physician")
  @JsonProperty("primary_care_physician")
  public String getPrimaryCarePhysician() {
    return primaryCarePhysician;
  }
  public void setPrimaryCarePhysician(String primaryCarePhysician) {
    this.primaryCarePhysician = primaryCarePhysician;
  }


  /**
   * Benefits summary for rehabilitation services
   **/
  public PlanSearchResult rehabilitationServices(String rehabilitationServices) {
    this.rehabilitationServices = rehabilitationServices;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Benefits summary for rehabilitation services")
  @JsonProperty("rehabilitation_services")
  public String getRehabilitationServices() {
    return rehabilitationServices;
  }
  public void setRehabilitationServices(String rehabilitationServices) {
    this.rehabilitationServices = rehabilitationServices;
  }


  /**
   * Benefits summary for skilled nursing services
   **/
  public PlanSearchResult skilledNursing(String skilledNursing) {
    this.skilledNursing = skilledNursing;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Benefits summary for skilled nursing services")
  @JsonProperty("skilled_nursing")
  public String getSkilledNursing() {
    return skilledNursing;
  }
  public void setSkilledNursing(String skilledNursing) {
    this.skilledNursing = skilledNursing;
  }


  /**
   * Cost under the plan to visit a specialist
   **/
  public PlanSearchResult specialist(String specialist) {
    this.specialist = specialist;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cost under the plan to visit a specialist")
  @JsonProperty("specialist")
  public String getSpecialist() {
    return specialist;
  }
  public void setSpecialist(String specialist) {
    this.specialist = specialist;
  }


  /**
   * Cost under the plan for specialty drugs
   **/
  public PlanSearchResult specialtyDrugs(String specialtyDrugs) {
    this.specialtyDrugs = specialtyDrugs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cost under the plan for specialty drugs")
  @JsonProperty("specialty_drugs")
  public String getSpecialtyDrugs() {
    return specialtyDrugs;
  }
  public void setSpecialtyDrugs(String specialtyDrugs) {
    this.specialtyDrugs = specialtyDrugs;
  }


  /**
   * Benefits summary for urgent care
   **/
  public PlanSearchResult urgentCare(String urgentCare) {
    this.urgentCare = urgentCare;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Benefits summary for urgent care")
  @JsonProperty("urgent_care")
  public String getUrgentCare() {
    return urgentCare;
  }
  public void setUrgentCare(String urgentCare) {
    this.urgentCare = urgentCare;
  }


  /**
   * Percentage of doctors who matched this Plan
   **/
  public PlanSearchResult matchPercentage(Integer matchPercentage) {
    this.matchPercentage = matchPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage of doctors who matched this Plan")
  @JsonProperty("match_percentage")
  public Integer getMatchPercentage() {
    return matchPercentage;
  }
  public void setMatchPercentage(Integer matchPercentage) {
    this.matchPercentage = matchPercentage;
  }


  /**
   * Percentage of employees with 100% match
   **/
  public PlanSearchResult perfectMatchPercentage(Integer perfectMatchPercentage) {
    this.perfectMatchPercentage = perfectMatchPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage of employees with 100% match")
  @JsonProperty("perfect_match_percentage")
  public Integer getPerfectMatchPercentage() {
    return perfectMatchPercentage;
  }
  public void setPerfectMatchPercentage(Integer perfectMatchPercentage) {
    this.perfectMatchPercentage = perfectMatchPercentage;
  }


  /**
   * Cumulative premium amount for employees
   **/
  public PlanSearchResult employeePremium(BigDecimal employeePremium) {
    this.employeePremium = employeePremium;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cumulative premium amount for employees")
  @JsonProperty("employee_premium")
  public BigDecimal getEmployeePremium() {
    return employeePremium;
  }
  public void setEmployeePremium(BigDecimal employeePremium) {
    this.employeePremium = employeePremium;
  }


  /**
   * Cumulative premium amount for dependents
   **/
  public PlanSearchResult dependentPremium(BigDecimal dependentPremium) {
    this.dependentPremium = dependentPremium;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cumulative premium amount for dependents")
  @JsonProperty("dependent_premium")
  public BigDecimal getDependentPremium() {
    return dependentPremium;
  }
  public void setDependentPremium(BigDecimal dependentPremium) {
    this.dependentPremium = dependentPremium;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanSearchResult planSearchResult = (PlanSearchResult) o;
    return Objects.equals(this.adultDental, planSearchResult.adultDental) &&
        Objects.equals(this.ambulance, planSearchResult.ambulance) &&
        Objects.equals(this.benefitsSummaryUrl, planSearchResult.benefitsSummaryUrl) &&
        Objects.equals(this.buyLink, planSearchResult.buyLink) &&
        Objects.equals(this.carrierName, planSearchResult.carrierName) &&
        Objects.equals(this.childDental, planSearchResult.childDental) &&
        Objects.equals(this.childEyewear, planSearchResult.childEyewear) &&
        Objects.equals(this.childEyeExam, planSearchResult.childEyeExam) &&
        Objects.equals(this.customerServicePhoneNumber, planSearchResult.customerServicePhoneNumber) &&
        Objects.equals(this.durableMedicalEquipment, planSearchResult.durableMedicalEquipment) &&
        Objects.equals(this.diagnosticTest, planSearchResult.diagnosticTest) &&
        Objects.equals(this.drugFormularyUrl, planSearchResult.drugFormularyUrl) &&
        Objects.equals(this.effectiveDate, planSearchResult.effectiveDate) &&
        Objects.equals(this.expirationDate, planSearchResult.expirationDate) &&
        Objects.equals(this.emergencyRoom, planSearchResult.emergencyRoom) &&
        Objects.equals(this.familyDrugDeductible, planSearchResult.familyDrugDeductible) &&
        Objects.equals(this.familyDrugMoop, planSearchResult.familyDrugMoop) &&
        Objects.equals(this.familyMedicalDeductible, planSearchResult.familyMedicalDeductible) &&
        Objects.equals(this.familyMedicalMoop, planSearchResult.familyMedicalMoop) &&
        Objects.equals(this.genericDrugs, planSearchResult.genericDrugs) &&
        Objects.equals(this.habilitationServices, planSearchResult.habilitationServices) &&
        Objects.equals(this.hiosIssuerId, planSearchResult.hiosIssuerId) &&
        Objects.equals(this.homeHealthCare, planSearchResult.homeHealthCare) &&
        Objects.equals(this.hospiceService, planSearchResult.hospiceService) &&
        Objects.equals(this.id, planSearchResult.id) &&
        Objects.equals(this.imaging, planSearchResult.imaging) &&
        Objects.equals(this.inNetworkIds, planSearchResult.inNetworkIds) &&
        Objects.equals(this.individualDrugDeductible, planSearchResult.individualDrugDeductible) &&
        Objects.equals(this.individualDrugMoop, planSearchResult.individualDrugMoop) &&
        Objects.equals(this.individualMedicalDeductible, planSearchResult.individualMedicalDeductible) &&
        Objects.equals(this.individualMedicalMoop, planSearchResult.individualMedicalMoop) &&
        Objects.equals(this.inpatientBirth, planSearchResult.inpatientBirth) &&
        Objects.equals(this.inpatientFacility, planSearchResult.inpatientFacility) &&
        Objects.equals(this.inpatientMentalHealth, planSearchResult.inpatientMentalHealth) &&
        Objects.equals(this.inpatientPhysician, planSearchResult.inpatientPhysician) &&
        Objects.equals(this.inpatientSubstance, planSearchResult.inpatientSubstance) &&
        Objects.equals(this.level, planSearchResult.level) &&
        Objects.equals(this.logoUrl, planSearchResult.logoUrl) &&
        Objects.equals(this.name, planSearchResult.name) &&
        Objects.equals(this.nonPreferredBrandDrugs, planSearchResult.nonPreferredBrandDrugs) &&
        Objects.equals(this.onMarket, planSearchResult.onMarket) &&
        Objects.equals(this.offMarket, planSearchResult.offMarket) &&
        Objects.equals(this.outOfNetworkCoverage, planSearchResult.outOfNetworkCoverage) &&
        Objects.equals(this.outOfNetworkIds, planSearchResult.outOfNetworkIds) &&
        Objects.equals(this.outpatientFacility, planSearchResult.outpatientFacility) &&
        Objects.equals(this.outpatientMentalHealth, planSearchResult.outpatientMentalHealth) &&
        Objects.equals(this.outpatientPhysician, planSearchResult.outpatientPhysician) &&
        Objects.equals(this.outpatientSubstance, planSearchResult.outpatientSubstance) &&
        Objects.equals(this.planMarket, planSearchResult.planMarket) &&
        Objects.equals(this.planType, planSearchResult.planType) &&
        Objects.equals(this.preferredBrandDrugs, planSearchResult.preferredBrandDrugs) &&
        Objects.equals(this.prenatalPostnatalCare, planSearchResult.prenatalPostnatalCare) &&
        Objects.equals(this.preventativeCare, planSearchResult.preventativeCare) &&
        Objects.equals(this.premiumSubsidized, planSearchResult.premiumSubsidized) &&
        Objects.equals(this.premium, planSearchResult.premium) &&
        Objects.equals(this.primaryCarePhysician, planSearchResult.primaryCarePhysician) &&
        Objects.equals(this.rehabilitationServices, planSearchResult.rehabilitationServices) &&
        Objects.equals(this.skilledNursing, planSearchResult.skilledNursing) &&
        Objects.equals(this.specialist, planSearchResult.specialist) &&
        Objects.equals(this.specialtyDrugs, planSearchResult.specialtyDrugs) &&
        Objects.equals(this.urgentCare, planSearchResult.urgentCare) &&
        Objects.equals(this.matchPercentage, planSearchResult.matchPercentage) &&
        Objects.equals(this.perfectMatchPercentage, planSearchResult.perfectMatchPercentage) &&
        Objects.equals(this.employeePremium, planSearchResult.employeePremium) &&
        Objects.equals(this.dependentPremium, planSearchResult.dependentPremium);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adultDental, ambulance, benefitsSummaryUrl, buyLink, carrierName, childDental, childEyewear, childEyeExam, customerServicePhoneNumber, durableMedicalEquipment, diagnosticTest, drugFormularyUrl, effectiveDate, expirationDate, emergencyRoom, familyDrugDeductible, familyDrugMoop, familyMedicalDeductible, familyMedicalMoop, genericDrugs, habilitationServices, hiosIssuerId, homeHealthCare, hospiceService, id, imaging, inNetworkIds, individualDrugDeductible, individualDrugMoop, individualMedicalDeductible, individualMedicalMoop, inpatientBirth, inpatientFacility, inpatientMentalHealth, inpatientPhysician, inpatientSubstance, level, logoUrl, name, nonPreferredBrandDrugs, onMarket, offMarket, outOfNetworkCoverage, outOfNetworkIds, outpatientFacility, outpatientMentalHealth, outpatientPhysician, outpatientSubstance, planMarket, planType, preferredBrandDrugs, prenatalPostnatalCare, preventativeCare, premiumSubsidized, premium, primaryCarePhysician, rehabilitationServices, skilledNursing, specialist, specialtyDrugs, urgentCare, matchPercentage, perfectMatchPercentage, employeePremium, dependentPremium);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanSearchResult {\n");
    
    sb.append("    adultDental: ").append(toIndentedString(adultDental)).append("\n");
    sb.append("    ambulance: ").append(toIndentedString(ambulance)).append("\n");
    sb.append("    benefitsSummaryUrl: ").append(toIndentedString(benefitsSummaryUrl)).append("\n");
    sb.append("    buyLink: ").append(toIndentedString(buyLink)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    childDental: ").append(toIndentedString(childDental)).append("\n");
    sb.append("    childEyewear: ").append(toIndentedString(childEyewear)).append("\n");
    sb.append("    childEyeExam: ").append(toIndentedString(childEyeExam)).append("\n");
    sb.append("    customerServicePhoneNumber: ").append(toIndentedString(customerServicePhoneNumber)).append("\n");
    sb.append("    durableMedicalEquipment: ").append(toIndentedString(durableMedicalEquipment)).append("\n");
    sb.append("    diagnosticTest: ").append(toIndentedString(diagnosticTest)).append("\n");
    sb.append("    drugFormularyUrl: ").append(toIndentedString(drugFormularyUrl)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    emergencyRoom: ").append(toIndentedString(emergencyRoom)).append("\n");
    sb.append("    familyDrugDeductible: ").append(toIndentedString(familyDrugDeductible)).append("\n");
    sb.append("    familyDrugMoop: ").append(toIndentedString(familyDrugMoop)).append("\n");
    sb.append("    familyMedicalDeductible: ").append(toIndentedString(familyMedicalDeductible)).append("\n");
    sb.append("    familyMedicalMoop: ").append(toIndentedString(familyMedicalMoop)).append("\n");
    sb.append("    genericDrugs: ").append(toIndentedString(genericDrugs)).append("\n");
    sb.append("    habilitationServices: ").append(toIndentedString(habilitationServices)).append("\n");
    sb.append("    hiosIssuerId: ").append(toIndentedString(hiosIssuerId)).append("\n");
    sb.append("    homeHealthCare: ").append(toIndentedString(homeHealthCare)).append("\n");
    sb.append("    hospiceService: ").append(toIndentedString(hospiceService)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imaging: ").append(toIndentedString(imaging)).append("\n");
    sb.append("    inNetworkIds: ").append(toIndentedString(inNetworkIds)).append("\n");
    sb.append("    individualDrugDeductible: ").append(toIndentedString(individualDrugDeductible)).append("\n");
    sb.append("    individualDrugMoop: ").append(toIndentedString(individualDrugMoop)).append("\n");
    sb.append("    individualMedicalDeductible: ").append(toIndentedString(individualMedicalDeductible)).append("\n");
    sb.append("    individualMedicalMoop: ").append(toIndentedString(individualMedicalMoop)).append("\n");
    sb.append("    inpatientBirth: ").append(toIndentedString(inpatientBirth)).append("\n");
    sb.append("    inpatientFacility: ").append(toIndentedString(inpatientFacility)).append("\n");
    sb.append("    inpatientMentalHealth: ").append(toIndentedString(inpatientMentalHealth)).append("\n");
    sb.append("    inpatientPhysician: ").append(toIndentedString(inpatientPhysician)).append("\n");
    sb.append("    inpatientSubstance: ").append(toIndentedString(inpatientSubstance)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nonPreferredBrandDrugs: ").append(toIndentedString(nonPreferredBrandDrugs)).append("\n");
    sb.append("    onMarket: ").append(toIndentedString(onMarket)).append("\n");
    sb.append("    offMarket: ").append(toIndentedString(offMarket)).append("\n");
    sb.append("    outOfNetworkCoverage: ").append(toIndentedString(outOfNetworkCoverage)).append("\n");
    sb.append("    outOfNetworkIds: ").append(toIndentedString(outOfNetworkIds)).append("\n");
    sb.append("    outpatientFacility: ").append(toIndentedString(outpatientFacility)).append("\n");
    sb.append("    outpatientMentalHealth: ").append(toIndentedString(outpatientMentalHealth)).append("\n");
    sb.append("    outpatientPhysician: ").append(toIndentedString(outpatientPhysician)).append("\n");
    sb.append("    outpatientSubstance: ").append(toIndentedString(outpatientSubstance)).append("\n");
    sb.append("    planMarket: ").append(toIndentedString(planMarket)).append("\n");
    sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
    sb.append("    preferredBrandDrugs: ").append(toIndentedString(preferredBrandDrugs)).append("\n");
    sb.append("    prenatalPostnatalCare: ").append(toIndentedString(prenatalPostnatalCare)).append("\n");
    sb.append("    preventativeCare: ").append(toIndentedString(preventativeCare)).append("\n");
    sb.append("    premiumSubsidized: ").append(toIndentedString(premiumSubsidized)).append("\n");
    sb.append("    premium: ").append(toIndentedString(premium)).append("\n");
    sb.append("    primaryCarePhysician: ").append(toIndentedString(primaryCarePhysician)).append("\n");
    sb.append("    rehabilitationServices: ").append(toIndentedString(rehabilitationServices)).append("\n");
    sb.append("    skilledNursing: ").append(toIndentedString(skilledNursing)).append("\n");
    sb.append("    specialist: ").append(toIndentedString(specialist)).append("\n");
    sb.append("    specialtyDrugs: ").append(toIndentedString(specialtyDrugs)).append("\n");
    sb.append("    urgentCare: ").append(toIndentedString(urgentCare)).append("\n");
    sb.append("    matchPercentage: ").append(toIndentedString(matchPercentage)).append("\n");
    sb.append("    perfectMatchPercentage: ").append(toIndentedString(perfectMatchPercentage)).append("\n");
    sb.append("    employeePremium: ").append(toIndentedString(employeePremium)).append("\n");
    sb.append("    dependentPremium: ").append(toIndentedString(dependentPremium)).append("\n");
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

