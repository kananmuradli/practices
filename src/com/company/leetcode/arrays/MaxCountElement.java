package com.company.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class MaxCountElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        findMaxCountElement(arr);
    }

    public static void findMaxCountElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("array is empty");
            return;
        }
        Map<Integer, Integer> elementsMap = new HashMap<>();
        for (int element : arr) {
            int count = elementsMap.getOrDefault(element, 0) + 1;
            elementsMap.put(element, count);
        }

        int maxElement = 0, maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : elementsMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
        }
        System.out.println("Max used element is : " + maxElement + " and used " + maxCount + " times");
    }
}
