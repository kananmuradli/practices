package com.company.leetcode;

public class SumOfSquareNumbers {

    /**
     * Given a non-negative integer c, decide whether there are two integers a and b such that
     *
     * a^2 + b^2 = c.
     *
     * Example 1:
     *
     * Input: c = 5
     *
     * Output: true
     *
     * Explanation: 1 * 1 + 2 * 2 = 5
     *
     */

    public static boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(11));
    }
}
