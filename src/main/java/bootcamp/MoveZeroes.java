package bootcamp;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoveZeroes {

    public int[] moveZeroesToEnd(int[] nums) {

        int nonzeropointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonzeropointer] = nums[i];
                nonzeropointer++;
            }
        }
        for (; nonzeropointer < nums.length; nonzeropointer++) {
            nums[nonzeropointer] = 0;
        }
        return nums;
    }

    @Test
    public void testMoveZeroes() {

        int[] nums = {0, 1, 0, 3, 12};
        int[] expectedNums = {1, 3, 12, 0, 0};
        //moveZeroesToEnd(nums);
        assertTrue(Arrays.equals(moveZeroesToEnd(nums), expectedNums),
                "Expected: " + Arrays.toString(expectedNums) + ", Actual: " + Arrays.toString(moveZeroesToEnd(nums)));

        System.out.println(Arrays.toString(moveZeroesToEnd(nums)));
    }
}