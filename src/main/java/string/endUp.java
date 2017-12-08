package string;

//Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars,
//uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.

import org.junit.Test;

public class endUp {

    public String endUp(String str) {
        if (str.length() < 4) return str.toUpperCase();
        return (str.substring(0, str.length() - 3)
                + str.substring(str.length() - 3).toUpperCase());
    }

    @Test
    public void test() {
        String str = "Hello, xxx you";
        System.out.println(endUp(str));
    }

    @Test
    public void test2() {
        String str = "Hey";
        System.out.println(endUp(str));
    }
}