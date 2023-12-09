package com.company.patterns.solid.l.example;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<AccountService> accountServices = List.of(new CurrentAccountService(),
                                                       new InternationalAccountService());
        accountServices.forEach(AccountService::getCommission);
    }
}
