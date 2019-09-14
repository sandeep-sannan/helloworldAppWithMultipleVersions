package com.example.springhelloworldgcp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok("Pod Is Up");
    }

    @GetMapping("/version")
    public ResponseEntity<String> getMessageWithVersion() {
        return ResponseEntity.ok("Ver 2");
    }
}
