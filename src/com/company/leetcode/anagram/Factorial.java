package com.company.leetcode.anagram;

/* Write Java code for finding factorial of number -> input 3 -> 6 */

public class Factorial {

    public static void main(String[] args) {
        System.out.println(findFactorialWithIteration(5));
        System.out.println(findFactorialWithRecursion(5));
    }

    public static int findFactorialWithIteration(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        int pow = 1;
        for (int i = 1; i <= number; i++) {
            pow = pow * i;
        }
        return pow;
    }

    public static int findFactorialWithRecursion(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * findFactorialWithIteration(number-1);
    }
}
