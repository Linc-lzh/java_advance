package com.tuling.part3.innerclass3;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("run().....");
    }
}

interface USB{
    void work();
}

class Keyboard implements USB{

    @Override
    public void work() {
        System.out.println("键盘工作了....");
    }
}


public class Other {
    public static void main(String[] args) {
//        MyRunnable myRunnable = new MyRunnable();
//        new Thread(myRunnable).start();

//        new Thread(new MyRunnable()).start();//匿名对象的写法

        //匿名内部类
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("run().....");
//            }
//        }).start();;
        System.out.println("----------------------------");


        USB keyboard = new Keyboard();

        //匿名内部类
        USB usb = new USB(){

            @Override
            public void work() {
                System.out.println("匿名内部的实现");
            }
        };
        usb.work();



    }
}
