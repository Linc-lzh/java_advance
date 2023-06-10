package com.tuling.part3.innerclass1;

public class Other {
    public static void main(String[] args) {
        //创建成员内部类的对象，调用方法
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.innerShow();

    }
}
