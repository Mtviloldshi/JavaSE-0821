package com.ambition.exercise.ing2;

/*
    1、	写一个名为Account的类模拟账户。该类的属性和方法如下图所示。该类包括的属性：
    2、	账号id，余额balance，年利率annualInterestRate；包含的方法：访问器方法（getter和setter方法），
    取款方法withdraw()，存款方法deposit()。
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    //取款
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount > balance) {
                System.out.println("余额不足！");
            } else {
                balance -= amount;
                System.out.println("成功取出:" + amount);
            }
        } else {
            System.out.println("请输入有效数字!");
        }
    }

    //存款
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("成功存入" + amount);
        } else {
            System.out.println("请输入有效数字！");
        }
    }

    public Account() {
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
}
