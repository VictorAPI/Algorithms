package string;

//Given a string, does "xyz" appear in the middle of the string? To define middle,
//we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
//This problem is harder than it looks.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class xyzMiddle {

    public boolean xyzMiddle(String str) {
        int mid = str.length() / 2;
        if (str.length() > 2) {
            if ((str.length() % 2) == 0) {
                for (int i = mid - 2; i < (str.length() / 2); i++)
                    if (str.substring(i, i + 3).equals("xyz")) return true;
            } else {
                for (int i = mid - 1; i < (str.length() / 2); i++)
                    if (str.substring(i, i + 3).equals("xyz")) return true;
            }
        }
        return false;
    }

    @Test
    public void test() {
        String str1 = "aaaxyzbb";
        assertTrue(xyzMiddle(str1) == true,
                "Expected: " + "false" + ", Actual: " + xyzMiddle(str1));
        System.out.println(xyzMiddle(str1));
    }

    @Test
    public void test2() {
        String str1 = "aaaxyzbbb";
        assertTrue(xyzMiddle(str1) == true,
                "Expected: " + "true" + ", Actual: " + xyzMiddle(str1));
        System.out.println(xyzMiddle(str1));
    }

    @Test
    public void test3() {
        String str1 = "axyzbbb";
        assertTrue(xyzMiddle(str1) == false,
                "Expected: " + "true" + ", Actual: " + xyzMiddle(str1));
        System.out.println(xyzMiddle(str1));
    }
}