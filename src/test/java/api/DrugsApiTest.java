package api;

import vericred.ApiClient;
import model.DrugCoverageResponse;
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
     * Search for DrugCoverages
     *
     * Drug Coverages are the specific tier level, quantity limit, prior authorization and step therapy for a given Drug/Plan combination. This endpoint returns all DrugCoverages for a given Drug
     */
    @Test
    public void getDrugCoveragesTest() {
        String ndcPackageCode = null;
        String audience = null;
        String stateCode = null;
        // DrugCoverageResponse response = api.getDrugCoverages(ndcPackageCode, audience, stateCode);

        // TODO: test validations
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
