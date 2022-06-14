package com.company.leetcode;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        reverseStringFirstWay();
        reverseStringSecondWay();
        reverseStringThirdWay();
        reverseStringFourthWay();
    }

    private static void reverseStringFirstWay() {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter string - ");
        String str = sc.nextLine();
        String nStr = "";
        char ch;

        System.out.print("Original Word :");
        System.out.println(str); //example word
        for (int i = 0; i<str.length(); i++){
            ch = str.charAt(i);  //extracts each character
            nStr = ch + nStr;   // adds each character in front of the existing string
        }
        System.out.println("Reversed word :" +nStr);
    }

    private static void reverseStringSecondWay(){
        String input = "GeeksForGeeks";
        System.out.println("Original string : " +input);

        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        System.out.println("Reversed string : " + stringBuilder);
    }

    private static void reverseStringThirdWay(){
        String input = "GeeksForGeeks";

        char[] ch = input.toCharArray();
        System.out.print("Reversed string : ");
        for (int i = ch.length-1; i>=0; i--){
            System.out.print(ch[i]);
        }
        System.out.println();
    }

    private static void reverseStringFourthWay(){
        String input = "GeeksForGeeks";
        StringBuffer sbr = new StringBuffer(input);
        sbr.reverse();
        System.out.println("Reversed string : " +sbr);
    }
}

