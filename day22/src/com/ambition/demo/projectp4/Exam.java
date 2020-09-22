package com.ambition.demo.projectp4;

import java.util.List;

/**
 * @Author: ambitions
 * @Date: 2020/09/20/16:24
 * @Description:
 *
 * 1.Exam类的main方法中调用 getItem方法，接收方法返回的Item对象，在屏幕上打印对象。
 *
 * 2.在Exam类的main方法中调用重复（循环）调用getUserAction方法，打印返回值，
 * 直到程序结束运行。
 *
 * 3.在Exam类的main方法中调用 ExamView类的testExam方法，验证程序是否正确运行
 */
public class Exam {
    private static ItemService itemService = new ItemService();
    private static ExamView examView = new ExamView();

    public static void main(String[] args) {
        //1.测试把数据存入集合是否正常
//        List<String> list = itemService.readTextFile("Items.txt");
//        for (String s : list) {
//            System.out.println(s);
//        }
        //2.测试从集合取出数据，以对象的形式存入对象数组，取出是否正常
//        Item item = itemService.getItem(10);
//        System.out.println(item.getTopic());
//        System.out.println(item.getOptionsA());
//        System.out.println(item.getOptionsB());
//        System.out.println(item.getOptionsC());
//        System.out.println(item.getOptionsD());
//        System.out.println(item.getAnswer());
        //3.测试对象序列化是否正常
//        itemService.saveAnswer(new char[]{'c','b','a','y','o'});
        //4.测试键盘录入是否正常
//        for (int i = 0; i < 7; i++) {
//            char userAction = examView.getUserAction();
//            System.out.println(userAction);
//        }

        //5.测试显示题目是否正常 1.0
//        examView.testExam();

        //6.测试显示题目是否正常 2.0
//        examView.testExam();

        //6.测试程序答应功能 3.0
        examView.testExam();
    }
}
