package map;

//Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both),
//set the other to have that same value in the map.

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class mapAB3 {

    public Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) {

            String valueA = map.get("a");
            map.put("b", valueA);

        } else if (!map.containsKey("a") && map.containsKey("b")) {

            String valueB = map.get("b");
            map.put("a", valueB);
        }
        return map;

    }

    @Test
    public void test() {
        Map<String, String> testMap = new HashMap<String, String>() {
            {
                put("aa", "aa");
                put("a", "apple");
                put("z", "zzz");
            }
        };
        Map<String, String> expectedMap = new HashMap<String, String>() {
            {
                put("aa", "aa");
                put("a", "apple");
                put("b", "apple");
                put("z", "zzz");
            }
        };
        assertTrue(mapAB3(testMap).equals(expectedMap),
                "Expected: " + expectedMap.toString() + ", Actual: " + mapAB3(testMap).toString());
        System.out.println(mapAB3(testMap).toString());
    }
}