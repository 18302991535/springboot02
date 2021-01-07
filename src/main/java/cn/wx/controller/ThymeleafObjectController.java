package cn.wx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class ThymeleafObjectController {
@RequestMapping("/thmeleafObject")
public String thymeleafObject(Model model){
    Date date =new Date();
    Double price=123.48567d;
    String str ="这两天荒废了学习,有点惭愧";
    String str1="今后好好的补上,争取找个好工作";
    model.addAttribute("date",date);
    model.addAttribute("price",price);
    model.addAttribute("str",str);
    model.addAttribute("str1",str1);
    return "thymeleafObject";
}
}
