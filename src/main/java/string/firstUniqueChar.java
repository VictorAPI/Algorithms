package string;

// Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class firstUniqueChar {

    public int firstUniqChar(String s) {
        if (s.isEmpty() || s == null) return -1;
        for  (int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (s.substring(0,i).indexOf(ch) == -1 && s.substring(i+1).indexOf(ch) == -1) return i;
        }
        return -1;
    }

    @Test
    public void test1() {
        String str = "axvaxa";
        int expected = 2;
        assertEquals(firstUniqChar(str), expected,
                "Something went wrong with test1");
        System.out.println(firstUniqChar(str));
    }

    @Test
    public void test2() {
        String str = "axdsadvaxa1";
        int expected = 3;
        assertEquals(firstUniqChar(str), expected,
                "Something went wrong with test2");
        System.out.println(firstUniqChar(str));
    }

}
