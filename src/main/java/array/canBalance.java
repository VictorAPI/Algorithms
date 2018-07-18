package array;

//Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side
//is equal to the sum of the numbers on the other side.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class canBalance {

    public boolean canBalance(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) sum += nums[j];
            for (int j = i; j < nums.length; j++) sum -= nums[j];
            if (sum == 0) return true;
        }
        return false;
    }

    @Test
    public void test() {
        int[] testArray = new int[]{1, 2, 2, 1};
        assertTrue(canBalance(testArray) == true,
                "Expected: " + "true" + ", Actual: " + canBalance(testArray));
        System.out.println(canBalance(testArray));
    }

    @Test
    public void test2() {
        int[] testArray = new int[]{1, 3, 2, 1, 1};
        assertTrue(canBalance(testArray) == true,
                "Expected: " + "true" + ", Actual: " + canBalance(testArray));
        System.out.println(canBalance(testArray));
    }

    @Test
    public void test3() {
        int[] testArray = new int[]{1, 3, 2, 1};
        assertTrue(canBalance(testArray) == false,
                "Expected: " + "true" + ", Actual: " + canBalance(testArray));
        System.out.println(canBalance(testArray));
    }
}