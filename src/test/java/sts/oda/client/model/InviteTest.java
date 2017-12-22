package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InviteTest extends BaseTest {

    private static Invite subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new Invite();
        subject.legacyInvite(true);
        subject.link("link");
        subject.method("method");
    }

    /**
     * Test "Invite"
     */
    @Test
    public void testInvite()
    {
        String expectedJson = "{\n" +
                "  \"legacyInvite\": true,\n" +
                "  \"link\": \"link\",\n" +
                "  \"method\": \"method\"\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "legacy_invite"
     */
    @Test
    public void testPropertyLegacyInvite()
    {
        assertEquals(true, subject.getLegacyInvite());
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
     * Test attribute "method"
     */
    @Test
    public void testPropertyMethod()
    {
        assertEquals("method", subject.getMethod());
    }
}
