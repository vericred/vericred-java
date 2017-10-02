package api;

import vericred.ApiClient;

import model.NetworkComparisonRequest;
import model.NetworkComparisonResponse;
import model.NetworkSearchResponse;
import model.NetworkDetailsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-02T17:06:11.296-04:00")
public interface NetworksApi extends ApiClient.Api {


  /**
   * Network Comparisons
   * Compare provider counts in a given area between a base network and one or more comparison networks.  #### Comparing Networks Comparison of provider counts within a radius requires that you provide a &#x60;zip_code&#x60; and &#x60;radius&#x60; to use as a search area.  The response returns the total number of unique &#x60;Providers&#x60; in the Base &#x60;Network&#x60; (i.e. those who are not present in the Comparison &#x60;Network&#x60;), The number of unique &#x60;Provider&#x60;s in the Comparison &#x60;Network&#x60; (i.e. those who are not present in the Base &#x60;Network&#x60;), and the count of &#x60;Provider&#x60;s who are in *both* &#x60;Network&#x60;s
   * @param id Primary key of the base network (required)
   * @param body  (required)
   * @return NetworkComparisonResponse
   */
  @RequestLine("POST /networks/{id}/network_comparisons")
  @Headers({
    "Content-type: application/json",
    "Accept: application/json",
  })
  NetworkComparisonResponse createNetworkComparisons(@Param("id") Integer id, NetworkComparisonRequest body);

  /**
   * Networks
   * A network is a list of the doctors, other health care providers, and hospitals that a plan has contracted with to provide medical care to its members. This endpoint is paginated.
   * @param carrierId Carrier HIOS Issuer ID (required)
   * @param page Page of paginated response (optional)
   * @param perPage Responses per page (optional)
   * @return NetworkSearchResponse
   */
  @RequestLine("GET /networks?carrier_id={carrierId}&page={page}&per_page={perPage}")
  @Headers({
    "Content-type: application/json",
    "Accept: application/json",
  })
  NetworkSearchResponse listNetworks(@Param("carrierId") String carrierId, @Param("page") Integer page, @Param("perPage") Integer perPage);

  /**
   * Network Details
   * A network is a list of the doctors, other health care providers, and hospitals that a plan has contracted with to provide medical care to its members.
   * @param id Primary key of the network (required)
   * @return NetworkDetailsResponse
   */
  @RequestLine("GET /networks/{id}")
  @Headers({
    "Content-type: application/json",
    "Accept: application/json",
  })
  NetworkDetailsResponse showNetwork(@Param("id") Integer id);
}
