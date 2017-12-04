package recursion2;

import org.junit.Test;

public class groupNoAdj {
    public boolean groupNoAdj(int start, int[] nums, int target) {
        // Base case: if there are no numbers left, then there is a
        // solution only if target is 0.
        if (start >= nums.length) return (target == 0);

        // Key idea: nums[start] is chosen or it is not.
        // Deal with nums[start], letting recursion
        // deal with all the rest of the array.

        // Recursive call trying the case that nums[start] is chosen --
        // subtract it from target in the call and jump one element forward.
        if (groupNoAdj(start + 2, nums, target - nums[start])) return true;

        // Recursive call trying the case that nums[start] is not chosen.
        if (groupNoAdj(start + 1, nums, target)) return true;

        // If neither of the above worked, it's not possible.
        return false;
    }
}

//Given an array of ints, is it possible to choose a group of some of the ints,
//such that the group sums to the given target with this additional constraint:
//If a value in the array is chosen to be in the group, the value immediately following it in the array must not be chosen.