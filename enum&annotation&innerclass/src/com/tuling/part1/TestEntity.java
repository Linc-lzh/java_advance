package com.tuling.part1;

public class TestEntity {
    public static void main(String[] args) {
        Entity entity = new Entity();
        entity.setId(1);
        //entity.setType(2);
        //entity.setType(-2);//无法限制里面的值，然后可读性也不好
        //entity.setType(Entity.TYPE_TEXT);//使用常量，可读性要好一些
        entity.setType(TypeEnum.TYPE_TEXT);//可读性好，同时对值的范围又有限制

        System.out.println("-------------------------");

       // System.out.println("Sex.MAN.getValue():"+Sex.MAN.getValue());



    }
}
