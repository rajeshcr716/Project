package com.eazybytes.eazyschool.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandler(Exception exception){
     ModelAndView errorPage = new ModelAndView();
     errorPage.setViewName("error");
     errorPage.addObject("error message", exception.getMessage());
        return  errorPage;
    }
}
