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
    
        @Autowired
        RestTemplate restTemplate;

        @RequestMapping("/welcome")
        public String welcome() {
            String message ="";
            try {
                message = restTemplate.getForObject("http://hello-message-app:8888/hello", String.class);
            }catch(Exception e){
                System.out.println("Exception " + e.getMessage());
            }
            return message;
        }

        @Bean
        public RestTemplate rest() {
            return new RestTemplate();
        }

}
