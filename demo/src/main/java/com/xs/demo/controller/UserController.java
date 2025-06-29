package com.xs.demo.controller;


import com.xs.demo.pojo.ResponseMessage;
import com.xs.demo.pojo.User;
import com.xs.demo.pojo.dto.UserDto;
import com.xs.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping
    public ResponseMessage<User> addUser(@Validated @RequestBody UserDto user){
        System.out.println(user);
        User addResult = userService.add(user);
        return ResponseMessage.success(addResult);
    }

    @GetMapping
    public ResponseMessage<List<User>> getUser(){

        List<User> result = userService.getUserList();

        return ResponseMessage.success(result);
    }

    @GetMapping("/{userId}")
    public ResponseMessage<User> getUser(@PathVariable Integer userId){
        User userResult =  userService.getUser(userId);
        return ResponseMessage.success(userResult);
    }

    @PutMapping
    public ResponseMessage<User> updateUser(@Validated @RequestBody UserDto user){
        User result = userService.updateUser(user);
        return ResponseMessage.success(result);
    }

    @DeleteMapping("/{userId}")
    public ResponseMessage<Object> deleteUser(@PathVariable Integer userId){
        userService.deleteUser(userId);
        return ResponseMessage.success(null);
    }

}
