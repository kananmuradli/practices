package com.company.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] arr) {
        Set<Integer> numbers = new HashSet<>();
        for (int num : arr) {
            if (numbers.contains(num))
                return true;
            numbers.add(num);
            System.out.println(numbers);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {34, 56, 76, 45, 55, 33, 76};
        System.out.println(containsDuplicate(arr));
    }
}
