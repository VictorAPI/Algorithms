package recursion;

//Given a string, compute recursively the number of times lowercase "hi" appears in the string,
//however do not count "hi" that have an 'x' immediately before them.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class countHi2 {

    public int countHi2(String str) {
        if (str.length() < 2) return 0;
        if (str.length() > 2 && str.charAt(0) == 'x' && str.substring(1, 3).equals("hi"))
            return 0 + countHi2(str.substring(3));
        else if (str.substring(0, 2).equals("hi"))
            return 1 + countHi2(str.substring(2));
        else return 0 + countHi2(str.substring(1));
    }

    @Test
    public void test() {
        String test = "kjbhi hi kkjbkjbxhikjbkjbk  hixhi";
        int expected = 3;
        assertTrue(countHi2(test) == expected,
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(countHi2(test)));
        System.out.println(String.valueOf(countHi2(test)));
    }
}