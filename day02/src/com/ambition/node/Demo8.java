package com.ambition.node;
/*
 * 	逻辑运算符
 * 		与& 或| 非! 异或^ 短路与&& 短路||
 *
 */
public class Demo8 {

    public static void main(String[] args) {
        int a = 3,b = 4,c = 5;
        //与&两边都为真，结果才为真
        System.out.println((a>b) & (a<c));
        //或| 两边都为假，结果才为假
        System.out.println((a>b) & (a<c));
        System.out.println(!true);
        //^异或 相同为假 相反为真
        System.out.println(true ^ false);

//		短路与&& 短路||
        //&&左边第一个为假，后面不执行
        //||左边第一个为真，后面不执行
        System.out.println((a>b) && (a<c));
        System.out.println((a>b) || (a<c));
    }

}
