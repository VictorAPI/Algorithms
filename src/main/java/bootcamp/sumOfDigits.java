package bootcamp;

import org.junit.Test;

public class sumOfDigits {

    public int sumOfDigits(int n) {
        if (n < 0) n *= -1;
        if (n < 10) return n;
        return sumOfDigits(n / 10) + n % 10;
    }

    @Test
    public void test() {
        System.out.println(sumOfDigits(-12345));
    }
}