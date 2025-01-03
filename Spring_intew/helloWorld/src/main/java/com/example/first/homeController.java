package com.example.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    // When user trying to access the /home  then below method
    // just return the welcome.html

    @RequestMapping(value = {"","/","/home"})
    public String hello()
    {
        return "welcome.html";
    }
}
