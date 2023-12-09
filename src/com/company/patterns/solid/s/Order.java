package com.company.patterns.solid.s;

//this principle states that each class should have one responsibility, one single purpose.
// this means that a class will do only one job.
//in our class we do not write any additional methods or variables.
public class Order {
    private final Long id;
    private final String address;

    public Order(Long id, String address) {
        this.id = id;
        this.address = address;
    }
}
