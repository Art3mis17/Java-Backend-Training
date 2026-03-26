package org.example.springsecurity.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Welcome to Public page";
    }


    @GetMapping("/user")
    public String userPage(){
        return "Welcome to User page";
    }

    @GetMapping("/admin")
    public String adminPage(){
        return "Welcome to Admin page";
    }
}
