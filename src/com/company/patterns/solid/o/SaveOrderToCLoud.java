package com.company.patterns.solid.o;

public class SaveOrderToCLoud implements Save{

    @Override
    public void save(Order order) {
        System.out.println("Save order to cloud with id:" + order.getId() + " address : " + order.getAddress());
    }
}
