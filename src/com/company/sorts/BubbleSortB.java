package com.company.sorts;

import java.util.Arrays;

public class BubbleSortB {

    public static void bubbleSort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int j = 0; j < lastUnsortedIndex; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int tempValue = array[i];
        array[i] = array[j];
        array[j] = tempValue;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 6, 1, 2, 5};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
