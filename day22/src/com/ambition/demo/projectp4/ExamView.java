package com.ambition.demo.projectp4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

/**
 * @Author: ambitions
 * @Date: 2020/09/21/8:25
 * @Description:
 *  1.编写ExamView类，声明getUserAction方法：public char getUserAction()，在方法中读取键盘键入值（每次只取键入序列的第一个键值），
 *  判断键值应为a、b、c、d、n、p键（包括大小写）值之一时，将其作为方法返回值，否则忽略不计；
 *
 *  2.在ExamView类中，声明displayItem方法：public void displayItem(int  no)，该方法显示参数no指定的考题内容，不含答案；
 *  3.在ExamView类，声明testExam方法：public void testExam()，在方法中：
 *      初始时，调用 displayItem显示考题第1题；
 *      调用 getUserAction方法，判断当用户键入n时，显示下一题；当用户键入p时，显示上一题（如果当前不是第1题时）；
 *      在当前为最后一题时键入n，方法结束并返回。
 * 在Exam类的main方法中调用 testExam方法，验证结果。
 *
 * 4.在ExamView类中，定义char[] answer属性，改进testExam方法，在原基础上：
 *      调用 getUserAction方法，判断当用户键入a、b、c、d中的任意键时，将其记为当前题目的答案（记入 answer数组中）；
 *      在显示最后一题时键入n，方法结束， 调用ItemService中的saveAnswer保存所有答案，并返回。
 * 5.在Exam类的main方法中调用 ExamView类的testExam方法，测试题目显示及按键操作是否正确
 *
 * 6在ExamView类中，继续改进testExam方法，在原基础上：
 *      起始进入考试时，首先显示一页“帮助信息”，用来说明考试过程中的操作方法，尤其是各按键的使用。
 *      当键入n时，显示第一道题；在显示每题题目的同时，如果之前考生已经选择了该题目的答案，则答案也同时显示以便考生查看；
 *      键入f表示结束考试，程序应提示用户进行确认。如确认则自动判分，并调用ItemService中的saveAnswer保存所有答案及分数；
 *      并显示所有考题的正确答案和考生所选答案，以及考试分数，然后方法结束。如果不确认，则继续答题。
 *      在Exam类的main方法中调用 ExamView类的testExam方法，验证程序是否正确运行
 */
public class ExamView {
    private Scanner scan = new Scanner(System.in);
    private  ItemService itemService = new ItemService();
    private char[] answer = new char[10];//保存答案
    private int num = 1;//当前题号
    private int score = 0;//分数

    /**
     * 显示考试帮助信息
     */
    public void show(){
        System.out.println("-------------------帮助信息-------------------\n");
        System.out.println("                 1.输入N字母进入考试\n");
        System.out.println("                 2.输入a、b、d、c来填写您的答案\n");
        System.out.println("                 3.每次答完题目会有正确答案显示\n");
        System.out.println("                 4.答完题后输入N进入下一题，输入P查看上一题\n");
        System.out.println("                 5.输入F键结束考试，结算分数\n");
    }

    /**
     * 结算分数,显示所有考题已经答案
     * 键入f表示结束考试，程序应提示用户进行确认。如确认则自动判分，并调用ItemService中的saveAnswer保存所有答案及分数；
     * 并显示所有考题的正确答案和考生所选答案，以及考试分数，然后方法结束。如果不确认，则继续答题。
     */
    public boolean showOut(){
        System.out.print("是否确认结束答题？Y/N:");
        char c = scan.next().charAt(0);
        if (c == 'y' || c == 'Y'){
            itemService.saveAnswer(answer);//将所有答案保存到文件中
            System.out.println("您的分数" + score);
            //正确答案和题目
            for (int i = 1; i <= 10; i++) {
                displayItem1(i);
            }
            System.out.print("您的答案:");
            char[] answer = itemService.getAnswer();
            System.out.println(answer);
            return false;
        }
        return true;
    }

    public void showOut2(){
            System.out.println("题目已答完:");
            itemService.saveAnswer(answer);//将所有答案保存到文件中
            System.out.println("您的分数" + score);
            //正确答案和题目
            for (int i = 1; i <= 10; i++) {
                displayItem1(i);
            }
            System.out.print("您的答案:");
            //显示考生答案
            char[] answer = itemService.getAnswer();
            System.out.println(answer);
    }

    /**
     * 保存答案，计算分数
     */
    public void saveCount(){
        System.out.print("请输入答案：");
        char chs2 = getUserAction();//接收答案字母
        if (chs2 == 'A' || chs2 == 'B' || chs2 == 'C' || chs2 == 'D'){
            String answer = itemService.getItem(num).getAnswer();
            System.out.println("正确答案是：" + answer);
            if (answer.charAt(0) == chs2){//如果答案正确
                score +=10;
            }
            this.answer[num - 1] = chs2;//保存考生答案
        }
    }

    /**
     * 调用 getUserAction方法，判断当用户键入a、b、c、d中的任意键时，将其记为当前题目的答案（记入 answer数组中）；
     * 在显示最后一题时键入n，方法结束， 调用ItemService中的saveAnswer保存所有答案，并返回。
     * Version 2.0
     *
     */
    public void testExam(){
        show();//显示信息帮助
        char chs = ' ';
        if (getUserAction() == 'N'){
            displayItem(num);
        }
        do {
            saveCount();//判断输入的答案是否正确，并计算分数，保存答案
            chs = getUserAction();//接收切题字母
            if ( chs == 'N'){
                if (num == 10){
                    showOut2();
                    break;
                }
                num++;
                displayItem(num);
            }else if (chs == 'P'){
                if (num == 1){
                    displayItem(num);
                }else
                    displayItem(num - 1);
            }else if (chs == 'f' || chs == 'F'){
                boolean b = showOut();
                if (b){
                    break;
                }
            }
        }while (true);
    }

    /**
     * 初始时，调用 displayItem显示考题第1题；
     * 调用 getUserAction方法，判断当用户键入n时，显示下一题；当用户键入p时，显示上一题（如果当前不是第1题时）；
     * version 1.0
     */
//    public void testExam(){
//        int num = 1;
//        boolean flag = true;
//        displayItem(num);
//        do {
//            char chs = getUserAction();
//            if (chs == 'n' || chs == 'N'){
//                if (num == 10){
//                    break;
//                }
//                num++;
//                displayItem(num);
//            }else if (chs == 'p' || chs == 'P'){
//                if (num == 1){
//                    displayItem(num);
//                }else
//                    displayItem(num - 1);
//            }
//        }while (flag);
//    }

    /**
     * 显示参数no指定的考题内容 不包括答案
     * @param no 题号
     */
    public void displayItem(int  no){
        Item item = itemService.getItem(no);
        System.out.println(item.getTopic());
        System.out.println(item.getOptionsA());
        System.out.println(item.getOptionsB());
        System.out.println(item.getOptionsC());
        System.out.println(item.getOptionsD());
    }

    /**
     * 显示参数no指定的考题内容 包括答案
     * @param no 题号
     */
    public void displayItem1(int  no){
        Item item = itemService.getItem(no);
        System.out.println(item.getTopic());
        System.out.println(item.getOptionsA());
        System.out.println(item.getOptionsB());
        System.out.println(item.getOptionsC());
        System.out.println(item.getOptionsD());
        System.out.println(item.getAnswer());
    }

    /**
     * 读取键盘录入的数据
     * @return 返回键盘录入的数据
     */
    public char getUserAction(){
        String str = scan.next();
        switch (str.charAt(0)){
            case 'a':
            case 'A':
                return str.toUpperCase().charAt(0);
            case 'b':
            case 'B':
                return str.toUpperCase().charAt(0);
            case 'c':
            case 'C':
                return str.toUpperCase().charAt(0);
            case 'd':
            case 'D':
                return str.toUpperCase().charAt(0);
            case 'n':
            case 'N':
                return str.toUpperCase().charAt(0);
            case 'p':
            case 'P':
                return str.toUpperCase().charAt(0);
            default:
                return ' ';
        }
    }
}
