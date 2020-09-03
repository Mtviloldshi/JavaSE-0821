package com.ambition.customer.manager.project2;

import com.ambition.customer.manager.project.CMUtility;

import java.text.BreakIterator;

/*
    CustomerView为主模块，负责菜单的显示和处理用户操作
    本类封装以下信息：
    CustomerList customers = new CustomerList(10);
        创建最大包含10客户对象的CustomerList 对象，供以下各成员方法使用。
    该类至少提供以下方法：
    public void enterMainMenu()
    private void addNewCustomer()
    private void modifyCustomer()
    private void deleteCustomer()
    private void listAllCustomers()
    public static void main(String[] args)

 */
public class CustomerView {
    //初始化数组长度
    CustomerList customers = new CustomerList(10);

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }

    public void enterMainMenu() {
        boolean flag = true;//定义标识
        do {
            System.out.println("--------客户信息管理软件----------\n");
            System.out.println("        1 添加客户");
            System.out.println("        2 修改客户");
            System.out.println("        3 删除用户");
            System.out.println("        4 客户列表");
            System.out.println("        5 退出\n");
            System.out.print("        请选择(1-5):");

            //从键盘读取操作数据
            char menu = CMUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    //添加客户
                    addCustomer();
                    break;
                case '2':
                    //修改客户
                    modifyCustomer();
                    break;
                case '3':
                    //删除用户
                    deleteCustomer();
                    break;
                case '4':
                    //客户列表
                    listAllCustomers();
                    break;
                case '5':
                    //退出
                    System.out.println("请确认是否退出(Y/N):");
                    if (CMUtility.readChar() == 'Y')
                        flag = false;
                    break;
            }
        } while (flag);
    }

    //添加客户
    private void addCustomer() {
        System.out.println("---------------------添加客户---------------------");
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

        //初始化数组并调用添加用户对象方法，返回结果
        boolean flag = customers.addCustomer(new Customer(name, gender, age, phone, email));
        if (flag) {
            System.out.println("---------------------添加成功---------------------");
        } else {
            System.out.println("---------------------添加失败---------------------");
        }
    }

    //修改用户
    private void modifyCustomer() {
        System.out.println("---------------------修改用户---------------------");
        int id = -1;
        Customer customer = null;
        for (; ; ) {
            System.out.println("请选择待修改客户编号(-1退出)：");
            //读取当前用户编号
            id = CMUtility.readInt();
            //如果输入的数为-1，直接结束当前方法
            if (id == -1) {
                return;
            }
            //获取当前用户 角标为 编号id - 1
            customer = customers.getCustomer(id - 1);
            if (customer == null) {
                System.out.println("查无此用户！");
            } else {
                break;
            }
        }
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

        //调用修改客户方法，并初始化对象,返回结果
        boolean flag = customers.replaceCustomer(id - 1, new Customer(name, gender, age, phone, email));

        if (flag) {
            System.out.println("---------------------修改完成---------------------");
        } else {
            System.out.println("---------------------修改失败---------------------");
        }
    }

    //删除用户
    private void deleteCustomer() {
        System.out.println("---------------------删除客户---------------------");
        int id = -1;
        Customer customer = null;
        for (; ; ) {
            System.out.println("请选择待删除客户编号(-1退出)：");
            //读取当前用户编号
            id = CMUtility.readInt();
            //如果输入的数为-1，直接结束当前方法
            if (id == -1) {
                return;
            }
            //获取当前用户 角标为 编号id - 1
            customer = customers.getCustomer(id - 1);
            if (customer == null) {
                System.out.println("查无此用户！");
            } else {
                break;
            }
        }
        boolean flag = customers.deleteCustomer(id - 1);
        if (flag) {
            System.out.println("---------------------删除成功---------------------");
        } else {
            System.out.println("---------------------删除失败---------------------");
        }
    }

    //查看用户列表
    private void listAllCustomers() {
        System.out.println("---------------------------客户列表---------------------------\n");
        System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t邮箱\n");
        //获取到对象数组
        Customer[] allCustomers = customers.getAllCustomers();
        if (allCustomers == null) {//如果数组为空
            System.out.println("\n无数据！！！\n");
        } else {
            //遍历
            for (int i = 0; i < allCustomers.length; i++) {
                System.out.println(i + 1 + "\t\t" + allCustomers[i].getName() + "\t\t" + allCustomers[i].getGender()
                        + "\t\t" + allCustomers[i].getAge() + "\t\t" + allCustomers[i].getPhone() +
                        "\t\t" + allCustomers[i].getEmail());
            }
            System.out.println("\n---------------------------客户列表完成---------------------------");
        }
    }
}
