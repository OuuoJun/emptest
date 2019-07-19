package com.topone.emptest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.topone.emptest.mapper")//扫描映射接口
public class EmptestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmptestApplication.class, args);
    }

}
