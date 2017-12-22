package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SubscriptionEventsResponseTest extends BaseTest {
    private static SubscriptionEventsResponse subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        List<SubscriptionScreening> screenings= new ArrayList<SubscriptionScreening>();
        screenings.add(new SubscriptionScreening());
        subject = new SubscriptionEventsResponse();
        subject.screenings(screenings);
    }
    /**
     * Test "SubscriptionEventsResponse"
     */
    @Test
    public void testSubscriptionEventsResponse()
    {
        String expectedJson = "{\n" +
                "  \"screenings\": [\n" +
                "    {}\n" +
                "  ]\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "screenings"
     */
    @Test
    public void testPropertyScreenings()
    {
        assertEquals(new SubscriptionScreening(), subject.getScreenings().get(0));
    }
}
