package recursion;

import org.junit.Test;

//Given an array of ints, is it possible to choose a group of some of the ints, beginning at the start index,
//such that the group sums to the given target? However, with the additional constraint that all 6's must be chosen.

import static org.junit.jupiter.api.Assertions.assertTrue;

public class groupSum6 {

    public boolean groupSum6(int start, int[] nums, int target) {
        // Base case: if there are no numbers left, then there is a
        // solution only if target is 0.
        if (start >= nums.length) return (target == 0);

        if (nums[start] == 6) target -= nums[start];

        // Key idea: nums[start] is chosen or it is not.
        // Deal with nums[start], letting recursion
        // deal with all the rest of the array.

        // Recursive call trying the case that nums[start] is chosen --
        // subtract it from target in the call.
        if (groupSum6(start + 1, nums, target - nums[start])) return true;

        // Recursive call trying the case that nums[start] is not chosen.
        if (groupSum6(start + 1, nums, target)) return true;

        // If neither of the above worked, it's not possible.
        return false;
    }

    @Test
    public void test() {
        int start = 2;
        int[] nums = {1, 2, 3, 6, 1, 5, 1};
        int target = 12;
        boolean expected = true;
        assertTrue(groupSum6(start, nums, target) == expected,
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(groupSum6(start, nums, target)));
        System.out.println(String.valueOf(groupSum6(start, nums, target)));
    }
}
