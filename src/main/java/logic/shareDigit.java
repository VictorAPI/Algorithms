package logic;

//Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23.
//(Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class shareDigit {
    public boolean shareDigit(int a, int b) {
        int leftA = a / 10;
        int leftB = b / 10;
        int rightA = a % 10;
        int rightB = b % 10;
        return (leftA == leftB || leftA == rightB || rightA == leftB || rightA == rightB);
    }

    @Test
    public void test() {
        int a = 39, b = 13;
        boolean expected = true;
        assertTrue(shareDigit(a, b) == expected,
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(shareDigit(a, b)));
        System.out.println(String.valueOf(shareDigit(a, b)));
    }
}