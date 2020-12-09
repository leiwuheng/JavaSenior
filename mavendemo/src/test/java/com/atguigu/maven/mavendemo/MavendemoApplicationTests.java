package com.atguigu.maven.mavendemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MavendemoApplicationTests {

    @Test
    void testHello() {
        Hello hello = new Hello();
        String maven = hello.sayHello("maven");
        System.out.println(maven);

    }

}
