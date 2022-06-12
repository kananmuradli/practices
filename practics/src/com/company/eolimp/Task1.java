package com.company.eolimp;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m;
        if (n >= 10 && n <= 99) {
            m = n % 10;
            n = n / 10;
            System.out.println(n + " " + m);
            System.out.println("ok");
        }

    }
}
