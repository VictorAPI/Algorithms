package array;

//Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array.
//The original array will contain at least "count" even numbers.

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class copyEvens {

    public int[] copyEvens(int[] nums, int count) {

        int[] newArray = new int[count];
        int index = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] % 2 == 0 && index < count) {
                newArray[index] = nums[i];
                index++;
            }
        return newArray;

    }

    @Test
    public void test() {
        int num = 5;
        int[] testArray = {1, 3, 10, 0, 1, 7, 0, 1, 0, 2};
        int[] expected = {10, 0, 0, 0, 2};
        assertTrue(Arrays.equals(copyEvens(testArray, num), expected),
                "Expected: " + Arrays.toString(expected) + ", Actual: " + Arrays.toString(copyEvens(testArray, num)));
        System.out.println(Arrays.toString(copyEvens(testArray, num)));
    }
}