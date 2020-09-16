package com.ambition.demo.genneric.genneric1;

import org.junit.Test;

import java.util.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/14/9:28
 * @Description: 泛型：参数化类型，只能是引用数据类型
 * 泛型的好处：
 * 把运行期的安全隐患，在编译器提前解决掉
 * 不需要手动强制转换类型，避免了类型转换异常
 * <p>
 * 格式：
 * <数据类型>
 * 使用时，给出明确的数据类型
 * <p>
 * 可以使用的位置：
 * 类
 * 方法
 */
public class Demo1 {
    int a,b;
    public void f(){
        a = 0;
                b = 0;
        char[] c = {'0'};
        g(b,c);
        System.out.println( a );
        System.out.println( b );
        System.out.println( c[0] );
    }

    public void g(int b,char[] arr){
        a = 1;
        b = 1;
        arr[0] = '1';
    }
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.f();
//        Base base = new Base();
//        ArrayList list = new ArrayList();
//        list.add(1);
//        base.show(list);
//        System.out.println(list);
    }
}


class Base {
    public void show(ArrayList arr) {
        arr.add(2);
        arr = new ArrayList();
        arr.add(3);
        arr.add(4);
        System.out.println(arr);
    }
}
