### 常用类

#### 一、String类

* 引用数据类型，表示一个字符序列，比如：字符串字面量" ABD" 表示这个类的实例，存在常量池中。

* 特点：
    * 字符串一旦创建不可变
    * 数据通过一个私有char[]来存储字符序列，并且String类中没有对外提供方法来操作此属性，所以不可变。
    * 字符串常量存储在常量池中，并且只有一份
    
* 创建字符串方式：
    * String s = "abc";
    * new String(); 
    * new String("abc"); //如果常量池中没有"abc"则在常量池中存储，然后再在堆中new出一个String对象。   
    * new String(char[] arr)
    * new String(char[] arr,int offset,int count)
    * new String(byte[] byte,int offset,int count)
    * 通过连接符 + 号，任意类型数值与+连接 结果都为字符串
    
* 字符串常用方法：
    > ""空串 ," "空格字符串,null无数据      
             
* 内存分析：
    * [见day13/images/内存图分析png]
    
#### 二、可变字符串序列 StringBuffer StringBuilder   拼接字符串时效率高于直接操作String对象。
    
* StringBuffer 线程安全
* StringBuilder 线程不安全

* 使用方法
    * StringBuilder sb = new StringBuilder("sss");
    * sb.append("kkk");//直接在后面拼接字符串
    * String s = sb.toString();//转为字符串对象
    
#### 三、数学相关类类

* Math类
    * 提供了一些基础数学运算方法

* Random随机数类
    * Random random = new Random();
    * int num = random.nextInt();//返回一个伪随机整数
    * int num = random.nextInt(n);//返回一个[0-n) 的伪随机整数
    
* BinInteger 用于精确表示(运算)超大整数
* BigDecimal 用于精确表示(运算)超大小数    
   