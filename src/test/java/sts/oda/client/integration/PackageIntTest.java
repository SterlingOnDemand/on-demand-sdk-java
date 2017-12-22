package sts.oda.client.integration;

import sts.oda.client.ApiException;
import sts.oda.client.model.PackageResponse;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class PackageIntTest extends BaseIntegrationTest {

    public PackageIntTest()
    {
        super();
    }

    @Test
    public void  test_get() throws ApiException {
        List<PackageResponse> packagesResponses = apiInstance.packagesGet("false");
        for(PackageResponse packagesResponse : packagesResponses) {
            assertNotNull(packagesResponse.getId());
            assertNotNull(packagesResponse.getTitle());
        }
    }
}
