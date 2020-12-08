package com.atguigu.exer;

/**
 * MyDate类包含:
 * private成员变量year,month,day；并为每一个属性定义 getter, setter 方法；
 *
 * @author
 * @create 2020-10-13 20:00
 */
public class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }


//    @Override
//    public int compareTo(Object o) {
//        if (o instanceof MyDate) {
//            MyDate m = (MyDate) o;
//
//            if (this.getYear() != m.getYear()) {
//                return Integer.compare(this.getYear(),m.getYear());
//            } else if (this.getMonth() != m.getMonth()) {
//                return Integer.compare(this.getMonth(), m.getMonth());
//            } else {
//                return Integer.compare(this.getDay(), m.getDay());
//            }
//
//        }
////        return 0;
//        throw new RuntimeException("传入的数据类型不一致！");
//    }

    @Override
    public int compareTo(MyDate o) {
        if (this.getYear() != o.getYear()) {
            return Integer.compare(this.getYear(),o.getYear());
        } else if (this.getMonth() != o.getMonth()) {
            return Integer.compare(this.getMonth(), o.getMonth());
        } else {
            return Integer.compare(this.getDay(), o.getDay());
        }
    }
}

