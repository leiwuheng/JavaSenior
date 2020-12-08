package com.atguigu.exer;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中（下一章：TreeSet 需使用泛型来定义）
 * 分别按以下两种方式对集合中的元素进行排序，并遍历输出：
 * <p>
 * 1). 使Employee 实现 Comparable 接口，并按 name 排序
 * 2). 创建 TreeSet 时传入 Comparator对象，按生日日期的先后排序。
 *
 * @author
 * @create 2020-10-13 20:08
 */
public class EmployeeTest {

    //问题二：按生日日期的先后排序
    @Test
    public void test2() {

        Comparator<Employee> com = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getBirthday().compareTo(e2.getBirthday());
            }


            //@Override
//            public int compare(Object o1, Object o2) {
//                if (o1 instanceof Employee && o2 instanceof Employee) {
//                    Employee e1 = (Employee) o1;
//                    Employee e2 = (Employee) o2;
//
//                    //方式一
////                    if (e1.getBirthday().getYear() != e2.getBirthday().getYear()) {
////                        return Integer.compare(e1.getBirthday().getYear(), e2.getBirthday().getYear());
////                    } else if (e1.getBirthday().getMonth() != e2.getBirthday().getMonth()) {
////                        return Integer.compare(e1.getBirthday().getMonth(), e2.getBirthday().getMonth());
////                    } else {
////                        return Integer.compare(e1.getBirthday().getDay(), e2.getBirthday().getDay());
////                    }
//
//                    //方式二
//                    return e1.getBirthday().compareTo(e2.getBirthday());
//
//                }
////                return 0;
//                throw new RuntimeException("传入的数据类型不一致！");
//            }
        };


        TreeSet<Employee> set = new TreeSet<>(com);

        Employee e1 = new Employee("liudehua", 55, new MyDate(1965, 5, 4));
        Employee e2 = new Employee("zhangxueyou", 43, new MyDate(1987, 5, 4));
        Employee e3 = new Employee("guofucheng", 44, new MyDate(1987, 5, 4));
        Employee e4 = new Employee("liming", 51, new MyDate(1954, 8, 12));
        Employee e5 = new Employee("liangchaowei", 21, new MyDate(1978, 12, 4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //问题一：使用自然排序
    @Test
    public void test1() {

        TreeSet<Employee> set = new TreeSet<>();

        Employee e1 = new Employee("liudehua", 55, new MyDate(1965, 5, 4));
        Employee e2 = new Employee("zhangxueyou", 43, new MyDate(1987, 5, 4));
        Employee e3 = new Employee("guofucheng", 44, new MyDate(1987, 5, 9));
        Employee e4 = new Employee("liming", 51, new MyDate(1954, 8, 12));
        Employee e5 = new Employee("liangchaowei", 21, new MyDate(1978, 12, 4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee);
        }
    }

}
