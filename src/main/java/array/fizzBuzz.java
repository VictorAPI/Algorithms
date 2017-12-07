package array;

//This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first problem for job interviews.
//Consider the series of numbers beginning at start and running up to but not including end,
//so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string form of these numbers,
//except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz",
//and for multiples of both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx) will make the String form of an int or other type.
//This version is a little more complicated than the usual version since you have to allocate and index into an array
//instead of just printing, and we vary the start/end instead of just always doing 1..100.

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class fizzBuzz {

    public String[] fizzBuzz(int start, int end) {
        String[] newArray = new String[end - start];
        for (int i = 0; i < newArray.length; i++) {
            if (((start + i) % 3 == 0) && ((start + i) % 5 == 0)) newArray[i] = "FizzBuzz";
            else if ((start + i) % 3 == 0) newArray[i] = "Fizz";
            else if ((start + i) % 5 == 0) newArray[i] = "Buzz";
            else newArray[i] = String.valueOf(start + i);
        }
        return newArray;
    }

    @Test
    public void test() {
        int start = 2;
        int end = 4;
        String[] finalArray = {"2", "Fizz"};
        assertTrue(Arrays.equals(fizzBuzz(start, end), finalArray),
                "Expected: " + Arrays.toString(finalArray) + ", Actual: " + Arrays.toString(fizzBuzz(start, end)));
        System.out.println(Arrays.toString(fizzBuzz(start, end)));
    }

    @Test
    public void test1() {
        int start = 3;
        int end = 16;
        String[] finalArray = {"Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
        assertTrue(Arrays.equals(fizzBuzz(start, end), finalArray),
                "Expected: " + Arrays.toString(finalArray) + ", Actual: " + Arrays.toString(fizzBuzz(start, end)));
        System.out.println(Arrays.toString(fizzBuzz(start, end)));
    }
}