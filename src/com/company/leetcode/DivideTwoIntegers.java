package com.company.leetcode;

public class DivideTwoIntegers {

    public static void main(String[] args) {
        System.out.println(divideWithWhileLoop(23, 3));
        System.out.println(divideWithForLoop(23, 3));
    }

    public static int divideWithWhileLoop(int dividend, int divisor) {
        int result = 0;
        while ((dividend - divisor) >= 0) {
            result++;
            dividend = dividend - divisor;
        }
        return result;
    }

    public static int divideWithForLoop(int dividend1, int divisor1) {
        int result1 = 0;
        for (int i = 0; (dividend1 - divisor1) >= 0; i++) {
            result1++;
            dividend1 = dividend1 - divisor1;
        }
        return result1;
    }
}

