package string;

//Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a'
// and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

import org.junit.Test;

public class deFront {

    public String deFront(String str) {
        if ((str.length()>1) && (str.charAt(1) != 'b'))
            str = str.charAt(0) + str.substring(2);
        if ((str.length()>0) && (str.charAt(0) != 'a'))
            str = str.substring(1);
        return str;
    }

    @Test
    public void test() {
        String str = "aey, you";
        System.out.println(deFront(str));
    }

    @Test
    public void test2() {
        String str = "bey, you Three, Hey";
        System.out.println(deFront(str));
    }

}
