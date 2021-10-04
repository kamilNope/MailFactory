package com.example.maildiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MailDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailDiscoveryServiceApplication.class, args);
    }

}
