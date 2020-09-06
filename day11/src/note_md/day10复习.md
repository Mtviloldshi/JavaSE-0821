### 多态

* 格式：父类引用对象指向子类对象(接口引用对象指向其实现类)

* 多态的前提：继承（实现接口）、重写
    * Fu fu = new Zi();
* 多态时成员特点：
    * 成员变量： 编译、运行都看左边
    * 成员方法： 编译看左边，运行看右边
    * 静态方法： 编译运行都看左边
    * 私有方法： 不能重写
    
* 多态的特点：    
    * 增强了程序的拓展性
    * 降低了类之间的耦合度    
    
* 应用
    * 用在方法的参数上：
        * public void feed(Animal animal){}
    * 用在方法返回值类型：
        * public Animal getAnimal(){}
    * 用在对象数组
        * Animal[] animal = {};
        
* 多态的弊端
    * 不能使用子类的特有方法
    * 解决：
        * 向下转型 ：
            * Animal animal = new Dog();
            * Dog dog = (Dog) animal;        
            
    * instanceof关键字: 判断变量是否为匹配类型，结果为boolean类型
         * if(animal instanceof Dog){ Dog dog = (Dog) animal;}

#### native关键字： 调用本地方法（c/c++）涉及到系统功能的调用         
#### final关键字：最终的
    
* 修饰变量： 常量、值不可改变    
* 修饰方法： 不能被重写
* 修饰类： 不能被继承

### Object类 

* Java中所有的类都直接或者间接的继承自Object类