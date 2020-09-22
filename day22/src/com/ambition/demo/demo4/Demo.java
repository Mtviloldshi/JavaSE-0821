package com.ambition.demo.demo4;

import org.junit.Test;

import java.time.temporal.ValueRange;
import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

/**
 * @Author: ambitions
 * @Date: 2020/09/21/10:27
 * @Description:
 *
 *  lambda的使用
 */
public class Demo {
    //1.自定义函数接口，无参无返回值
    @Test
    public void test1(){
        callSomething(new Call() {
            @Override
            public void shout() {
                System.out.println("无参无返回值");
            }
        });

        callSomething(() -> System.out.println("无参无返回值"));
    }

    //2.消费型
    @Test
    public void test2(){
        Consumer<String> consumer1 = new Consumer<String>(){
            @Override
            public void accept(String o) {
                System.out.println(o);
            }
        };

        consumer1.accept("jsj");

        Consumer consumer = s -> System.out.println(s);
        consumer.accept("有参无返回值");

        //Collection集合中应用消费性接口
        List<String> list = new ArrayList<>();
        list.add("jsj");
        list.add("jsj1");
        list.add("jsj2");
        //遍历
        list.forEach(s ->
                {
                    if (s.equals("jsj")) {
                    }
                    System.out.println(s);
                }
                );
    }

    //3.供给型
    @Test
    public void test3(){
        Stream<Double> stream = Stream.generate(new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        }).limit(10);
        stream.forEach(i -> System.out.println(i));

        System.out.println("-------------");

        Stream.generate(() -> Math.random()).limit(10).forEach(i -> {
            if (i < 0.5){
                i = 0.999;
            }
            System.out.println(i);
        });
    }

    //4.功能型
    @Test
    public void test4(){
        Map<Integer,String> map = new HashMap<>();
        map.put(123,"tom");
        map.put(456,"jack");
        map.put(789,"jrray");
        map.replaceAll(new BiFunction<Integer, String, String>() {
            @Override
            public String apply(Integer integer, String s) {
                if (integer > 200){
                    s = "hhhh";
                }
                return s;
            }
        });

        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println(integer + "=" + s);
            }
        });

        System.out.println("----------");

        //优化
        map.replaceAll((k,v) -> {
            if (k > 200)
                v = "hhh";
            return v;
        });

        map.forEach((k,v) -> System.out.println(k + "=" + v));
    }

    //5.判断型
    @Test
    public void test5(){
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add("123");
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 4;
            }
        });
        list.forEach(s -> System.out.println(s));

        System.out.println("-----------");
        list.removeIf(s -> s.length() > 3);
        list.forEach(s -> System.out.println(s));

    }

    public static void callSomething(Call call){
        call.shout();
    }

}

interface Call{
    void shout();
}
