package com.company.searches;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinearSearch {



    public static int linearSearch(int[] arr, int x) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int x = 30;

        int result = linearSearch(arr, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index - " + result);
    }
}

class NK {
    public static void main(String[] args) {
        System.out.println(controlInputData1("Kenan^"));
    }

    public static String controlInputData1(String str) {
        String regex = "[^A-Za-z0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.replaceAll("");
    }
}

class Prt {
    private static ArrayList<Character> special = new ArrayList<>(Arrays.asList('&', '$', '@', '#', '^'));

    public static void main(String[] args) {
        String test = "05-06.07.2022-ci il tarixdə & HYDROVIP GROUP & MMC tərəfindən elektron qaimə-faktura məlumatlarına $ əsasən cəmi 41111,2 manat ";
        String outputText = "";

        for (int i = 0; i < test.length(); i++) {
            char c = test.charAt(i);
            if (!special.contains(c))
                outputText += c;
            else if (c == '&') {
                outputText += "and";
            } else if (c == '$') {
                outputText += "dollar";
            } else if (c == '@') {
                outputText += " ";
            } else if (c == '#') {
                outputText += " ";
            } else if (c == '^') {
                outputText += " ";
            }
        }
        System.out.println(outputText);
    }
}