package com.company.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    /**
     * Input: s = "MCMXCIV"
     * Output: 1994
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     */

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

     static Map<Character, Integer> map = new HashMap();

    public static int romanToInt(String s) {
        fillMapValues();
        int result = 0;
        int size = s.length();
        for (int i = 0; i < size - 1; i++) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1)))
                result -= map.get(s.charAt(i));
            else
                result += map.get(s.charAt(i));
        }
        result += map.get(s.charAt(size - 1));
        return result;
    }

    public static void fillMapValues() {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }
}
