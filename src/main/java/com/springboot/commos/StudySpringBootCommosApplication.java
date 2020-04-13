package com.springboot.commos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync    //开启异步
@EnableScheduling  //开启定时任务
@SpringBootApplication
public class StudySpringBootCommosApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudySpringBootCommosApplication.class, args);
    }

}
