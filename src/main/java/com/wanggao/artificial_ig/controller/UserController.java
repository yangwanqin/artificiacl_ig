package com.wanggao.artificial_ig.controller;


import com.wanggao.artificial_ig.bean.User;
import com.wanggao.artificial_ig.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("user")
    public List<User> getUsersByUsername(@RequestParam("username") String username) {
        return userService.getUsersByUsername(username);
    }
}