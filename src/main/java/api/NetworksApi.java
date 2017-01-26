package api;

import vericred.ApiClient;

import model.NetworkSearchResponse;
import model.NetworkDetailsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-26T16:00:18.173-05:00")
public interface NetworksApi extends ApiClient.Api {


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
