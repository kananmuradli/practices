package com.company.leetcode.arrays;

/*
Write Java code for finding numbers of maximum element in array -> input [4,1,5,5,1,5] -> output 3
Write Java code for finding factorial of number -> input 3 -> 6
*/
public class NumbersOfMaxElement {

    public static void main(String[] args) {
        int[] array = {4, 1, 5, 5, 1, 5};
        System.out.println(maxElementInArray(array));
    }

    public static int maxElementInArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int maxElement = arr[0];
        int maxCount = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                maxCount = 1;
            } else if (arr[i] == maxElement) {
                maxCount++;
            }
        }
        return maxCount;

    }
}
