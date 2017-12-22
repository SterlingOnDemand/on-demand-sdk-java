package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReferenceCodesResponseTest extends BaseTest {
    private static ReferenceCodesResponse subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        List<ReferenceCode> referenceCodes = new ArrayList<ReferenceCode>();
        referenceCodes.add(new ReferenceCode());
        subject = new ReferenceCodesResponse();
        subject.referenceCodes(referenceCodes);
    }
    /**
     * Test "ReferenceCodesResponse"
     */
    @Test
    public void testReferenceCodesResponse()
    {

        String expectedJson = "{\n" +
                "  \"referenceCodes\": [\n" +
                "    {}\n" +
                "  ]\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "reference_codes"
     */
    @Test
    public void testPropertyReferenceCodes()
    {
        assertEquals(new ReferenceCode(), subject.getReferenceCodes().get(0));
    }
}
