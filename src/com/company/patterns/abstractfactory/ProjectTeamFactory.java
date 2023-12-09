package com.company.patterns.abstractfactory;

public interface ProjectTeamFactory {

    Developer getDeveloper();

    Tester getTester();

    ProductOwner getProductOwner();
}
