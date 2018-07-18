package array;

// Given array of integers. Return an array of n highest integers.

import org.junit.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class nHighestNums {

    public int[] highNum(int[] intArray, int n) {

        int temp = Integer.MAX_VALUE;
        int[] output = new int[n];

        for (int i=0; i < n; i++) {
            int maxSoFar = Integer.MIN_VALUE;
            for (int j = 0; j<intArray.length; j++) {
                if (intArray[j] > maxSoFar && intArray[j] < temp) {
                    maxSoFar = intArray[j];
                }
            }
            output[i] = maxSoFar;
            temp = maxSoFar;
        }
        return output;
    }


    @Test
    public void test() {
        int check = 6;
        int[] intArray = {1,15, 3, 11, 5, 6, 22, 9, 0, -1, -27};
        int[] output = {22, 15, 11, 9, 6, 5};

        assertTrue(Arrays.equals(highNum(intArray, check), output),
                "Expected: " + Arrays.toString(output)+ ", Actual: " + Arrays.toString(highNum(intArray, check)));
        System.out.println(Arrays.toString(highNum(intArray, check)));
    }
}