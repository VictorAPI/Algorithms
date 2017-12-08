package array;

//For each multiple of 10 in the given array, change all the values following it to be that multiple of 10,
//until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class tenRun {

    public int[] tenRun(int[] nums) {

        boolean ten = false;
        int tmp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                tmp = nums[i];
                ten = true;
            } else if (nums[i] % 10 != 0 && ten) {
                nums[i] = tmp;
            }
        }
        return nums;
    }

    @Test
    public void test() {
        int[] testNum = {0, 0, 0, 10, 2, 1, 20, 1, 7, 10, 2, 1};
        int[] expected = {0, 0, 0, 10, 10, 10, 20, 20, 20, 10, 10, 10};
        assertTrue(Arrays.equals(tenRun(testNum), expected),
                "Expected: " + Arrays.toString(expected) + ", Actual: " + Arrays.toString(tenRun(testNum)));
        System.out.println(Arrays.toString(tenRun(testNum)));
    }
}