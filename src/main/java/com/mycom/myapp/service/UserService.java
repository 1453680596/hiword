package com.mycom.myapp.service;

import com.mycom.myapp.pojo.Customer;
import com.mycom.myapp.pojo.User;

public interface UserService {
    boolean register(User user);
    User login(User user);
    User select(Customer user);
}
