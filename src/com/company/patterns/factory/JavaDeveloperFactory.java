package com.company.patterns.factory;

public class JavaDeveloperFactory implements DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
