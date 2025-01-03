package com.eazybytes.eazyschool.controller;

import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.POST;


@Controller
public class ContactController {

    @RequestMapping("/contact")
    public String displayContactPage()
    {
        return "contact.html";
    }


    private  static Logger log = LoggerFactory.getLogger(ContactController.class);

    @Autowired
    private ContactService contactService;

    @RequestMapping(value = "/saveMsg", method = POST)
    public  ModelAndView saveMessage(Contact contact){
         contactService.saveMessageDetails(contact);
        return new ModelAndView("redirect:/contact");
    }





}
