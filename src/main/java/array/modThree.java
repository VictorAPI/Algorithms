package array;

import org.junit.Test;

public class modThree {

    public boolean modThree(int[] nums) {
        if (nums.length > 2) {
            for (int i=0; i<nums.length-2; i++) {
                if (isEven(nums[i]) && isEven(nums[i+1]) && isEven(nums[i+2]))
                    return true;
                else if (isOdd(nums[i]) && isOdd(nums[i+1]) && isOdd(nums[i+2]))
                    return true;
            }
        }
        return false;
    }

    public boolean isEven(int val) {
        return val % 2 == 1;
    }

    public boolean isOdd(int val) {
        return val % 2 == 0;
    }
}

//Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.