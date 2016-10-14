package api;

import vericred.ApiClient;
import model.FormularyDrugPackageResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DrugPackagesApi
 */
public class DrugPackagesApiTest {

    private DrugPackagesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(DrugPackagesApi.class);
    }

    
    /**
     * Formulary Drug Package Search
     *
     * Search for coverage by Formulary and DrugPackage ID
     */
    @Test
    public void showFormularyDrugPackageCoverageTest() {
        String formularyId = null;
        String ndcPackageCode = null;
        // FormularyDrugPackageResponse response = api.showFormularyDrugPackageCoverage(formularyId, ndcPackageCode);

        // TODO: test validations
    }
    
}
