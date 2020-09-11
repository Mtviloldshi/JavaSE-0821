package com.ambition.exercise.before.exercise;

import org.junit.Test;

import java.util.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/10/15:13
 * @Description:
 *  添加100以内的质数到Collection的某个集合中
 * 使用foreach遍历
 * 使用Iterator遍历，并删除个位数是3个质数
 * 删除11
 * 查看最后剩下几个元素
 *
 * 添加10个100以内的随机整数到另一个Collection的集合中
 * 求它们的交集
 */
public class CollectionExercise {
    public static void main(String[] args) {
        Collection<Integer> coll = new ArrayList<>();

        //添加100以内的质数到Collection的某个集合中
        for (int i = 2; i < 100; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                coll.add(Integer.valueOf(i));
            }
        }
        //使用foreach遍历
        for (Integer number:
                coll) {
            System.out.print(number + "\t");
        }
        System.out.println();

        //使用Iterator遍历，并删除个位数是3个质数
        Iterator<Integer> iterator = coll.iterator();
        //删除个位数是3个质数,集合转数组
        Object[] objects = coll.toArray();
        //创建新数组存储位个位数不是3的质数
        int[] sb = new int[objects.length];
        //初始化sb数组角标
        int j = 0;
        for (int i = 0; i < objects.length; i++) {
            if ((int)objects[i] % 10 != 3){
                sb[j++] = ((int)objects[i]);
            }
        }
        //初始化没有数据的角标
        int index = 0;
        //找到没有数据位置角标
        for (int i = 0; i < sb.length; i++) {
            if (sb[i] == 0){
                index = i;
                break;
            }
        }

        //初始化装新数据的数组 长度为index，将数据放进新数组
        int[] arr2 = new int[index];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sb[i];
        }
        System.out.println(Arrays.toString(sb));
        System.out.println(Arrays.toString(arr2));

        //初始化装减去11 的数组，并把减掉11之后的数组放进新数组
        int[] arr3 = new int[index - 1];
        for (int i = 0; i < arr2.length -1; i++) {
            if (arr2[i] == 11){//如果找到11，后面书一次往前替换
                for (int k = i; k < arr2.length - 1; k++) {
                    arr3[k] = arr2[k + 1];
                }
            }
            if (arr2[i] < 11){//如果没找到，正常替换
                arr3[i] = arr2[i];
            }
        }
        //删除原有的数据
        System.out.println(coll.removeAll(coll));

        //把数组新数据添加到 集合中
        for (int i = 0; i < arr3.length; i++) {
            coll.add(arr3[i]);
        }
        System.out.println("size" + coll.size());

        //添加10个 0-100以内的随机数到另一个集合中
        //创建一个新集合
        Collection<Integer> coll2 = new ArrayList<>();
        //实例化随机数对象
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            //将随机数添加进集合中
            coll2.add(Integer.valueOf(random.nextInt(99)));
        }

        System.out.println("随机数");
        for (Integer num :
                coll2) {
            System.out.print(num+ "\t");
        }

        //返回两个集合的子集 子集在coll集合
        System.out.println("\n" + coll.retainAll(coll2));

        System.out.println();
        //使用foreach遍历
        for (Integer number:
                coll) {
            System.out.print(number + "\t");
        }
    }

    @Test
    public void test(){
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 3){
                System.out.println(i);
            }

        }
    }
}
