package api;

import vericred.ApiClient;

import model.ProviderResponse;
import model.RequestProvidersSearch;
import model.ProvidersSearchResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T16:44:52.285-04:00")
public interface ProvidersApi extends ApiClient.Api {


  /**
   * Find a Provider
   * To retrieve a specific provider, just perform a GET using his NPI number
   * @param npi NPI number (required)
   * @param vericredApiKey API Key (optional)
   * @return ProviderResponse
   */
  @RequestLine("GET /providers/{npi}")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
    "vericredApiKey: {vericredApiKey}"
  })
  ProviderResponse getProvider(@Param("npi") String npi, @Param("vericredApiKey") String vericredApiKey);

  /**
   * Find Providers
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

   * @param body  (optional)
   * @return ProvidersSearchResponse
   */
  @RequestLine("POST /providers/search")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  ProvidersSearchResponse getProviders(RequestProvidersSearch body);
}
