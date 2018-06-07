package string;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class validPalindrome_0 {

// For each index i in the given string, let's remove that character, then check if the resulting string is a palindrome.
// If it is, (or if the original string was a palindrome), then we'll return true

    public boolean isPalindrome(CharSequence s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            char c = sb.charAt(i);
            sb.deleteCharAt(i);
            if (isPalindrome(sb)) return true;
            sb.insert(i, c);
        }
        return isPalindrome(s);
    }

    @Test
    public void test1() {
        String testStr = "axvaxa";
        assertTrue(validPalindrome(testStr),
                "Expected: " + String.valueOf(true) + ", Actual: " + String.valueOf(validPalindrome(testStr)));
        System.out.println(validPalindrome(testStr));
    }
}