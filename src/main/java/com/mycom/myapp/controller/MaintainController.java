package com.mycom.myapp.controller;

import com.mycom.myapp.pojo.Customer;
import com.mycom.myapp.pojo.CustomerCar;
import com.mycom.myapp.pojo.Feedback;
import com.mycom.myapp.pojo.Maintain;
import com.mycom.myapp.service.CustomerCarService;
import com.mycom.myapp.service.CustomerService;
import com.mycom.myapp.service.FeedbackService;
import com.mycom.myapp.service.MaintainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/maintain")
public class MaintainController {
    @Autowired
    private MaintainService maintainService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerCarService customerCarService;

    @RequestMapping("/toSelect")
    public String toSelect( Model model) {
        List<Maintain> maintainList = maintainService.select(new Maintain());
        model.addAttribute("maintainList", maintainList);
        return "maintain";
    }

    @RequestMapping("/select")
    public String maintainList(Maintain maintain, Model model) {
        List<Maintain> maintainList = maintainService.select(maintain);
        if (maintainList != null && maintainList.size() > 0) {
            model.addAttribute("maintainList", maintainList);
            return "maintain";
        } else {
            model.addAttribute("errormsg", "无维修记录！");
            return "maintain";
        }

    }


    @RequestMapping("/toInsert")
    public String toInsert() {
        return "maintaininsert";
    }
    @RequestMapping("/insert")
    public String insert(Maintain maintain, Model model) {
        if (StringUtils.isEmpty(maintain.getName())||StringUtils.isEmpty(maintain.getCarnumber())){
            model.addAttribute("errormsg","客户姓名或车牌不可为空");
            return "maintain";
        }
/*        List<Maintain> list = maintainService.select(new Maintain());
        if (list.size()==0){
            model.addAttribute("errormsg","客户不存在，请核实客户信息");
            return "maintain";
        }

 */
        Customer customer=new Customer();
        customer.setName(maintain.getName());
        List<Customer> customerList = customerService.select(customer);
        if (customerList.size()==0){
            model.addAttribute("errormsg","用户不存在");
            return "maintain";
        }
        maintain.setCustomerId(customerList.get(0).getId());
  //
        CustomerCar customerCar=new CustomerCar();
        customerCar.setCarnumber(maintain.getCarnumber());
        List<CustomerCar> customerCarList= customerCarService.select(customerCar);
        if (customerCarList.size()==0){
            model.addAttribute("errormsg","车牌号错误");
            return "maintain";
        }
        
///
        Boolean isOK1 = maintainService.insert(maintain);
        if (isOK1) {
            model.addAttribute("errormsg","新增成功");
            return toSelect(model);
        } else {
            model.addAttribute("errormsg","新增失败");
            return "maintain";
        }
    }


    //更新用户
    @RequestMapping("/toUpdate")
    public String toUpdate(Maintain maintain, Model model) {
        List<Maintain> maintains = maintainService.select(maintain);
        model.addAttribute("maintain", maintains.get(0));
        return "maintainupdate";
    }

    @RequestMapping("/update")
    public String update(Maintain maintain, Model model) {
        Boolean isOK2 = maintainService.update(maintain);
        if (isOK2) {
            model.addAttribute("errormsg", "更新成功！");
            return toSelect(model);
        } else {
            model.addAttribute("maintain", maintain);
            model.addAttribute("errormsg", "更新失败！");
            return "maintainupdate";
        }
    }

    //删除用户
//    @RequestMapping("/toDelete")
//    public String toDelete(){return "delete";}
    @RequestMapping("/delete")
    public String delete(Maintain maintain, Model model) {
        boolean f1 = maintainService.delete(maintain);
        if (f1) {
            model.addAttribute("errormsg", "删除成功！");
        } else {
            model.addAttribute("errormsg", "删除失败！！");
        }
        return toSelect(model);

    }
}