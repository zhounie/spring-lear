package com.xs.springboot;

import com.xs.springboot.service.IUserService;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(SpringbootApplication.class, args);
        IUserService userService = ioc.getBean(IUserService.class);
        userService.getUser();
    }

}
