package ap;

import org.junit.Test;

public class copyEvens {
    public int[] copyEvens(int[] nums, int count) {

        int[] newArray = new int[count];
        int index = 0;
        for (int i=0; i<nums.length; i++)
            if (nums[i]%2 == 0 && index < count) {
                newArray[index] = nums[i];
                index++;
            }
        return newArray;

    }

}

//Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array.
//The original array will contain at least "count" even numbers.