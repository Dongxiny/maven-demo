package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.dao")
@SpringBootApplication
public class ASpringBootApplication{
    /**
     * @ author: d
     * @ description: TODO
     * @ date: 2020/8/26 16:25
     * @ return
     */
    public static void main(String[] args) {
       SpringApplication.run(ASpringBootApplication.class, args);
    }
}
