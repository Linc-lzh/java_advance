package com.tuling.part7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
//        properties.setProperty("北京","首都");
//        properties.setProperty("长沙","湖南省会");
//        properties.setProperty("深圳","直辖市");
//
//        System.out.println(""+properties.getProperty("长沙"));
//        System.out.println("--------------------------------");
//        //遍历
//        Set<String> strings = properties.stringPropertyNames();
//        for (String key : strings) {
//            String value = properties.getProperty(key);
//            System.out.println(key+":"+value);
//        }

        System.out.println("--------------------------------");

        try {
            //与流相关的操作
            properties.load(new FileInputStream("db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //遍历
        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys) {
            String value = properties.getProperty(key);
            System.out.println(key+":"+value);
        }

    }
}
