package com.company.patterns.solid.d.good;

public class Loan implements FormInterface{
    private double amount;

    @Override
    public String toString() {
        return "Loan{" +
                "amount=" + amount +
                '}';
    }
}
