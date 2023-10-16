package com.mycom.myapp.mapper;

import com.mycom.myapp.pojo.Customer;
import com.mycom.myapp.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    int register(User user);
    User login(User user);
}
