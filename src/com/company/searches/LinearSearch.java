package com.company.searches;

public class LinearSearch {

    public static int linearSearch(int[] arr, int x) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int x = 30;

        int result = linearSearch(arr, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index - " + result);
    }
}
