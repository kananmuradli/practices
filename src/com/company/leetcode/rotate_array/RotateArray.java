package com.company.leetcode.rotate_array;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArrayBruteForce(nums, k);
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
}
