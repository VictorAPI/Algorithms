package string;

// Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

import org.junit.Test;

public class doubleX {

    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        if (i + 1 >= str.length()) return false;
        return str.substring(i + 1, i + 2).equals("x");
    }

    @Test
    public void test() {
        String str = "Hello, xxx you";
        System.out.println(doubleX(str));
    }

    @Test
    public void test2() {
        String str = "Hellox, x you";
        System.out.println(doubleX(str));
    }
}