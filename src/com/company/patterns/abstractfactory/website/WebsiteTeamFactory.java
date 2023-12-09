package com.company.patterns.abstractfactory.website;

import com.company.patterns.abstractfactory.Developer;
import com.company.patterns.abstractfactory.ProductOwner;
import com.company.patterns.abstractfactory.ProjectTeamFactory;
import com.company.patterns.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PythonDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProductOwner getProductOwner() {
        return new WebsitePO();
    }
}
