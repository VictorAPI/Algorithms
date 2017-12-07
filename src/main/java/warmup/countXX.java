package warmup;

//Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

import org.junit.Test;

public class countXX {

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++)
            if (str.substring(i, i + 2).equals("xx")) count++;
        return count;
    }

    @Test
    public void test() {
        String str = "Hellox, xx you";
        System.out.println(countXX(str));
    }

    @Test
    public void test2() {
        String str = "Helloxxx, x you";
        System.out.println(countXX(str));
    }
}