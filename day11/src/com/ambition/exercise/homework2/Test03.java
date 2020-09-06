package com.ambition.exercise.homework2;

public class Test03 {
    public static void main(String[] args) {
        Base b1 = new Base();//
        System.out.println();
        Base b2 = new Sub();//
    }
}

class Base {
    Base() {
        method(100);
    }

    public void method(int i) {
        System.out.println("base : " + i);//22
    }
}

class Sub extends Base {
    Sub() {
        super.method(70);
    }

    @Override
    public void method(int j) {
        System.out.println("sub : " + j);//11
    }
}
