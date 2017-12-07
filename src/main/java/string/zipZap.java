package string;

//Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
//Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class zipZap {

    public String zipZap(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && i < str.length() - 1 && str.charAt(i - 1) == 'z' && str.charAt(i + 1) == 'p') {
                continue;
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }

    @Test
    public void test() {
        String str1 = "zipXzap";
        assertTrue(zipZap(str1).equals("zpXzp"),
                "Expected: " + "zpXzp" + ", Actual: " + zipZap(str1));
        System.out.println(zipZap(str1));
    }

    @Test
    public void test2() {
        String str1 = "zipasldknlXzp";
        assertTrue(zipZap(str1).equals("zpasldknlXzp"),
                "Expected: " + "zpasldknlXz" + ", Actual: " + zipZap(str1));
        System.out.println(zipZap(str1));
    }
}