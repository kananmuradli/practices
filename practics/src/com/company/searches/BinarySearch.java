package com.company.searches;

public class BinarySearch {

    public static int binarySearch(int[] arr, int x) {
        int beginIndex = 0;
        int endIndex = arr.length - 1;
        while (beginIndex <= endIndex) {
            int mid = beginIndex + (endIndex - beginIndex) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                beginIndex = mid + 1;
            else
                endIndex = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 2;
        int result = binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element present at index : " + result);
    }
}
