package com.company.eolimp;

import java.util.Scanner;

public class Task3 {

//  Daxil olunan ədədin tək bölənlərini, onların sayını, cəmini və hasilini ekrana çıxart!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int say = 0;
        int cem = 0;
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 1) {
                cem = cem + i;
                hasil = hasil * i;
                say++;
                System.out.println("Tek bolenler: " + i);
            }
        }
        System.out.println("Uygun gelen ededlerin sayi: " + say);
        System.out.println("Uygun gelen ededlerin cemi: " + cem);
        System.out.println("Uygun gelen ededlerin hasili: " + hasil);
    }
}
