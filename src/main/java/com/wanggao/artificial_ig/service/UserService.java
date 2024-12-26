package com.wanggao.artificial_ig.service;

import com.wanggao.artificial_ig.bean.User;
import com.wanggao.artificial_ig.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    //根据Username去查作者信息
    public List<User> getUsersByUsername(String username) {
        return userRepository.getUsersByUsername(username);
    }
}
