package array;

//Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,  0, 2, 1,  3, 2, 1}

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class squareUp {

    public int[] squareUp(int n) {

        int[] array = new int[n * n];
        int pass = 1;

        if (n == 0) return array;

        for (int i = n - 1; i < array.length; i += n) {
            int k = i;
            for (int j = 1; j <= pass; j++) {
                array[k] = j;
                k--;
            }
            pass++;
        }
        return array;
    }

    @Test
    public void test() {
        int testNum = 4;
        int[] expected = {0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1};
        assertTrue(Arrays.equals(squareUp(testNum), expected),
                "Expected: " + Arrays.toString(expected) + ", Actual: " + Arrays.toString(squareUp(testNum)));
        System.out.println(Arrays.toString(squareUp(testNum)));
    }
}
