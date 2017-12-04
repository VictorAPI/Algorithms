package map;

import org.junit.Test;
import java.util.Map;

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

}

//Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both),
//set the other to have that same value in the map.