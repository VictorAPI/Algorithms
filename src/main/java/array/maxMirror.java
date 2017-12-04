package array;

import org.junit.Test;

public class maxMirror {

    public int maxMirror(int[] nums) {

        int count = 0;
        int max = 0;

        for (int i=0; i<nums.length; i++) {
            for (int j = nums.length-1; j>=0 && i+count < nums.length; j--) {
                if (nums[i+count] == nums[j]) {
                    count++;
                } else {
                    max = Math.max(count,max);
                    count = 0;
                }
            }

            max = Math.max(count,max);
        }
        return max;
    }
}

//We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array,
//the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1}
//is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.