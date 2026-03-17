package com.change.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // 帮我写个除以0的异常
        int a = 1;
        int b = 1;
        int c = a / b;
        System.out.println(c);

        //帮我写个空指针的异常
        String str = null;
        if (str != null) {
            int length = str.length();
        }


        //在帮我洗个异
        int bb = 0;
        int d = 1;
        if (bb != 0) {
            int e = a / bb;
            System.out.println(e);
        } else {
            System.out.println("除数不能为0");
        }

        SpringApplication.run(DemoApplication.class, args);
    }

}
