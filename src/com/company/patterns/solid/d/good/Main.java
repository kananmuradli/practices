package com.company.patterns.solid.d.good;

public class Main {
    public static void main(String[] args) {
        WebFramework framework = new WebFramework();
        framework.save(new ModelForm(1, 33));
        framework.save(new Loan());
        framework.save(new Payment());
    }
}
