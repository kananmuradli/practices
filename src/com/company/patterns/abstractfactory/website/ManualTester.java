package com.company.patterns.abstractfactory.website;

import com.company.patterns.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("manual tester test code");
    }
}
