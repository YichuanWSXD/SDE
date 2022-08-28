package com.ityichuan.test;

import com.ityichuan.springboottest.SpringbootTestApplication;
import com.ityichuan.springboottest.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Yichuan
 * @date 8/28/22 0 6:04 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootTestApplication.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testAdd(){
        userService.add();
    }
}
