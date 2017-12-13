package map;

//The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string,
//with the value the number of times that string appears in the array.

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class wordCount {

    public Map<String, Integer> wordCount(String[] strings) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String s : strings) {

            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                int count = map.get(s);
                map.put(s, count + 1);
            }
        }
        return map;
    }

    @Test
    public void test() {
        String[] testList = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
        Map<String, Integer> expectedMap = new HashMap<String, Integer>() {
            {
                put("bx", 2);
                put("ax", 1);
                put("by", 2);
                put("ay", 1);
                put("ai", 1);
                put("aj", 1);
            }
        };
        assertTrue(wordCount(testList).equals(expectedMap),
                "Expected: " + expectedMap + ", Actual: " + wordCount(testList));
        System.out.println(wordCount(testList));
    }
}

