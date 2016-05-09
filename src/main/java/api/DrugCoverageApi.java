package api;

import vericred.ApiClient;

import model.DrugCoverage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T13:18:42.423-04:00")
public interface DrugCoverageApi extends ApiClient.Api {


  /**
   * Find Drug Coverages for a given NDC
   * Drug Coverages are the specific tier level, quantity limit, prior authorization
and step therapy for a given Drug/Plan combination.  This endpoint returns
all DrugCoverages for a given Drug


   * @param ndc NDC for a drug (required)
   * @return List<DrugCoverage>
   */
  @RequestLine("GET /drugs/{ndc}/coverages")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  List<DrugCoverage> drugsNdcCoveragesGet(@Param("ndc") String ndc);
}
