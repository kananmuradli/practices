package com.company.patterns.abstractfactory.banking;

import com.company.patterns.abstractfactory.ProductOwner;

public class BankingPO implements ProductOwner {
    @Override
    public void manageProduct() {
        System.out.println("Banking PO manage product");
    }
}
