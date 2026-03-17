package com.change.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // 帮我写个除以0的异常
        int a = 1;
        int b = 0;
        if (b != 0) {
            int c = a / b;
            System.out.println(c);
        } else {
            System.out.println("除数不能为0");
        }

        SpringApplication.run(DemoApplication.class, args);
    }

}
