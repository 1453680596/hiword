package com.mycom.myapp.controller;

import com.mycom.myapp.pojo.Customer;
import com.mycom.myapp.pojo.User;
import com.mycom.myapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basicinfo")
public class BasicInfoController {
    @Autowired
    private UserService userService;

    @RequestMapping("/toBasicInfo")
    public String toBasicInfo(){
        return "basic";
    }

    //查找
    @RequestMapping("/toSelect")
    public String toSelect(Customer customer, Model model, String username) {
        User user2 = userService.select(customer);
        if (user2 != null) {
            model.addAttribute("user2", user2);
            model.addAttribute("username", username);
            return "selectconsequence";
        } else {
            return "select";
        }
    }
}
