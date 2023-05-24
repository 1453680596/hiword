package com.mycom.myapp.mapper;

import com.mycom.myapp.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    /**
     * 注册用户
     *
     * @param user 用户
     * @return 返回受影响行数
     */
    int register(User user);
    User login(User user);
    User select(User user);
}
