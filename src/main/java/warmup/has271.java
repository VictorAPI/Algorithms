package warmup;

//Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5,
//followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

import org.junit.Test;

public class has271 {

    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 5 && nums[i + 2] >= nums[i] - 3 && nums[i + 2] <= nums[i] + 1) return true;
        }
        return false;
    }

    @Test
    public void test() {
        int[] numbers = new int[]{2, 7, 1, 3, 0, 5};
        System.out.println(has271(numbers));
    }

    @Test
    public void test2() {
        int[] numbers = new int[]{3, 1, 2, 5, 4, 9, 3};
        System.out.println(has271(numbers));
    }

    @Test
    public void test3() {
        int[] numbers = new int[]{3, 1, 2, 5, 4, 9, 5};
        System.out.println(has271(numbers));
    }
}