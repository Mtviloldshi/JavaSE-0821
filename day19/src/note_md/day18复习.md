### 一、泛型

* 概念：是一种参数类型，一般用于集合中，使用时明确数据类型，表示在此集合中放入的元素类型。
* 好处：把运行期间的存在的安全隐患，提前到编译器解决。获取集合中的元素时，无需再进行类型的强制转换
* 使用：`<String>` 明确数据类型，必须是引用数据类型。使用时如果不明确泛型类型，则认为Object类型
* 格式：定义`<T>`  
* 定义的位置：接口、类、方法
* 自定义泛型：
    * `interface inter<T>{ void show();}`
    * `class MyClass<T>{ private E e;}`
    * `public <T> void show(E e)`
    
* 通配符
    * `<?>`:表示任意泛型类型.比如 方法参数需要一个List<?>,表示带任意泛型的List，都可以接受
    * `<? extends T>`:表示任意带泛型类型及其子类。比如 方法参数需要一个List<? extends T>,表示带任意泛型的T及其子类，都可以接受
    * `<? super T>`:表示任意带泛型类型及其父类。比如 方法参数需要一个List<? super T>,表示带任意泛型的T及其父类，都可以接受
    


### 二、File类

* 理解：系统中文件或者目录的抽象表示形式，一个File类对象，就封装了一个文件或者目录的信息，并且可以对文件进行创建或删除操作    

* 构造方法：
    * File(String file)://new File("D:/test.txt");
    
    * File(File f,String name)://File file1 = new File("D:/"); File file2 = new File(file1,"D:hello/test.txt");
    
### 三、IO流    

* 理解：IO流表示数据的输入、输出，就跟水流动一样，数据从一个源头(硬盘)到目的地(内存)。

* IO流的分类：
    * 根据数据的流向分：
        * 输入流：参照物：(内存、Java程序)
            * InputStream:
                * FileInputStream:
                    * FileInputStream(String file);
                    * FileInputStream(File file);
                    * int read();
                    * int read(byte[] bys);
            * Reader:
                * FileReader:
                    * FileReader(String);
                    * int read();
                    * int read(char[] cs);
        * 输出流
            * OutputStream:
                * FileOutputStream:
                    * FileOutputStream(String file);
                    * FileOutputStream(File file,boolean append);//true追加写入，默认false
                    * write(int i);
                    * write(byte[] bys);
                    * write(byte[] bys,int off,int len)
            * Write:
                * FileWrite:
                    * FileWrite(String file);
                    * FileWrite(File file,boolean append);//true追加写入
                    * write(int i);
                    * write(String str);
                    * write(char[] chs);
                    * write(char[] chs,int off,int len);
    * 根据数据传输的基本单位：
        * 字节流：
            * InputStream:
                * FileInputStream:
            * OutputStream:
                FileOutputStream:        
        * 字符流    
            * Reader:
                * FileReader:
            * Write:
                * FileWrite: