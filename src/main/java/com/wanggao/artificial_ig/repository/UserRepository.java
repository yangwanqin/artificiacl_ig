package com.wanggao.artificial_ig.repository;

import com.wanggao.artificial_ig.bean.User;
import com.wanggao.artificial_ig.mapper.UserMapper;
import com.wanggao.artificial_ig.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public class UserRepository {
    @Autowired
    private UserMapper userMapper;

    public List<User> getUsersByUsername(String username) {
        return userMapper.getUsersByUsername(username);
    }



}
