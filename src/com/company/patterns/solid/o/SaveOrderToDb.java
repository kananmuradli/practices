package com.company.patterns.solid.o;

public class SaveOrderToDb implements Save{

    @Override
    public void save(Order order) {
        System.out.println("Save order to db with id:" + order.getId() + " address : " + order.getAddress());
    }
}
