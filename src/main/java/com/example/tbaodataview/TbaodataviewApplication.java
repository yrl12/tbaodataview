package com.example.tbaodataview;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com..example.tbaodataview.dao")
public class TbaodataviewApplication {

    public static void main(String[] args) {

        SpringApplication.run(TbaodataviewApplication.class, args);
    }

}
