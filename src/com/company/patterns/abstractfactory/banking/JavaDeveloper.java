package com.company.patterns.abstractfactory.banking;

import com.company.patterns.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("write java code");
    }
}
