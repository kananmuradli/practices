package com.company.leetcode;

public class DivideTwoIntegers {

    public static void main(String[] args) {
        System.out.println(divideWithWhileLoop(7, -2));
        System.out.println(divideWithWhileLoop(-7, 2));
        System.out.println(divideWithWhileLoop(7, 2));
        System.out.println(divideWithWhileLoop(-7, -2));
        System.out.println(divideWithWhileLoop(7, 1));
        System.out.println(divideWithWhileLoop(7, -1));

        System.out.println();

        System.out.println(divideWithForLoop(7, -2));
        System.out.println(divideWithForLoop(-7, 2));
        System.out.println(divideWithForLoop(7, 2));
        System.out.println(divideWithForLoop(-7, -2));
        System.out.println(divideWithForLoop(7, 1));
        System.out.println(divideWithForLoop(7, -1));
    }

    public static int divideWithWhileLoop(int dividend, int divisor) {
        Integer maxValue = getControl(dividend, divisor);
        if (maxValue != null) return maxValue;

        int sign = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0) ? -1 : 1;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        if (dividend == divisor) return -1;

        int result = 0;
        while ((dividend - divisor) >= 0) {
            result++;
            dividend = dividend - divisor;
        }
        return sign < 0 ? -result : result;
    }

    public static int divideWithForLoop(int dividend, int divisor) {
        Integer maxValue = getControl(dividend, divisor);
        if (maxValue != null) return maxValue;

        int sign1 = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0) ? -1 : 1;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        if (dividend == divisor) return -1;

        int result1 = 0;
        for (int i = 0; (dividend - divisor) >= 0; i++) {
            result1++;
            dividend = dividend - divisor;
        }
        return sign1 < 0 ? -result1 : result1;
    }

    private static Integer getControl(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;
        if (dividend == divisor) return 1;
        if (divisor == 1) return dividend;
        if (divisor == -1) return -dividend;
        return null;
    }
}

