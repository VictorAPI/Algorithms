package array;

//We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array,
//return the sum of the changes for a walk beginning at the start index and ending at the end index.
//For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 = 6.
//The start end end index will both be valid indexes into the array with start <= end.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class sumHeights {
    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++)
            sum += Math.abs(heights[i] - heights[i + 1]);
        return sum;
    }

    @Test
    public void test() {
        int[] testArray = {1, 2, 5, 3, 6, 7, 2};
        int start = 2;
        int end = 5;
        int expected = 6;
        assertTrue(sumHeights(testArray, start, end) == expected,
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(sumHeights(testArray, start, end)));
        System.out.println(String.valueOf(sumHeights(testArray, start, end)));
    }
}