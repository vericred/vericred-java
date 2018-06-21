package api;

import vericred.ApiClient;

import model.PlanSearchResponse;
import model.RequestPlanFind;
import model.PlanShowResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-21T16:41:18.837-04:00")
public interface MedicalPlansApi extends ApiClient.Api {


  /**
   * Find Plans
   * ### Location Information  Searching for a set of plans requires a &#x60;zip_code&#x60; and &#x60;fips_code&#x60; code.  These are used to determine pricing and availabity of health plans. This endpoint is paginated.  Optionally, you may provide a list of Applicants or Providers  ### Applicants  This is a list of people who will be covered by the plan.  We use this list to calculate the premium.  You must include &#x60;age&#x60; and can include &#x60;smoker&#x60;, which also factors into pricing in some states.  Applicants *must* include an age.  If smoker is omitted, its value is assumed to be false.  #### Multiple Applicants To get pricing for multiple applicants, just append multiple sets of data to the URL with the age and smoking status of each applicant next to each other.  For example, given two applicants - one age 32 and a non-smoker and one age 29 and a smoker, you could use the following request  &#x60;GET /plans/medical?zip_code&#x3D;07451&amp;fips_code&#x3D;33025&amp;applicants[][age]&#x3D;32&amp;applicants[][age]&#x3D;29&amp;applicants[][smoker]&#x3D;true&#x60;  It would also be acceptible to include &#x60;applicants[][smoker]&#x3D;false&#x60; after the first applicant&#39;s age.  ### Providers  We identify Providers (Doctors) by their National Practitioner Index number (NPI).  If you pass a list of Providers, keyed by their NPI number, we will return a list of which Providers are in and out of network for each plan returned.  For example, if we had two providers with the NPI numbers &#x60;12345&#x60; and &#x60;23456&#x60; you would make the following request  &#x60;GET /plans/medical?zip_code&#x3D;07451&amp;fips_code&#x3D;33025&amp;providers[][npi]&#x3D;12345&amp;providers[][npi]&#x3D;23456&#x60;  ### Enrollment Date  To calculate plan pricing and availability, we default to the current date as the enrollment date.  To specify a date in the future (or the past), pass a string with the format &#x60;YYYY-MM-DD&#x60; in the &#x60;enrollment_date&#x60; parameter.  &#x60;GET /plans/medical?zip_code&#x3D;07451&amp;fips_code&#x3D;33025&amp;enrollment_date&#x3D;2016-01-01&#x60;  ### Subsidy  On-marketplace plans are eligible for a subsidy based on the &#x60;household_size&#x60; and &#x60;household_income&#x60; of the applicants.  If you pass those values, we will calculate the &#x60;subsidized_premium&#x60; and return it for each plan.  If no values are provided, the &#x60;subsidized_premium&#x60; will be the same as the &#x60;premium&#x60;  &#x60;GET /plans/medical?zip_code&#x3D;07451&amp;fips_code&#x3D;33025&amp;household_size&#x3D;4&amp;household_income&#x3D;40000&#x60;   ### Sorting  Plans can be sorted by the &#x60;premium&#x60;, &#x60;carrier_name&#x60;, &#x60;level&#x60;, and &#x60;plan_type&#x60; fields, by either ascending (as &#x60;asc&#x60;) or descending (as &#x60;dsc&#x60;) sort under the &#x60;sort&#x60; field.  For example, to sort plans by level, the sort parameter would be &#x60;level:asc&#x60;.  ### Drug coverages  Are included along with the rest of the plan data. See [the description below](#drugcoverages) for more details. 
   * @param body  (required)
   * @return PlanSearchResponse
   */
  @RequestLine("POST /plans/medical/search")
  @Headers({
    "Content-type: application/json",
    "Accept: application/json",
  })
  PlanSearchResponse findPlans(RequestPlanFind body);

  /**
   * Show Plan
   * Show the details of an individual Plan.  This includes deductibles, maximums out of pocket, and co-pay/coinsurance for benefits (See [Benefits summary format](#header-benefits-summary-format) above.)
   * @param id ID of the Plan (required)
   * @param year Plan year (defaults to current year) (optional)
   * @return PlanShowResponse
   */
  @RequestLine("GET /plans/medical/{id}?year={year}")
  @Headers({
    "Content-type: application/json",
    "Accept: application/json",
  })
  PlanShowResponse showPlan(@Param("id") String id, @Param("year") Integer year);
}
