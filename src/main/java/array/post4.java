package array;

import org.junit.Test;

public class post4 {

    public int[] post4(int[] nums) {
        int startIndex = 0;

        for (int i=nums.length-1; i>=0; i--)
            if (nums[i] == 4) {
                startIndex = i+1;
                break;
            }

        int len = nums.length - startIndex;
        int[] newArray = new int[len];

        for (int j=0; j<len; j++)
            newArray[j] = nums[nums.length-len+j];

        return newArray;
    }

}

//Given a non-empty array of ints, return a new array containing the elements from the original array that come
//after the last 4 in the original array. The original array will contain at least one 4.
//Note that it is valid in java to create an array of length 0.