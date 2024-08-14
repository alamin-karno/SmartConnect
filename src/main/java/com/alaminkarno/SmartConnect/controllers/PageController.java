package com.alaminkarno.SmartConnect.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("name","Spring MVC");
        model.addAttribute("github","GitHub");
        model.addAttribute("youtube","YouTube Videos");
        return "home";
    }
}
