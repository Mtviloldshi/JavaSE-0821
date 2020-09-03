package com.ambition.customer.manager.project;

//客户管理类
public class CustomerList {
    private Customer[] customers;//Customer 对象数组
    private int total;//记录保存客户对象的数量

    //初始化数组长度
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * 添加客户功能
     *
     * @param customer 要添加的用户
     * @return 添加是否成功
     */
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {//超出数组长度
            return false;
        }
        customers[total++] = customer;//添加用户，并增加客户数量
        return true;
    }

    /**
     * 替换指定位置的客户对象
     *
     * @param index    替换对象的索引
     * @param customer 替换的新客户
     * @return 替换是否成功
     */
    public boolean replaceCustomer(int index, Customer customer) {
        if (index < 0 || index > total - 1) {
            return false;
        }
        customers[index] = customer;

        return true;
    }

    /**
     * 删除客户
     *
     * @param index 被删除客户的索引位置
     * @return 删除是否成功
     */
    public boolean delCustomer(int index) {
        if (index < 0 || index > total - 1) {
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        customers[--total] = null;
        return true;
    }

    /**
     * 获取所有的用户对象
     *
     * @return 所有用户的对象数组
     */
    public Customer[] getAllCustomer() {
        if (total == 0) {
            return null;
        }
        Customer[] newCustomer = new Customer[total];
        for (int i = 0; i < total; i++) {
            newCustomer[i] = customers[i];
        }
        return newCustomer;
    }

    /**
     * 获取一个客户对象
     *
     * @param index 指定索引位置
     * @return 获取的当前对象
     */
    public Customer getCustomer(int index) {
        if (index < 0 || index > total - 1) {
            return null;
        }
        return customers[index];
    }

//    public static void main(String[] args) {
//        CustomerList custL = new CustomerList(5);
//        Customer c1 = new Customer("tom",'m',18,"123","@123");
//        Customer c2 = new Customer("tom1",'m',19,"123","@123");
//        custL.addCustomer(c1);
//        custL.addCustomer(c2);
//        Customer[] allCustomer = custL.getAllCustomer();
//        for (int i = 0; i < allCustomer.length; i++) {
//            System.out.println(allCustomer[i].getName());
//        }
//    }
}
