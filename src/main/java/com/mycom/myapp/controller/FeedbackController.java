package com.mycom.myapp.controller;
import com.mycom.myapp.pojo.Feedback;
import com.mycom.myapp.service.CustomerService;
import com.mycom.myapp.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/feedback")
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/toSelect")
    public String toSelect( Model model) {
        List<Feedback> feedbackList = feedbackService.select(new Feedback());
        model.addAttribute("feedbackList", feedbackList);
        return "feedbackselectconsequence";
    }

    @RequestMapping("/select")
    public String feedbackList(Feedback feedback, Model model) {
        List<Feedback> feedbackList = feedbackService.select(feedback);
        if (feedbackList != null && feedbackList.size() > 0) {
            model.addAttribute("feedbackList", feedbackList);
            return "feedbackselectconsequence";
        } else {
            model.addAttribute("errormsg", "该用户尚无留言！");
            return "feedbackselectconsequence";
        }

    }

    //新增用户
//    @RequestMapping("/toInsert")
//    public String toInsert() {
//        return "carinsert";
//    }
//
//    @RequestMapping("/insert")
//    public String insert(CustomerCar customerCar, Model model) {
//        if (StringUtils.isEmpty(customerCar.getName())||StringUtils.isEmpty(customerCar.getCartype())){
//            model.addAttribute("errormsg","客户姓名或车型不可为空");
//            return "carinsert";
//        }
//
//        List<Customer> list = customerService.select(new Customer(customerCar.getName()));
//        if (list.size()==0){
//            model.addAttribute("errormsg","客户不存在，请核实客户信息");
//            return "carinsert";
//        }
//        customerCar.setCustomerId(list.get(0).getId());
//        Boolean isOK1 = customerCarService.insert(customerCar);
//        if (isOK1) {
//            model.addAttribute("errormsg","新增成功");
//            return toSelect(model);
//        } else {
//            model.addAttribute("errormsg","新增失败");
//            return "carinsert";
//        }
//    }

    //更新用户
    @RequestMapping("/toUpdate")
    public String toUpdate(Feedback feedback, Model model) {
        List<Feedback> feedbacks = feedbackService.select(feedback);
        model.addAttribute("feedback", feedbacks.get(0));
        return "feedbackupdate";
    }

    @RequestMapping("/update")
    public String update(Feedback feedback, Model model) {
        Boolean isOK2 = feedbackService.update(feedback);
        if (isOK2) {
            model.addAttribute("errormsg", "更新成功！");
            return toSelect(model);
        } else {
            model.addAttribute("feedback", feedback);
            model.addAttribute("errormsg", "更新失败！");
            return "feedbackupdate";
        }
    }

    //删除用户
//    @RequestMapping("/toDelete")
//    public String toDelete(){return "delete";}
    @RequestMapping("/delete")
    public String delete(Feedback feedback, Model model) {
        boolean f1 = feedbackService.delete(feedback);
        if (f1) {
            model.addAttribute("errormsg", "删除成功！");
        } else {
            model.addAttribute("errormsg", "删除失败！！");
        }
        return toSelect(model);

    }
}
