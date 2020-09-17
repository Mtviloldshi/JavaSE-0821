package review.test01.ing3;

import java.util.Arrays;

/**
 * @Author: ambitions
 * @Date: 2020/09/16/14:13
 * @Description:
 *
 *  String str = "342567891";
 *  升序
 */
public class Demo {
    public static void main(String[] args) {
        String str = "342567891";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        String str2 = new String(chars);
        System.out.println(str2);
    }
}
