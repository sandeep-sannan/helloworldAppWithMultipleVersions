package com.example.springhelloworldgcp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello-old")
    public String hello() {
        return String.format("This is hello from version 1");
    }

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String welcome() {
        String message ="This is hello from version 1 + [ ";
        String azMsg="";
        try {
            azMsg = restTemplate.getForObject("http://azure-hello-message-app:8080/welcome", String.class);
        }catch(Exception e){
            System.out.println("Exception " + e.getMessage());
            azMsg = "failed to call azure pods";
        }
        message= message+azMsg +" ]";
        return message;
    }

    @Bean
    public RestTemplate rest() {
        return new RestTemplate();
    }


}
