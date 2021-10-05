package com.example.mailqualityservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mailqualityservice.clients.FastMailClient;

@RestController
public class MailController {

    final FastMailClient fastMailClient;

    public MailController(FastMailClient restClient) {
        this.fastMailClient = restClient;
    }

    @GetMapping("/mail")
    public String getMail(){
        return fastMailClient.getMail();
    }
}
