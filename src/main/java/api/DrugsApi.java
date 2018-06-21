package api;

import vericred.ApiClient;

import model.DrugSearchResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-21T16:41:18.837-04:00")
public interface DrugsApi extends ApiClient.Api {


  /**
   * Drug Search
   * Search for drugs by proprietary name
   * @param searchTerm Full or partial proprietary name of drug (required)
   * @return DrugSearchResponse
   */
  @RequestLine("GET /drugs?search_term={searchTerm}")
  @Headers({
    "Content-type: application/json",
    "Accept: application/json",
  })
  DrugSearchResponse listDrugs(@Param("searchTerm") String searchTerm);
}
