package com.mycom.myapp.controller;

import com.mycom.myapp.pojo.Customer;
import com.mycom.myapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/basicinfo")
public class BasicInfoController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/toSelect")
    public String toSelect(Model model){
        List<Customer> customerList = customerService.select(new Customer());
        model.addAttribute("customerList",customerList);
        return "selectconsequence";
    }
    @RequestMapping("/select")
    public String customerList(Customer customer,Model model) {
        List<Customer> customerList = customerService.select(customer);
        if (customerList!=null && customerList.size()>0){
            model.addAttribute("customerList",customerList);
            return "selectconsequence";
        }else{
            model.addAttribute("errormsg","用户不存在");
            return "selectconsequence";
        }
    }


    //新增用户
    @RequestMapping("/toInsert")
    public String toInsert(){
        return "insert";
    }
    @RequestMapping("/insert")
    public String insert(Customer customer,Model model){
        if (StringUtils.isEmpty(customer.getName())){
            model.addAttribute("errormsg","客户姓名不可为空");
            return "insert";
        }
        Boolean isOK1 = customerService.insert(customer);
        if (isOK1) {
            return toSelect(model);
        } else {
            return "insert";
        }
    }

    //更新用户
    @RequestMapping("/toUpdate")
    public String toUpdate(Customer customer,Model model){
        customer = customerService.select(customer).get(0);
        model.addAttribute("customer",customer);
        return "update";
    }
    @RequestMapping("/update")
    public String update(Customer customer,Model model){
        Boolean isOK2 = customerService.update(customer);
        if (isOK2){
            return toSelect(model);
        }else {
            return "selectconsequence";
        }
    }

    @RequestMapping("/delete")
    public String delete(Customer customer,Model model,int id){
        if (!StringUtils.isEmpty(id)){
            try{
                customerService.delete(customer);
            }catch (Exception e){
                model.addAttribute("errormsg","不可删除仍有车辆信息的客户，请核实");
                return toSelect(model);
            }
        }
        boolean customer2=customerService.delete(customer);
        return toSelect(model);
    }

    @RequestMapping("/deleteCustomerInfoBatch")
    public String deleteCustomerInfoBatch(Model model, String... ids) {
        if (!StringUtils.isEmpty(ids)){
            try{
                customerService.deleteCustomerInfoBatch(ids);
            }catch (Exception e){
                model.addAttribute("errormsg","不可删除仍有车辆信息的客户，请核实");
                return toSelect(model);
            }
        }
        if (!StringUtils.isEmpty(ids)){
            customerService.deleteCustomerInfoBatch(ids);
        }
        return toSelect(model);
    }
}
