package com.ambition.demo.reviewio.file;

import java.io.File;
import java.io.IOException;

/**
 * @Author: ambitions
 * @Date: 2020/09/14/18:24
 * @Description:
 *
 * 。输入也叫做读取数据，输出也叫做作写出数据。
 *
 * public String getName() ：返回由此File表示的文件或目录的名称。
 * public long length() ：返回由此File表示的文件的长度。
 * public String getPath() ：将此File转换为路径名字符串。
 * public long lastModified() ：返回File对象对应的文件或目录的最后修改时间（毫秒值）
 * public boolean exists() ：此File表示的文件或目录是否实际存在。
 * public boolean isDirectory() ：此File表示的是否为目录。
 * public boolean isFile() ：此File表示的是否为文件。
 *
 * 绝对路径：从盘符开始的路径，这是一个完整的路径。
 * 相对路径：相对于项目目录的路径，这是一个便捷的路径，开发中经常使用。
 * 规范路径：所谓规范路径名，即对路径中的“..”等进行解析后的路径名
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/test7.txt");
        //创建文件，返回创建结果
        boolean newFile = file.createNewFile();

        //返回文件的长度
        long length = file.length();
        System.out.println(length);

        //获取文件路径
        String path = file.getPath();
        System.out.println(path);

        //public long lastModified() ：返回File对象对应的文件或目录的最后修改时间（毫秒)
        long l = file.lastModified();
        System.out.println(l);

        //public String getAbsolutePath() ：返回此File的绝对路径名字符串。
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);
        //String getCanonicalPath() ：返回此File对象所对应的规范路径名
        String canonicalPath = file.getCanonicalPath();
        System.out.println(canonicalPath);

        System.out.println("----------------");
        //public boolean exists() ：此File表示的文件或目录是否实际存在。
        System.out.println(file.exists());
        //public boolean isDirectory() ：此File表示的是否为目录。
        System.out.println(file.isDirectory());
        //public boolean isFile() ：此File表示的是否为文件。
        System.out.println(file.isFile());
    }
}
