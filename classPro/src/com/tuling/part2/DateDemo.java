package com.tuling.part2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();
        System.out.println("当前时间的毫秒数："+time);
        //System.out.println("年："+date.getYear());

        System.out.println("---------------------");
        Calendar now = Calendar.getInstance();

        //获取年月日时分秒
//        System.out.println("年："+now.get(Calendar.YEAR));
//        System.out.println("月："+now.get(Calendar.MONTH));//(0-11)
//        System.out.println("日："+now.get(Calendar.DAY_OF_MONTH));
//        System.out.println("时："+now.get(Calendar.HOUR_OF_DAY));
//        System.out.println("分："+now.get(Calendar.MINUTE));
//        System.out.println("秒："+now.get(Calendar.SECOND));
        //设置一下时间
        now.set(2000,10,10,10,10,0);
        now.set(Calendar.YEAR,1999);

//        System.out.println("年："+now.get(Calendar.YEAR));
//        System.out.println("月："+now.get(Calendar.MONTH));//(0-11)
//        System.out.println("日："+now.get(Calendar.DAY_OF_MONTH));
//        System.out.println("时："+now.get(Calendar.HOUR_OF_DAY));
//        System.out.println("分："+now.get(Calendar.MINUTE));
//        System.out.println("秒："+now.get(Calendar.SECOND));

        //Date---->Calendar
        now.setTime(new Date());

//        System.out.println("年："+now.get(Calendar.YEAR));
//        System.out.println("月："+now.get(Calendar.MONTH));//(0-11)
//        System.out.println("日："+now.get(Calendar.DAY_OF_MONTH));
//        System.out.println("时："+now.get(Calendar.HOUR_OF_DAY));
//        System.out.println("分："+now.get(Calendar.MINUTE));
//        System.out.println("秒："+now.get(Calendar.SECOND));
//        System.out.println("----------------------------");
        now.add(Calendar.MONTH,2);

        System.out.println("年："+now.get(Calendar.YEAR));
        System.out.println("月："+now.get(Calendar.MONTH));//(0-11)
        System.out.println("日："+now.get(Calendar.DAY_OF_MONTH));
        System.out.println("时："+now.get(Calendar.HOUR_OF_DAY));
        System.out.println("分："+now.get(Calendar.MINUTE));
        System.out.println("秒："+now.get(Calendar.SECOND));


        //Calendar---->Date
        Date dateTime = now.getTime();
        System.out.println("转化之后的Date:"+dateTime);


        System.out.println("====================================");

        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年-MM月-dd日");
        //String---------->Date
        String str = "2012-202-88";
        try {
            Date parse = sdf.parse(str);
            System.out.println("解析之后的parse:"+parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        //Date-------->String

        Date currentDate = new Date();
        String format = sdf2.format(currentDate);
        System.out.println("format:"+format);


    }
}
