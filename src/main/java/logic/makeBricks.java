package logic;

//We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each).
//Return true if it is possible to make the goal by choosing from the given bricks.
//This is a little harder than it looks and can be done without any loops.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class makeBricks {

    public boolean makeBricks(int small, int big, int goal) {
        if (goal > big * 5 + small) return false;
        if (goal % 5 > small) return false;
        return true;
    }

    @Test
    public void test() {
        int a = 3, b = 13, c = 12;
        boolean expected = true;
        assertTrue(makeBricks(a, b, c) == expected,
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(makeBricks(a, b, c)));
        System.out.println(String.valueOf(makeBricks(a, b, c)));
    }
}