package com.company.ds;

import java.util.Arrays;

public class Algo {

    public static void main(String[] args) {
        Algo algo = new Algo();
        //algo.bubbleSortAlgorithms();
        algo.getResultForBinarySearch();

    }
    private void bubbleSortAlgorithms() {
        int[] array = {4, -1, 30, 11, -40, 15, 20, 10, -5};
        print(array);
        int size = array.length;
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        print(array);
    }

    private void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    //binary searchde array mutleq sorted olmalidir!
    public int binarySearch(int[] array, int lowIndex, int highIndex, int findElementInArray) {

        while (lowIndex <= highIndex) {

            int middleIndex = (highIndex + lowIndex) / 2;

            if (array[middleIndex] == findElementInArray) {
                return middleIndex;
            } else if (array[middleIndex] > findElementInArray) {
                highIndex = middleIndex - 1;
            } else {
                lowIndex = middleIndex + 1;
            }
        }
        return -1;
    }

    public void getResultForBinarySearch() {
        int[] array = {2, 3, 4, 5, 6};
        int lowIndex = 0;
        int highIndex = array.length - 1;
        int findElementInArray = 2;
        int result = binarySearch(array, lowIndex, highIndex, findElementInArray);

        if (result == -1) {
            System.out.println("Element not found this array");
        } else {
            System.out.println("Element found at index : " + result);
        }
    }
}
