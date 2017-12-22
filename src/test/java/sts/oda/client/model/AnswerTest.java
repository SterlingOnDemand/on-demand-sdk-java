package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnswerTest extends BaseTest{

    private static Answer answer;

    @BeforeClass
    public static void setUpBeforeClass()
    {
        answer = new Answer();
        answer.questionId("question_id");
        answer.response("response");
    }

    /**
     * Test "Answer"
     */
    @Test
    public void testAnswer()
    {
        String expectedJson = "{\n" +
                "  \"questionId\": \"question_id\",\n" +
                "  \"response\": \"response\"\n" +
                "}";
    assertEquals(expectedJson, gson.toJson(answer));
}

    /**
     * Test attribute "question_id"
     */
    @Test
    public void testPropertyQuestionId()
    {
        assertEquals("question_id", answer.getQuestionId());
    }

    /**
     * Test attribute "response"
     */
    @Test
    public void testPropertyResponse()
    {
        assertEquals("response", answer.getResponse());
    }
}
