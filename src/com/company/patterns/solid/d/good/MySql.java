package com.company.patterns.solid.d.good;

public class MySql implements SqlInterface{

    @Override
    public void save(FormInterface form) {
        System.out.println("Save to mysql db form : " + form);
    }
}
