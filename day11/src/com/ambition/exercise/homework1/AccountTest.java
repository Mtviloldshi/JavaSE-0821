package com.ambition.exercise.homework1;

/**
 * @author 86176
 * 测试类
 */
public class AccountTest {
    public static void main(String[] args) {
//        Account account = new Account(1122,20000,0.045);
//        account.withdraw(2500);
//        System.out.println("----------");
//        account.deposit(3000);
//        System.out.print("月利率为：" + account.getMonthlyInterest());

        Account account = new CheckAccount(1122,20000,0.045,5000);
        account.withdraw(26000);
        System.out.println();
        account.withdraw(18000);
        System.out.println();
        account.withdraw(3000);
//        System.out.println();
//        account.deposit(10000);
//        System.out.println();
//        account.withdraw(3000);
//        System.out.println();
//        account.withdraw(8000);
    }
}
