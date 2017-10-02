package api;

import vericred.ApiClient;

import model.FormularyResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-02T17:06:11.296-04:00")
public interface FormulariesApi extends ApiClient.Api {


  /**
   * Formulary Search
   * Search for drugs by proprietary name
   * @param searchTerm Full or partial name of the formulary (optional)
   * @param rxBin RX BIN Number (found on an insurance card) (optional)
   * @param rxGroup RX Group String (found on an insurance card) (optional)
   * @param rxPcn RX PCN Number (found on an insurance card) (optional)
   * @return FormularyResponse
   */
  @RequestLine("GET /formularies?search_term={searchTerm}&rx_bin={rxBin}&rx_group={rxGroup}&rx_pcn={rxPcn}")
  @Headers({
    "Content-type: application/json",
    "Accept: application/json",
  })
  FormularyResponse listFormularies(@Param("searchTerm") String searchTerm, @Param("rxBin") String rxBin, @Param("rxGroup") String rxGroup, @Param("rxPcn") String rxPcn);
}
