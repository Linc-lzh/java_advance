package com.tuling.part1;

import java.util.Arrays;

public class StringDemo2 {
    public static void main(String[] args) {
        String str = "abcd123456";
          /*
        charAt(int index)
        返回 char指定索引处的值。注意越界问题:java.lang.StringIndexOutOfBoundsException: String index out of range: 100
        index:0---->length()-1
         */
        char ch = str.charAt(2);
        System.out.println("ch:"+ch);
             /*
        concat(String str)
        将指定的字符串连接到该字符串的末尾。
        同+连接符一样
         */
        //String newStr = str + "---->";
        String newStr = str.concat("---->");
        System.out.println("newStr:"+newStr);

             /*
        boolean contains(CharSequence s)
        当且仅当此字符串包含指定的char值序列时才返回true。
         */

        boolean contains = str.contains("ab1");
        System.out.println("contains:"+contains);

        /*
        boolean endsWith(String suffix)
        测试此字符串是否以指定的后缀结尾。
         */
        String txtStr = "hello.txt";
        boolean endsWith = txtStr.endsWith(".txt");
        System.out.println("endsWith:"+endsWith);

        String str1 = "2021xue.com";
        boolean startsWith = str1.startsWith("2021");


            /*
        boolean equals(Object anObject)
        将此字符串与指定对象进行比较。
        boolean equalsIgnoreCase(String anotherString)
        将此 String与其他 String比较，忽略大小写
         */
        boolean abc = "abc".equals("aBc");
        System.out.println("abc:"+abc);
        boolean aBC = "abc".equalsIgnoreCase("aBC");
        System.out.println("aBC:"+aBC);


        /*
          byte[] ---->String
          String ---->byte[]
          getBytes()
        使用平台的默认字符集将此 String编码为字节序列，将结果存储到新的字节数组中。
        char[] toCharArray()
        将此字符串转换为新的字符数组。
         */
        String str2 = "abc";
        char[] chars = str2.toCharArray();
        System.out.println("chars:"+ Arrays.toString(chars));

        System.out.println("=======================================");

        /*
        搜索
        int indexOf(int ch)
        返回指定字符第一次出现的字符串内的索引。
        int indexOf(int ch, int fromIndex)
        返回指定字符第一次出现的字符串内的索引，以指定的索引开始搜索。

        int lastIndexOf(String str)
        返回指定子字符串最后一次出现的字符串中的索引。
        int lastIndexOf(String str, int fromIndex)
        返回指定子字符串的最后一次出现的字符串中的索引，从指定索引开始向后搜索


         */


        String str3 = "helloaworld!!";
        int index = str3.indexOf("l",4);
        System.out.println("index:"+index);

        int index2 = str3.lastIndexOf("l");
        System.out.println("index2:"+index2);


          /*
        boolean isEmpty()
        返回 true如果，且仅当 length()为 0 。
         */
        String str4 = " ";
        System.out.println("str4是否为空:"+str4.isEmpty());

         /*
        String replace(char oldChar, char newChar)
        返回从替换所有出现的导致一个字符串 oldChar在此字符串 newChar 。
         */
        String str5 = "abcwwwdef";
        String www = str5.replace("www", "123");
        System.out.println("www:"+www);



         /*
        String[] split(String regex)
        按照切符，将此字符串分割为数组
        注意点：分隔符放在首位，中间起作用。放在末尾不起作用
         */
        String str6 = "==www==woow====123";
        String[] split = str6.split("==");
        System.out.println("分割得到的数组："+Arrays.toString(split));


         /*
        String substring(int beginIndex)
        返回一个字符串，该字符串是此字符串的子字符串。
        String substring(int beginIndex, int endIndex)
        返回一个字符串，该字符串是此字符串的子字符串。  包含前面的下标，不包含后面的下标

         */

        String str7  = "aaabbb";
        String substring = str7.substring(3);
        System.out.println("substring:"+substring);
        String substring2 = str7.substring(0, 3);//包含前面的索引，不包含后面的索引[);
        System.out.println("substring2:"+substring2);


        /*
        String toLowerCase()
        将所有在此字符 String使用默认语言环境的规则，以小写。
        String toUpperCase()
        将所有在此字符 String使用默认语言环境的规则大写。

         */

        System.out.println("转大写："+str7.toUpperCase());
        System.out.println("转小写："+str7.toLowerCase());

        /*
        String trim()
        返回一个字符串，其值为此字符串，并删除任何前导和尾随空格。不会删除中间的空格
         */

        String str8 = "he llo ";
        System.out.println("去除空格的字符串长度："+str8.trim().length());
        System.out.println("原来的字符串长度："+str8.length());


    }
}
