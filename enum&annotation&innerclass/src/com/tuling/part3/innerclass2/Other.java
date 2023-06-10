package com.tuling.part3.innerclass2;

public class Other {
    public static void main(String[] args) {
        //访问静态内部类的静态的方法
        Outer.Inner.innerStaticShow();

        //访问静态内部类的成员方法

        Outer.Inner inner = new Outer.Inner();
        inner.innerShow();

    }
}
