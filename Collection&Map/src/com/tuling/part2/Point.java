package com.tuling.part2;

//定义带有泛型的类
//type
public class Point <T>{
    private T x;
    private T y;

    //定义含有泛型的方法
    public static <M> void getValue(M m){
        if(m instanceof String){
            System.out.println("m:"+m);
        }

    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}
