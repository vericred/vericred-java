package api;

import vericred.ApiClient;
import model.NetworkComparisonRequest;
import model.NetworkComparisonResponse;
import model.NetworkSearchResponse;
import model.NetworkDetailsResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NetworksApi
 */
public class NetworksApiTest {

    private NetworksApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(NetworksApi.class);
    }

    
    /**
     * Network Comparisons
     *
     * Compare provider counts in a given area between a base network and one or more comparison networks.  #### Comparing Networks Comparison of provider counts within a radius requires that you provide a &#x60;zip_code&#x60; and &#x60;radius&#x60; to use as a search area.  The response returns the total number of unique &#x60;Providers&#x60; in the Base &#x60;Network&#x60; (i.e. those who are not present in the Comparison &#x60;Network&#x60;), The number of unique &#x60;Provider&#x60;s in the Comparison &#x60;Network&#x60; (i.e. those who are not present in the Base &#x60;Network&#x60;), and the count of &#x60;Provider&#x60;s who are in *both* &#x60;Network&#x60;s
     */
    @Test
    public void createNetworkComparisonsTest() {
        Integer id = null;
        NetworkComparisonRequest body = null;
        // NetworkComparisonResponse response = api.createNetworkComparisons(id, body);

        // TODO: test validations
    }
    
    /**
     * Networks
     *
     * A network is a list of the doctors, other health care providers, and hospitals that a plan has contracted with to provide medical care to its members. This endpoint is paginated.
     */
    @Test
    public void listNetworksTest() {
        String carrierId = null;
        Integer page = null;
        Integer perPage = null;
        // NetworkSearchResponse response = api.listNetworks(carrierId, page, perPage);

        // TODO: test validations
    }
    
    /**
     * Network Details
     *
     * A network is a list of the doctors, other health care providers, and hospitals that a plan has contracted with to provide medical care to its members.
     */
    @Test
    public void showNetworkTest() {
        Integer id = null;
        // NetworkDetailsResponse response = api.showNetwork(id);

        // TODO: test validations
    }
    
}
