package map;

//Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value,
//set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class topping2 {

    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            String value = map.get("ice cream");
            map.put("yogurt", value);
        }
        if (map.containsKey("spinach")) map.put("spinach", "nuts");
        return map;
    }

    @Test
    public void test() {
        Map<String, String> testMap = new HashMap<String, String>() {
            {
                put("ice cream", "apple");
                put("yogurt", "bold");
                put("spinach", "brew");
            }
        };
        Map<String, String> expectedMap = new HashMap<String, String>() {
            {
                put("ice cream", "apple");
                put("yogurt", "apple");
                put("spinach", "nuts");
            }
        };
        assertTrue(topping2(testMap).equals(expectedMap),
                "Expected: " + expectedMap.toString() + ", Actual: " + topping2(testMap).toString());
        System.out.println(topping2(testMap).toString());
    }
}