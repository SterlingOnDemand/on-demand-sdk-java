package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InviteResponseTest extends BaseTest {
    private static InviteResponse subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new InviteResponse();
        subject.invite(new Invite());
    }

    /**
     * Test "InviteResponse"
     */
    @Test
    public void testInviteResponse()
    {
        String expectedJson = "{\n" +
                "  \"invite\": {}\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "invite"
     */
    @Test
    public void testPropertyInvite()
    {
        assertEquals(new Invite(), subject.getInvite());
    }
}
