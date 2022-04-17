package com.ccunix.reading;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ccunix.reading.dao")
@SpringBootApplication
public class ReadingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadingApplication.class, args);
    }

}
