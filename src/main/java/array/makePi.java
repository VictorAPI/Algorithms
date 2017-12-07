package array;

//Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class makePi {

    public int[] makePi() {
        int[] val = new int[]{3, 1, 4};
        return val;
    }

    @Test
    public void test() {
        int[] finalArray = {3, 1, 4};
        assertTrue(Arrays.equals(makePi(), finalArray),
                "Expected: " + Arrays.toString(finalArray) + ", Actual: " + Arrays.toString(makePi()));
        System.out.println(Arrays.toString(makePi()));
    }
}