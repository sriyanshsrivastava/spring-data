package com.sriyansh.jpa.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // Home controller localhost:8080/ will give us hello world, in browser. or postman.
    @GetMapping("/")
    public String home(){
        return "Hello World";
    }

}
