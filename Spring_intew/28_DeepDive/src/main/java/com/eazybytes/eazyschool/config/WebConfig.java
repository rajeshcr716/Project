package com.eazybytes.eazyschool.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/courses").setViewName("courses");
        registry.addViewController("/about").setViewName("about");
        //registry.addViewController("/error").setViewName("error");
       // registry.addViewController("/login").setViewName("login");
       // registry.addViewController("/contact").setViewName("contact");
        // commented because db operation needed so separate controller class is created.


    }
}
