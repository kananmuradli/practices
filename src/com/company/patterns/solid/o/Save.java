package com.company.patterns.solid.o;

public interface Save {

    void save(Order order);

    default void foo() {
        System.out.println("foo");
    }

    static void test() {
        System.out.println("test");
    }
}
