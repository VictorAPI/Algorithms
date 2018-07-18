package recursion;

//Given a string and a non-empty substring sub,
//compute recursively the largest substring which starts and ends with sub and return its length.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class strDist {

    public int strDist(String str, String sub) {

        if (!str.equals(sub) && str.length() <= sub.length()) return 0;
        if (!str.startsWith(sub)) return strDist(str.substring(1), sub);
        if (!str.endsWith(sub)) return strDist(str.substring(0, str.length() - 1), sub);
        return str.length();
    }

    @Test
    public void test() {
        String str = "Boom boom";
        String sub = "oo";
        int expected = 7;
        assertTrue(strDist(str, sub) == expected,
                "Expected: " + expected + ", Actual: " + strDist(str, sub));
        System.out.println(strDist(str, sub));
    }
}