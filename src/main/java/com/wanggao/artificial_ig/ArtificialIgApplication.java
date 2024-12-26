package com.wanggao.artificial_ig;


import com.wanggao.artificial_ig.bean.User;
import com.wanggao.artificial_ig.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@MapperScan("com.wanggao.artificial_ig.mapper")
@SpringBootApplication
public class ArtificialIgApplication {
    @Autowired
    private UserService userService;

    public static void main(String[] args) {

        SpringApplication.run(ArtificialIgApplication.class, args);


    }
    public void run(String...args) throws Exception{
        String username = "蔡徐坤"; // 替换为实际的用户名
        List<User> users = userService.getUsersByUsername(username);
        if (users.isEmpty()) {
            System.out.println("No users found with username: " + username);
        } else {
            System.out.println("Users found with username: " + username);
            for (User user : users) {
                System.out.println("ID: " + user.getId() + ", Username: " + user.getUsername() + ", Email: " + user.getEmail());
            }
        }

    }
}


