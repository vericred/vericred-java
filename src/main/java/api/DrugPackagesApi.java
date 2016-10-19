package api;

import vericred.ApiClient;

import model.FormularyDrugPackageResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-14T13:33:39.716-04:00")
public interface DrugPackagesApi extends ApiClient.Api {


  /**
   * Formulary Drug Package Search
   * Search for coverage by Formulary and DrugPackage ID
   * @param formularyId ID of the Formulary in question (required)
   * @param ndcPackageCode ID of the DrugPackage in question (required)
   * @return FormularyDrugPackageResponse
   */
  @RequestLine("GET /formularies/{formulary_id}/drug_packages/{ndc_package_code}")
  @Headers({
    "Content-type: application/json",
    "Accept: application/json",
  })
  FormularyDrugPackageResponse showFormularyDrugPackageCoverage(@Param("formularyId") String formularyId, @Param("ndcPackageCode") String ndcPackageCode);
}
