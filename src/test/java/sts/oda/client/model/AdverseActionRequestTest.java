package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdverseActionRequestTest extends BaseTest{
    private static AdverseActionRequest adverseActionRequest;

    @BeforeClass
    public static void setUpBeforeClass(){
       adverseActionRequest = new AdverseActionRequest();
       adverseActionRequest.comment("comment");
       adverseActionRequest.addReportItemIdsItem("1");
       adverseActionRequest.addReportItemIdsItem("2");
    }

    @Test
    public void testAdverseActionRequest(){
        String expectedJson = "{\n" +
                "  \"comment\": \"comment\",\n" +
                "  \"reportItemIds\": [\n" +
                "    \"1\",\n" +
                "    \"2\"\n" +
                "  ]\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(adverseActionRequest));
    }

    @Test
    public void testPropertyComment(){
        assertEquals("comment", adverseActionRequest.getComment());
    }

    @Test
    public void testPropertyReportItemIds(){
        assertEquals("1", adverseActionRequest.getReportItemIds().get(0));
        assertEquals("2", adverseActionRequest.getReportItemIds().get(1));
    }
}