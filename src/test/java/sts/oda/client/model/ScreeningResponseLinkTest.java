package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScreeningResponseLinkTest extends BaseTest {
    private static ScreeningResponseLink subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new ScreeningResponseLink();
        subject.admin(new ScreeningReport());
    }

    /**
     * Test "ScreeningResponseLink"
     */
    @Test
    public void testScreeningResponseLink()
    {
        String expectedJson = "{\n" +
                "  \"admin\": {}\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "admin"
     */
    @Test
    public void testPropertyAdmin()
    {
        assertEquals(new ScreeningReport(), subject.getAdmin());
    }
}
