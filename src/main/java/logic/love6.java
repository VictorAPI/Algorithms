package logic;

//The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
//Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class love6 {

    public boolean love6(int a, int b) {
        int sum = a + b;
        int dif = a - b;
        return (a == 6 || b == 6 || sum == 6 || Math.abs(dif) == 6);
    }

    @Test
    public void test() {
        int a = 3, b = 9;
        boolean expected = true;
        assertTrue(love6(a, b) == expected,
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(love6(a, b)));
        System.out.println(String.valueOf(love6(a, b)));
    }
}