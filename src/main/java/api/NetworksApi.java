package api;

import vericred.ApiClient;

import model.NetworkSearchResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-01T14:02:42.021-04:00")
public interface NetworksApi extends ApiClient.Api {


  /**
   * Networks
   * A network is a list of the doctors, other health care providers,
and hospitals that a plan has contracted with to provide medical care to
its members.
   * @param carrierId Carrier HIOS Issuer ID (required)
   * @return NetworkSearchResponse
   */
  @RequestLine("GET /networks?carrier_id={carrierId}")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  NetworkSearchResponse listNetworks(@Param("carrierId") String carrierId);
}
