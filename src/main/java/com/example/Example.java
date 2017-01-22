package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan("com.example.dao")
@SpringBootApplication
@ServletComponentScan
public class Example {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
