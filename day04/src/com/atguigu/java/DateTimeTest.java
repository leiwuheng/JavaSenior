package com.atguigu.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * jdk 8之前的日期时间的API测试
 * 1. System类中currentTimeMillis();
 * 2. java.util.Date和子类java.sql.Date
 * 3. SimpleDateFormat
 * 4. Calendar
 *
 * @author
 * @create 2020-10-03 14:11
 */
public class DateTimeTest {

     /*
    SimpleDateFormat的使用：SimpleDateFormat对日期Date类的格式化和解析

    1.两个操作：
    1.1 格式化：日期 --->字符串
    1.2 解析：格式化的逆过程，字符串 ---> 日期

    2.SimpleDateFormat的实例化
     */

    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化SimpleDateFormat:使用默认的构造器
        SimpleDateFormat sdf = new SimpleDateFormat();

        //格式化: 日期 --->字符串
        Date date = new Date();
        System.out.println(date);

        String format = sdf.format(date);
        System.out.println(format);

        //解析：格式化的逆过程，字符串 ---> 日期
        String str = "20-10-10 下午2:25";
        Date date1 = sdf.parse(str);
        System.out.println(date1);

        //*************按照指定的方式格式化和解析：调用带参的构造器*****************
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //格式化
        String format1 = sdf1.format(date);
        System.out.println(format1);//2020-10-03 02:34:30
        //解析:要求字符串必须是符合SimpleDateFormat识别的格式(通过构造器参数体现),
        //否则，抛异常
        Date date2 = sdf1.parse("2022-2-6 02:34:30");
        System.out.println(date2);
    }


    /*
   练习一：字符串"2020-09-08"转换为java.sql.Date

   练习二："三天打渔两天晒网"   1990-01-01  xxxx-xx-xx 打渔？晒网？

   举例：2020-09-08 ？ 总天数

   总天数 % 5 == 1,2,3 : 打渔
   总天数 % 5 == 4,0 : 晒网

   总天数的计算？
   方式一：( date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24) + 1
   方式二：1990-01-01  --> 2019-12-31  +  2020-01-01 -->2020-09-08
    */
    @Test
    public void testExer() throws ParseException {
        String birth = "2020-9-8";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date = sdf.parse(birth);

//        System.out.println(date);
//        System.out.println(date.getTime());

        java.sql.Date birthDate = new java.sql.Date(date.getTime());

        System.out.println(birthDate);
    }


    /*
    Calendar日历类(抽象类）的使用

     */


    @Test
    public void testCalender(){
        //1.实例化
        //方式一：创建其子类（GregorianCalendar）的对象
        //方式二：调用其静态方法getInstance()
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());

        //2.常用方法
        //get()
        int day1 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day1);
        int day2 = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(day2);

        //set()
        calendar.set(Calendar.DAY_OF_MONTH,10);
        int day3 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day3);

        //add()
        calendar.add(Calendar.DAY_OF_MONTH,-3);
        int day4 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day4);

        //getTime():日历类-->Date
        Date date = calendar.getTime();
        System.out.println(date);

        //setTime()：Date-->日历类
        Date date1 = new Date();
        calendar.setTime(date1);
        int day5 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day5);


    }

}
