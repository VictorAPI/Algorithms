package array;

import org.junit.Test;

public class zeroMax {

    public int[] zeroMax(int[] nums) {

        int maxSoFar = 0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0) {
                for (int j=i+1; j<nums.length; j++) {
                    if (nums[j] %2 != 0 && nums[j] > maxSoFar) {
                        maxSoFar = nums[j];
                    }
                }
                nums[i] = maxSoFar;
                maxSoFar = 0;
            }
        }
        return nums;
    }

}

//Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right
//of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.