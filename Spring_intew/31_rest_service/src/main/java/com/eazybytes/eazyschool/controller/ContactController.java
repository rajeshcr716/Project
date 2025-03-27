package com.eazybytes.eazyschool.controller;

import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.eazybytes.eazyschool.proxy.ContactProxy;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@RestController
public class ContactController {
    @Autowired
    ContactProxy contactProxy;

    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/getMessages")
    public List<Contact> getMessagesByStatus(@RequestParam("status") String status){

        return contactProxy.getMessagesByStatus(status);
}

    @PostMapping("/saveMsg")
    public ResponseEntity<Response> saveMsg(@RequestBody Contact contact){
        String uri = "http://localhost:8080/api/contact/saveMsg";
        HttpHeaders headers = new HttpHeaders();
        headers.add("invocationFrom","RestTemplate");
        HttpEntity<Contact> httpEntity = new HttpEntity<>(contact, headers);
        ResponseEntity<Response> responseEntity = restTemplate.exchange(uri, HttpMethod.POST,
                httpEntity,Response.class);
        return responseEntity;
    }

}


