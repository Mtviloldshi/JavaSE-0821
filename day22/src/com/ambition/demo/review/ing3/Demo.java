package com.ambition.demo.review.ing3;

/**
 * @Author: ambitions
 * @Date: 2020/09/17/11:38
 * @Description: public static String replace(String text, String target, String replace){
 * ....
 * }
 * 示例 ：replace(“aabbccbb”, “bb”, “dd”); 结果 ：aadccdd
 * 注意：不能使用 注意：不能使用 注意：不能使用 注意：不能使用 String及 StringBuffer等类的 等类的 replace等现成的替换 等现成的替换 等现成的替换 API方法。
 */
public class Demo {
    public static void main(String[] args) {
        String text = "aabbccbb";
        String target = "bb";
        String replace = "dd";

        String rel = replace(text, target, replace);
        System.out.println("原数据:" + text);
        System.out.println("替换后的数据：" + rel);
    }

    public static String replace(String text, String target, String replace) {
        char[] arr = text.toCharArray();
        //替换数组
        char[] arr3 = target.toCharArray();
        char[] arr4 = replace.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr3[0]){
                arr[i] = arr4[0];
            }
        }
        return String.valueOf(arr);
    }
}
