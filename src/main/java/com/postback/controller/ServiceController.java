package com.postback.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @RequestMapping(value = "/postback", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void endpointExample(@RequestBody String payload) {
        System.out.println(payload);
    }
}
