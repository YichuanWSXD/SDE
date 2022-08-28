package com.ityichuan.springbootinit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yichuan
 * @date 8/28/22 0 4:42 PM
 */
@RestController
public class HelloController {

    @Value("${name}")
    private String name;

    @Value("${person.name}")
    private String name2;

    @Value("${person.age}")
    private String age;

    @Value("${address[0]}")
    private String address;

//    environment
    @Autowired
    private Environment env;


//    ConfigurationProperties
    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello Spring Boot!";
    }

    @RequestMapping("/hello2")
    public String hello2(){
        System.out.println(name);
        System.out.println(name2);
        System.out.println(age);
        System.out.println(address);

        System.out.println("-----------------------------------");
        System.out.println(env.getProperty("person.name"));
        System.out.println(env.getProperty("address"));

        System.out.println("-----------------------------------");
        System.out.println(person);

        return "Hello Spring Boot!";
    }

}
