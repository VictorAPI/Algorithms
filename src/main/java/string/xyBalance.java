package string;

//We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string.
//So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class xyBalance {

    public boolean xyBalance(String str) {
        int i = 0;
        boolean result = true;
        while (i < str.length()) {
            if (str.charAt(i) == 'x') {
                for (int j = i; j < str.length(); j++) {
                    if (str.charAt(j) == 'y') {
                        result = true;
                        break;
                    } else result = false;
                }
            }
            i++;
        }
        return result;
    }

    @Test
    public void test() {
        String str1 = "xzabycx";
        assertTrue(xyBalance(str1) == false,
                "Expected: " + "false" + ", Actual: " + xyBalance(str1));
        System.out.println(xyBalance(str1));
    }

    @Test
    public void test2() {
        String str1 = "xxabBxxy";
        assertTrue(xyBalance(str1) == true,
                "Expected: " + "true" + ", Actual: " + xyBalance(str1));
        System.out.println(xyBalance(str1));
    }
}