package com.example.demogit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("/index")
    public String index(){
        return "Welcome to here! pull  在自动合并代码时有冲突，解决冲突！" ;

    }

}
