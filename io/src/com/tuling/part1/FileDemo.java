package com.tuling.part1;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;




public class FileDemo {
    //递归遍历文件夹所有的内容(包括子层级的文件内容)
    public static void printDir(File dir){
        if(dir.isFile()&&dir.getName().endsWith(".java")){
            System.out.println(dir);
        }else{
            File[] files = dir.listFiles();
            if(files!=null){
                for (File file : files) {
                    if(file.isFile()&&file.getName().endsWith(".java")){
                        System.out.println(file);
                    }else{
                        printDir(file);
                    }

                }
            }

        }
    }

    //使用FileFilter接口
    public static void printDir2(File dir){




        if(dir.isFile()&&dir.getName().endsWith(".java")){
            System.out.println(dir);
        }else{
            //只有服务条件的才会放在数组当中
            File[] files = dir.listFiles(new FileFilter() {
                @Override
                public boolean accept(File file) {
                    return file.isDirectory()||(file.isFile()&&file.getName().endsWith(".java"));
                }
            });
            if(files!=null){
                for (File file : files) {
                    if(file.isDirectory()){
                        printDir(file);
                    }else{
                        System.out.println(file);
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        //文件相关的操作
        File file = new File("D:\\tuling\\test1\\demo.txt");

        System.out.println("文件的绝对路径："+file.getAbsolutePath());

        System.out.println("文件名："+file.getName());

        System.out.println("文件的大小："+file.length());

        //判断一下文件是否存在
        if(file.exists()){
            file.delete();//删除
        }else{
            try {
                file.createNewFile();//创建文件
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("是否是文件："+file.isFile());
        System.out.println("是否是目录："+file.isDirectory());




        System.out.println("----------------------------------");

        //文件夹相关的操作
        File dir = new File("D:\\tuling\\test1");

        System.out.println("文件夹的绝对路径："+dir.getAbsolutePath());

        System.out.println("文件夹的名子："+dir.getName());

        System.out.println("文件夹的大小："+dir.length());
        if(!dir.exists()){//如果目录不存在就创建
            //dir.mkdirs();//可以创建多级目录
            dir.mkdir();//创建单级目录
        }else{
            //dir.delete();
        }
        System.out.println("是否是文件："+dir.isFile());
        System.out.println("是否是目录："+dir.isDirectory());

        System.out.println("----------------");
        //
        String[] list = dir.list();
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("----------------");
//        File[] files = dir.listFiles();
//        for (File ele : files) {
//
//            System.out.println(ele);
//        }

        //遍历目录所有的文件内容
        printDir2(dir);

    }
}
