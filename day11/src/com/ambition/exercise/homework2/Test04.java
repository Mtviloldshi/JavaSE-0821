package com.ambition.exercise.homework2;

/**
 * 就近原则 追根溯源
 *      子类有的先匹配子类 子类没有往父类查找
 *      父类也没有 选择子类最接近的
 */
public class Test04 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        A1 a2 = new B1();
        B1 b = new B1();
        C c = new C();
        D d = new D();
        System.out.println("(1)" + a1.show(b)); //A and A
        System.out.println("(2)" + a2.show(d));//A and D
        System.out.println("(3)" + b.show(c)); // B and B
        System.out.println("(4)" + b.show(d));//A and D
    }
}
class A1{
    public String show(D obj){
        return ("A and D");
    }
    public String show(A1 obj){
        return "A and A";
    }
}
class B1 extends A1{
    public String show(B1 obj){
        return "B and B";
    }
    @Override
    public String show(A1 obj){
        return "B and A";
    }
}
class C extends B1{

}
class D extends B1{

}
