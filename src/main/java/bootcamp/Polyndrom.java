package bootcamp;

import org.junit.Test;

public class Polyndrom {

    // 1234321

    public boolean isPoly(int x) {

        int xOld = x;
        int res = 0;

        while (x > 0) {
            int remainder = x % 10;
            res = res * 10 + remainder;
            x /= 10;
        }
        return xOld == res;
    }

    @Test
    public void testPoly() {
        int x = 2147447412;
        System.out.println(isPoly(x));
    }
}
