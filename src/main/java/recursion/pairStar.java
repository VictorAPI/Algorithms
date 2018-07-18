package recursion;

//Given a string, compute recursively a new string where identical chars that are adjacent in the original string
//are separated from each other by a "*".

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class pairStar {

    public String pairStar(String str) {
        if (str.length() < 2) return str;
        if (str.charAt(0) == str.charAt(1))
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        else return str.charAt(0) + pairStar(str.substring(1));
    }

    @Test
    public void test() {
        String start = "x(((x))x)";
        String expected = "x(*(*(x)*)x)";
        assertTrue(pairStar(start).equals(expected),
                "Expected: " + expected + ", Actual: " + pairStar(start));
        System.out.println(pairStar(start));
    }
}