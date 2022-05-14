package com.company.leetcode;

import java.util.HashSet;

public class LongestSubString {

    /**
     * Given a string s, find the length of the longest substring without repeating characters.
     *
     * Example 1:
     *
     * Input: s = "abcabcbb"
     * Map[a: 0, b: 1, c: 2]
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     *
     */

    public static int lengthOfLongestSubString(String s) {
        if (s.length() <= 1) {
            return 1;
        }
        char[] chars = s.toCharArray();
        HashSet<Character> charSet = new HashSet<>();
        charSet.add(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            if (i + 1 < chars.length && chars[i] != chars[i + 1]) {
                charSet.add(chars[i]);
            }
        }
        System.out.println(charSet);
        System.out.println(chars.length);
        return charSet.size();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubString("abcabcbb"));
    }
}
