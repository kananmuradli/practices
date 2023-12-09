package com.company.patterns.abstractfactory.banking;

import com.company.patterns.abstractfactory.Developer;
import com.company.patterns.abstractfactory.ProductOwner;
import com.company.patterns.abstractfactory.ProjectTeamFactory;
import com.company.patterns.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProductOwner getProductOwner() {
        return new BankingPO();
    }
}
