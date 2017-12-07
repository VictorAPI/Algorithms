package string;

//Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
//The string length will be at least 3.

import org.junit.Test;

public class middleThree {

    public String middleThree(String str) {
        int mid = str.length() / 2;
        System.out.println("Length: " + str.length() + ", Mid: " + mid);
        return str.substring(mid - 1, mid + 2);
    }

    @Test
    public void test() {
        String str = "bread123bread";
        System.out.println(middleThree(str));
    }

    @Test
    public void test2() {
        String str = "breadbrea";
        System.out.println(middleThree(str));
    }
}