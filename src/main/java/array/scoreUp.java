package array;

//The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}.
//the "answers" array contains a student's answers, with "?" representing a question left blank.
//The two arrays are not empty and are the same length. Return the score for this array of answers,
//giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class scoreUp {

    public int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < key.length; i++)
            if (answers[i] == key[i]) score += 4;
            else if (answers[i] != "?") score--;
        return score;
    }

    @Test
    public void test() {
        String[] testKey = {"a", "b", "c", "b"};
        String[] testAnswers = {"a", "?", "b", "b"};
        int expected = 7;
        assertTrue(scoreUp(testKey, testAnswers) == expected,
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(scoreUp(testKey, testAnswers)));
        System.out.println(String.valueOf(scoreUp(testKey, testAnswers)));
    }
}