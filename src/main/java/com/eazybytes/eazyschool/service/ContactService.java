package com.eazybytes.eazyschool.service;


import com.eazybytes.eazyschool.constants.EazySchoolConstants;
import com.eazybytes.eazyschool.model.Contact;

import com.eazybytes.eazyschool.repository.ContactRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;


import java.time.LocalDateTime;

@Slf4j
@Service
//@RequestScope
//@SessionScope
//@ApplicationScope
@Data
public class ContactService {

    private int counter = 0;

    public ContactService()
    {
        System.out.println("Contact service Bean initialized");
    }





    //Now logger object needed no more because above @Slf4j annotaion generate log object by default  based on class names
   //another great advantage is by mistake if we define another class name .The log came from that  class..(consider below line)
    //...(ContactController.class) So this is wrong..manuall mistake . using annotaion by default it populate current class object.

    /*private static Logger log = LoggerFactory.getLogger(ContactService.class);*/

    /**
     * Save Contact Details into DB
     * @param contact
     * @return boolean
     */

    //STEP 3
    @Autowired
    private ContactRepository contactRepository;



    public boolean saveMessageDetails(Contact contact){

        boolean isSaved = true;
         contact.setStatus(EazySchoolConstants.OPEN);
        contact.setCreatedBy(EazySchoolConstants.ANONYMOUS);
        contact.setCreatedAt(LocalDateTime.now());

        int result = contactRepository.saveContactMsg(contact);

         if(result>0)
        {
            isSaved = true;
        }


        log.info(contact.toString());
        return isSaved;
//abced test 

    }
}
