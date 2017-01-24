package com.olegregg.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping(method=RequestMethod.GET, value="/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello");
    }
}
