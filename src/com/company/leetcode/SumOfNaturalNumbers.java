package com.company.leetcode;

public class SumOfNaturalNumbers {

    static int sumOfNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }

    static int findSum(int n) {
        if (n % 2 == 0)
            return (n / 2) * (n + 1);

        else
            return ((n + 1) / 2) * n;
    }

    static int sumOfNaturalNumbersB(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return n + sumOfNaturalNumbersB(n-1);
    }

    public static void main(String args[]) {
        int n = 4;
        System.out.println("1-Sum of Natural Numbers is: " + sumOfNaturalNumbers(n));
        System.out.println("1-Sum of Natural Numbers is: " + sumOfNaturalNumbersB(n));
        System.out.println("2-Sum of Natural Numbers is: " + findSum(n));
    }
}
