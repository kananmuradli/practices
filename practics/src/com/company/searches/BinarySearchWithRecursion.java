package com.company.searches;

public class BinarySearchWithRecursion {

    public static int binarySearch(int[] arr, int beginIndex, int endIndex, int x) {
        if (endIndex >= beginIndex) {
            int mid = beginIndex + (endIndex - beginIndex) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, beginIndex, mid - 1, x);

            return binarySearch(arr, mid + 1, endIndex, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 50;
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present ");
        else
            System.out.println("Element is present at index : " + result);
    }
}
