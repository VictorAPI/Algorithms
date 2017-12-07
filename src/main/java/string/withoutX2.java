package string;

//Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
//and otherwise return the string unchanged. This is a little harder than it looks.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class withoutX2 {

    public String withoutX2(String str) {
        String result = "";
        if (str.length() > 1) {
            for (int i = 0; i < 2; i++) {
                if (!(str.charAt(i) == 'x'))
                    result += str.charAt(i);
            }
            for (int i = 2; i < str.length(); i++) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    @Test
    public void test() {
        String str1 = "xzabcx";
        assertTrue(withoutX2(str1).equals("zabcx"),
                "Expected: " + "zabcx" + ", Actual: " + withoutX2(str1));
        System.out.println(withoutX2(str1));
    }

    @Test
    public void test2() {
        String str1 = "xxabBxx";
        assertTrue(withoutX2(str1).equals("abBxx"),
                "Expected: " + "abBxx" + ", Actual: " + withoutX2(str1));
        System.out.println(withoutX2(str1));
    }
}