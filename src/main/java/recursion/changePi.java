package recursion;

//Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14"

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class changePi {

    public String changePi(String str) {
        if (str.length() < 2) return str;
        if (str.substring(0, 2).equals("pi")) return "3.14" + changePi(str.substring(2));
        return str.substring(0, 1) + changePi(str.substring(1));
    }

    @Test
    public void test() {
        String test = "jkpi pisdfn lksnpikj";
        String expected = "jk3.14 3.14sdfn lksn3.14kj";
        assertTrue(changePi(test).equals(expected),
                "Expected: " + expected + ", Actual: " + changePi(test));
        System.out.println(changePi(test));
    }
}