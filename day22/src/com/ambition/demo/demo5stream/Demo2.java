package com.ambition.demo.demo5stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @Author: ambitions
 * @Date: 2020/09/21/14:29
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("c++");
        list.add("c++");
        Stream<String> stream = list.stream();
        //1.filter()接收lambda表达式，过滤满足条件元素，返回一个满足条件的集合
        Stream<String> stream1 = stream.filter(s -> s.length() > 4);
        stream1.forEach(System.out::println);
        //链式编程
        list.stream().filter(s -> s.length() > 4).forEach(System.out::println);
        System.out.println("------------------");
        //2.去重distinct()
        list.stream().distinct().forEach(System.out::println);

        System.out.println("-----------------");

        //3.limit(3) 截取前三个元素返回
        list.stream().limit(3).forEach(System.out::println);
        //返回前五个
        Stream.generate(Math::random).limit(5).forEach(System.out::println);
        System.out.println("-------------");

        //4，skip(3) 舍弃前三个元素
        list.stream().skip(3).forEach(System.out::println);
    }

    @Test
    public void test1(){
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("c++");
        list.add("c++");

        //5.sorted()自然排序，
        list.stream().sorted().forEach(System.out::println);
        System.out.println("---------");

        //6.sorted()定制排序
        list.stream().sorted((s1,s2) -> s1.length() - s2.length()).forEach(System.out::println);
        System.out.println("___________");

        //7.peek() 对流中每个数据执行lambda操作
        list.stream().peek(s -> System.out.println(s.length())).forEach(System.out::println);

    }

    @Test
    public void test2(){
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("c++");

        //8.map(s -> s + 123) 映射操作
        list.stream().map(s -> s + 123).forEach(System.out::println);
        System.out.println("--------------");

        //9.mapToDouble(String::length)
        list.stream().mapToDouble(String::length).forEach(System.out::println);
        System.out.println("----");

        //10.mapToInt(String::length)
        list.stream().mapToInt(String::length).forEach(System.out::println);
        System.out.println("---------");

        //11.mapToLong(String::length)
        list.stream().mapToLong(String::length).forEach(System.out::println);
        System.out.println("-------");

        //12.flatMap()将元素的每个元素转成一个流
//        list.stream().flatMap()
    }
}
