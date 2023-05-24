package com.mycom.myapp.controller;

import com.mycom.myapp.pojo.User;
import com.mycom.myapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.security.util.Password;

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
    public String login(User user, Model model,String username){
        User user2=userService.select(user);
        if (user2!=null){
            model.addAttribute("user2",user2);
            model.addAttribute("username",username);
            return "selectconsequensce";
        }
        else {
            return "basic";
        }
        }


}