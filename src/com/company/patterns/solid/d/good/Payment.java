package com.company.patterns.solid.d.good;

public class Payment implements FormInterface{
    private double amount;

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                '}';
    }
}
