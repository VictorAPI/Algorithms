package string;

//Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
//and otherwise return the string unchanged.

import org.junit.Test;

public class withoutX {

    public String withoutX(String str) {
        if ((str.length() > 0) && (str.charAt(0) == 'x'))
            str = str.substring(1);
        else if ((str.length() > 0) && (str.charAt(str.length() - 1) == 'x'))
            str = str.substring(0, str.length() - 1);
        return str;
    }

    @Test
    public void test() {
        String str1 = "xzab*c2**d**e";
        System.out.println(withoutX(str1));
    }

    @Test
    public void test2() {
        String str1 = "abBaababxx";
        System.out.println(withoutX(str1));
    }
}