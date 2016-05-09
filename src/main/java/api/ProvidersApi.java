package api;

import vericred.ApiClient;

import model.InlineResponse200;
import model.InlineResponse2001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T13:18:42.423-04:00")
public interface ProvidersApi extends ApiClient.Api {


  /**
   * Find providers by term and zip code
   * All &#x60;Provider&#x60; searches require a &#x60;zip_code&#x60;, which we use for weighting
the search results to favor &#x60;Provider&#x60;s that are near the user.  For example,
we would want &quot;Dr. John Smith&quot; who is 5 miles away to appear before
&quot;Dr. John Smith&quot; who is 100 miles away.

The weighting also allows for non-exact matches.  In our prior example, we
would want &quot;Dr. Jon Smith&quot; who is 2 miles away to appear before the exact
match &quot;Dr. John Smith&quot; who is 100 miles away because it is more likely that
the user just entered an incorrect name.

The free text search also supports Specialty name search and &quot;body part&quot;
Specialty name search.  So, searching &quot;John Smith nose&quot; would return
&quot;Dr. John Smith&quot;, the ENT Specialist before &quot;Dr. John Smith&quot; the Internist.


   * @param searchTerm String to search by (required)
   * @param zipCode Zip Code to search near (required)
   * @param acceptsInsurance Limit results to Providers who accept at least one insurance plan.  Note that the inverse of this filter is not supported and any value will evaluate to true (optional)
   * @param hiosIds HIOS id of one or more plans (optional)
   * @param page Page number (optional)
   * @param perPage Number of records to return per page (optional)
   * @param radius Radius (in miles) to use to limit results (optional)
   * @return InlineResponse200
   */
  @RequestLine("GET /providers?accepts_insurance={acceptsInsurance}&hios_ids={hiosIds}&page={page}&per_page={perPage}&radius={radius}&search_term={searchTerm}&zip_code={zipCode}")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  InlineResponse200 providersGet(@Param("searchTerm") String searchTerm, @Param("zipCode") String zipCode, @Param("acceptsInsurance") String acceptsInsurance, @Param("hiosIds") List<String> hiosIds, @Param("page") String page, @Param("perPage") String perPage, @Param("radius") String radius);

  /**
   * Find a specific Provider
   * To retrieve a specific provider, just perform a GET using his NPI number


   * @param npi NPI number (required)
   * @return InlineResponse2001
   */
  @RequestLine("GET /providers/{npi}")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  InlineResponse2001 providersNpiGet(@Param("npi") String npi);
}
