package com.tuling.part3.innerclass2;

public class Outer {


    private int outerVariable = 1;

    /**
     * 外部类定义的属性(重名)
     */
    private int commonVariable = 2;

    private static int outerStaticVariable = 3;

    static {
        System.out.println("Outer的静态块被执行了……");
    }

    /**
     * 成员方法
     */
    public void outerMothod() {
        System.out.println("我是外部类的outerMethod方法");
    }

    /*
     *	静态方法
     */
    public static void outerStaticMethod() {
        System.out.println("我是外部类的outerStaticMethod静态方法");
    }


    //静态内部类
    public static class Inner{

        /**
         * 成员信息
         */
        private int innerVariable = 10;
        //和外部的变量命名冲突
        private int commonVariable = 20;

        static {
            System.out.println("Outer.Inner的静态块执行了……");
        }

        private static int innerStaticVariable = 30;

        /**
         * 成员方法
         */
        public void innerShow() {
            System.out.println("innerVariable:" + innerVariable);
            System.out.println("内部的commonVariable:" + commonVariable);
            System.out.println("outerStaticVariable:"+outerStaticVariable);
            //不能访问外部类的普通的成员变量
            //System.out.println("外部的普通的变量："+outerVariable);
            //无法访问普通的成员方法
            //outerMothod();
            outerStaticMethod();
        }

        /**
         * 静态方法
         */
        public static void innerStaticShow() {

            //被调用时会先加载Outer类
            //outerStaticMethod();
            //System.out.println("outerStaticVariable"+outerStaticVariable);

            System.out.println("innerStaticShow()....");
        }


    }
}
