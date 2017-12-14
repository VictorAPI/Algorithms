package recursion;

//Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere,
//possibly with overlapping. N will be non-negative.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class strCopies {

    public boolean strCopies(String str, String sub, int n) {
        if (n == 0) return true;
        if (str.length() < sub.length()) return false;

        return (str.substring(0, sub.length()).equals(sub)) ?
                strCopies(str.substring(1), sub, n - 1) : strCopies(str.substring(1), sub, n);
//        if (str.substring(0, sub.length()).equals(sub))
//            return strCopies(str.substring(1), sub, n - 1);
//        else return strCopies(str.substring(1), sub, n);
    }

    @Test
    public void test() {
        String str = "Booom boom";
        String sub = "oo";
        int n = 3;
        boolean expected = true;
        assertTrue(strCopies(str, sub, n) == expected,
                "Expected: " + expected + ", Actual: " + strCopies(str, sub, n));
        System.out.println(strCopies(str, sub, n));
    }

    @Test
    public void test1() {
        String str = "Boom boom groom";
        String sub = "oo";
        int n = 4;
        boolean expected = false;
        assertTrue(strCopies(str, sub, n) == expected,
                "Expected: " + expected + ", Actual: " + strCopies(str, sub, n));
        System.out.println(strCopies(str, sub, n));
    }
}