package com.company.patterns.abstractfactory;

import com.company.patterns.abstractfactory.banking.BankingTeamFactory;

public class BankingApp {
    public static void main(String[] args) {
        var projectTeamFactory = new BankingTeamFactory();
        var developer = projectTeamFactory.getDeveloper();
        var tester = projectTeamFactory.getTester();
        var productOwner = projectTeamFactory.getProductOwner();

        System.out.println("Building banking app");
        developer.writeCode();
        tester.testCode();
        productOwner.manageProduct();
    }
}
