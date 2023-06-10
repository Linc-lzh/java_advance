package com.tuling.part3.innerclass1;

public class Outer {

    private int outerVariable = 1;
    private int commonVariable = 2;
    private static int outerStaticVariable = 3;
    //省略getter/setter

    /**
     * 成员方法
     */
    public void outerMethod() {
        System.out.println("我是外部类的outerMethod方法");
    }

    /**
     * 静态方法
     */
    public static void outerStaticMethod() {
        System.out.println("我是外部类的outerStaticMethod静态方法");
    }

    //成员内部类
     class Inner{

        private int commonVariable = 20;

        public Inner(){}
        /**
         * 成员方法，访问外部类信息（属性、方法）
         */
        public void innerShow(){
            System.out.println("内部类自己的commonVariable:"+commonVariable);
            System.out.println("外部类的同名的commonVariable:"+Outer.this.commonVariable);

            System.out.println("外部类的成员变量outerVariable:"+outerVariable);
            System.out.println("外部类的静态变量outerStaticVariable:"+outerStaticVariable);

            //外部类的方法
            outerMethod();
            outerStaticMethod();

        }
    }

    /**
     *	外部类访问内部类信息
     */
    public Inner getInstance(){
        Inner inner = new Inner();
        return inner;
    }



}
