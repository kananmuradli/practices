package com.company.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class MaxCountElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};

        findMaxCountElement(arr).forEach((element, count) ->
                System.out.println("Element : " + element + " count : " + count));

        for (var entries : findMaxCountElement(arr).entrySet()) {
            System.out.println("Element : " + entries.getKey() + " and count : " + entries.getValue());
        }
    }

    public static Map<Integer, Integer> findMaxCountElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("array is empty");
            return new HashMap<>();
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

        var maxMaps = new HashMap<Integer, Integer>();
        maxMaps.put(maxElement, maxCount);

        return maxMaps;

    }
}
