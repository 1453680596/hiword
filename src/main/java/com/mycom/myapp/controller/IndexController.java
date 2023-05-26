package com.mycom.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
    //返回首页
    @RequestMapping("/toGuide")
    public String toGuide(){
        return "guide";
    }

    //登出
    @RequestMapping("/toIndex")
    public String toIndex(){
        return "redirect:/index.jsp";
    }

    //注册
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }
    //登录
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }
}