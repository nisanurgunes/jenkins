package com.jnkns.jenkins.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {
    @GetMapping
    public ResponseEntity<String> getMessage() {
        return new ResponseEntity<>("Nisa Gunes", HttpStatus.OK);
    }
}
