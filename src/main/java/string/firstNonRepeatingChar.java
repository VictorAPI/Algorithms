package string;

// Given a string. Return first non-repeating character in a string.

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class firstNonRepeatingChar {

    private char firstNonRepeatingCharUsingNestedLoops(String str) {
        char result = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == c) {
                    break;
                }
                if (j == str.length() - 1) {
                    return str.charAt(i);
                    }
                }
            }
        return result;
    }

    private char firstNonRepeatingCharUsingHashMap(String str) {

        Map<Character, Integer> map = new HashMap<>();

        char result = 0;
        for (int i = 0; i < str.length(); i++)
            if (!map.containsKey(str.charAt(i)))
                map.put(str.charAt(i), 1);
            else {
                int temp = map.get(str.charAt(i));
                map.put(str.charAt(i), temp + 1);
            }

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1)
                return str.charAt(i);
        }
        return result;
    }



    @Test
    public void test1() {

        String check = "geeksforgeeks";
        char c = 'f';

        assertTrue(firstNonRepeatingCharUsingNestedLoops(check) == c,
                "There is no non-repeating characters or the string is empty");
        System.out.println("The first non-repeating character is: " + firstNonRepeatingCharUsingNestedLoops(check));
    }

    @Test
    public void test2() {

        String check = "geeksforgeeks";
        char c = 'f';

        assertTrue(firstNonRepeatingCharUsingHashMap(check) == c,
                "There is no non-repeating characters or the string is empty");
        System.out.println("The first non-repeating character is: " + firstNonRepeatingCharUsingHashMap(check));
    }
}
