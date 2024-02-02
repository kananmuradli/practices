package com.company.ds;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 3};
        int[] array2 = {1, 2, 3, 4};

        System.out.println(isDuplicate(array1));
        System.out.println(isDuplicate(array2));
    }

    public static boolean isDuplicate(int[] array) {
        Set<Integer> elements = new HashSet<>();

        for (int element : array) {
            if (!elements.add(element)) {
                return true;
            }
        }
        return false;
    }
}
