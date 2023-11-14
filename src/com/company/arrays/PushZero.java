package com.company.arrays;

public class PushZero {

//  Veriliş arraydəki 0-ları arrayin sonuna sürüşdürür. pushZerosToEnd.
    public static void pushZerosToEnd(int[] arr) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++)
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        while (count < n)
            arr[count++] = 0;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        System.out.println("Array length: " + arr.length);
        System.out.println("Array after pushing zeros to the back: ");
        pushZerosToEnd(arr);
    }
}


