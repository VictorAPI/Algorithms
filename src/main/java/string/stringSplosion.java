package string;

//Given a non-empty string like "Code" return a string like "CCoCodCode".

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class stringSplosion {

    public String stringSplosion(String str) {
        String result = "";
        for (int i=0; i<=str.length(); i++)
            result += str.substring(0, i);
        return result;
    }

    @Test
    public void test() {
        String initStr = "Code";
        String finStr = "CCoCodCode";
        assertTrue(stringSplosion(initStr).equals(finStr),
                "Expected: " + finStr + ", Actual: " + stringSplosion(initStr));
        System.out.println("Success! Final string: " + stringSplosion(initStr));
    }


}