package com.company.eolimp;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {
        List<Integer> a = List.of(1, 2, 3, 4, 5);
        List<Integer> b = List.of(2, 3, 4, 5, 6);
        List<Integer> c = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (a.get(i).equals(b.get(j))) {
                    c.add(a.get(i));
                }
            }
        }
        System.out.println(c);
    }
}

class ThreadSafeObject {
    private int counter = 0;

    public void incrementCounter() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
class Main {
    public static void main(String[] args) {
        final ThreadSafeObject threadSafeObject = new ThreadSafeObject();

        // Create and start multiple threads
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    threadSafeObject.incrementCounter();
                }
            });
            thread.start();
        }

        // Wait for all threads to complete
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final value of the counter
        System.out.println("Counter: " + threadSafeObject.getCounter());
    }
}

class MyClass implements Cloneable {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10);

        try {
            MyClass obj2 = (MyClass) obj1.clone();
            System.out.println("Original: " + obj1.getValue() + " Hascode1: " + obj1.hashCode());
            System.out.println("Clone: " + obj2.getValue() + " Hascode2: " + obj2.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public int getValue() {
        return value;
    }
}

