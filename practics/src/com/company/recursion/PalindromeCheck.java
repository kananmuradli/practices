package com.company.recursion;

import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }

        if (s.charAt(0) == s.charAt(s.length() - 1))
            return isPalindrome(s.substring(1, s.length() - 1));

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String for check");
        String check = scanner.next();

        if (isPalindrome(check)) {
            System.out.println(check + " - is a palindrome");
        } else {
            System.out.println(check + " - is not a palindrome");
        }
    }
}
