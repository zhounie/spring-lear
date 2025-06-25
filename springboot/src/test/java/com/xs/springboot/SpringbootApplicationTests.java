package com.xs.springboot;

import com.xs.springboot.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    IUserService userService;

    @Test
    void contextLoads() {
        userService.getUser();
    }

}
