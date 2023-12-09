package com.company.patterns.abstractfactory;

import com.company.patterns.abstractfactory.website.WebsiteTeamFactory;

public class WebsiteApp {
    public static void main(String[] args) {
        var projectFactory = new WebsiteTeamFactory();
        var developer = projectFactory.getDeveloper();
        var tester = projectFactory.getTester();
        var productOwner = projectFactory.getProductOwner();

        System.out.println("Building website app");
        developer.writeCode();
        tester.testCode();
        productOwner.manageProduct();
    }
}
