package string;

//Given a string, return a string length 1 from its front, unless front is false,
//in which case return a string length 1 from its back. The string will be non-empty.

import org.junit.Test;

public class theEnd {

    public String theEnd(String str, boolean front) {
        if (front) return str.substring(0, 1);
        return str.substring(str.length() - 1);
    }

    @Test
    public void test() {
        String str = "ab*c2d";
        boolean front = true;
        System.out.println(theEnd(str, front));
    }

    @Test
    public void test2() {
        String str = "a2b*3*c34d";
        boolean front = false;
        System.out.println(theEnd(str, front));
    }
}