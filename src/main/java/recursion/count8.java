package recursion;

//Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
//except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
//Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class count8 {

    public int count8(int n) {
        int count = 0;
        if (n % 10 == 8) count = 1;
        if (n % 100 == 88) count = 2;
        if (n == 0) return 0;
        else return count + count8(n / 10);
    }

    @Test
    public void test() {
        int test = 818388856;
        int expected = 7;
        assertTrue(count8(test) == expected,
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(count8(test)));
        System.out.println(String.valueOf(count8(test)));
    }
}