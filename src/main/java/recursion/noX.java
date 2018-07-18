package recursion;

//Given a string, compute recursively a new string where all the 'x' chars have been removed

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class noX {

    public String noX(String str) {
        if (str.length() == 0) return "";
        if (str.charAt(0) == 'x') return noX(str.substring(1));
        return str.charAt(0) + noX(str.substring(1));
    }

    @Test
    public void test() {
        String start = "x(((x))x)";
        String expected = "((()))";
        assertTrue(noX(start).equals(expected),
                "Expected: " + expected + ", Actual: " + noX(start));
        System.out.println(noX(start));
    }
}