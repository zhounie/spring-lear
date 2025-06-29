package com.xs.demo.service;

import com.xs.demo.pojo.User;
import com.xs.demo.pojo.dto.UserDto;
import com.xs.demo.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User add(UserDto user) {

        User userPojo = new User();

        BeanUtils.copyProperties(user, userPojo);

        return userRepository.save(userPojo);
    }

    @Override
    public User getUser(Integer userId){
        return userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("用户不存在"));
    }

    @Override
    public User updateUser(UserDto user) {
        User userPojo = new User();
        BeanUtils.copyProperties(user, userPojo);

        return userRepository.save(userPojo);
    }

    @Override
    public void deleteUser(Integer userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public List<User> getUserList() {
        Iterable<User> users = userRepository.findAll();

        return StreamSupport.stream(
                users.spliterator(), false
                ).collect(Collectors.toList());
    }


}
