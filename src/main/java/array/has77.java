package array;

import org.junit.Test;

public class has77 {

    public boolean has77(int[] nums) {
        if (nums.length > 2) {
            for (int i = 0; i<nums.length-2; i++) {
                if (nums[i] == 7 && nums[i+2] == 7) return true;
            }
        }
        if (nums.length > 1) {
            for (int i = 0; i<nums.length-1; i++) {
                if (nums[i] == 7 && nums[i+1] == 7) return true;
            }
        }
        return false;
    }

}

//Given an array of ints, return true if the array contains two 7's next to each other,
//or there are two 7's separated by one element, such as with {7, 1, 7}.