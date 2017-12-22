package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class QuestionTest extends BaseTest {
    private static Question subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        List<String> answers = new ArrayList<String>();
        answers.add("answers");
        subject = new Question();
        subject.answers(answers);
        subject.id("id");
        subject.prompt("prompt");
    }

    /**
     * Test "Question"
     */
    @Test
    public void testQuestion()
    {
        String expectedJson = "{\n" +
                "  \"answers\": [\n" +
                "    \"answers\"\n" +
                "  ],\n" +
                "  \"id\": \"id\",\n" +
                "  \"prompt\": \"prompt\"\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "answers"
     */
    @Test
    public void testPropertyAnswers()
    {
        assertEquals("answers", subject.getAnswers().get(0));
    }

    /**
     * Test attribute "id"
     */
    @Test
    public void testPropertyId()
    {
        assertEquals("id", subject.getId());
    }

    /**
     * Test attribute "prompt"
     */
    @Test
    public void testPropertyPrompt()
    {
        assertEquals("prompt", subject.getPrompt());
    }
}
