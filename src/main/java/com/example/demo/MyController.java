package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @RequestMapping("/test")
    public ResponseEntity<String> test() {
        throw new RuntimeException();
    }


    @RequestMapping("/test1")
    public ResponseEntity<String> test1() {
        throw new IllegalArgumentException("test1 error");
    }
}
