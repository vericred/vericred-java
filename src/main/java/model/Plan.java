package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T13:18:42.423-04:00")
public class Plan  implements Serializable {
  
  private Boolean adultDental = null;
  private String ambulance = null;
  private String benefitsSummaryUrl = null;
  private String buyLink = null;
  private String carrierName = null;
  private Boolean childDental = null;
  private String childEyewear = null;
  private String customerServicePhoneNumber = null;
  private String durableMedicalEquipment = null;
  private String diagnosticTest = null;
  private String drugFormularyUrl = null;
  private String emergencyRoom = null;
  private String familyDrugDeductible = null;
  private String familyDrugMoop = null;
  private String familyMedicalDeductible = null;
  private String familyMedicalMoop = null;
  private String genericDrugs = null;
  private String hiosIssuerId = null;
  private String id = null;
  private String imaging = null;
  private String individualDrugDeductible = null;
  private String individualDrugMoop = null;
  private String individualMedicalDeductible = null;
  private String individualMedicalMoop = null;
  private String inpatientFacility = null;
  private String inpatientPhysician = null;
  private String level = null;
  private String logoUrl = null;
  private String name = null;
  private Integer networkSize = null;
  private String nonPreferredBrandDrugs = null;
  private Boolean onMarket = null;
  private Boolean offMarket = null;
  private Boolean outOfNetworkCoverage = null;
  private String outpatientFacility = null;
  private String outpatientMentalHealth = null;
  private String outpatientPhysician = null;
  private String planMarket = null;
  private String planType = null;
  private String preferredBrandDrugs = null;
  private String preventativeCare = null;
  private String primaryCarePhysician = null;
  private String rehabilitationServices = null;
  private String specialist = null;
  private String specialtyDrugs = null;
  private String urgentCare = null;

  
  /**
   * Does the plan provide dental coverage for adults?
   **/
  public Plan adultDental(Boolean adultDental) {
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
  public Plan ambulance(String ambulance) {
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
  public Plan benefitsSummaryUrl(String benefitsSummaryUrl) {
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
  public Plan buyLink(String buyLink) {
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
  public Plan carrierName(String carrierName) {
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
  public Plan childDental(Boolean childDental) {
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
  public Plan childEyewear(String childEyewear) {
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
   * Phone number to contact the insurance carrier
   **/
  public Plan customerServicePhoneNumber(String customerServicePhoneNumber) {
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
  public Plan durableMedicalEquipment(String durableMedicalEquipment) {
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
  public Plan diagnosticTest(String diagnosticTest) {
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
  public Plan drugFormularyUrl(String drugFormularyUrl) {
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
   * Description of costs when visiting the ER
   **/
  public Plan emergencyRoom(String emergencyRoom) {
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
  public Plan familyDrugDeductible(String familyDrugDeductible) {
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
  public Plan familyDrugMoop(String familyDrugMoop) {
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
  public Plan familyMedicalDeductible(String familyMedicalDeductible) {
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
  public Plan familyMedicalMoop(String familyMedicalMoop) {
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
  public Plan genericDrugs(String genericDrugs) {
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
   * 
   **/
  public Plan hiosIssuerId(String hiosIssuerId) {
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
   * Government-issued HIOS plan ID
   **/
  public Plan id(String id) {
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
  public Plan imaging(String imaging) {
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
   * Deductible for drugs when an individual is on the plan
   **/
  public Plan individualDrugDeductible(String individualDrugDeductible) {
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
  public Plan individualDrugMoop(String individualDrugMoop) {
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
  public Plan individualMedicalDeductible(String individualMedicalDeductible) {
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
  public Plan individualMedicalMoop(String individualMedicalMoop) {
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
   * Cost under the plan for an inpatient facility
   **/
  public Plan inpatientFacility(String inpatientFacility) {
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
   * Cost under the plan for an inpatient physician
   **/
  public Plan inpatientPhysician(String inpatientPhysician) {
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
   * Plan metal grouping (e.g. platinum, gold, silver, etc)
   **/
  public Plan level(String level) {
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
  public Plan logoUrl(String logoUrl) {
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
  public Plan name(String name) {
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
   * Total number of Providers in network
   **/
  public Plan networkSize(Integer networkSize) {
    this.networkSize = networkSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total number of Providers in network")
  @JsonProperty("network_size")
  public Integer getNetworkSize() {
    return networkSize;
  }
  public void setNetworkSize(Integer networkSize) {
    this.networkSize = networkSize;
  }


  /**
   * Cost under the plan for non-preferred brand drugs
   **/
  public Plan nonPreferredBrandDrugs(String nonPreferredBrandDrugs) {
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
  public Plan onMarket(Boolean onMarket) {
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
  public Plan offMarket(Boolean offMarket) {
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
  public Plan outOfNetworkCoverage(Boolean outOfNetworkCoverage) {
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
   * Benefits summary for outpatient facility coverage
   **/
  public Plan outpatientFacility(String outpatientFacility) {
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
  public Plan outpatientMentalHealth(String outpatientMentalHealth) {
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
  public Plan outpatientPhysician(String outpatientPhysician) {
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
   * Market in which the plan is offered (on_marketplace, shop, etc)
   **/
  public Plan planMarket(String planMarket) {
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
  public Plan planType(String planType) {
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
  public Plan preferredBrandDrugs(String preferredBrandDrugs) {
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
   * Benefits summary for preventative care
   **/
  public Plan preventativeCare(String preventativeCare) {
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
   * Cost under the plan to visit a Primary Care Physician
   **/
  public Plan primaryCarePhysician(String primaryCarePhysician) {
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
  public Plan rehabilitationServices(String rehabilitationServices) {
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
   * Cost under the plan to visit a specialist
   **/
  public Plan specialist(String specialist) {
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
  public Plan specialtyDrugs(String specialtyDrugs) {
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
  public Plan urgentCare(String urgentCare) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plan plan = (Plan) o;
    return Objects.equals(this.adultDental, plan.adultDental) &&
        Objects.equals(this.ambulance, plan.ambulance) &&
        Objects.equals(this.benefitsSummaryUrl, plan.benefitsSummaryUrl) &&
        Objects.equals(this.buyLink, plan.buyLink) &&
        Objects.equals(this.carrierName, plan.carrierName) &&
        Objects.equals(this.childDental, plan.childDental) &&
        Objects.equals(this.childEyewear, plan.childEyewear) &&
        Objects.equals(this.customerServicePhoneNumber, plan.customerServicePhoneNumber) &&
        Objects.equals(this.durableMedicalEquipment, plan.durableMedicalEquipment) &&
        Objects.equals(this.diagnosticTest, plan.diagnosticTest) &&
        Objects.equals(this.drugFormularyUrl, plan.drugFormularyUrl) &&
        Objects.equals(this.emergencyRoom, plan.emergencyRoom) &&
        Objects.equals(this.familyDrugDeductible, plan.familyDrugDeductible) &&
        Objects.equals(this.familyDrugMoop, plan.familyDrugMoop) &&
        Objects.equals(this.familyMedicalDeductible, plan.familyMedicalDeductible) &&
        Objects.equals(this.familyMedicalMoop, plan.familyMedicalMoop) &&
        Objects.equals(this.genericDrugs, plan.genericDrugs) &&
        Objects.equals(this.hiosIssuerId, plan.hiosIssuerId) &&
        Objects.equals(this.id, plan.id) &&
        Objects.equals(this.imaging, plan.imaging) &&
        Objects.equals(this.individualDrugDeductible, plan.individualDrugDeductible) &&
        Objects.equals(this.individualDrugMoop, plan.individualDrugMoop) &&
        Objects.equals(this.individualMedicalDeductible, plan.individualMedicalDeductible) &&
        Objects.equals(this.individualMedicalMoop, plan.individualMedicalMoop) &&
        Objects.equals(this.inpatientFacility, plan.inpatientFacility) &&
        Objects.equals(this.inpatientPhysician, plan.inpatientPhysician) &&
        Objects.equals(this.level, plan.level) &&
        Objects.equals(this.logoUrl, plan.logoUrl) &&
        Objects.equals(this.name, plan.name) &&
        Objects.equals(this.networkSize, plan.networkSize) &&
        Objects.equals(this.nonPreferredBrandDrugs, plan.nonPreferredBrandDrugs) &&
        Objects.equals(this.onMarket, plan.onMarket) &&
        Objects.equals(this.offMarket, plan.offMarket) &&
        Objects.equals(this.outOfNetworkCoverage, plan.outOfNetworkCoverage) &&
        Objects.equals(this.outpatientFacility, plan.outpatientFacility) &&
        Objects.equals(this.outpatientMentalHealth, plan.outpatientMentalHealth) &&
        Objects.equals(this.outpatientPhysician, plan.outpatientPhysician) &&
        Objects.equals(this.planMarket, plan.planMarket) &&
        Objects.equals(this.planType, plan.planType) &&
        Objects.equals(this.preferredBrandDrugs, plan.preferredBrandDrugs) &&
        Objects.equals(this.preventativeCare, plan.preventativeCare) &&
        Objects.equals(this.primaryCarePhysician, plan.primaryCarePhysician) &&
        Objects.equals(this.rehabilitationServices, plan.rehabilitationServices) &&
        Objects.equals(this.specialist, plan.specialist) &&
        Objects.equals(this.specialtyDrugs, plan.specialtyDrugs) &&
        Objects.equals(this.urgentCare, plan.urgentCare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adultDental, ambulance, benefitsSummaryUrl, buyLink, carrierName, childDental, childEyewear, customerServicePhoneNumber, durableMedicalEquipment, diagnosticTest, drugFormularyUrl, emergencyRoom, familyDrugDeductible, familyDrugMoop, familyMedicalDeductible, familyMedicalMoop, genericDrugs, hiosIssuerId, id, imaging, individualDrugDeductible, individualDrugMoop, individualMedicalDeductible, individualMedicalMoop, inpatientFacility, inpatientPhysician, level, logoUrl, name, networkSize, nonPreferredBrandDrugs, onMarket, offMarket, outOfNetworkCoverage, outpatientFacility, outpatientMentalHealth, outpatientPhysician, planMarket, planType, preferredBrandDrugs, preventativeCare, primaryCarePhysician, rehabilitationServices, specialist, specialtyDrugs, urgentCare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plan {\n");
    
    sb.append("    adultDental: ").append(toIndentedString(adultDental)).append("\n");
    sb.append("    ambulance: ").append(toIndentedString(ambulance)).append("\n");
    sb.append("    benefitsSummaryUrl: ").append(toIndentedString(benefitsSummaryUrl)).append("\n");
    sb.append("    buyLink: ").append(toIndentedString(buyLink)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    childDental: ").append(toIndentedString(childDental)).append("\n");
    sb.append("    childEyewear: ").append(toIndentedString(childEyewear)).append("\n");
    sb.append("    customerServicePhoneNumber: ").append(toIndentedString(customerServicePhoneNumber)).append("\n");
    sb.append("    durableMedicalEquipment: ").append(toIndentedString(durableMedicalEquipment)).append("\n");
    sb.append("    diagnosticTest: ").append(toIndentedString(diagnosticTest)).append("\n");
    sb.append("    drugFormularyUrl: ").append(toIndentedString(drugFormularyUrl)).append("\n");
    sb.append("    emergencyRoom: ").append(toIndentedString(emergencyRoom)).append("\n");
    sb.append("    familyDrugDeductible: ").append(toIndentedString(familyDrugDeductible)).append("\n");
    sb.append("    familyDrugMoop: ").append(toIndentedString(familyDrugMoop)).append("\n");
    sb.append("    familyMedicalDeductible: ").append(toIndentedString(familyMedicalDeductible)).append("\n");
    sb.append("    familyMedicalMoop: ").append(toIndentedString(familyMedicalMoop)).append("\n");
    sb.append("    genericDrugs: ").append(toIndentedString(genericDrugs)).append("\n");
    sb.append("    hiosIssuerId: ").append(toIndentedString(hiosIssuerId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imaging: ").append(toIndentedString(imaging)).append("\n");
    sb.append("    individualDrugDeductible: ").append(toIndentedString(individualDrugDeductible)).append("\n");
    sb.append("    individualDrugMoop: ").append(toIndentedString(individualDrugMoop)).append("\n");
    sb.append("    individualMedicalDeductible: ").append(toIndentedString(individualMedicalDeductible)).append("\n");
    sb.append("    individualMedicalMoop: ").append(toIndentedString(individualMedicalMoop)).append("\n");
    sb.append("    inpatientFacility: ").append(toIndentedString(inpatientFacility)).append("\n");
    sb.append("    inpatientPhysician: ").append(toIndentedString(inpatientPhysician)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    networkSize: ").append(toIndentedString(networkSize)).append("\n");
    sb.append("    nonPreferredBrandDrugs: ").append(toIndentedString(nonPreferredBrandDrugs)).append("\n");
    sb.append("    onMarket: ").append(toIndentedString(onMarket)).append("\n");
    sb.append("    offMarket: ").append(toIndentedString(offMarket)).append("\n");
    sb.append("    outOfNetworkCoverage: ").append(toIndentedString(outOfNetworkCoverage)).append("\n");
    sb.append("    outpatientFacility: ").append(toIndentedString(outpatientFacility)).append("\n");
    sb.append("    outpatientMentalHealth: ").append(toIndentedString(outpatientMentalHealth)).append("\n");
    sb.append("    outpatientPhysician: ").append(toIndentedString(outpatientPhysician)).append("\n");
    sb.append("    planMarket: ").append(toIndentedString(planMarket)).append("\n");
    sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
    sb.append("    preferredBrandDrugs: ").append(toIndentedString(preferredBrandDrugs)).append("\n");
    sb.append("    preventativeCare: ").append(toIndentedString(preventativeCare)).append("\n");
    sb.append("    primaryCarePhysician: ").append(toIndentedString(primaryCarePhysician)).append("\n");
    sb.append("    rehabilitationServices: ").append(toIndentedString(rehabilitationServices)).append("\n");
    sb.append("    specialist: ").append(toIndentedString(specialist)).append("\n");
    sb.append("    specialtyDrugs: ").append(toIndentedString(specialtyDrugs)).append("\n");
    sb.append("    urgentCare: ").append(toIndentedString(urgentCare)).append("\n");
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
