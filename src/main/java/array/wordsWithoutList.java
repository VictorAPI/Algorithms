package array;

//Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted.
//See wordsWithout() below which is more difficult because it uses arrays.

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class wordsWithoutList {

    public List wordsWithoutList(String[] words, int len) {
        List newList = new ArrayList();
        for (String s : words)
            if (s.length() != len)
                newList.add(s);
        return newList;
    }

    @Test
    public void test() {
        String[] testArray = {"asba", "werwerw", "asde", "asdasdd", "HelloVleH"};
        int length = 4;
        List<String> expected = new ArrayList<>(Arrays.asList("werwerw", "asdasdd", "HelloVleH"));
        assertTrue(wordsWithoutList(testArray, length).equals(expected),
                "Expected: " + expected + ", Actual: " + wordsWithoutList(testArray, length));
        System.out.println(wordsWithoutList(testArray, length));
    }
}
