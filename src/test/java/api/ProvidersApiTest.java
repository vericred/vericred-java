package api;

import vericred.ApiClient;
import model.ProviderShowResponse;
import model.RequestProvidersSearch;
import model.ProvidersSearchResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProvidersApi
 */
public class ProvidersApiTest {

    private ProvidersApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ProvidersApi.class);
    }

    
    /**
     * Find a Provider
     *
     * To retrieve a specific provider, just perform a GET using his NPI number
     */
    @Test
    public void getProviderTest() {
        String npi = null;
        // ProviderShowResponse response = api.getProvider(npi);

        // TODO: test validations
    }
    
    /**
     * Find Providers
     *
     * All &#x60;Provider&#x60; searches require a &#x60;zip_code&#x60;, which we use for weighting the search results to favor &#x60;Provider&#x60;s that are near the user.  For example, we would want \&quot;Dr. John Smith\&quot; who is 5 miles away to appear before \&quot;Dr. John Smith\&quot; who is 100 miles away.  The weighting also allows for non-exact matches.  In our prior example, we would want \&quot;Dr. Jon Smith\&quot; who is 2 miles away to appear before the exact match \&quot;Dr. John Smith\&quot; who is 100 miles away because it is more likely that the user just entered an incorrect name.  The free text search also supports Specialty name search and \&quot;body part\&quot; Specialty name search.  So, searching \&quot;John Smith nose\&quot; would return \&quot;Dr. John Smith\&quot;, the ENT Specialist before \&quot;Dr. John Smith\&quot; the Internist. 
     */
    @Test
    public void getProvidersTest() {
        RequestProvidersSearch body = null;
        // ProvidersSearchResponse response = api.getProviders(body);

        // TODO: test validations
    }
    
}
