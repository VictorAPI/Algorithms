package string;

//Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star,
//they are the same

import org.junit.Test;

public class sameStarChar {

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if ((str.charAt(i) == '*') && (str.charAt(i - 1) != (str.charAt(i + 1)))) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void test() {
        String str = "Brea*adBr";
        System.out.println(sameStarChar(str));
    }

    @Test
    public void test2() {
        String str = "Isn't *itI";
        System.out.println(sameStarChar(str));
    }
}