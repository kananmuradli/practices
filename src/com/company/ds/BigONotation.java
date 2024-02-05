package com.company.ds;

/*
    Big O notation is a way to measure how well a
    computer algorithm scales as the amount of data
    involved increases. It is not always a measure
    of speed as you'll see below
    This is a rough overview of Big O and doesn't
    cover topics such as asymptotic analysis, which
    covers comparing algorithms as data approaches
    infinity
    What we are defining is the part of the algorithm
    that has the greatest effect. For example
    45n^3 + 20n^2 + 19 = 84 (n=1)
    45n^3 + 20n^2 + 19 = 459 (n=2) Does 19 matter?
    45n^3 + 20n^2 + 19 = 47019 (n=10)
    Does the 20n^2 matter if 45n^3 = 45,000?
    Has an O(n^3) Order of n-cubed
 */
public class BigONotation {

    public static int stringHastFunction(String wordToHash) {
        int hashKeyValue = 0;

        for (int i = 0; i < wordToHash.length(); i++) {
            int charCode = Math.abs(wordToHash.charAt(i) - 96);
            int hKVTemp = hashKeyValue;
            hashKeyValue = (hashKeyValue * 27 + charCode);
            System.out.println("Hash Key Value " + hKVTemp + " * 27 + Character Code - " + charCode + " = " + hashKeyValue);
        }
        System.out.println();
        return hashKeyValue;
    }

    public static void main(String[] args) {
        System.out.println(stringHastFunction("Kenan"));
    }
}
