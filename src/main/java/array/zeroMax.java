package array;

//Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right
//of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class zeroMax {

    public int[] zeroMax(int[] nums) {

        int maxSoFar = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 != 0 && nums[j] > maxSoFar) {
                        maxSoFar = nums[j];
                    }
                }
                nums[i] = maxSoFar;
                maxSoFar = 0;
            }
        }
        return nums;
    }

    @Test
    public void test() {
        int[] testNum = {1, 3, 10, 0, 1, 7, 0, 1, 0, 2};
        int[] expected = {1, 3, 10, 7, 1, 7, 1, 1, 0, 2};
        assertTrue(Arrays.equals(zeroMax(testNum), expected),
                "Expected: " + Arrays.toString(expected) + ", Actual: " + Arrays.toString(zeroMax(testNum)));
        System.out.println(Arrays.toString(zeroMax(testNum)));
    }
}