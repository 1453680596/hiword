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
        User user1=userService.login(user);
        if (user1!=null){
            model.addAttribute("user1",user1);
            model.addAttribute("username",username);
            return "guide";
        }
        else {
            model.addAttribute("errormsg","账号密码错误或不存在该用户");
            return "login";
        }
        }


}