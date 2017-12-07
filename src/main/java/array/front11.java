package array;

//Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
//If either array is length 0, ignore that array.

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class front11 {

    public int[] front11(int[] a, int[] b) {
        int[] result = new int[0];
        int[] result1 = new int[1];
        if (a.length != 0 && b.length != 0) {
            int[] result2 = new int[2];
            result2[0] = a[0];
            result2[1] = b[0];
            return result2;
        } else if (a.length == 0 && b.length != 0) {
            result1[0] = b[0];
            return result1;
        } else if (b.length == 0 && a.length != 0) {
            result1[0] = a[0];
            return result1;
        }
        return result;
    }

    @Test
    public void test() {
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {3, 5, 2, 3};
        int[] finalArray = {1, 3};
        assertTrue(Arrays.equals(front11(firstArray, secondArray), finalArray),
                "Expected: " + Arrays.toString(finalArray) + ", Actual: " + Arrays.toString(front11(firstArray, secondArray)));
        System.out.println(Arrays.toString(front11(firstArray, secondArray)));
    }

    @Test
    public void test1() {
        int[] firstArray = {};
        int[] secondArray = {3, 5, 2, 3};
        int[] finalArray = {3};
        assertTrue(Arrays.equals(front11(firstArray, secondArray), finalArray),
                "Expected: " + Arrays.toString(finalArray) + ", Actual: " + Arrays.toString(front11(firstArray, secondArray)));
        System.out.println(Arrays.toString(front11(firstArray, secondArray)));
    }

    @Test
    public void test2() {
        int[] firstArray = {};
        int[] secondArray = {};
        int[] finalArray = {};
        assertTrue(Arrays.equals(front11(firstArray, secondArray), finalArray),
                "Expected: " + Arrays.toString(finalArray) + ", Actual: " + Arrays.toString(front11(firstArray, secondArray)));
        System.out.println(Arrays.toString(front11(firstArray, secondArray)));
    }
}