package com.example.mailqualityservice.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "fast-service", url = "http://localhost:8001")
public interface FastMailClient {

    @RequestMapping("/mail")
    String getMail();

}
