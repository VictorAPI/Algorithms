package recursion;

//Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class countHi {

    public int countHi(String str) {
        if (str.length()<2) return 0;
        int count = 0;
        if (str.substring(0,2).equals("hi")) count = 1;
        return count + countHi(str.substring(1));
    }

    @Test
    public void test() {
        String test = "kjbhi hi kkjbkjbhikjbkjbk  hihi";
        int expected = 5;
        assertTrue(countHi(test) == expected,
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(countHi(test)));
        System.out.println(String.valueOf(countHi(test)));
    }
}