package api;

import vericred.ApiClient;

import model.DrugCoverageResponse;
import model.DrugSearchResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-27T13:45:11.284-04:00")
public interface DrugsApi extends ApiClient.Api {


  /**
   * Search for DrugCoverages
   * Drug Coverages are the specific tier level, quantity limit, prior
authorization and step therapy for a given Drug/Plan combination. This endpoint
returns all DrugCoverages for a given Drug
   * @param ndcPackageCode NDC package code (required)
   * @param audience Two-character state code (required)
   * @param stateCode Two-character state code (required)
   * @return DrugCoverageResponse
   */
  @RequestLine("GET /drug_packages/{ndc_package_code}/coverages?audience={audience}&state_code={stateCode}")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  DrugCoverageResponse getDrugCoverages(@Param("ndcPackageCode") String ndcPackageCode, @Param("audience") String audience, @Param("stateCode") String stateCode);

  /**
   * Drug Search
   * Search for drugs by proprietary name
   * @param searchTerm Full or partial proprietary name of drug (required)
   * @return DrugSearchResponse
   */
  @RequestLine("GET /drugs?search_term={searchTerm}")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  DrugSearchResponse listDrugs(@Param("searchTerm") String searchTerm);
}
