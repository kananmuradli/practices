package com.company.patterns.solid.o;

//not good practice change class every time
//The Open-Closed principle requires that classes should be open for extension and closed to modification.
public class SaveOrder {

    public void saveOrderToDb(Long id, String address) {
        System.out.println("Save order to db with id : " + id + "address : " + address);
    }

    public void saveOrderToCloud(Long id, String address) {
        System.out.println("Save order to cloud with id : " + id + "address : " + address);
    }

    public void saveOrderToFile(Long id, String address) {
        System.out.println("Save order to file with id : " + id + "address : " + address);
    }
}
