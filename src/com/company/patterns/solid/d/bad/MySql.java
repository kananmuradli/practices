package com.company.patterns.solid.d.bad;

public class MySql {

    public void save(ModelForm form) {
        System.out.println("Save to db form " + form);
    }

    public void save(Loan loan) {
        System.out.println("Save to db loan " + loan);
    }

    public void save(Payment payment) {
        System.out.println("Save to db payment " + payment);
    }
}