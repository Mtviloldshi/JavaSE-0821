package com.ambition.exercise.homework;

public class CheckingAccount extends Account {
    private double overdraftProtection;


    public CheckingAccount(double balance, double overdraftProtection) {
        super(balance);
        this.overdraftProtection = overdraftProtection;
    }

    @Override
    public boolean withdraw(double amt) {
        if (amt > 0) {//合法数字
                if (amt <= getBalance()+overdraftProtection) {//小于透支金额
                    if (getBalance() <= 0 && amt <= - (getBalance() - overdraftProtection)){
                                return true;
                    }
                    return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
