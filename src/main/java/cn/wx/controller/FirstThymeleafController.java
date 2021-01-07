package cn.wx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstThymeleafController {
    String str="欢迎学习Themeleaf模板引擎...";
    @GetMapping("/firstThymeleaf")
    public String firstThymeleaf(Model model){
        model.addAttribute("thymeleaf",str);
        model.addAttribute("role","admin");
        return "index";
    }
}
