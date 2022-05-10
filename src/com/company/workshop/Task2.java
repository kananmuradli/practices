package com.company.workshop;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {

    /**
     * You have three Arrays.
     * A = {2, 5, 3, 2, 8, 1}
     * B = {7, 9, 5, 2, 4, 10, 10}
     * C = {6, 7, 5, 5, 3, 7}
     *
     * s1 = A & B - 2, 5, 3, 8, 1, 7, 9, 4, 10
     * s2 = A & C -
     * s3 = B & C
     *  2, 5, 3, 8, 1, 7, 9, 4, 10
     * result = s(s1 + s2 + s3)
     *
     * make an array from this three arrays which elements is present in at least two array.
     *
     * This question was followed by instead of three arrays. If you have a list of array then what will be the solution?
     * Also what will be the time complexity?
     * 3xO(n)
     * recursive - log n
     * n
     * 1
     * 2 * n
     * n * n * n * n
     * @param
     */

    public static void main(String[] args) {
        int[] A = {2, 5, 3, 2, 8, 1};
        int[] B = {7, 9, 5, 2, 4, 10, 3};
        int[] C = {6, 7, 5, 5, 3, 7};
        presentTwoElements(A, B, C);
    }

    public static void presentTwoElements(int[] A, int[] B, int[] C) {
        Set<Integer> AA = Arrays.stream(A).boxed().collect(Collectors.toSet());
        Set<Integer> BB = Arrays.stream(B).boxed().collect(Collectors.toSet());
        Set<Integer> CC = Arrays.stream(C).boxed().collect(Collectors.toSet());

        Set<Integer> result = Stream.of(AA, BB, CC).flatMap(Collection::stream)
                .filter(x -> (AA.contains(x)) && BB.contains(x)
                        || AA.contains(x) && CC.contains(x)
                        || BB.contains(x) && CC.contains(x))
                .collect(Collectors.toSet());
        System.out.println(result);
    }
}