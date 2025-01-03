package com.eazybytes.eazyschool.service;

import ch.qos.logback.core.CoreConstants;
import com.eazybytes.eazyschool.controller.ContactController;
import com.eazybytes.eazyschool.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Slf4j
@Service
@RequestScope
@SessionScope
@ApplicationScope
public class ContactService {

    public int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public ContactService() {
        System.out.println("Contact Service Bean initialized");
    }

    public boolean saveMessageDetails(Contact contact){
     boolean isSaved = true;
      log.info(contact.toString());
        return isSaved;
    }
}
