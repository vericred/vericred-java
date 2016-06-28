package api;

import vericred.ApiClient;
import model.NetworkSearchResponse;
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
    
}
