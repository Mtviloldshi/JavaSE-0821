package com.ambition.demo.projectp4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ambitions
 * @Date: 2020/09/20/15:19
 * @Description:
 *
 * 业务层
 *
 *  1.编写ItemService类，提供public void readTextFile(String filename)方法，
 *  该方法可读取参数指定的文本文件内容 （不使用包装） ，并打印输出到屏幕上
 *
 *  2.改进ItemService类的readTextFile方法: public List<String> readTextFile(String filename)，该方法使用流的链接，
 *  以文本行的方式读取参数指定的文本文件内容，并放置到集合中以作为该方法的返回值
 *
 *  3.在ItemService类中声明实例变量Item[] items；将ItemService类的readTextFile方法改为私有方法；
 *  * 在ItemService 类中添加构造器，构造器中调用 readTextFile方法，将方法返回的字符串集合组装为 Item对象，并将所有 Item对象以数组形式保存在
 *  *      items实例变量中；
 *  * 添加getItem方法： public Item getItem(int no)，该方法返回 ItemService中保存的由参数no指定的 Item对象；no从1开始
 *
 *  4.在ItemService类中添加saveAnswer方法： public void saveAnswer(char[] answer)，
 *  该方法创建answer.dat二进制文件，并将数组中的内容以对象形式写入到文件中保存；
 * 	提示：使用对象序列化机制
 * 在Exam类的main方法中调用 saveAnswer方法，测试是否正常工作。
 */
public class ItemService {
    private Item[] items = new Item[10];

    /**
     * 把数组以对象的方式存储到文件中
     * @param answer 数组名
     */
    public void saveAnswer(char[] answer){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("answer.dat"))){
                oos.writeObject(answer);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //获取考生填写答案
    public char[] getAnswer(){
        char[] answer = null;
        //显示考生答案
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("answer.dat"))){
           answer =(char[]) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return answer;
    }

    /**
     * 初始化构造器时，读取数据到集合中
     * 然后以对象的方式存入对象数组中
     */
    public ItemService() {
        List<String> list = readTextFile("Items.txt");
        int index = 0;
        for (int i = 0; i < items.length; i++) {
            String[] str = new String[6];
            for (int j = 0; j < str.length; j++) {
                str[j] = list.get(index);
                index++;
            }
            Item item = new Item(str[0],str[1],str[2],str[3],str[4],str[5]);
            items[i] = item;

        }
    }

    /**
     * 获取指定对象
     * @param no 对象编号
     * @return 对象
     */
    public Item getItem(int no){
        if (no < 0 || no > items.length) return null;
        return items[no-1];
    }

    /**
     * 读取任意类型文件到集合中
     * @param fileName 文件名
     * @return 集合
     */
    private List<String> readTextFile(String fileName){
        List<String> list = new ArrayList<>();
        String newLine = null;
        try (BufferedReader bis = new BufferedReader(new FileReader(fileName));){
            while ((newLine = bis.readLine()) != null){
                list.add(newLine);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
