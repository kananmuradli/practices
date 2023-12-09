package com.company.patterns.factory;

public class KotlinDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new KotlinDeveloper();
    }
}
