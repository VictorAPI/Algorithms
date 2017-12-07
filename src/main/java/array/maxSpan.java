package array;

//Consider the leftmost and righmost appearances of some value in an array.
//We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1.
//Returns the largest span found in the given array.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class maxSpan {

    public int maxSpan(int[] nums) {

        int maxSoFar = 0;

        for (int i = 0; i < nums.length; i++)
            for (int j = nums.length - 1; j >= i; j--)
                if (nums[i] == nums[j] && maxSoFar < (j - i + 1)) maxSoFar = (j - i + 1);
        return maxSoFar;
    }

    @Test
    public void test() {
        int[] testArray = {1, 2, 3, 8, 9, 3, 2, 0};
        int expected = 6;
        assertTrue(maxSpan(testArray) == expected,
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(maxSpan(testArray)));
        System.out.println(String.valueOf(maxSpan(testArray)));
    }
}
