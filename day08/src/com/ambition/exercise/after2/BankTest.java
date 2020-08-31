package com.ambition.exercise.after2;

//测试
public class BankTest {
    public static void main(String[] args) {
        Bank card = new CreditCard(123456, 1000, 500);

        card.withdraw(1500);
        card.save(101);

        String info = card.getInfo();
        System.out.println(info);
    }
}
