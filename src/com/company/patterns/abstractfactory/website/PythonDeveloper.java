package com.company.patterns.abstractfactory.website;

import com.company.patterns.abstractfactory.Developer;

public class PythonDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("write python code");
    }
}
