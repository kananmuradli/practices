package com.company.leetcode.rotate_array;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 2;
        rotateArrayBruteForce(nums, k);
        System.out.println("****************");
        rotateArrayBruteForceWithLeftSide(nums, k);
    }

    public static void rotateArrayBruteForce(int[] nums, int k) {
        int size = nums.length;
        k = k % size;

        for (int i = 0; i < k; i++) {
            int lastElement = nums[size - 1];
            for (int j = size - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = lastElement;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void rotateArrayBruteForceWithLeftSide(int[] nums, int k) {
        int size = nums.length;
        k = k % size;

        for (int i = 0; i < k; i++) {
            int firstElement = nums[0];
            for (int j = 0; j < size - 1; j++) {
                nums[j] = nums[j + 1];
            }
            nums[size - 1] = firstElement;
        }

        System.out.println(Arrays.toString(nums));
    }
}
