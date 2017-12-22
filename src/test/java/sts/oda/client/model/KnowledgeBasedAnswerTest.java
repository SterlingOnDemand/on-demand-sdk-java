package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class KnowledgeBasedAnswerTest extends BaseTest{
    private static KnowledgeBasedAnswer subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        List<Answer> answers = new ArrayList<Answer>();
        answers.add(new Answer());
        List<Question> questions = new ArrayList<Question>();
        questions.add(new Question());
        subject = new KnowledgeBasedAnswer();
        subject.answers(answers);
        subject.questions(questions);
    }

    /**
     * Test "KnowledgeBasedAnswer"
     */
    @Test
    public void testKnowledgeBasedAnswer()
    {
        String expectedJson = "{\n" +
                "  \"answers\": [\n" +
                "    {}\n" +
                "  ],\n" +
                "  \"questions\": [\n" +
                "    {}\n" +
                "  ]\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "answers"
     */
    @Test
    public void testPropertyAnswers()
    {
        assertEquals(new Answer(), subject.getAnswers().get(0));
    }

    /**
     * Test attribute "questions"
     */
    @Test
    public void testPropertyQuestions()
    {
        assertEquals(new Question(), subject.getQuestions().get(0));
    }
}
