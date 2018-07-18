package array;

//Return an array that contains exactly the same numbers as the given array,
//but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's,
//but every other number may move. The array contains the same number of 4's and 5's,
//and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class fix45 {

    public int[] fix45(int[] nums) {

        int temp = 0;
        int pos5 = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 5 && i == 0 || nums[i] == 5 && nums[i - 1] != 4) {
                pos5 = i;
                for (int j = 0; j < nums.length; j++)
                    if (nums[j] == 4 && nums[j + 1] != 5) {
                        temp = nums[j + 1];
                        nums[j + 1] = 5; //every 4 has a number after it that is not a 4.
                        nums[pos5] = temp;
                        break;
                    }
            }
        return nums;
    }

    @Test
    public void test() {
        int[] testArray = new int[]{1, 3, 4, 2, 2, 5};
        int[] finalArray = new int[]{1, 3, 4, 5, 2, 2};
        assertTrue(Arrays.equals(fix45(testArray), finalArray),
                "Expected: " + Arrays.toString(finalArray) + ", Actual: " + Arrays.toString(fix45(testArray)));
        System.out.println(Arrays.toString(fix45(testArray)));
    }

    @Test
    public void test2() {
        int[] testArray = new int[]{5, 3, 2, 4, 1};
        int[] finalArray = new int[]{1, 3, 2, 4, 5};
        assertTrue(Arrays.equals(fix45(testArray), finalArray),
                "Expected: " + Arrays.toString(finalArray) + ", Actual: " + Arrays.toString(fix45(testArray)));
        System.out.println(Arrays.toString(fix45(testArray)));
    }

    @Test
    public void test3() {
        int[] testArray = new int[]{1, 3, 2, 1};
        int[] finalArray = new int[]{1, 3, 2, 1};
        assertTrue(Arrays.equals(fix45(testArray), finalArray),
                "Expected: " + Arrays.toString(finalArray) + ", Actual: " + Arrays.toString(fix45(testArray)));
        System.out.println(Arrays.toString(fix45(testArray)));
    }
}