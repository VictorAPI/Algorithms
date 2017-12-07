package array;

//Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
//except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value,
//ignore just one copy, and likewise for the largest value. Use int division to produce the final average.
//You may assume that the array is length 3 or more.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class centeredAverage {

    public int centeredAverage(int[] nums) {
        int minSoFar = nums[0];
        int minIndex = 0;
        int maxSoFar = nums[0];
        int maxIndex = 0;
        int sum = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minSoFar) {
                minSoFar = nums[i];
                minIndex = i;
            } else if (nums[i] > maxSoFar) {
                maxSoFar = nums[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != minIndex && i != maxIndex)
                sum += nums[i];
        }
        return sum / (nums.length - 2);
    }

    @Test
    public void test() {
        int[] testArray = new int[]{1, 3, 4, 4};
        assertTrue(centeredAverage(testArray) == 3,
                "Expected: " + "3" + ", Actual: " + centeredAverage(testArray));
        System.out.println(centeredAverage(testArray));
    }

    @Test
    public void test2() {
        int[] testArray = new int[]{5, 3, 2, 1, 1};
        assertTrue(centeredAverage(testArray) == 2,
                "Expected: " + "2" + ", Actual: " + centeredAverage(testArray));
        System.out.println(centeredAverage(testArray));
    }

    @Test
    public void test3() {
        int[] testArray = new int[]{1, 3, 2, 1};
        assertTrue(centeredAverage(testArray) == 1,
                "Expected: " + "1" + ", Actual: " + centeredAverage(testArray));
        System.out.println(centeredAverage(testArray));
    }
}