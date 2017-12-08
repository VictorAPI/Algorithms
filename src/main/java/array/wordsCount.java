package array;

//Given an array of strings, return the count of the number of strings with the given length.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class wordsCount {

    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (String word : words)
            if (word.length() == len) count++;
        return count;
    }

    @Test
    public void test() {
        String[] testArray = {"asba", "werwerw", "asde", "asdasdd", "HelloVleH"};
        int length = 4;
        int expected = 2;
        assertTrue(wordsCount(testArray, length) == expected,
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(wordsCount(testArray, length)));
        System.out.println(String.valueOf(wordsCount(testArray, length)));
    }
}