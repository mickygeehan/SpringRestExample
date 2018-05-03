package com.michael.restdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/greeting")
    public String getHomepage(){
        return "greeting";
    }
}