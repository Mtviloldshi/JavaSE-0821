package com.ambition.javabean;

public class Account {
    private Integer id;
    private Double balance;
    private Double moneyRote;

    public Account() {
    }

    public Account(Integer id, Double balance, Double moneyRote) {
        this.id = id;
        this.balance = balance;
        this.moneyRote = moneyRote;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getMoneyRote() {
        return moneyRote;
    }

    public void setMoneyRote(Double moneyRote) {
        this.moneyRote = moneyRote;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", moneyRote=" + moneyRote +
                '}';
    }
}
