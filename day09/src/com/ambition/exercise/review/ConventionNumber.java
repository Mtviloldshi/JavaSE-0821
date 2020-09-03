package com.ambition.exercise.review;

/*
    求任意个数的 最大公约数
        最大公约数：两个或者多个数可以同时整除的最大数
 */
public class ConventionNumber {
    //找出多个字符串相同字母
    public static String sameChars(String... words){
        String same = "";
        //找出所有words中相同的字符拼接起来
        //先用一个数组，表示26个字母是否在单词中出现过
        boolean[] appear = new boolean[26];//默认false
        /*
            appear[0]表示a字符是否在所有单词出现，如果是true，表示出现了，就是工共的，
                如果是false，表示没有出现，不是公共的
         */
        //从'a' -> 'z';
        for (char letter = 'a'; letter <= 'z' ; letter++) {
            boolean flag = true;//假设所有的words中都有这个letter
            for (int i = 0; i < words.length; i++) {
                //判断letter是否在words中出现过
                boolean now = false;//假设在words[i]中没有出现过
                for (int j = 0; j < words[i].length(); j++) {
                    if (words[i].charAt(j) == letter){//说明letter在当前words中
                        now = true;
                        break;
                    }
                }
                if (now == false){//说明letter在当前words[i]中没有出现
                    flag = false;
                    break;
                }
            }
            if (flag == true){
                appear[letter - 97] = true;
            }
        }

        for (int i = 0; i < appear.length; i++) {
            if (appear[i] == true){
                same += (char)(97 + i);
            }
        }

        return same;
    }

    public static int maxYue(int... num) {
        //求出最小值
        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (min > num[i]){
                min = num[i];
            }
        }

        //从最小的值往1的方向找，找到第一个公约数就是他们最大的公约数
        for (int i = min; i > 1 ; i--) {
            boolean flag = true;//默认是公约数
            for (int j = 0; j < num.length; j++) {
                if (num[j] % i != 0){//有一个数不能整除最小值，说明不是公约数，跳出循环
                    flag = false;
                    break;
                }
            }
            if (flag){
                return i;
            }
        }
        return 1;
    }

//    public static int conventionNumber(int... num) {
//        //求出最小值
//        int min = num[0];
//        for (int i = 1; i < num.length; i++) {
//            if (min > num[i]) {
//                min = num[i];
//            }
//        }
//
//        //求出最大公约数
//        for (int k = 0; k < num.length; k++) {
//            int j = 0;
//            for (int i = 0; i < num.length; i++) {
//                if (num[i] % min == 0) {
//                    j++;
//                }
//            }
//            if (j == num.length) {
//                return min;
//            }
//            if (min > 1) {
//                min--;
//            }
//            if (min == 1) {
//                return 1;
//            }
//        }
//        return 1;
//    }
}
