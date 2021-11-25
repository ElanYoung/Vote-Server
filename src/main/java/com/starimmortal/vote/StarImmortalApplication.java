package com.starimmortal.vote;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author william@StarImmortal
 * @date 2021/02/01
 */
@SpringBootApplication
@MapperScan(basePackages = "com.starimmortal.vote.mapper")
public class StarImmortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarImmortalApplication.class, args);
    }
}
