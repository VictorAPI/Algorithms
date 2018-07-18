package array;

//Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
//Return the number of clumps in the given array.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class countClumps {

    public int countClumps(int[] nums) {

        boolean match = false;
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && !match) {
                match = true;
                count++;
            } else if (nums[i] != nums[i + 1]) {
                match = false;
            }
        }
        return count;
    }

    @Test
    public void test() {
        int[] testArray = new int[]{1, 3, 4, 4, 2, 2};
        assertTrue(countClumps(testArray) == 2,
                "Expected: " + "2" + ", Actual: " + countClumps(testArray));
        System.out.println(countClumps(testArray));
    }

    @Test
    public void test2() {
        int[] testArray = new int[]{5, 3, 2, 1, 1};
        assertTrue(countClumps(testArray) == 1,
                "Expected: " + "1" + ", Actual: " + countClumps(testArray));
        System.out.println(countClumps(testArray));
    }

    @Test
    public void test3() {
        int[] testArray = new int[]{1, 3, 2, 1};
        assertTrue(countClumps(testArray) == 0,
                "Expected: " + "0" + ", Actual: " + countClumps(testArray));
        System.out.println(countClumps(testArray));
    }
}