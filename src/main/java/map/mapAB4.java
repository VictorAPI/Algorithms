package map;

//Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths,
//then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class mapAB4 {

    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            int lenA = map.get("a").length();
            int lenB = map.get("b").length();
            if (lenA == lenB) {
                map.put("a", "");
                map.put("b", "");
            }
            if (lenA > lenB) {
                map.put("c", map.get("a"));
            } else if (lenA < lenB) {
                map.put("c", map.get("b"));
            }
        }
        return map;
    }

    @Test
    public void test() {
        Map<String, String> testMap = new HashMap<String, String>() {
            {
                put("a", "apple");
                put("b", "bold");
            }
        };
        Map<String, String> expectedMap = new HashMap<String, String>() {
            {
                put("a", "apple");
                put("b", "bold");
                put("c", "apple");
            }
        };
        assertTrue(mapAB4(testMap).equals(expectedMap),
                "Expected: " + expectedMap.toString() + ", Actual: " + mapAB4(testMap).toString());
        System.out.println(mapAB4(testMap).toString());
    }

    @Test
    public void test1() {
        Map<String, String> testMap = new HashMap<String, String>() {
            {
                put("a", "appl");
                put("b", "bold");

            }
        };
        Map<String, String> expectedMap = new HashMap<String, String>() {
            {
                put("a", "");
                put("b", "");
            }
        };
        assertTrue(mapAB4(testMap).equals(expectedMap),
                "Expected: " + expectedMap.toString() + ", Actual: " + mapAB4(testMap).toString());
        System.out.println(mapAB4(testMap).toString());
    }
}