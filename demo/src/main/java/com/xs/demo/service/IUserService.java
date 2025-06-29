package com.xs.demo.service;

import com.xs.demo.pojo.User;
import com.xs.demo.pojo.dto.UserDto;

import java.util.List;

public interface IUserService {

    User add(UserDto user);

    User getUser(Integer userId);

    User updateUser(UserDto user);

    void deleteUser(Integer userId);

    List<User> getUserList();
}
