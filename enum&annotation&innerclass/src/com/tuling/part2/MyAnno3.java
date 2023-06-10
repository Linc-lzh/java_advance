package com.tuling.part2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})//表示我这个注解只能用在类上面
@Retention(RetentionPolicy.SOURCE)//描述注解被保留的阶段
public @interface MyAnno3 {

}
