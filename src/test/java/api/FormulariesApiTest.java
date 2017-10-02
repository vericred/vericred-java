package api;

import vericred.ApiClient;
import model.FormularyResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FormulariesApi
 */
public class FormulariesApiTest {

    private FormulariesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(FormulariesApi.class);
    }

    
    /**
     * Formulary Search
     *
     * Search for drugs by proprietary name
     */
    @Test
    public void listFormulariesTest() {
        String searchTerm = null;
        String rxBin = null;
        String rxGroup = null;
        String rxPcn = null;
        // FormularyResponse response = api.listFormularies(searchTerm, rxBin, rxGroup, rxPcn);

        // TODO: test validations
    }
    
}
