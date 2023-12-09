package com.company.patterns.solid.l.example;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

public class InternationalAccountService implements AccountService{

    @Override
    public BigDecimal getCommission() {
        return ZERO;
    }
}
