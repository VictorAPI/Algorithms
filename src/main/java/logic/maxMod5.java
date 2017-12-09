package logic;

//Given two int values, return whichever value is larger. However if the two values have the same remainder when divided by 5,
//then the return the smaller value. However, in all cases, if the two values are the same, return 0.
//Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class maxMod5 {

    public int maxMod5(int a, int b) {
        int result = 0;
        int smaller, bigger;
        if (a != b) {
            if (a < b) {
                smaller = a;
                bigger = b;
            } else {
                smaller = b;
                bigger = a;
            }
            result = (a % 5 == b % 5) ? smaller : bigger;
        }
        return result;
    }

    @Test
    public void test() {
        int a = 3, b = 13;
        int expected = 3;
        assertTrue(maxMod5(a, b) == expected,
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(maxMod5(a, b)));
        System.out.println(String.valueOf(maxMod5(a, b)));
    }
}