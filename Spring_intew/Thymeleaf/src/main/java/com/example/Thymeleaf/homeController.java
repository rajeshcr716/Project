package com.example.Thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

    @RequestMapping(value = {"","/","home"})
    public String display(Model model){
        model.addAttribute("username", "Jack");
        return "welcome.html";
    }
}
