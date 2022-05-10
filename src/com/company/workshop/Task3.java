package com.company.workshop;

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {

    /***
     * Given arrays for N (>= 2) users, each representing the IDs of
     * hotels visited,
     * find the common IDs of the hotels visited amongst the users.
     *
     * Input:
     * userA = { 2, 3, 1, 2 }
     * userB = { 2, 5, 3 }
     * userC = { 7, 3, 1 }
     *
     * {2, 3, 1, 2, 5, 3, 7, 3, 1}
     *
     * Output: {3}
     *
     * Assumptions:
     * Arrays are unsorted.
     *
     * Cases:
     * 1) Each array consists of distinct hotel IDs
     * 2) Each array may contain duplicate hotel IDs
     *
     * @return
     */


    public static List<Integer> findCommonHotelIdsA(int[][] input) {

        List<Set<Integer>> inputList = Arrays.stream(input)
                .map(x -> Arrays.stream(x).boxed().collect(Collectors.toSet()))
                .collect(Collectors.toList());

        List<Integer> result = inputList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        Map<Integer, Long> counters = result.stream()
                .collect(Collectors.groupingBy(p -> p, Collectors.counting()));

        List<Integer> a = counters.entrySet()
                .stream()
                .filter(x -> x.getValue() == input.length)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return a;
    }

    public static List<Integer> findCommonHotelIdsB(int[][] input) {
        List<List<Integer>> listOfList = Arrays.stream(input)
                .map(x -> Arrays.stream(x).boxed().collect(Collectors.toList()))
                .collect(Collectors.toList());

        List<Integer> reference = listOfList.get(0);

        for (int i = 1; i < listOfList.size(); i++) {
            Set<Integer> hotel = new HashSet<>(listOfList.get(i));
            for (int j = 0; j < reference.size(); j++) {
                if (!hotel.contains(reference.get(j))) {
                    reference.remove(j);
                    j--;
                }
            }
        }

        return reference;
    }

    public static void main(String[] args) {
        int[][] input = {{2, 3, 1}, {2, 5, 3}, {7, 3, 2}};
        System.out.println(input.length);
        System.out.println(findCommonHotelIdsA(input));
        System.out.println(findCommonHotelIdsB(input));
    }
}
