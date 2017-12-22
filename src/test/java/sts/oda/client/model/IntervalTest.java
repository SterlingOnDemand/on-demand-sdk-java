package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntervalTest extends BaseTest {
    private static Interval subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new Interval();
        subject.unit("unit");
        subject.value(0);
    }
    /**
     * Test "Interval"
     */
    @Test
    public void testInterval()
    {
        String expectedJson = "{\n" +
                "  \"unit\": \"unit\",\n" +
                "  \"value\": 0\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "unit"
     */
    @Test
    public void testPropertyUnit()
    {
        assertEquals("unit", subject.getUnit());
    }

    /**
     * Test attribute "value"
     */
    @Test
    public void testPropertyValue()
    {
        assertEquals(0, subject.getValue().intValue());
    }
}
