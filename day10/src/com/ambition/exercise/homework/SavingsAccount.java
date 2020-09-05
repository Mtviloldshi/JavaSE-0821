package com.ambition.exercise.homework;

public class SavingsAccount extends Account{
    private double interestRate;//年利率

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }
}
