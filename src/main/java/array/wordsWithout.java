package array;

//Given an array of strings, return a new array without the strings that are equal to the target string.
//One approach is to count the occurrences of the target string, make a new array of the correct length,
//and then copy over the correct strings.

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class wordsWithout {

    public String[] wordsWithout(String[] words, String target) {

        int count = 0;
        for (int i=0; i < words.length; i++)
            if (words[i] != target) count++;

        int index = 0;
        String[] newArray = new String[count];

        for (int i=0; i<words.length; i++) {
            if (words[i] != target && index < count) {
                newArray[index] = words[i];
                index++;
            }
        }
        return newArray;
    }

    @Test
    public void test() {
        String[] testArray = {"asba", "werwerw", "asde", "asdasdd", "HelloVleH"};
        String targetString = "asba";
        String[] expected = {"werwerw", "asde", "asdasdd", "HelloVleH"};
        assertTrue(Arrays.equals(wordsWithout(testArray, targetString), expected),
                "Expected: " + Arrays.toString(expected) + ", Actual: " + Arrays.toString(wordsWithout(testArray, targetString)));
        System.out.println(Arrays.toString(wordsWithout(testArray, targetString)));
    }
}