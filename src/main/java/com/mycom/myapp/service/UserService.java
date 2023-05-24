package com.mycom.myapp.service;

import com.mycom.myapp.pojo.User;

public interface UserService {
    boolean register(User user);
    boolean login(User user);
}
