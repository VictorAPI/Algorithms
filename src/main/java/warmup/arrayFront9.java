package warmup;

//Given an array of ints, return true if one of the first 4 elements in the array equals 9.
//The array length may be less than 4.

import org.junit.Test;

public class arrayFront9 {

    public boolean arrayFront9(int[] nums) {
        int len = nums.length;
        if (len > 4) len = 4;
        for (int i = 0; i < len; i++)
            if (nums[i] == 9) return true;
        return false;
    }

    @Test
    public void test() {
        int[] numbers = new int[]{2, 2, 9, 3, 0, 5};
        System.out.println(arrayFront9(numbers));
    }

    @Test
    public void test2() {
        int[] numbers = new int[]{3, 1, 2, 5};
        System.out.println(arrayFront9(numbers));
    }
}