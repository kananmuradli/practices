package com.company.eolimp;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m;
        int count = 0;
        for (int i = 0; i <= n; i++) {
            while (n >= 10) {
                m = n % 10; //2
                n = n / 10; //1
                count++; //1
            }
        }
        System.out.println(count + 1);
    }
}


