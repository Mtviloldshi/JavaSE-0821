### IO

#### 一、缓存流(处理流):对基本流的包装处理，提供一个数据缓冲区，目的就是提升效率

* BufferedInputStream
    * BufferedInputStream(InputStream is);
        * int read();
        * int read(byte[] bys);
        
* BufferedOutputStream
    * BufferedOutputStream(OutputStream);
        * write(int bye);
        * write(byte[] bys);
        * write(byte[],int off,int len);
        
* BufferedReader
    * BufferedReader(Reader reader);
        * int read();
        * int read(char[] chs);
        * String readLine();//读取一行数据 返回字符串
        
* BufferedWrite
    * BufferedWriter(Writer writer);
        * write(int ch);
        * write(char[] chs);
        * write(char[],int off,int len);
        * write(String str);
        * newLine();//换行
        * flush();//刷新缓冲区
        
#### 二、转换流

* 本质上是把字节流转换为字符流，转换流也是字符流

* InputStreamWriter
    * InputStreamWriter(InputStream is);//使用平台默认编码
    * InputStreamWriter(InputStream is,String charset)//按照指定的编码格式读取字节数据
        * read();
        * read(char[] chs);
    
* OutStreamReader               
    * OutStreamReader(OutputStream os);
    * OutStreamReader(OutputStream os,String charset);//把数据写入到文件中
        * write(int ch);
        * write(char[] chs);
        * write(char[],int off,int len);
 
#### 三、对象流

* 如果想把Java对象直接存储到对象文件当中，需要使得Java类实现Serializable接口，这就是序列化。
* 如果想想读取文件中得一个Java对象到内存中，这就是反序列化。
  
* ObjectOutputStream
    * ObjectOutputStream(OutputStream os);
    * writeObject(Object obj);//写入Java对象
    
* ObjectInputStream    
    * ObjectInputStream(InputStream is);
    * readObject();//读取一个对象
    
#### 四、其他流

* 打印流
    * PrintStream
        * print(Object obj);
        * println(Object obj);
        * println();//换行
        
    * printWrite 
        * print(Object obj);
        * println(Object obj);
        * println();//换行 
        
* 标准输入输出流
    * System.in :本质是字节输入流
    * System.out: 本质上是字节打印流
    
#### 五、JKD7处理流异常的方式

* jkd7之前
* > try{需要处理的异常}catch(Exception e){处理方式}                  

* jdk7方式  自动释放资源
* > try(需要释放资源的变量声明){需要处理的代码}catch(IOException e){处理方式}        
  
  
### 网络编程

* 网络的软件架构：
    * B/S: Browser Server  
        * 对开发人员：只需要开发服务器端，升级更新也只需要针对服务端
        * 针对用户：无需下载客户端，有浏览器即可
        * 安全性相对差，对带宽要求高，对大型游戏运行效果差
    * C/S: Client Server
        * 需要开发客户端 、服务端
        * 使用时需要下载客户端，要更新客户端
        * 安全性相对高，对网络要求相对低，只管传输数据
        
* TCP与UDP协议
    * UDP协议:（发短信）
        * 非面向连接
        * 安全性差、效率高
        * 传输的数据量有限
        
    * TCP协议:（打电话）
        * 面向连接
        * 安全性高、效率低    
        * 传输的数据量无限制
        * 建立连接：三次握手
        * 断开连接：四次挥手
        
* 网络编程三要素
    * 协议、IP（识别网络中的计算机）、端口号（识别计算机上的某个程序）
    
* TCP网络编程
    * 客户端
        * Socket s = new Socket("127.0.0.1",8888);         
        * OutputStream os = s.getOutputStream();   
        * os.write("hello".getBytes());
        * s.close();
    
    * 服务端
        * SocketServer ss = new SocketServer(8888);
        * Accept at = ss.accept();    
        * InputStream is = at.getInputStream();
        * byte[] bys = new byte[1024]
        * int len = -1;
        * ((len = is.read(bys)) != -1){}
        * is.close();