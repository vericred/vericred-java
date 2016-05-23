package api;

import vericred.ApiClient;

import model.ZipCountyResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T16:44:52.285-04:00")
public interface ZipCountiesApi extends ApiClient.Api {


  /**
   * Search for Zip Counties
   * Our &#x60;Plan&#x60; endpoints require a zip code and a fips (county) code.  This is because plan pricing requires both of these elements.  Users are unlikely to know their fips code, so we provide this endpoint to look up a &#x60;ZipCounty&#x60; by zip code and return both the selected zip and fips codes.
   * @param zipPrefix Partial five-digit Zip (required)
   * @param vericredApiKey API Key (optional)
   * @return ZipCountyResponse
   */
  @RequestLine("GET /zip_counties?zip_prefix={zipPrefix}")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
    "vericredApiKey: {vericredApiKey}"
  })
  ZipCountyResponse getZipCounties(@Param("zipPrefix") String zipPrefix, @Param("vericredApiKey") String vericredApiKey);
}
