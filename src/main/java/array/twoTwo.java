package array;

import org.junit.Test;

public class twoTwo {

    public boolean twoTwo(int[] nums) {

        if (nums.length > 1) {
            for (int i=1; i<nums.length-1; i++)
                if (nums[i] == 2 && nums[i+1] != 2 && nums[i-1] != 2) return false;

            if (nums[0] == 2 && nums[1] != 2) return false;
            if (nums[nums.length-1] == 2 && nums[nums.length-2] != 2) return false;
        }
        if (nums.length == 1 && nums[0] == 2) return false;
        return true;
    }

}

//Given an array of ints, return true if every 2 that appears in the array is next to another 2.