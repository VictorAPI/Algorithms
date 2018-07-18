package logic;

//Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count
//towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class luckySum {

    public int luckySum(int a, int b, int c) {
        int sum = 0;
        if (a != 13) {
            sum += a;
            if (b != 13) {
                sum += b;
                if (c != 13)
                    sum += c;
            }
        }
        return sum;
    }

    @Test
    public void test() {
        int a = 3, b = 13, c = 12;
        int expected = 3;
        assertTrue(luckySum(a, b, c) == expected,
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(luckySum(a, b, c)));
        System.out.println(String.valueOf(luckySum(a, b, c)));
    }
}