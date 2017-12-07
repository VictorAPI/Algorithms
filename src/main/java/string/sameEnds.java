package string;

//Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping.
//For example, sameEnds("abXab") is "ab".

import org.junit.Test;

public class sameEnds {

    public String sameEnds(String str) {

        String result = "";
        String tmp = "";

        for (int i = 0; i < str.length() / 2; i++) {
            tmp += str.charAt(i);
            if (tmp.equals(str.substring(str.length() - tmp.length())))
                result = tmp;
        }
        return result;
    }

    @Test
    public void test() {
        String str = "BreadBr";
        System.out.println(sameEnds(str));
    }

    @Test
    public void test2() {
        String str = "Isn't itI";
        System.out.println(sameEnds(str));
    }
}