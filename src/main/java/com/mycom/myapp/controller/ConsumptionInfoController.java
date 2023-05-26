package com.mycom.myapp.controller;

import com.mycom.myapp.pojo.CustomerCar;
import com.mycom.myapp.service.CustomerCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/consumptioninfo")
public class ConsumptionInfoController {
    @Autowired
    private CustomerCarService customerCarService;

    @RequestMapping("/toConsumptionInfo")
    public String toConsumptionInfo() {
        return "consumption";
    }

    @RequestMapping("/toSelect")
    public String toSelect(CustomerCar customerCar, Model model) {
        List<CustomerCar> customerCarList = customerCarService.select(customerCar);
        if (customerCarList != null && customerCarList.size() > 0) {
            model.addAttribute("customerCarList", customerCarList);
        }
        return "carselectconsequence";
    }

    @RequestMapping("/select")
    public String customerCarList(CustomerCar customerCar, Model model) {
        List<CustomerCar> customerCarList = customerCarService.select(customerCar);
        if (customerCarList != null && customerCarList.size() > 0) {
            model.addAttribute("customerCarList", customerCarList);
            return "carselectconsequence";
        } else {
            model.addAttribute("errormsg", "该车辆类型不存在");
            return "carselectconsequence";
        }

    }

    //新增用户
    @RequestMapping("/toInsert")
    public String toInsert() {
        return "carinsert";
    }

    @RequestMapping("/insert")
    public String insert(CustomerCar customerCar, Model model) {
        Boolean isOK1 = customerCarService.insert(customerCar);
        if (isOK1) {
            model.addAttribute("customerCar", customerCar);
            return "carinsertconsequence";
        } else {
            return "carinsert";
        }
    }

    //更新用户
    @RequestMapping("/toUpdate")
    public String toUpdate(CustomerCar customerCar, Model model) {
        model.addAttribute("customerCar", customerCar);
        return "carupdate";
    }

    @RequestMapping("/update")
    public String update(CustomerCar customerCar, Model model) {
        Boolean isOK2 = customerCarService.update(customerCar);
        if (isOK2) {
            model.addAttribute("customerCar", customerCar);
            return "carupdateconsequence";
        } else {
            return "carselectconsequence";
        }
    }

    //删除用户
//    @RequestMapping("/toDelete")
//    public String toDelete(){return "delete";}
    @RequestMapping("/delete")
    public String delete(CustomerCar customerCar, Model model) {
        boolean customerCar2 = customerCarService.delete(customerCar);
        if (customerCar2) {
            model.addAttribute("customerCar2", customerCar2);
            return "cardeleteconsequence";
        } else {
            return "carselectconsequence";
        }
    }
}
