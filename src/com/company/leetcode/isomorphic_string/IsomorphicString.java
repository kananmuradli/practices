package com.company.leetcode.isomorphic_string;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("title", "paper"));
    }

    public static boolean isIsomorphic(String a, String b) {
        if (a == null || b == null) return false;
        if (a.length() != b.length()) return false;
        if (a.length() == 0 && b.length() == 0) return true;

        var map = new HashMap<Character, Character>();

        for (int i = 0; i < a.length(); i++) {
            var c1 = a.charAt(i);
            var c2 = b.charAt(i);

            var c = getKey(c2, map);

            if (c != null && c != c1) return false;
            else if (map.containsKey(c1)) {
                if (c2 != map.get(c1)) return false;
            } else map.put(c1, c2);
        }
        return true;
    }

    private static Character getKey(Character c2, HashMap<Character, Character> map) {
        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            if (c2.equals(entry.getValue())) return entry.getKey();
        }
        return null;
    }
}
