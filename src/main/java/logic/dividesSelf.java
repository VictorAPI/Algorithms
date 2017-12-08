package logic;

//We'll say that a positive int divides itself if every digit in the number divides into the number evenly.
//So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly.
//We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself.
//Note: use % to get the rightmost digit, and / to discard the rightmost digit.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class dividesSelf {

    public boolean dividesSelf(int n) {
        int tmp = n;
        if (n % 10 == 0) return false;
        while (n != 0) {
            if (tmp % (n % 10) != 0) return false;
            n /= 10;
        }
        return true;
    }

    @Test
    public void test() {
        int testNum = 128;
        boolean expected = true;
        assertTrue(dividesSelf(testNum),
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(dividesSelf(testNum)));
        System.out.println(String.valueOf(dividesSelf(testNum)));
    }
}

