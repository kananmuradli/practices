package com.company.sorts;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        for (int firstUnSortedIndex = 1; firstUnSortedIndex < array.length; firstUnSortedIndex++) {
            int element = array[firstUnSortedIndex];
            int i;
            for (i = firstUnSortedIndex; i > 0 && array[i - 1] > element; i--) {
                array[i] = array[i - 1];
            }
            array[i] = element;
        }
    }

    public static void main(String[] args) {
        int[] array = {4, -1, 30, 11, -40, 15, 20, 10, -5};
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
