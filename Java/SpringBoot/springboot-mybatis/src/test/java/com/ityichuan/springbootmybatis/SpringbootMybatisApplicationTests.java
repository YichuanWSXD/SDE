package com.ityichuan.springbootmybatis;

import com.ityichuan.springbootmybatis.domain.User;
import com.ityichuan.springbootmybatis.mapper.UserMapper;
import com.ityichuan.springbootmybatis.mapper.UserXmlMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testFindAll() {
        List<User> list = userMapper.findAll();
        System.out.println(list);
    }

    @Autowired
    private UserXmlMapper userXmlMapper;

    @Test
    void testFindAll2() {
        List<User> list = userXmlMapper.findAll();
        System.out.println(list);
    }

}
