package com.company.leetcode;

public class DivideTwoIntegers {

    public static void main(String[] args) {
        System.out.println(divideWithWhileLoop(7, -2));
        System.out.println(divideWithForLoop(7, -2));
    }

    public static int divideWithWhileLoop(int dividend, int divisor) {
        int sign = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0) ? -1 : 1;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int result = 0;
        while ((dividend - divisor) >= 0) {
            result++;
            dividend = dividend - divisor;
        }
        return sign < 0 ? -result : result;
    }

    public static int divideWithForLoop(int dividend1, int divisor1) {
        int sign1 = (dividend1 < 0 && divisor1 > 0) || (dividend1 > 0 && divisor1 < 0) ? -1 : 1;
        dividend1 = Math.abs(dividend1);
        divisor1 = Math.abs(divisor1);

        int result1 = 0;
        for (int i = 0; (dividend1 - divisor1) >= 0; i++) {
            result1++;
            dividend1 = dividend1 - divisor1;
        }
        return sign1 < 0 ? -result1 : result1;
    }
}

