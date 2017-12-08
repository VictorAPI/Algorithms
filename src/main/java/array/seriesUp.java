package array;

//Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping).
//Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class seriesUp {

    public int[] seriesUp(int n) {

        int[] array = new int[n * (n + 1) / 2];
        int i = 0;

        for (int j = 1; j <= n; j++)
            for (int k = 1; k <= j; k++)
                array[i++] = k;
        return array;
    }

    @Test
    public void test() {
        int testNum = 3;
        int[] expected = {1, 1, 2, 1, 2, 3};
        assertTrue(Arrays.equals(seriesUp(testNum), expected),
                "Expected: " + Arrays.toString(expected) + ", Actual: " + Arrays.toString(seriesUp(testNum)));
        System.out.println(Arrays.toString(seriesUp(testNum)));
    }
}