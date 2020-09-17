package review.test02.ing2;

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
        char[] arr1 = new char[arr.length - 1];
        //删除b
        for (int i = 3; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        //复制数据到新数组
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        //修改指定字符串的值 到新数组
        char[] arr3 = target.toCharArray();
        char[] arr4 = replace.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr3[0]){
                arr1[i] = arr4[0];
            }
        }
        return String.valueOf(arr1);
    }
}
