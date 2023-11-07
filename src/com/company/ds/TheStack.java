package com.company.ds;

import java.util.Arrays;

public class TheStack {

    private String[] stackArray;
    private int stackSize;
    private int topOfStack = -1;

    TheStack(int size) {
        stackSize = size;
        stackArray = new String[size];
        // Assigns the value of -1 to every value in the array
        // so I control what gets printed to screen
        Arrays.fill(stackArray, "-1");
    }

    public void push(String input) {
        if (topOfStack + 1 < stackSize) {
            topOfStack++;
            stackArray[topOfStack] = input;
        } else {
            System.out.println("Sorry But the Stack is Full");
        }
        System.out.println("PUSH " + input + " Was Added to the Stack\n");
    }

    public String pop() {
        if (topOfStack >= 0) {
            System.out.println("POP " + stackArray[topOfStack] + " Was Removed From the Stack\n");
            // Just like in memory an item isn't deleted, but instead is just not available
            stackArray[topOfStack] = "-1"; // Assigns -1 so the value won't appear
            return stackArray[topOfStack--];
        } else {
            System.out.println("Sorry But the Stack is Empty");
            return "-1";
        }
    }

    public String peek() {
        System.out.println("PEEK " + stackArray[topOfStack] + " Is at the Top of the Stack\n");
        return stackArray[topOfStack];
    }

    public void pushMany(String multipleValues) {
        String[] tempString = multipleValues.split(" ");
        for (int i = 0; i < tempString.length; i++) {
            push(tempString[i]);
        }
    }

    public void popAll() {
        for (int i = topOfStack; i >= 0; i--) {
            pop();
        }
    }

    public void popDisplayAll() {
        String theReverse = "";
        for (int i = topOfStack; i >= 0; i--) {
            theReverse += stackArray[i] += " ";
        }
        System.out.println("The Reverse: " + theReverse.trim());
        System.out.println();
        popAll();
    }

    public static void main(String[] args) {
        TheStack theStack = new TheStack(10);
        theStack.push("10");
        theStack.push("17");
        theStack.push("13");
        // Look at the top value on the stack

        theStack.peek();
        // Remove values from the stack (LIFO)

        theStack.pop();
        theStack.pop();
        theStack.pop();
        // Add many to the stack

        theStack.pushMany("R E D R U M");
        // Remove all from the stack

        // theStack.popAll();

        // Remove all from the stack and print them

        theStack.popDisplayAll();
    }
}