package com.mycom.myapp.controller;

import com.mycom.myapp.pojo.Customer;
import com.mycom.myapp.pojo.User;
import com.mycom.myapp.service.CustomerService;
import com.mycom.myapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/basicinfo")
public class BasicInfoController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/toBasicInfo")
    public String toBasicInfo(){
        return "basic";
    }

    //查找
//    @RequestMapping("/toSelect")
//    public String toSelect(Customer customer, Model model, String name) {
//        Customer customer1 = customerService.select(customer);
//        if (customer1 != null) {
//            model.addAttribute("customer1", customer1);
//            model.addAttribute("name", name);
//            return "selectconsequence";
//        } else {
//            return "select";
//        }
//    }
    @RequestMapping("/toSelect")
    public String toSelect(){
        return "select";
    }
    @RequestMapping("/select")
    public String customerList(Customer customer,Model model) {
        List<Customer> customerList = customerService.select(customer);
        if (customerList!=null && customerList.size()>0){
            model.addAttribute("customerList",customerList);
            return "selectconsequence";
        }else{
            model.addAttribute("errormsg","用户不存在");
            return "select";
        }

    }


    //新增用户
    @RequestMapping("/toInsert")
    public String toInsert(){
        return "insert";
    }
    @RequestMapping("/insert")
    public String insert(Customer customer,Model model){
        Boolean isOK1 = customerService.insert(customer);
        if (isOK1) {
            model.addAttribute("customer", customer);
            return "insertconsequence";
        } else {
            return "insert";
        }
    }

    //更新用户
    @RequestMapping("/toUpdate")
    public String toUpdate(Customer customer,Model model){
        model.addAttribute("customer",customer);
        return "update";
    }
    @RequestMapping("/update")
    public String update(Customer customer,Model model){
        Boolean isOK2 = customerService.update(customer);
        if (isOK2){
            model.addAttribute("customer",customer);
            return "updateconsequence";
        }else {
            return "selectconsequence";
        }
    }

    //删除用户
//    @RequestMapping("/toDelete")
//    public String toDelete(){return "delete";}
    @RequestMapping("/delete")
    public String delete(Customer customer,Model model){
        boolean customer2=customerService.delete(customer);
        if (customer2){
            model.addAttribute("customer2",customer2);
            return "deleteconsequence";
        }else {
            return "selectconsequence";
        }
    }
}
