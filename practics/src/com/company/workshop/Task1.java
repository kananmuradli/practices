package com.company.workshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    /**
     * Write algorithm for java grep command for word matching in the following context.Given a file containing n words.
     * Given a word w and a number k.Find k words in the file occurring before occurrence of w.
     * Assume that the average word size is m in the file
     * egg.
     *
     * 0 aaa
     * 1 bbb
     * 2 ccc
     * 3 booking
     * 4 alpha
     * 5 beta
     * 6 gamma
     *
     * for k=3 and w = booking
     * the output should be [aaa,bbb,ccc,booking]
     * similarly for k = 2 and w = beta
     * output should be [booking,alpha,beta]
     * Assume that the file size can grow very large
     * and try to get solution with space complexity lesser than O(n)
     *
     * I suggested solution for iterating through file until the word w is found and maintaining a queue of size K
     * The time complexity of my solution was O(nm)
     * and space complexity was O(k) .Any answers to improve the time and space complexity
     * Apparently they were looking for a better implementation of grep
     */

    public static void main(String[] args) {
        String[] input = {
                "aaa",
                "bbb",
                "ccc",
                "booking",
                "alpha",
                "beta",
                "gamma"
        };

        System.out.println(solve(input, "hello", 3));
        System.out.println(solve(input, "booking", 3));
        System.out.println(solve(input, "aaa", 3));
        System.out.println(solve(input, "bbb", 3));
    }

    public static List<String> solve(String[] input, String word, int k) {
        List<String> inputList = Arrays.stream(input).collect(Collectors.toList());
        int indexWord = inputList.indexOf(word);
        if (indexWord < 0) {
            System.err.print(word + ": Not Found ");
            return new ArrayList<>();
        }
        if (indexWord - k < 0) {
            return inputList.subList(0, indexWord + 1);
        }
        return inputList.subList(indexWord - k, indexWord + 1);
    }
}
