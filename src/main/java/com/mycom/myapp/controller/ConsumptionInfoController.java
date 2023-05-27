package com.mycom.myapp.controller;

import com.mycom.myapp.pojo.Customer;
import com.mycom.myapp.pojo.CustomerCar;
import com.mycom.myapp.service.CustomerCarService;
import com.mycom.myapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/consumptioninfo")
public class ConsumptionInfoController {
    @Autowired
    private CustomerCarService customerCarService;
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/toSelect")
    public String toSelect( Model model) {
        List<CustomerCar> customerCarList = customerCarService.select(new CustomerCar());
        model.addAttribute("customerCarList", customerCarList);
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
        if (StringUtils.isEmpty(customerCar.getName())||StringUtils.isEmpty(customerCar.getCartype())){
            model.addAttribute("errormsg","客户姓名或车型不可为空");
            return "carinsert";
        }

        List<Customer> list = customerService.select(new Customer(customerCar.getName()));
        if (list.size()==0){
            model.addAttribute("errormsg","客户不存在，请核实客户信息");
            return "carinsert";
        }
        customerCar.setCustomerId(list.get(0).getId());
        Boolean isOK1 = customerCarService.insert(customerCar);
        if (isOK1) {
            model.addAttribute("errormsg","新增成功");
            return toSelect(model);
        } else {
            model.addAttribute("errormsg","新增失败");
            return "carinsert";
        }
    }

    //更新用户
    @RequestMapping("/toUpdate")
    public String toUpdate(CustomerCar customerCar, Model model) {
        List<CustomerCar> cars = customerCarService.select(customerCar);
        model.addAttribute("customerCar", cars.get(0));
        return "carupdate";
    }

    @RequestMapping("/update")
    public String update(CustomerCar customerCar, Model model) {
        Boolean isOK2 = customerCarService.update(customerCar);
        if (isOK2) {
            model.addAttribute("errormsg", "更新成功！");
            return toSelect(model);
        } else {
            model.addAttribute("customerCar", customerCar);
            model.addAttribute("errormsg", "更新失败！");
            return "carupdate";
        }
    }

    //删除用户
//    @RequestMapping("/toDelete")
//    public String toDelete(){return "delete";}
    @RequestMapping("/delete")
    public String delete(CustomerCar customerCar, Model model) {
        boolean customerCar2 = customerCarService.delete(customerCar);
        if (customerCar2) {
            model.addAttribute("errormsg", "删除成功！");
        } else {
            model.addAttribute("errormsg", "删除失败！！");
        }
        return toSelect(model);

    }
}
