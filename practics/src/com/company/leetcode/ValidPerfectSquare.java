package com.company.leetcode;

public class ValidPerfectSquare {

    /**
     * Given a positive integer num,
     *
     * write a function which returns True if num is perfect square
     *
     * else returns false
     *
     * Input: x = 4
     * Output: True
     *
     * Input: x = 8
     * Output: False
     *
     */

    public static boolean mySqrt(int x){
        if (x == 0){
            return true;
        }
        if (x == 1){
            return true;
        }
        return calculateRoot(x, 1, 0);
    }

    public static boolean calculateRoot(int x, int y, int count) {
        int z = x - y;
        if (z == 0) {
            return true;
        }
        if (z < 0) {
            return false;
        }
        return calculateRoot(z, y + 2, count + 1);
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(0));
        System.out.println(mySqrt(1));
    }
}
