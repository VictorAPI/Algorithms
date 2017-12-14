package recursion;

//Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class allStar {

    public String allStar(String str) {
        if (str.length() < 2) return str;
        return str.substring(0, 1) + "*" + allStar(str.substring(1));
    }

    @Test
    public void test() {
        String str1 = "zipXzap";
        String expected = "z*i*p*X*z*a*p";
        assertTrue(allStar(str1).equals(expected),
                "Expected: " + expected + ", Actual: " + allStar(str1));
        System.out.println(allStar(str1));
    }
}