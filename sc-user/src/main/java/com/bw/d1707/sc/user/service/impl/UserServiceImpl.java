package com.bw.d1707.sc.user.service.impl;



import com.bw.d1707.sc.user.pojo.User;
import com.bw.d1707.sc.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(1);
        user.setUsername("张三");
        user.setPassword("123456");
        return user;
    }
}
