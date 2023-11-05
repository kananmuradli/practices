package com.company.ds;

public class ArrayStructures {

    private final int[] theArray = new int[50];

    private int arraySize = 10;

    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 10) + 10;
        }
    }

    public void printArray() {
        System.out.println("----------");

        for (int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");
            System.out.println("----------");
        }
    }

    public int getValueAtIndex(int index) {
        if (index < arraySize) {
            return theArray[index];
        }
        return 0;
    }

    public boolean doesArrayContainThisValue(int searchValue) {
        boolean valueInArray = false;
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == searchValue) {
                valueInArray = true;
                break;
            }
        }
        return valueInArray;
    }

    public void deleteValueByIndex(int index) {
        if (index < arraySize) {
            for (int i = index; i < arraySize - 1; i++) {
                theArray[i] = theArray[i + 1];
            }
            arraySize--;
        }
    }

    public void insertValue(int value) {
        if (arraySize < 50) {
            theArray[arraySize] = value;
            arraySize++;
        }
    }

    public String linearSearchForValue(int value) {
        boolean valueInArray = false;

        String indexesWithValue = "";

        System.out.print("The value was found in the following: ");

        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value) {
                valueInArray = true;

                System.out.print(i + " ");
                indexesWithValue += i + " ";
            }
        }

        if (!valueInArray) {
            indexesWithValue += "None";
            System.out.print(indexesWithValue);
        }

        System.out.println();
        return indexesWithValue;
    }

    public static void main(String[] args) {

        ArrayStructures arrayStructures = new ArrayStructures();
        arrayStructures.generateRandomArray();
        arrayStructures.printArray();
        System.out.println(arrayStructures.getValueAtIndex(2));
        System.out.println(arrayStructures.doesArrayContainThisValue(13));
        arrayStructures.printArray();
        System.out.println();
        arrayStructures.deleteValueByIndex(2);
        arrayStructures.printArray();
        arrayStructures.insertValue(99);
        System.out.println();
        arrayStructures.printArray();
        arrayStructures.linearSearchForValue(13);
    }
}
