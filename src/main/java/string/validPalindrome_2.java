package string;

// Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class validPalindrome_2 {

    public boolean validPalindrome(String s) {
        int l = -1, r = s.length();
        while (++l < --r) {
            if (s.charAt(l) != s.charAt(r))
                return isPalindromic(s, l, r+1) || isPalindromic(s, l-1, r);
        }
        return true;
    }

    public boolean isPalindromic(String s, int l, int r) {
        while (++l < --r)
            if (s.charAt(l) != s.charAt(r)) return false;
        return true;
    }


    @Test
    public void test1() {
        String str = "axvaxa";
        assertTrue(validPalindrome(str),
                "Something went wrong with test1");
        System.out.println(validPalindrome(str));
    }

    @Test
    public void test2() {
        String str = "axvaxa1";
        assertFalse(validPalindrome(str),
                "Something went wrong with test2");
        System.out.println(validPalindrome(str));
    }
}
