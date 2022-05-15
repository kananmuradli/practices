package com.company.sorts;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[]array){
        for (int lastUnSortedIndex = array.length - 1; lastUnSortedIndex > 0; lastUnSortedIndex--){
            int largestIndex = 0;
            for (int i = 1; i <= lastUnSortedIndex; i++){
                if (array[i] > array[largestIndex]){
                    largestIndex = i;
                }
            }
            swap(array, largestIndex, lastUnSortedIndex);
        }
    }

    public static void swap(int[]array, int i, int j){
        if (i == j){
            return;
        }

        int tempValue = array[i];
        array[i] = array[j];
        array[j] = tempValue;
    }

    public static void main(String[] args) {
        int [] array = {4, -1, 30, 11, -40, 15, 20, 10, -5};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));
    }
}
