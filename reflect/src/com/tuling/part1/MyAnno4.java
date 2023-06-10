package com.tuling.part1;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})//指定注解可以使用的位置
@Retention(RetentionPolicy.RUNTIME)//直接保留到运行时阶段
public @interface MyAnno4 {
    int age() default 0;
}
