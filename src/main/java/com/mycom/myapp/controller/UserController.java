package com.mycom.myapp.controller;

import com.mycom.myapp.pojo.User;
import com.mycom.myapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public String register(User user, Model model) {
        if (StringUtils.isEmpty(user.getUsername())||StringUtils.isEmpty(user.getPassword())){
            model.addAttribute("errorMessage","注册信息不能为空！");
            return "register";
        }
        boolean isOK = userService.register(user);
        if (isOK) {
            model.addAttribute("user", user);
            model.addAttribute("errorMessage", "注册成功");
            return "login";
        }

        else {
            model.addAttribute("errorMessage", "注册失败");
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