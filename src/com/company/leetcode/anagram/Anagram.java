package com.company.leetcode.anagram;

/*
Writing Java code for checking word is anagram
(a word or phrase made by transposing the letters of another word or phrase) or not
-> input race,care -> output true
input -> test, code -> output false
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String a = "mala", b = "alma";
        System.out.println(isAnagramSort(a, b));
        System.out.println(isAnagram(a, b));
        System.out.println(foo('B'));
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        var str = new ArrayList<String>();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            str.add(c + "");
        }

        for (int j = 0; j < b.length(); j++) {

            if (Character.isUpperCase(b.charAt(j))) {
                char d = Character.toLowerCase(b.charAt(j));
                str.remove(d + "");
                if (Character.isLowerCase(d)) {
                    char d1 = Character.toUpperCase(b.charAt(j));
                    str.remove(d1 + "");
                }
            }

            if (Character.isLowerCase(b.charAt(j))) {
                char d = Character.toUpperCase(b.charAt(j));
                str.remove(d + "");
                if (Character.isUpperCase(d)) {
                    char d1 = Character.toLowerCase(b.charAt(j));
                    str.remove(d1 + "");
                }
            }
        }

        if (str.size() == 0) {
            return true;
        }

        return false;
    }

    public static boolean isAnagramSort(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        var a1 = a.toCharArray();
        var a2 = b.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }

    public static char foo(char a) {
        if (a >= 65 && a <= 90) {
            a += 32;
            return a;
        }
        if (a >= 97 && a <= 122) {
            a-=32;
            return a;
        }
        return '*';
    }
}
