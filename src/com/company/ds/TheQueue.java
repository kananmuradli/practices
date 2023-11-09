package com.company.ds;

import java.util.Arrays;

public class TheQueue {

    private String[] queueArray;
    private int queueSize;

    // Sets stack as empty
    private int front, numberOfItems, rear = 0;

    TheQueue(int size) {
        queueSize = size;
        queueArray = new String[size];
        // Assigns the value of -1 to every value in the array
        // so I control what gets printed to screen
        Arrays.fill(queueArray, "-1");

    }

    public void insert(String input) {
        if (numberOfItems + 1 <= queueSize) {
            queueArray[rear] = input;
            rear++;
            numberOfItems++;
            System.out.println("INSERT " + input + " Was Added to the Queue\n");
        } else {
            System.out.println("Sorry But the Queue is Full");
        }
    }

    // This priority insert will add items in order from high to low

    public void priorityInsert(String input) {
        int i;
        if (numberOfItems == 0) {
            insert(input);
        } else {
            for (i = numberOfItems - 1; i >= 0; i--) {
                if (Integer.parseInt(input) > Integer.parseInt(queueArray[i])) {
                    queueArray[i + 1] = queueArray[i];
                } else {
                    break; // Done shifting items in queue
                }
            }
            queueArray[i + 1] = input;
            rear++;
            numberOfItems++;
        }
    }

    public void remove() {
        if (numberOfItems > 0) {
            System.out.println("REMOVE " + queueArray[front] + " Was Removed From the Queue\n");
            // Just like in memory an item isn't deleted, but instead is just not available
            queueArray[front] = "-1";
            front++;
            numberOfItems--;
        } else {
            System.out.println("Sorry But the Queue is Empty");
        }
    }

    public void peek() {
        System.out.println("The First Element is " + queueArray[front]);
    }

    public static void main(String[] args) {
        TheQueue theQueue = new TheQueue(10);
        theQueue.priorityInsert("16");
        theQueue.priorityInsert("25");
        theQueue.priorityInsert("10");

//        theQueue.remove();
//        theQueue.remove();
//        theQueue.peek();

		/*
		theQueue.insert("10");

		theQueue.displayTheQueue();

		theQueue.insert("15");

		theQueue.displayTheQueue();

		theQueue.insert("25");

		theQueue.displayTheQueue();

		theQueue.insert("25");

		theQueue.displayTheQueue();

		theQueue.insert("25");
		*/
    }
}
