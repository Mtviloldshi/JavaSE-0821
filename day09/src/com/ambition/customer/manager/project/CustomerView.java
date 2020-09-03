package com.ambition.customer.manager.project;

public class CustomerView {
    private CustomerList customers = new CustomerList(10);

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }

    /**
     * 主菜单
     */
    public void enterMainMenu() {
        boolean flag = true;
        do {
            System.out.println("--------客户信息管理软件----------\n");
            System.out.println("        1 添加客户");
            System.out.println("        2 修改客户");
            System.out.println("        3 删除用户");
            System.out.println("        4 客户列表");
            System.out.println("        5 退出\n");
            System.out.println("        请选择(1-5)");
            char c = CMUtility.readMenuSelection();
            switch (c) {
                case '1':
                    //添加用户
                    addCustomer();
                    break;
                case '2':
                    //修改客户
                    modifyCustomer();
                    break;
                case '3':
                    //删除用户
                    delCustomer();
                    break;
                case '4':
                    //客户列表
                    getAllCustomer();
                    break;
                case '5':
                    //退出
                    System.out.println("确认是否退出(Y/N)：");
                    if (CMUtility.readChar() == 'Y')
                        flag = false;
                    break;
            }
        } while (flag);
    }

    //添加
    public void addCustomer() {
        System.out.println("---------------添加客户-------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(20);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(11);
        System.out.print("邮箱：");
        String email = CMUtility.readString(30);
        boolean flag = customers.addCustomer(new Customer(name, gender, age, phone, email));
        if (flag) {
            System.out.println("---------------添加完成-------------------");
        } else {
            System.out.println("---------------容量已满，添加失败-------------------");
        }
    }

    //修改
    public void modifyCustomer() {
        System.out.println("---------------修改客户客户-------------------");
        int id = -1;
        Customer customer = null;
        for (; ; ) {
            System.out.println("请选择要修改的客户编号(-1退出):");
            id = CMUtility.readInt();
            if (id == -1) {
                return;//结束方法
            }
            //判断此编号的客户是否存在
            customer = customers.getCustomer(id - 1);
            if (customer == null) {
                System.out.println("无法找到指定用户！");
            } else {
                break;
            }
        }
        //获取新对象的信息
        System.out.print("姓名(" + customer.getName() + "):");
        String name = CMUtility.readString(20, customer.getName());
        System.out.print("性别(" + customer.getGender() + "):");
        char gender = CMUtility.readChar(customer.getGender());
        System.out.print("年龄(" + customer.getAge() + "):");
        int age = CMUtility.readInt(customer.getAge());
        System.out.print("电话(" + customer.getPhone() + "):");
        String phone = CMUtility.readString(11, customer.getPhone());
        System.out.print("邮箱(" + customer.getEmail() + "):");
        String email = CMUtility.readString(30, customer.getEmail());

        //封装成对象
        boolean flag = customers.replaceCustomer(id - 1, new Customer(name, gender, age, phone, email));
        if (flag) {
            System.out.println("---------------修改成功-------------------");
        } else {
            System.out.println("---------------修改失败-------------------");
        }
    }

    //删除用户
    public void delCustomer() {
        System.out.println("---------------删除用户-------------------");
        int id = -1;
        Customer customer = null;
        for (; ; ) {
            System.out.println("请选择要修改的客户编号(-1退出):");
            id = CMUtility.readInt();
            if (id == -1) {
                return;//结束方法
            }
            //判断此编号的客户是否存在
            customer = customers.getCustomer(id - 1);
            if (customer == null) {
                System.out.println("无法找到指定用户！");
            } else {
                break;
            }
        }

        System.out.println("确认是否删除(Y/N):");
        if (CMUtility.readChar() == 'y') {
            customers.delCustomer(id - 1);
            System.out.println("---------------删除完成-------------------");
        }
    }

    //查看用户列表
    public void getAllCustomer() {
        System.out.println("---------------用户列表-------------------\n");
        System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t邮箱");
        Customer[] allCustomer = customers.getAllCustomer();
        if (allCustomer == null) {
            System.out.println("\n            当前无用户!!!\n");
        } else {
            for (int i = 0; i < allCustomer.length; i++) {
                System.out.println(i + 1 + "\t" + allCustomer[i].getName() + "\t" + allCustomer[i].getGender() + "\t" +
                        allCustomer[i].getAge() + "\t" + allCustomer[i].getPhone() + "\t" + allCustomer[i].getEmail());
            }
        }

        System.out.println("\n---------------用户列表-------------------");
    }
}
