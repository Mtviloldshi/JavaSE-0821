package com.ambition.demo.demo5stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author: ambitions
 * @Date: 2020/09/21/14:14
 * @Description:
 *
 *  Stream流：
 *      用于处理数据
 * 特点：
 *      不存储数据
 *      不改变源数据，每次操作都会返回一个持有结果的新Stream
 *      操作是延时的，等到需要结果的时候才执行
 *
 * 使用步骤
 *      创建Stream：通过一个数据源（集合、数组），获取一个流
 *      中间操作
 *      终止操作
 */
public class Demo {
    public static void main(String[] args) {
        //1.通过集合获得Stream
        List<String> list = Arrays.asList("hello","world","java");
        Stream<String> stream = list.stream();
        //2.通过数组
        IntStream stream1 = Arrays.stream(new int[]{1, 2, 3, 4, 5});
        Stream<String> stream2 = Arrays.stream(new String[]{"hhh", "eee", "lll"});
        //3.通过Stream静态方法
        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);
        //4.无限流
        Stream<Double> stream4 = Stream.generate(Math::random);
        Stream<Integer> stream5 = Stream.iterate(0, s -> s + 2);
        stream5.forEach(System.out::println);
    }
}
