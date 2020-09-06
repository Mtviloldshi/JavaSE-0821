package com.ambition.exercise.homework;

/*
        addCustomer 方法必须依照参数（姓，名）构造一个新的 Customer对象，然后把它放到 customer 数组中。还必须把 numberOfCustomer 属性的值加 1。
        getNumOfCustomers 方法返回 numberofCustomers 属性值。
        getCustomer方法返回与给出的index参数相关的客户。

 */
public class Bank {
    private Customer[] customers;//客户数组
    private int numberOfCustomer;

    public Bank(int numberOfCustomer) {
        customers = new Customer[numberOfCustomer];
    }

    //添加客户
    public boolean addCustomer(String f, String l) {
        if (numberOfCustomer > customers.length) return false;

        customers[numberOfCustomer] = new Customer(l, f);//添加用户进数组
        for (;;){
            if (CMUtility.readInt() == 0){//0 储蓄卡
                customers[numberOfCustomer++].setAccount(new SavingsAccount(2000,0.045));//添加账户给用户
                return true;
            }else if (CMUtility.readInt() == 1){// 借记卡
                customers[numberOfCustomer++].setAccount(new CheckingAccount(2000,5000));//添加账户给用户
                return true;
            }else {
                return false;
            }
        }
    }

    //获取当前客户
    public Customer getCustome(int index) {
        //角标合法且不越界
        if (index > 0 || index > numberOfCustomer - 1) return null;
        //返回当前对象
        return customers[index];
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public void setNumberOfCustomer(int numberOfCustomer) {
        this.numberOfCustomer = numberOfCustomer;
    }
}
