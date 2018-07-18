package recursion;

//Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string,
//without the sub strings overlapping.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class strCount {

    public int strCount(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        return (str.substring(0,sub.length()).equals(sub)) ?
                1 + strCount(str.substring(sub.length()), sub) : 0 + strCount(str.substring(1), sub);
    }

    @Test
    public void test() {
        String str = "Booom boom";
        String sub = "oo";
        int expected = 2;
        assertTrue(strCount(str, sub) == expected,
                "Expected: " + expected + ", Actual: " + strCount(str, sub));
        System.out.println(strCount(str, sub));
    }
}