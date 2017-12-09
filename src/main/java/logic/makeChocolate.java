package logic;

//We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
//Return the number of small bars to use, assuming we always use big bars before small bars.
//Return -1 if it can't be done.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class makeChocolate {

    public int makeChocolate(int small, int big, int goal) {
        int needBig = goal / 5;
        if (needBig > big) needBig = big;
        int result = goal - needBig * 5;
        if (goal > big * 5 + small) result = -1;
        if (goal % 5 > small) result = -1;
        return result;
    }

    @Test
    public void test() {
        int a = 3, b = 13, c = 12;
        int expected = 2;
        assertTrue(makeChocolate(a, b, c) == expected,
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(makeChocolate(a, b, c)));
        System.out.println(String.valueOf(makeChocolate(a, b, c)));
    }
}