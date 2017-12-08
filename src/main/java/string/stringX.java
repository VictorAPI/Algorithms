package string;

//Given a string, return a version where all the "x" have been removed.
//Except an "x" at the very start or end should not be removed.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class stringX {

    public String stringX(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++)
            if (!(i > 0 && i < str.length() - 1 && str.charAt(i) == 'x'))
                result += str.charAt(i);
        return result;
    }

    @Test
    public void test() {
        String initStr = "Coxxdxex";
        String finStr = "Codex";
        assertTrue(stringX(initStr).equals(finStr),
                "Expected: " + finStr + ", Actual: " + stringX(initStr));
        System.out.println("Success! Final string: " + stringX(initStr));
    }
}