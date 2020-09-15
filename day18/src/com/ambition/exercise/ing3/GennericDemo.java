package com.ambition.exercise.ing3;

import org.junit.Test;

import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: ambitions
 * @Date: 2020/09/14/19:56
 * @Description:
 *
 *  （1）可以在任意类型的对象数组中，查找某个元素的下标，按照顺序查找，如果有重复的，就返回第
 * 一个找到的，如果没有返回-1
 * （2）可以在任意类型的对象数组中，查找最大值，要求元素必须实现Comparable接口
 * （3）可以在任意类型的对象数组中，查找最大值，按照指定定制比较器来比较元素大小
 * （4）可以给任意对象数组进行从小到大排序，要求数组元素类型必须实现Comparable接口
 * （5）可以给任意对象数组进行从小到大排序，只要你指定定制比较器对象，不要求数组元素实现
 * Comparable接口
 * （6）可以将任意对象数组的元素拼接为一个字符串返回
 */
public class GennericDemo {
    public static void main(String[] args) {
        String[] arr = {"6","9","2","3","8","5","9","3","1","4"};
        int index = Tools.indexOfs(arr, "9");
        System.out.println(index);
        if (index != -1){
            System.out.println("找到了:" + arr[index]);
        }else {
            System.out.println("未找到");
        }

    }

    @Test
    public void test(){
        String[] str = {"he","sj","sksk","aosdi","a","b"};
//        Tools.sort(str);
        System.out.println(Arrays.toString(str));
//        Tools.sort2(str);
        Tools.sort3(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(str));
        System.out.println("-------------");
        String s = Tools.returnStr(str);
        System.out.println(s);
    }
}

class Tools{

    //（6）可以将任意对象数组的元素拼接为一个字符串返回
    public static <T> String returnStr(T[] arr){
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
        }
        return str;
    }

//     * （4）可以给任意对象数组进行从小到大排序，要求数组元素类型必须实现Comparable接口
    public static <T extends Comparable<? super T>> void sort(T[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0){
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }
    public static <T extends Comparable<? super T>> void sort2(T[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minter = i;
            for (int j = i + 1; j < arr.length; j++) {//每次从i + 1开始
                if (arr[minter].compareTo(arr[j]) > 0){
                    minter = j;
                }
            }
            if (minter != i){
                T temp = arr[minter];
                arr[minter] = arr[i];
                arr[i] = temp;
            }
        }
    }


// * （5）可以给任意对象数组进行从小到大排序，只要你指定定制比较器对象，不要求数组元素实现Comparable接口
    public static <T> void sort3(T[] arr,Comparator<? super T> comparator){
        for (int i = 0; i < arr.length - 1; i++) {
            int minter = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (comparator.compare(arr[minter],arr[j]) > 0){
                        minter = j;
                }
            }
            if (minter != i){//当minter = j;进行交换数据
                T temp = arr[minter];
                arr[minter] = arr[i];
                arr[i] = temp;
            }
        }
    }

//    （2）可以在任意类型的对象数组中，查找最大值，要求元素必须实现Comparable接口
    public static <T extends Comparable<? super T>> T selectMax(T[] arr){
            T max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max.compareTo(arr[i]) < 0){
                max = arr[i];
            }
        }
            return max;
    }
 // * （3）可以在任意类型的对象数组中，查找最大值，按照指定定制比较器来比较元素大小
    public static <T> T selectMax2(T[] arr,Comparator<? super T> comparator){
        T max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (comparator.compare(max,arr[i]) < 0){
                max = arr[i];
            }
        }
        return max;
    }

    public static <T> int indexOfs(T[] arr,T t){
        for (int i = 0; i < arr.length; i++) {
            if (t.equals(arr[i])){
                return i;
            }
        }
//        Arrays.sort(arr);
//        int index = Arrays.binarySearch(arr, t);
//        if (index > -1){
//            return index;
//        }
        return -1;
    }
}
