package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * 其他流的使用
 * 1.标准的输入、输出流
 * 2.打印流
 * 3.数据流
 *
 * @author
 * @create 2020-10-31 14:53
 */
public class OtherStreamTest {


    public static void main(String[] args) {

        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);

            br = new BufferedReader(isr);

            while (true) {

                System.out.println("请输入字符串！");
                String data = br.readLine();

                if ("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)) {
                    System.out.println("程序退出！");
                    break;
                }

                String toUpperCase = data.toUpperCase();
                System.out.println(toUpperCase);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    /*
   2. 打印流：PrintStream 和PrintWriter
   2.1 提供了一系列重载的print() 和 println()
   2.2 练习：
    */
    @Test
    public void test2() {
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream(new File("E:\\IO\\text.txt"));
            // 创建打印输出流,设置为自动刷新模式(写入换行符或字节 '\n' 时都会刷新输出缓冲区)
            ps = new PrintStream(fos, true);
            if (ps != null) {// 把标准输出流(控制台输出)改成文件
                System.setOut(ps);
            }

            for (int i = 0; i <= 255; i++) { // 输出ASCII字符
                System.out.print((char) i);
                if (i % 50 == 0) { // 每50个数据一行
                    System.out.println(); // 换行
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
        }

    }

    @Test
    public void test3() {

        DataOutputStream dos = null;
        try {
            FileOutputStream fos = new FileOutputStream("data.txt");

            dos = new DataOutputStream(fos);

            dos.writeUTF("宋永刚");
            dos.flush();
            dos.writeInt(22);
            dos.flush();
            dos.writeBoolean(true);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dos != null) {
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void test4() {

        DataInputStream dis = null;
        try {
            FileInputStream fis = new FileInputStream("data.txt");

            dis = new DataInputStream(fis);

            String name = dis.readUTF();
            int age = dis.readInt();
            boolean isMale = dis.readBoolean();

            System.out.println("name =" + name + ",age =" + age + ",idsMale =" + isMale);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


}
