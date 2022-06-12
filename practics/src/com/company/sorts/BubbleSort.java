package com.company.sorts;

import java.util.Arrays;

public class BubbleSort {

//  BubbleSort Algorithm
    public static void main(String[] args) {
        int[] array = {3, 4, 6, 1, 2, 5};
        print(Arrays.toString(array));
        for (int i = 0, size = array.length; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        print(Arrays.toString(array));
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
