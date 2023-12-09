package com.company.patterns.abstractfactory.website;

import com.company.patterns.abstractfactory.ProductOwner;

public class WebsitePO implements ProductOwner {
    @Override
    public void manageProduct() {
        System.out.println("website po manage product");
    }
}
