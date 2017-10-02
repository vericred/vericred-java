package api;

import vericred.ApiClient;
import model.ZipCountiesResponse;
import model.ZipCountyResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ZipCountiesApi
 */
public class ZipCountiesApiTest {

    private ZipCountiesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ZipCountiesApi.class);
    }

    
    /**
     * Search for Zip Counties
     *
     * Our &#x60;Plan&#x60; endpoints require a zip code and a fips (county) code.  This is because plan pricing requires both of these elements.  Users are unlikely to know their fips code, so we provide this endpoint to look up a &#x60;ZipCounty&#x60; by zip code and return both the selected zip and fips codes.
     */
    @Test
    public void getZipCountiesTest() {
        String zipPrefix = null;
        // ZipCountiesResponse response = api.getZipCounties(zipPrefix);

        // TODO: test validations
    }
    
    /**
     * Show an individual ZipCounty
     *
     * Our &#x60;Plan&#x60; endpoints require a zip code and a fips (county) code.  This is because plan pricing requires both of these elements.  Users are unlikely to know their fips code, so we provide this endpoint to returns the details for a &#x60;ZipCounty&#x60; by zip code and return both the selected zip and fips codes.
     */
    @Test
    public void showZipCountyTest() {
        Integer id = null;
        // ZipCountyResponse response = api.showZipCounty(id);

        // TODO: test validations
    }
    
}
