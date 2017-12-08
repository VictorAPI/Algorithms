package array;

//Given an array of ints, return true if every 2 that appears in the array is next to another 2.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class twoTwo {

    public boolean twoTwo(int[] nums) {

        if (nums.length > 1) {
            for (int i = 1; i < nums.length - 1; i++)
                if (nums[i] == 2 && nums[i + 1] != 2 && nums[i - 1] != 2) return false;

            if (nums[0] == 2 && nums[1] != 2) return false;
            if (nums[nums.length - 1] == 2 && nums[nums.length - 2] != 2) return false;
        }
        if (nums.length == 1 && nums[0] == 2) return false;
        return true;
    }

    @Test
    public void test() {
        int[] testNum = {0, 0, 0, 10, 2, 2, 0, 1, 7, 0, 2, 0};
        boolean expected = false;
        assertTrue(twoTwo(testNum) == false,
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(twoTwo(testNum)));
        System.out.println(String.valueOf(twoTwo(testNum)));
    }

    @Test
    public void test1() {
        int[] testNum = {0, 0, 0, 10, 2, 2, 0, 1, 7, 2, 2, 0};
        boolean expected = false;
        assertTrue(twoTwo(testNum) == true,
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(twoTwo(testNum)));
        System.out.println(String.valueOf(twoTwo(testNum)));
    }
}