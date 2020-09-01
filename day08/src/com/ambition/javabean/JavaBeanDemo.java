package com.ambition.javabean;

public class JavaBeanDemo {
    public static void main(String[] args) {
        User user = new User("tom", 123456, "男", 12, "sh");
        Account account = new Account(123456, 9000000.0, 0.035);

        System.out.println(user.toString());
        System.out.println(account.toString());
    }
}
