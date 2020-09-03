package com.ambition.customer.manager.project2;
/*
    CustomerList为Customer对象的管理模块，内部用数组管理一组Customer对象
    本类封装以下信息：
    Customer[] customers：用来保存客户对象的数组
    int total = 0                 ：记录已保存客户对象的数量
    该类至少提供以下方法：
    public CustomerList(int totalCustomer)
    public boolean addCustomer(Customer customer)
    public boolean replaceCustomer(int index, Customer cust)
    public boolean deleteCustomer(int index)
    public Customer[] getAllCustomers()
    public Customer getCustomer(int index)

 */
public class CustomerList {
    private Customer[] customers;//用来保存客户对象的数组
    private int total;//记录已保存客户对象的数量

    //定义CustomerList构造器，初始化Customer[]数组长度
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }

    /**
     * 添加客户
     * @param customer 添加的客户对象
     * @return 是否添加成功
     */
    public boolean addCustomer(Customer customer){
        if (total > customers.length){//如果用户数量大于对象数组长度
            return false;
        }
        //否则 添加顾客 并且使顾客数量+1
        customers[total++] = customer;
        return true;
    }

    /**
     * 替换顾客
     * @param index 被替换顾客在数组中的角标
     * @param cust 新顾客
     * @return 是否替换成功
     */
    public boolean replaceCustomer(int index, Customer cust){
        //角标<0 或者 角标大于顾客数 - 1
        if (index < 0 || index > total - 1){
            return false;
        }
        //否则 替换顾客
        customers[index] = cust;
        return true;
    }

    /**
     * 删除用户
     * @param index 被删除用户的角标
     * @return 是否删除成功
     */
    public boolean deleteCustomer(int index){
        //角标<0 或者 角标大于顾客数 - 1
        if (index < 0 || index > total - 1){
            return false;
        }
        //否则将index + 1 之后的数据往前移动
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        //把最后一位顾客设置为null,且总顾客数 - 1
        customers[--total] = null;
        return true;
    }

    /**
     * 获取全部顾客
     * @return 顾客数组
     */
    public Customer[] getAllCustomers(){
        //如果当前数组没有客户
        if (total == 0){
            return null;
        }
        //创建一个新数组
        Customer[] newArr = new Customer[total];
        //把已有顾客装进新数组
        for (int i = 0; i < total; i++) {
            newArr[i] = customers[i];
        }
        //返回新数组
        return newArr;
    }

    /**
     * 获取当前角标顾客
     * @param index 当前顾客角标
     * @return 当前顾客对象
     */
    public Customer getCustomer(int index){
        //角标<0 或者 角标大于顾客数 - 1
        if (index < 0 || index > total - 1){
            return null;
        }
        //否则 返回当前顾客
        return customers[index];
    }
}
