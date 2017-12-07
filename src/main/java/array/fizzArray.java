package array;

//Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
//The given n may be 0, in which case just return a length 0 array.
//You do not need a separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case,
//so it just works. The syntax to make a new int array is: new int[desired_length]

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class fizzArray {

    public int[] fizzArray(int n) {
        int[] arrayOfNums = new int[n];
        for (int i = 0; i < n; i++) {
            arrayOfNums[i] = i;
        }
        return arrayOfNums;
    }

    @Test
    public void test() {
        int num = 0;
        int[] finalArray = new int[]{};
        assertTrue(Arrays.equals(fizzArray(num), finalArray),
                "Expected: " + Arrays.toString(finalArray) + ", Actual: " + Arrays.toString(fizzArray(num)));
        System.out.println(Arrays.toString(fizzArray(num)));
    }

    @Test
    public void test2() {
        int num = 3;
        int[] finalArray = new int[]{0, 1, 2};
        assertTrue(Arrays.equals(fizzArray(num), finalArray),
                "Expected: " + Arrays.toString(finalArray) + ", Actual: " + Arrays.toString(fizzArray(num)));
        System.out.println(Arrays.toString(fizzArray(num)));
    }

    @Test
    public void test3() {
        int num = 5;
        int[] finalArray = new int[]{0, 1, 2, 3, 4};
        assertTrue(Arrays.equals(fizzArray(num), finalArray),
                "Expected: " + Arrays.toString(finalArray) + ", Actual: " + Arrays.toString(fizzArray(num)));
        System.out.println(Arrays.toString(fizzArray(num)));
    }
}