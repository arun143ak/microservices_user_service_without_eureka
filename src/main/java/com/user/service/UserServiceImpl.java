package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //fake user lIst

    List<User> userList = List.of(
            new User(1L, "Arun", "1234567890"),
            new User(2L, "Kumar", "0987654321"),
            new User(3L, "AK", "8617867868")
    );
    @Override
    public User getUser(Long id) {
        return userList.stream().filter(u -> u.getUserId().equals(id)).findAny().orElse(null);
    }
}
