package com.atguigu.exer;

import org.junit.Test;

/**
 * @author
 * @create 2020-10-03 9:32
 */
public class StringDemo {

    /*
   将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反转为”abfedcg”
    */
    //方式一：转换为char[]
    public String reverse(String str, int startIndex, int endIndex) {

        if (str != null) {
            char[] arr = str.toCharArray();
            for (int x = startIndex, y = endIndex; x < y; x++, y--) {
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        }
        return null;
    }

    //方式二：使用String的拼接
    public String reverse1(String str, int startIndex, int endIndex) {

        if (str != null) {
            //第一部分
            String reverseStr = str.substring(0, startIndex);
            //第二部分
            for (int i = endIndex; i >= startIndex; i--) {
                reverseStr += str.charAt(i);
            }
            //第三部分
            //reverseStr += str.substring(endIndex + 1,str.length());
            //或
            reverseStr += str.substring(endIndex + 1);

            return reverseStr;
        }
        return null;
    }

    //方式三：使用StringBuffer/StringBuilder替换String
    public String reverse2(String str, int startIndex, int endIndex) {

        if (str != null) {
            //第一部分
            StringBuilder buidle = new StringBuilder(str.length());
            buidle.append(str.substring(0, startIndex));
            //第二部分
            for (int i = endIndex; i >= startIndex; i--) {
                buidle.append(str.charAt(i));
            }
            //第三部分
            buidle.append(str.substring(endIndex + 1));

            return buidle.toString();
        }
        return null;
    }

    @Test
    public void testReverse() {
        String str = "abcdefg";
        String reverse = reverse2(str, 2, 5);
        System.out.println(reverse);
    }

}
