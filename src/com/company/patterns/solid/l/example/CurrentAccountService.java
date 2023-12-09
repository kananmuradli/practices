package com.company.patterns.solid.l.example;

import java.math.BigDecimal;

public class CurrentAccountService implements AccountService{

    @Override
    public BigDecimal getCommission() {
        throw new RuntimeException("Commission not exist for current account");
    }
}
