package api;

import vericred.ApiClient;
import model.DrugCoverageResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DrugCoveragesApi
 */
public class DrugCoveragesApiTest {

    private DrugCoveragesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(DrugCoveragesApi.class);
    }

    
    /**
     * Search for DrugCoverages
     *
     * Drug Coverages are the specific tier level, quantity limit, prior authorization and step therapy for a given Drug/Plan combination. This endpoint returns all DrugCoverages for a given Drug.  #### Tiers   Possible values for tier:    | Tier                     | Description                                                                                                                                                                     |   | ------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |   | __generic__              | Unbranded drugs, with the same active ingredients as their brand-name equivalents, and generally available at a lower cost.                                                     |   | __preferred_brand__      | Brand-name drugs included on the health plan&#39;s formulary. Generally more expensive than generics, and less expensive than non-preferred drugs.                                  |   | __non_preferred_brand__  | Brand-name drugs not included on the health plan&#39;s formulary. These generally have a higher coinsurance.                                                                        |   | __specialty__            | Used to treat complex conditions like cancer. May require special handling or monitoring. May be generic or brand-name. Generally the most expensive drugs covered by a plan.   |   | __not_covered__          | Specifically excluded from the health plan.                                                                                                                                     |   | __not_listed__           | Neither included nor excluded from the health plan. Most plans provide some default level of coverage for unlisted drugs.                                                       |
     */
    @Test
    public void getDrugCoveragesTest() {
        String ndcPackageCode = null;
        String audience = null;
        String stateCode = null;
        // DrugCoverageResponse response = api.getDrugCoverages(ndcPackageCode, audience, stateCode);

        // TODO: test validations
    }
    
}
