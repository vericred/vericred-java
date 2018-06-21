package api;

import vericred.ApiClient;

import model.StateNetworkSizeResponse;
import model.StateNetworkSizeRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-21T16:41:18.837-04:00")
public interface NetworkSizesApi extends ApiClient.Api {


  /**
   * State Network Sizes
   * The number of in-network Providers for each network in a given state. This data is recalculated nightly.  The endpoint is paginated.
   * @param stateId State code (required)
   * @param page Page of paginated response (optional)
   * @param perPage Responses per page (optional)
   * @return StateNetworkSizeResponse
   */
  @RequestLine("GET /states/{state_id}/network_sizes?page={page}&per_page={perPage}")
  @Headers({
    "Content-type: application/json",
    "Accept: application/json",
  })
  StateNetworkSizeResponse listStateNetworkSizes(@Param("stateId") String stateId, @Param("page") Integer page, @Param("perPage") Integer perPage);

  /**
   * Network Sizes
   * The number of in-network Providers for each network/state combination provided. This data is recalculated nightly.
   * @param body  (required)
   * @return StateNetworkSizeResponse
   */
  @RequestLine("POST /network_sizes/search")
  @Headers({
    "Content-type: application/json",
    "Accept: application/json",
  })
  StateNetworkSizeResponse searchNetworkSizes(StateNetworkSizeRequest body);
}
