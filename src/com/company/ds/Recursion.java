package com.company.ds;

public class Recursion {

    public static void main(String[] args) {
        Recursion recursion = new Recursion();

        System.out.println("With out recursion - " + recursion.getTriangularNumberWithOutRecursion(6));
        System.out.println();
        System.out.println("With recursion - " + recursion.getTriangularNumberWithRecursion(6));
        System.out.println();
        System.out.println("Factorial with recursion is - " + recursion.getFactorial(6));
    }

    public int getTriangularNumberWithOutRecursion(int number) {
        int triangularNumber = 0;

        while (number > 0) {
            triangularNumber += number;
            number--;
        }

        return triangularNumber;
    }

    public int getTriangularNumberWithRecursion(int number) {

        System.out.println("Method - " + number);

        if (number == 1) {
            System.out.println("Returned 1");
            return 1;
        }

        int result = number + getTriangularNumberWithRecursion(number - 1);
        System.out.print("Returned : " + result);
        System.out.println(" Number -- " + number + " TriangularNumber -- (" + (number - 1) + ")");
        return result;
    }

    public int getFactorial(int number) {

        System.out.println("Method - " + number);

        if (number == 1) {
            System.out.println("Returned 1");
            return 1;
        }

        int result = number * getFactorial(number - 1);
        System.out.print("Returned : " + result);
        System.out.println(" Number -- " + number + " Factorial number -- (" + (number - 1) + ")");
        return result;
    }
}
