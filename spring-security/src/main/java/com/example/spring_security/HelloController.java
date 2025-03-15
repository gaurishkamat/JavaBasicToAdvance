package com.example.spring_security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String Home(){
        return "Welcome";
    }

    @GetMapping("/hello")
    public String Greet(){
        return "Hello World";
    }
    @GetMapping("/about")
    public String About(){
        return "Gaurish Kamat";
    }
}
