package com.company.recursion;

public class RecursionFibonacci {

    public static int fibonacciSeries(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(fibonacciSeries(n));
    }
}
