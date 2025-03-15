package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Greet(){
        return "Hello World";
    }
    @GetMapping("/about")
    public String About(){
        return "Gaurish Kamat";
    }
}
