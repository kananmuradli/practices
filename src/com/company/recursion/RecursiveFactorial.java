package com.company.recursion;

public class RecursiveFactorial {

    public static int recursiveFactorial(int value){
        if (value == 0){
            return 1;
        }
        return value * recursiveFactorial(value - 1);
    }

    public static void main(String[] args) {
        System.out.println(recursiveFactorial(5));
    }
}
