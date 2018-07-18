package logic;

//Given a positive int n, return true if it contains a 1 digit.
//Note: use % to get the rightmost digit, and / to discard the rightmost digit.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class hasOne {

    public boolean hasOne(int n) {
        int length = String.valueOf(n).length();
        for (int i = 1; i <= length; i++) {
            if (n % 10 == 1) return true;
            n = n / 10;
        }
        return false;
    }

    @Test
    public void test() {
        int testNum = 128;
        boolean expected = true;
        assertTrue(hasOne(testNum),
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(hasOne(testNum)));
        System.out.println(String.valueOf(hasOne(testNum)));
    }
}