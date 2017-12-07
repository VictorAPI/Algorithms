package warmup;

//Given a string, return the count of the number of times that a substring length 2 appears in the string
//and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class last2 {

    public int last2(String str) {
        if (str.length() < 2) return 0;
        int count = 0;
        String end = str.substring(str.length() - 2);

        for (int i = 0; i < str.length() - 2; i++)
            if (str.substring(i, i + 2).equals(end)) count++;
        return count;
    }

    @Test
    public void test() {
        String str = "X";
        assertTrue((last2(str) == 0), "Expected: " + "0, " + "Actual: " + last2(str));
        System.out.println(last2(str));
    }

    @Test
    public void test2() {
        String str = "XXX";
        assertTrue((last2(str) == 1), "Expected: " + "1, " + "Actual: " + last2(str));
        System.out.println(last2(str));
    }
}