package com.company.arrays;

public class KadaneAlgorithms {

    public static int kadaneForMaxSubArray(int[] array) {
        int maxEndHere = 0;
        int maxSoFar = 0;
        for (int arrayBox : array) {
            maxEndHere += arrayBox;
            if (maxEndHere < 0)
                maxEndHere = 0;
            if (maxSoFar < maxEndHere)
                maxSoFar = maxEndHere;
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] array = {-10, 20, 30, 50};
        System.out.println(kadaneForMaxSubArray(array));
    }
}