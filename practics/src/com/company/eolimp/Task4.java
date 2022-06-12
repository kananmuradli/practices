package com.company.eolimp;

public class Task4 {

    public static int factorial(int value){
        if (value==0){
            return 1;
        }
        int fact =1;
        for (int i = 1; i<=value;i++){
            fact = fact *i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
}
