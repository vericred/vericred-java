package api;

import vericred.ApiClient;
import model.StateNetworkSizeResponse;
import model.StateNetworkSizeRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NetworkSizesApi
 */
public class NetworkSizesApiTest {

    private NetworkSizesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(NetworkSizesApi.class);
    }

    
    /**
     * State Network Sizes
     *
     * The number of in-network Providers for each network in a given state. This data is recalculated nightly.  The endpoint is paginated.
     */
    @Test
    public void listStateNetworkSizesTest() {
        String stateId = null;
        Integer page = null;
        Integer perPage = null;
        // StateNetworkSizeResponse response = api.listStateNetworkSizes(stateId, page, perPage);

        // TODO: test validations
    }
    
    /**
     * Network Sizes
     *
     * The number of in-network Providers for each network/state combination provided. This data is recalculated nightly.
     */
    @Test
    public void searchNetworkSizesTest() {
        StateNetworkSizeRequest body = null;
        // StateNetworkSizeResponse response = api.searchNetworkSizes(body);

        // TODO: test validations
    }
    
}
