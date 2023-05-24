package com.mycom.myapp.controller;

import com.mycom.myapp.pojo.User;
import com.mycom.myapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public String register(User user, Model model) {
        boolean isOK = userService.register(user);
        if (isOK) {
            model.addAttribute("user", user);
            return "success";
        } else {
            return "register";
        }
    }

    //登录
    @RequestMapping("/login")
    public String login(String username ,String password,Model model){
        model.addAttribute("username",username);
        model.addAttribute("password",password);
        return "guide";
        }


}