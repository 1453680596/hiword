package com.mycom.myapp.service.impl;

import com.mycom.myapp.mapper.UserDao;
import com.mycom.myapp.pojo.Customer;
import com.mycom.myapp.pojo.User;
import com.mycom.myapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean register(User user) {
        int i = userDao.register(user);
        return i>0;
    }

    @Override
    public User login(User user){
        return userDao.login(user);
    }
}
