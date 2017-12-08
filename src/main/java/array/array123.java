package array;

//Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

import org.junit.Test;

public class array123 {

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++)
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) return true;
        return false;
    }

    @Test
    public void test() {
        int[] numbers = new int[]{2, 2, 9, 1, 2, 3, 5};
        System.out.println(array123(numbers));
    }

    @Test
    public void test2() {
        int[] numbers = new int[]{3, 1, 2, 5};
        System.out.println(array123(numbers));
    }
}