package com.ohgiraffers.Beanions.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ohgiraffers.Beanions")
@MapperScan(basePackages = "com.ohgiraffers.Beanions", annotationClass = Mapper.class)
public class BeanionsProjectBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanionsProjectBoardApplication.class, args);
    }

}
