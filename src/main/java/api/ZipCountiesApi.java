package api;

import vericred.ApiClient;

import model.ZipCountyResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-27T13:45:11.284-04:00")
public interface ZipCountiesApi extends ApiClient.Api {


  /**
   * Search for Zip Counties
   * Our &#x60;Plan&#x60; endpoints require a zip code and a fips (county) code.  This is because plan pricing requires both of these elements.  Users are unlikely to know their fips code, so we provide this endpoint to look up a &#x60;ZipCounty&#x60; by zip code and return both the selected zip and fips codes.
   * @param zipPrefix Partial five-digit Zip (required)
   * @return ZipCountyResponse
   */
  @RequestLine("GET /zip_counties?zip_prefix={zipPrefix}")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  ZipCountyResponse getZipCounties(@Param("zipPrefix") String zipPrefix);
}
