package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OneTimeReportLinkResponseTest extends BaseTest {
    private static OneTimeReportLinkResponse subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new OneTimeReportLinkResponse();
        subject.html("html");
        subject.link("link");
        subject.pdf("pdf");
        subject.token("token");
    }

    /**
     * Test "OneTimeReportLinkResponse"
     */
    @Test
    public void testOneTimeReportLinkResponse()
    {
        String expectedJson = "{\n" +
                "  \"html\": \"html\",\n" +
                "  \"link\": \"link\",\n" +
                "  \"pdf\": \"pdf\",\n" +
                "  \"token\": \"token\"\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "html"
     */
    @Test
    public void testPropertyHtml()
    {
        assertEquals("html", subject.getHtml());
    }

    /**
     * Test attribute "link"
     */
    @Test
    public void testPropertyLink()
    {
        assertEquals("link", subject.getLink());
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
     * Test attribute "token"
     */
    @Test
    public void testPropertyToken()
    {
        assertEquals("token", subject.getToken());
    }
}
