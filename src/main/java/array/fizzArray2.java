package array;

//Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1.
//N may be 0, in which case just return a length 0 array. Note: String.valueOf(xxx) will make the String form of most types.
//The syntax to make a new string array is: new String[desired_length]

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class fizzArray2 {

    public String[] fizzArray2(int n) {
        String[] newArray = new String[n];
        for (int i = 0; i < n; i++) {
            newArray[i] = "" + i;
        }
        return newArray;
    }

    @Test
    public void test() {
        int num = 0;
        String[] finalArray = {};
        assertTrue(Arrays.equals(fizzArray2(num), finalArray),
                "Expected: " + Arrays.toString(finalArray) + ", Actual: " + Arrays.toString(fizzArray2(num)));
        System.out.println(Arrays.toString(fizzArray2(num)));
    }

    @Test
    public void test2() {
        int num = 2;
        String[] finalArray = {"0", "1"};
        assertTrue(Arrays.equals(fizzArray2(num), finalArray),
                "Expected: " + Arrays.toString(finalArray) + ", Actual: " + Arrays.toString(fizzArray2(num)));
        System.out.println(Arrays.toString(fizzArray2(num)));
    }

    @Test
    public void test3() {
        int num = 3;
        String[] finalArray = {"0", "1", "2"};
        assertTrue(Arrays.equals(fizzArray2(num), finalArray),
                "Expected: " + Arrays.toString(finalArray) + ", Actual: " + Arrays.toString(fizzArray2(num)));
        System.out.println(Arrays.toString(fizzArray2(num)));
    }
}