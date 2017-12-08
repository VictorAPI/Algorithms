package array;

//Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped
//at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}.
//You may modify and return the given array or make a new array.

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class zeroFront {

    public int[] zeroFront(int[] nums) {
        int[] newArray = new int[nums.length];
        int frontCount = 0;
        int backCount = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                newArray[frontCount] = nums[i];
                frontCount++;
            } else {
                newArray[backCount] = nums[i];
                backCount--;
            }
        }
        return newArray;
    }

    @Test
    public void test() {
        int[] testNum = {0, 0, 0, 10, 2, 1, 0, 1, 7, 0, 2, 0};
        int[] expected = {0, 0, 0, 0, 0, 0, 2, 7, 1, 1, 2, 10};
        assertTrue(Arrays.equals(zeroFront(testNum), expected),
                "Expected: " + Arrays.toString(expected) + ", Actual: " + Arrays.toString(zeroFront(testNum)));
        System.out.println(Arrays.toString(zeroFront(testNum)));
    }
}