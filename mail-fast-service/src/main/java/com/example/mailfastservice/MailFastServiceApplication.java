package com.example.mailfastservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class MailFastServiceApplication {

    @Autowired
    EurekaClient eurekaClient;

    public static void main(String[] args) {
        SpringApplication.run(MailFastServiceApplication.class, args);
    }

    @RequestMapping("/mail")
    public String sendMail() {
        return "Hello world!\n\n" + eurekaClient.getInstanceRemoteStatus() + "\n" + eurekaClient.getEurekaClientConfig();
    }

}
