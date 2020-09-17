package review.test01.ing2;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: ambitions
 * @Date: 2020/09/16/14:06
 * @Description:
 *
 *  请编写代码使用把一个字符串反转，例如： hello1234
 */
public class Demo4 {
    public static void main(String[] args) {
        char[] arr = {'h','e','l','o','1','2','3','4'};

        for (int i = 0; i <= arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test(){
        String str = "hello1234";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
}
