package com.chen.dreamproject.controller;

import com.chen.dreamproject.entity.User;
import com.chen.dreamproject.services.IUserService;
import com.chen.dreamproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Autowired
    private IUserService iuserService;
    @RequestMapping("/hello")
    public String helloworld() {
        return "helloworld";
    }

    @RequestMapping("/saveUser")
    public String saveUser(){
        User user =new User();
        user.setName("Chenchangyi");
        user.setAge(29);
        user.setSex("男");
        iuserService.saveUser(user);
        return "success!!";
    }

}
