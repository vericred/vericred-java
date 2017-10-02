package api;

import vericred.ApiClient;
import model.DrugSearchResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DrugsApi
 */
public class DrugsApiTest {

    private DrugsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(DrugsApi.class);
    }

    
    /**
     * Drug Search
     *
     * Search for drugs by proprietary name
     */
    @Test
    public void listDrugsTest() {
        String searchTerm = null;
        // DrugSearchResponse response = api.listDrugs(searchTerm);

        // TODO: test validations
    }
    
}
