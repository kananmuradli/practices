package com.company.patterns.solid.d.good;

public class PostgreSql implements SqlInterface{

    @Override
    public void save(FormInterface form) {
        System.out.println("Save to postgresql db form : " + form);
    }
}
