package com.ityichuan.springbootcondition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringbootConditionApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringbootConditionApplication.class, args);

        // Find Bean, redisTemplate
//        Object redisTemplate = context.getBean("redisTemplate");
//        System.out.println(redisTemplate);



        Object user = context.getBean("user");
        System.out.println(user);
        Object user2 = context.getBean("user2");
        System.out.println(user2);

    }






}
