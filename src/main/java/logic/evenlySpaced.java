package logic;

//Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced,
//so the difference between small and medium is the same as the difference between medium and large.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class evenlySpaced {

    public boolean evenlySpaced(int a, int b, int c) {
        if (a == b && b == c) return true;
        if (a == b || a == c || b == c) return false;
        return ((Math.abs(a - b) == Math.abs(b - c)) || (Math.abs(a - c) == Math.abs(a - b)) || (Math.abs(a - c) == Math.abs(b - c)));
    }

    @Test
    public void test() {
        int a = 3, b = 9, c = 15;
        boolean expected = true;
        assertTrue(evenlySpaced(a, b, c) == expected,
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(evenlySpaced(a, b, c)));
        System.out.println(String.valueOf(evenlySpaced(a, b, c)));
    }
}