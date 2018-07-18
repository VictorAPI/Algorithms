package recursion;

//Given an array of ints, compute recursively the number of times that the value 11 appears in the array.
//We'll use the convention of considering only the part of the array that begins at the given index.
//In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class array11 {

    public int array11(int[] nums, int index) {
        if (index >= nums.length) return 0;
        if (nums[index] == 11) return 1 + array11(nums, index + 1);
        else return 0 + array11(nums, index + 1);
    }

    @Test
    public void test() {
        int[] nums = {1, 2, 3, 4, 11, 5};
        int index = 3;
        int expected = 1;
        assertTrue(array11(nums, index) == expected,
                "Expected: " + expected + ", Actual: " + array11(nums, index));
        System.out.println(array11(nums, index));
    }
}