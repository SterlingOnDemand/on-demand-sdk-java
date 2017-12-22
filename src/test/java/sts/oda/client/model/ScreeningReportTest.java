package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScreeningReportTest extends BaseTest {
    private static ScreeningReport subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new ScreeningReport();
        subject.pdf("pdf");
        subject.web("web");
    }

    /**
     * Test "ScreeningReport"
     */
    @Test
    public void testScreeningReport()
    {
        String expectedJson = "{\n" +
                "  \"pdf\": \"pdf\",\n" +
                "  \"web\": \"web\"\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "pdf"
     */
    @Test
    public void testPropertyPdf()
    {
        assertEquals("pdf", subject.getPdf());
    }

    /**
     * Test attribute "web"
     */
    @Test
    public void testPropertyWeb()
    {
        assertEquals("web", subject.getWeb());
    }
}
