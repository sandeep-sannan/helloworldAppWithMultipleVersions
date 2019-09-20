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

    @RequestMapping("/hello")
    public String hello() {
        return String.format("This is hello from version 2");
    }

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hello-new")
    public String welcome() {
        System.out.println("Hello End Point Called...Version2");
        String message ="This is hello from version 2 + [ ";
        String azMsg="";
        try {
            azMsg = restTemplate.getForObject("http://azure-master-app:8080/welcome", String.class);
        }catch(Exception e){
            System.out.println("Exception " + e.getMessage());
            azMsg = e.getMessage();
        }
        message= message+azMsg +" ]";
        return message;
    }

    @Bean
    public RestTemplate rest() {
        return new RestTemplate();
    }

}
