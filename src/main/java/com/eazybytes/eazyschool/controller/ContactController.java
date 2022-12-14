package com.eazybytes.eazyschool.controller;

import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.service.ContactService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
@Slf4j
@Controller
public class ContactController {

   // this log line not needed.
    /* private static Logger log = LoggerFactory.getLogger(ContactController.class);*/


    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }


//--STEP 3
// this is commented because no validation
    /*public String displayContactPage(){
        return "contact.html";
    }
*/
    // In below code we need to validate contact information given from the front end
    //first we need create model abject inside method ,after will call the contact object and make validation
  //--STEP 4
    @RequestMapping("/contact")
    public String displayContactPage(Model model){
        model.addAttribute("contact",new Contact());

        return "contact.html";
    }


    //Request mapping in genric in nature and it is our responsibility to convey what method should accept whether it post (or)get.
    //if we not mention the method support both type of them.


///--STEP 1
    //@PostMapping(value = "/saveMsg")
   /* @RequestMapping(value = "/saveMsg",method = POST)
    public ModelAndView saveMessage(@RequestParam String name,@RequestParam String mobileNum,@RequestParam String email,@RequestParam String subject,
                                    @RequestParam String message)
    {
        log.info("Name : " + name);
        log.info("Mobile Number : " + mobileNum);
        log.info("Email Address : " + email);
        log.info("Subject : " + subject);
        log.info("Message : " + message);
        return new ModelAndView("redirect:/contact");

    }*/


// --STEP 2
    /* @RequestMapping(value = "/saveMsg",method = POST)
    public ModelAndView saveMessage(Contact contact)
    {
        return new ModelAndView("redirect:/contact");
    }*/
// for validation some changes required.
// -- STEP 5
    @RequestMapping(value = "/saveMsg",method = POST)
    public Object saveMessage(@Valid @ModelAttribute("contact") Contact contact, Errors errors)
    {
        if(errors.hasErrors())
        {
            log.error("Contact from validation failed due to : "+ errors.toString());
            return "contact.html";
        }
        contactService.saveMessageDetails(contact);


        contactService.setCounter(contactService.getCounter()+1);
        log.info("Number of contact form submitted:  "+contactService.getCounter());

        return new ModelAndView("redirect:/contact");
    }




}
