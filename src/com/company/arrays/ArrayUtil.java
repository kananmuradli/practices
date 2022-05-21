package com.company.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayUtil {

//  Print an array using traditional for loop.
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

//  Reverse an array - The first way
    public static void reverseArrayA(Integer[] a) {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }

//  Reverse an array - The second way
    public static void reverseArrayB(int[] arr, int n) {
        for (int i = 0; i < n / 2; i++) {
            int t = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = t;
        }

        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
}
//  Find minimum element in array
    public static int minimumArray(int[]arr){
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = Math.min(res, arr[i]);
        }
        return res;
    }
//  Find maximum element in array
    public static int maximumArray(int[]arr){
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = Math.max(res, arr[i]);
        }
        return res;
    }

//    Find minimum element in array using library function
    public static int minimumArrayB(int[]arr, int n){
        return Arrays.stream(arr).min().getAsInt();
    }

//    Find maximum element in array using library function
    public static int maximumArrayB(int[]arr, int n){
        return Arrays.stream(arr).max().getAsInt();
    }

// Resize an array
    public static int[] resize(int[]arr, int size) {
        int[] temp = new int[size];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }
//  Find secondMax element in array
    public static int findSecondMax(int[] arr) {
      int max = Integer.MIN_VALUE;
      int secondMax = Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++){
          if (arr[i] > max){
              secondMax = max;
              max = arr[i];
          }
          else if (arr[i] > secondMax && arr[i] != max){
              secondMax = arr[i];
          }
      }
      return secondMax;
    }



    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        Integer[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8};
//        int n = arr.length;
//        printArray(arr);
//
//        reverseArrayA(arr1);
//        reverseArrayB(arr, arr.length);
//
//        System.out.println("Minimum element of array:" +minimumArray(arr));
//        System.out.println("Minimum element of array:" +maximumArray(arr));
//
//        System.out.println("Minimum element in array B: " + minimumArrayB(arr, n));
//        System.out.println("Maximum element in array B: " + maximumArrayB(arr, n));

//        int[] arr = {0, 11, 34, 5};
//        System.out.println("original size: " + arr.length);
//        int[] resize = resize(arr, 8);
//        System.out.println("size after resizing: " + resize.length);

//        System.out.println(findSecondMax(arr));
    }
}