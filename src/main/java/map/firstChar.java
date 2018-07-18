package map;

//Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen,
//with the value of all the strings starting with that character appended together in the order they appear in the array.

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class firstChar {

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for (String s : strings) {
            if (!map.containsKey(s.substring(0, 1))) {
                map.put(s.substring(0, 1), s);
            } else {
                String value = map.get(s.substring(0, 1));
                map.put(s.substring(0, 1), value + s);
            }
        }
        return map;
    }

    @Test
    public void test() {
        String[] testList = {"apple", "bells", "salt", "aardvark", "bells", "sun", "zen", "bells"};
        Map<String, String> expectedMap = new HashMap<String, String>() {
            {
                put("a", "appleaardvark");
                put("b", "bellsbellsbells");
                put("s", "saltsun");
                put("z", "zen");
            }
        };
        assertTrue(firstChar(testList).equals(expectedMap),
                "Expected: " + expectedMap.toString() + ", Actual: " + firstChar(testList).toString());
        System.out.println(firstChar(testList).toString());
    }
}