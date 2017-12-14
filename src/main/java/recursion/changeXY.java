package recursion;

//Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class changeXY {

    public String changeXY(String str) {
        if (str.length() == 0) return "";
        String newStr = "";
        if (str.substring(0, 1).equals("x")) newStr += "y";
        else newStr += str.substring(0, 1);
        return newStr + changeXY(str.substring(1));
    }

    @Test
    public void test() {
        String test = "jkpi xpisdfnx lksnpikjx";
        String expected = "jkpi ypisdfny lksnpikjy";
        assertTrue(changeXY(test).equals(expected),
                "Expected: " + expected + ", Actual: " + changeXY(test));
        System.out.println(changeXY(test));
    }
}
