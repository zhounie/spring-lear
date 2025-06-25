package com.xs.service;


import com.xs.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService implements IUserService {

    @Autowired
    IUserDao userDao;

    @Override
    public void getUser() {

        userDao.getUser();

    }
}
