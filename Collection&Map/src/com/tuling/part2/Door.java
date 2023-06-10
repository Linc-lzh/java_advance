package com.tuling.part2;

//实现这个接口的时候，可以确定泛型的类型
class DoorImpl implements Door<String,String>{

    @Override
    public String getType() {
        return null;
    }
}

class DoorImpl2 implements Door<Integer,Integer>{

    @Override
    public Integer getType() {
        return null;
    }
}
//定义含有泛型的接口
public interface Door <T1,T2>{
    T1 getType();
}
