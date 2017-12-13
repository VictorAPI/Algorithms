package map;

//Loop over the given array of strings to build a result string like this:
//when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result.
//Return the empty string if no string appears a 2nd time.

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class wordAppend {

    public String wordAppend(String[] strings) {
        String result = "";
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                int count = map.get(s);
                map.put(s, count + 1);
                if ((count + 1) % 2 == 0) result += s;
            }
        }
        return result;
    }

    @Test
    public void test() {
        String[] testList = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
        String expectedList = "bxby";
        assertTrue(wordAppend(testList).equals(expectedList),
                "Expected: " + expectedList + ", Actual: " + wordAppend(testList));
        System.out.println(wordAppend(testList));
    }
}