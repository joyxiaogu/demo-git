package com.example.demogit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("/index")
    public String index(){
        return "Welcome to here!" +
                "update ...!!!222222 github    local local  " ;

    }

}
