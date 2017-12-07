package array;

//Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end,
//so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the start number.
//Note that a length-0 array is valid.

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class fizzArray3 {

    public int[] fizzArray3(int start, int end) {
        int[] newArray = new int[end - start];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = start + i;
        }
        return newArray;
    }

    @Test
    public void test() {
        int start = 2;
        int end = 4;
        int[] finalArray = {2, 3};
        assertTrue(Arrays.equals(fizzArray3(start, end), finalArray),
                "Expected: " + Arrays.toString(finalArray) + ", Actual: " + Arrays.toString(fizzArray3(start, end)));
        System.out.println(Arrays.toString(fizzArray3(start, end)));
    }

    @Test
    public void test2() {
        int start = 2;
        int end = 2;
        int[] finalArray = {};
        assertTrue(Arrays.equals(fizzArray3(start, end), finalArray),
                "Expected: " + Arrays.toString(finalArray) + ", Actual: " + Arrays.toString(fizzArray3(start, end)));
        System.out.println(Arrays.toString(fizzArray3(start, end)));
    }

}