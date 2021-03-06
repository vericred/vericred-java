package api;

import vericred.ApiClient;

import model.ProviderShowResponse;
import model.RequestProvidersSearch;
import model.ProvidersSearchResponse;
import model.ProvidersGeocodeResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-02T17:06:11.296-04:00")
public interface ProvidersApi extends ApiClient.Api {


  /**
   * Find a Provider
   * To retrieve a specific provider, just perform a GET using his NPI number
   * @param npi NPI number (required)
   * @param year Only show plan ids for the given year (optional)
   * @param state Only show plan ids for the given state (optional)
   * @return ProviderShowResponse
   */
  @RequestLine("GET /providers/{npi}?year={year}&state={state}")
  @Headers({
    "Content-type: application/json",
    "Accept: application/json",
  })
  ProviderShowResponse getProvider(@Param("npi") String npi, @Param("year") String year, @Param("state") String state);

  /**
   * Find Providers
   * ### Provider Details All searches can take a &#x60;search_term&#x60;, which is used as a component in the score (and thus the ranking/order) of the results.  This is combined with the proximity to the location in ranking results. For example, we would want \&quot;Dr. John Smith\&quot; who is 5 miles away from a given Zip Code to appear before \&quot;Dr. John Smith\&quot; who is 100 miles away.  The weighting also allows for non-exact matches.  In our prior example, we would want \&quot;Dr. Jon Smith\&quot; who is 2 miles away to appear before the exact match \&quot;Dr. John Smith\&quot; who is 100 miles away because it is more likely that the user just entered an incorrect name.  The free text search also supports Specialty name search and \&quot;body part\&quot; Specialty name search.  So, searching \&quot;John Smith nose\&quot; would return \&quot;Dr. John Smith\&quot;, the ENT Specialist before \&quot;Dr. John Smith\&quot; the Internist.  In addition, we can filter &#x60;Providers&#x60; by whether or not they accept *any* insurance.  Our data set includes over 4 million &#x60;Providers&#x60;, some of whom do not accept any insurance at all.  This filter makes it more likely that the user will find his or her practitioner in some cases.  We can also use &#x60;min_score&#x60; to omit less relevant results.  This makes sense in the case where your application wants to display *all* of the results returned regardless of how many there are.  Otherwise, using our default &#x60;min_score&#x60; and pagination should be sufficient.  ### Location Information  All &#x60;Provider&#x60; searches that do *not* specify &#x60;plan_ids&#x60; or &#x60;network_ids&#x60;require some type of location information. We use this information either to weight results or to filter results, depending on the type.  #### Zip Code When providing the &#x60;zip_code&#x60; parameter, we order the &#x60;Providers&#x60; returned based on their score, which incorporates their proximity to the given Zip Code and the closeness of match to the search text.  If a &#x60;radius&#x60; is also provided, we filter out &#x60;Providers&#x60; who are outside of that radius from the center of the Zip Code provided  #### Polygon When providing the &#x60;polygon&#x60; parameter, we filter providers who are outside the bounds of the shape provided.  This is mutually exclusive with &#x60;zip_code&#x60; and &#x60;radius&#x60;.  ### Plan/Network Information We can also filter based on &#x60;Plan&#x60; and &#x60;Network&#x60; participation.  These filters are mutually exclusive and return the union of the resulting sets for each &#x60;Plan&#x60; or &#x60;Network&#x60;.  I.e. if you provider Plan A and Plan B, you will receive &#x60;Providers&#x60; who accept *either* &#x60;Plan&#x60;.  The same is true for &#x60;Networks&#x60;.  ### Examples  *Find Dr. Foo near Brooklyn*  &#x60;{ \&quot;search_term\&quot;: \&quot;Foo\&quot;, \&quot;zip_code\&quot;: \&quot;11215\&quot; }&#x60;  *Find all Providers within 5 miles of Brooklyn who accept a Plan*  &#x60;{ \&quot;zip_code\&quot;: \&quot;11215\&quot;, \&quot;radius\&quot;: 5, \&quot;hios_ids\&quot;: [\&quot;88582NY0230001\&quot;] }&#x60;  *Find all providers on a map of Brooklyn ordered by a combination of proximity to the center point of the map and relevance to the search term \&quot;ENT\&quot;*  &#x60;&#x60;&#x60; {   \&quot;polygon\&quot;: [       {\&quot;lon\&quot;:-74.0126609802,\&quot;lat\&quot;:40.6275684851 },       {\&quot;lon\&quot;:-74.0126609802,\&quot;lat\&quot;:40.7097269508 },       {\&quot;lon\&quot;:-73.9367866516,\&quot;lat\&quot;:40.7097269508 },       {\&quot;lon\&quot;:-73.9367866516,\&quot;lat\&quot;:40.6275684851 }   ],   \&quot;search_term\&quot; : \&quot;ENT\&quot; } &#x60;&#x60;&#x60; 
   * @param body  (required)
   * @return ProvidersSearchResponse
   */
  @RequestLine("POST /providers/search")
  @Headers({
    "Content-type: application/json",
    "Accept: application/json",
  })
  ProvidersSearchResponse getProviders(RequestProvidersSearch body);

  /**
   * Find Providers
   * ### Provider Details All searches can take a &#x60;search_term&#x60;, which is used as a component in the score (and thus the ranking/order) of the results.  This is combined with the proximity to the location in ranking results. For example, we would want \&quot;Dr. John Smith\&quot; who is 5 miles away from a given Zip Code to appear before \&quot;Dr. John Smith\&quot; who is 100 miles away.  The weighting also allows for non-exact matches.  In our prior example, we would want \&quot;Dr. Jon Smith\&quot; who is 2 miles away to appear before the exact match \&quot;Dr. John Smith\&quot; who is 100 miles away because it is more likely that the user just entered an incorrect name.  The free text search also supports Specialty name search and \&quot;body part\&quot; Specialty name search.  So, searching \&quot;John Smith nose\&quot; would return \&quot;Dr. John Smith\&quot;, the ENT Specialist before \&quot;Dr. John Smith\&quot; the Internist.  In addition, we can filter &#x60;Providers&#x60; by whether or not they accept *any* insurance.  Our data set includes over 4 million &#x60;Providers&#x60;, some of whom do not accept any insurance at all.  This filter makes it more likely that the user will find his or her practitioner in some cases.  We can also use &#x60;min_score&#x60; to omit less relevant results.  This makes sense in the case where your application wants to display *all* of the results returned regardless of how many there are.  Otherwise, using our default &#x60;min_score&#x60; and pagination should be sufficient.  ### Location Information  All &#x60;Provider&#x60; searches that do *not* specify &#x60;plan_ids&#x60; or &#x60;network_ids&#x60;require some type of location information. We use this information either to weight results or to filter results, depending on the type.  #### Zip Code When providing the &#x60;zip_code&#x60; parameter, we order the &#x60;Providers&#x60; returned based on their score, which incorporates their proximity to the given Zip Code and the closeness of match to the search text.  If a &#x60;radius&#x60; is also provided, we filter out &#x60;Providers&#x60; who are outside of that radius from the center of the Zip Code provided  #### Polygon When providing the &#x60;polygon&#x60; parameter, we filter providers who are outside the bounds of the shape provided.  This is mutually exclusive with &#x60;zip_code&#x60; and &#x60;radius&#x60;.  ### Plan/Network Information We can also filter based on &#x60;Plan&#x60; and &#x60;Network&#x60; participation.  These filters are mutually exclusive and return the union of the resulting sets for each &#x60;Plan&#x60; or &#x60;Network&#x60;.  I.e. if you provider Plan A and Plan B, you will receive &#x60;Providers&#x60; who accept *either* &#x60;Plan&#x60;.  The same is true for &#x60;Networks&#x60;.  ### Examples  *Find Dr. Foo near Brooklyn*  &#x60;{ \&quot;search_term\&quot;: \&quot;Foo\&quot;, \&quot;zip_code\&quot;: \&quot;11215\&quot; }&#x60;  *Find all Providers within 5 miles of Brooklyn who accept a Plan*  &#x60;{ \&quot;zip_code\&quot;: \&quot;11215\&quot;, \&quot;radius\&quot;: 5, \&quot;hios_ids\&quot;: [\&quot;88582NY0230001\&quot;] }&#x60;  *Find all providers on a map of Brooklyn ordered by a combination of proximity to the center point of the map and relevance to the search term \&quot;ENT\&quot;*  &#x60;&#x60;&#x60; {   \&quot;polygon\&quot;: [       {\&quot;lon\&quot;:-74.0126609802,\&quot;lat\&quot;:40.6275684851 },       {\&quot;lon\&quot;:-74.0126609802,\&quot;lat\&quot;:40.7097269508 },       {\&quot;lon\&quot;:-73.9367866516,\&quot;lat\&quot;:40.7097269508 },       {\&quot;lon\&quot;:-73.9367866516,\&quot;lat\&quot;:40.6275684851 }   ],   \&quot;search_term\&quot; : \&quot;ENT\&quot; } &#x60;&#x60;&#x60; 
   * @param body  (required)
   * @return ProvidersGeocodeResponse
   */
  @RequestLine("POST /providers/search/geocode")
  @Headers({
    "Content-type: application/json",
    "Accept: application/json",
  })
  ProvidersGeocodeResponse getProviders_1(RequestProvidersSearch body);
}
