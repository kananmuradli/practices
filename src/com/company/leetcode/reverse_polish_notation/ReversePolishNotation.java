package com.company.leetcode.reverse_polish_notation;

import java.util.Stack;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

/*

Evaluate the value of an arithmetic expression in Reverse Polish Notation. Valid
operators are +,-, *, /. Each operand may be an integer or another expression. For example:

 ["2", "1", "+", "3", "*"]-> ((2 + 1) * 3)-> 9
 ["4", "13", "5", "/", "+"]-> (4 + (13 / 5))-> 6

 */

public class ReversePolishNotation {

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        System.out.println(evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }

    public static int evalRPN(String[] tokens) {
        var operators = "+-/*";
        var stack = new Stack<String>();
        for (var token : tokens) {
            if (!operators.contains(token)) {
                stack.push(token);
            } else {
                var a = parseInt(stack.pop());
                var b = parseInt(stack.pop());
                switch (token) {
                    case "+" -> stack.push(valueOf(a + b));
                    case "-" -> stack.push(valueOf(b - a));
                    case "*" -> stack.push(valueOf(a * b));
                    case "/" -> stack.push(valueOf(b / a));
                }
            }
        }
        return parseInt(stack.pop());
    }
}
