package com.mycom.myapp.controller;

import com.mycom.myapp.pojo.Customer;
import com.mycom.myapp.pojo.User;
import com.mycom.myapp.service.CustomerService;
import com.mycom.myapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basicinfo")
public class BasicInfoController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/toBasicInfo")
    public String toBasicInfo(){
        return "select";
    }

    //查找
    @RequestMapping("/toSelect")
    public String toSelect(Customer customer, Model model, String name) {
        Customer customer1 = customerService.select(customer);
        if (customer1 != null) {
            model.addAttribute("customer1", customer1);
            model.addAttribute("name", name);
            return "selectconsequence";
        } else {
            return "select";
        }
    }
}
