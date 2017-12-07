package array;

//Given an array of ints, return true if the array contains two 7's next to each other,
//or there are two 7's separated by one element, such as with {7, 1, 7}.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class has77 {

    public boolean has77(int[] nums) {
        if (nums.length > 2) {
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i] == 7 && nums[i + 2] == 7) return true;
            }
        }
        if (nums.length > 1) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 7 && nums[i + 1] == 7) return true;
            }
        }
        return false;
    }

    @Test
    public void test() {
        int[] firstArray = {1, 2, 3};
        assertTrue(has77(firstArray) == false,
                "Expected: " + "false" + ", Actual: " + has77(firstArray));
        System.out.println(has77(firstArray));
    }

    @Test
    public void test1() {
        int[] firstArray = {1, 7, 3, 7};
        assertTrue(has77(firstArray) == true,
                "Expected: " + "true" + ", Actual: " + has77(firstArray));
        System.out.println(has77(firstArray));
    }

    @Test
    public void test2() {
        int[] firstArray = {1, 7, 7, 0};
        assertTrue(has77(firstArray) == true,
                "Expected: " + "true" + ", Actual: " + has77(firstArray));
        System.out.println(has77(firstArray));
    }
}