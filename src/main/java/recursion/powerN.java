package recursion;

//Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power,
//so powerN(3, 2) is 9 (3 squared).

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class powerN {

    public int powerN(int base, int n) {
        return (n ==0 ) ? 1 : base * powerN(base, n - 1);
//        if (n == 0) return 1;
//        else return base * powerN(base, n - 1);
    }

    @Test
    public void test() {
        int base = 2;
        int n = 2;
        int expected = 4;
        assertTrue(powerN(base, n) == expected,
                "Expected: " + expected + ", Actual: " + powerN(base, n));
        System.out.println(powerN(base, n));
    }
}