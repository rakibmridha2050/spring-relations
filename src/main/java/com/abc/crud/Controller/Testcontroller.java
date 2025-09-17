package com.abc.crud.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {
    @Value("${profile}")
    private  String message;

    @GetMapping("/")
    public String home(){
        return "Message: " + message;
    }
}
