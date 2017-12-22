package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubscriptionRequestTest extends BaseTest {
    private static SubscriptionRequest subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new SubscriptionRequest();
        subject.schedule(new Schedule());
        subject.screening(new ScreeningRequest());
    }

    /**
     * Test "SubscriptionRequest"
     */
    @Test
    public void testSubscriptionRequest()
    {
        String expectedJson = "{\n" +
                "  \"schedule\": {},\n" +
                "  \"screening\": {}\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "schedule"
     */
    @Test
    public void testPropertySchedule()
    {
        assertEquals(new Schedule(), subject.getSchedule());
    }

    /**
     * Test attribute "screening"
     */
    @Test
    public void testPropertyScreening()
    {
        assertEquals(new ScreeningRequest(), subject.getScreening());
    }
}
