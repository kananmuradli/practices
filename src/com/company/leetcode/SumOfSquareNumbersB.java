package com.company.leetcode;

public class SumOfSquareNumbersB {

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

    public static boolean judgeSquareSum(int c){
        for (int a = 0; a <= c; a++){
            for (int b = 0; b <= c; b++){
                if (a * a + b * b ==c){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(1));
        System.out.println(judgeSquareSum(0));
        System.out.println(judgeSquareSum(9));
        System.out.println(judgeSquareSum(11));
    }
}
