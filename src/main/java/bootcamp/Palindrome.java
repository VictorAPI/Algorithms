package bootcamp;

import org.junit.Test;

public class Palindrome {

    // 1234321

    public boolean isPali(int x) {

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
    public void testPali() {
        int x = 2147447412;
        System.out.println(isPali(x));
    }
}
