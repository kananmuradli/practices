package com.company.leetcode;

import java.util.Scanner;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store)
            if (n != 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        if (isAnagram(s, t))
            System.out.println("Is anagram");
        else
            System.out.println("Is not anagram");
    }
}