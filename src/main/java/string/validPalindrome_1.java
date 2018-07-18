package string;

//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//Note: For the purpose of this problem, we define empty string as valid palindrome.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class validPalindrome_1 {

    public boolean isPalindrome(String s) {

        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (!Character.isLetterOrDigit(s.charAt(l))) ++l;
            else if (!Character.isLetterOrDigit(s.charAt(r))) --r;
            else if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;
            else {++l; --r;}
        }
        return true;
    }

    @Test
    public void test1() {
        String str = "A man, a plan, a canal: Panama";
        assertTrue(isPalindrome(str),
                "Something went wrong with test1");
    }

    @Test
    public void test2() {
        String str = "0P";
        assertFalse(isPalindrome(str),
                "Something went wrong with test2");
    }

}
