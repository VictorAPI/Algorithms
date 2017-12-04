package map;

import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

public class wordMltiple {

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map1 = new HashMap<String, Boolean>();
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        for (String s:strings) {
            if (!map2.containsKey(s)) {
                map1.put(s, false);
                map2.put(s, 1);
            } else {
                int count = map2.get(s);
                map2.put(s, count+1);
                if (map2.get(s) % 2 == 0) map1.put(s, true);
            }
        }
        return map1;
    }

}

//Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true
//if that string appears 2 or more times in the array.