package com.tuling.part2;


import java.util.Date;

/*
元注解
public @interface 注解名称{
属性列表;
}
 */
@interface MyAnno2{

}

class Type{}

public @interface MyAnno {
    //1,属性列表的返回值必须一下类型
    //基本数据类型
    //String
    //枚举
    //注解
    //以上类型的数组
    int value() default 0;
//    String str();
//    Sex sex() default Sex.MAN;
//    MyAnno2 myAnno2();
    int[] arr();


}
