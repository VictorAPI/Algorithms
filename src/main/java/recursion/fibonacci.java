package recursion;

//The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition.
//The first two values in the sequence are 0 and 1 (essentially 2 base cases).
//Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
//Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class fibonacci {

    public int fibonacci(int n) {
        return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
//        if (n < 2) return n;
//        else return fibonacci(n-1) + fibonacci(n-2);
    }

    @Test
    public void test() {
        int test = 8;
        int expected = 21;
        assertTrue(fibonacci(test) == expected,
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(fibonacci(test)));
        System.out.println(String.valueOf(fibonacci(test)));
    }
}