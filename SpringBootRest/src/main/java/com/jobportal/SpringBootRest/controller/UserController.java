package com.jobportal.SpringBootRest.controller;

import com.jobportal.SpringBootRest.model.User;
import com.jobportal.SpringBootRest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    public User register(@RequestBody User user){
       return userService.saveUser(user);
    }

    public String login(@RequestBody User user){
        return userService.login(user);
    }
}
