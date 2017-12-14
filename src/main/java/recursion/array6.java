package recursion;

//Given an array of ints, compute recursively if the array contains a 6.
//We'll use the convention of considering only the part of the array that begins at the given index.
//In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class array6 {

    public boolean array6(int[] nums, int index) {
        if (index >= nums.length) return false;
        if (nums[index] == 6) return true;
        else return array6(nums, index + 1);
    }

    @Test
    public void test() {
        int[] nums = {1, 2, 3, 4, 6, 5};
        int index = 3;
        boolean expected = true;
        assertTrue(array6(nums, index) == expected,
                "Expected: " + expected + ", Actual: " + array6(nums, index));
        System.out.println(array6(nums, index));
    }
}