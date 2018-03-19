package recursion;

import java.util.*;

class Main {

    public static void main(String[] args) {

        // true cases
        System.out.println(isFibonacci(0) ? "success" : "fail");
        System.out.println(isFibonacci(1) ? "success" : "fail");
        System.out.println(isFibonacci(2) ? "success" : "fail");
        System.out.println(isFibonacci(3) ? "success" : "fail");
        System.out.println(isFibonacci(5) ? "success" : "fail");
        System.out.println(isFibonacci(8) ? "success" : "fail");
        System.out.println(isFibonacci(13) ? "success" : "fail");
        System.out.println(isFibonacci(21) ? "success" : "fail");
        System.out.println(isFibonacci(34) ? "success" : "fail");
        System.out.println(isFibonacci(55) ? "success" : "fail");

        // false cases
        System.out.println(isFibonacci(4) ? "success" : "fail");
        System.out.println(isFibonacci(7) ? "success" : "fail");
        System.out.println(isFibonacci(10) ? "success" : "fail");
        System.out.println(isFibonacci(22) ? "success" : "fail");
        System.out.println(isFibonacci(33) ? "success" : "fail");
        System.out.println(isFibonacci(36) ? "success" : "fail");
    }

    private static boolean isFibonacci(int n) {
        if (n < 2) return true;
        int a = 0;
        int b = 1;
        while (b < n) {
            int temp = a;
            a = b;
            b = temp + b;
        } return (b == n);
    }
}