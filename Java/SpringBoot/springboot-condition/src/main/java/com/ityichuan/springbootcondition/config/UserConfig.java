package com.ityichuan.springbootcondition.config;

import com.ityichuan.springbootcondition.condition.ClassCondition;
import com.ityichuan.springbootcondition.condition.ConditionOnClass;
import com.ityichuan.springbootcondition.domain.User;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    @ConditionOnClass("redis.clients.jedis.Jedis")
    public User user(){
        return new User();
    }

    @Bean
    @ConditionalOnProperty(name = "itcast", havingValue = "itheima")
    public User user2(){
        return new User();
    }
}
