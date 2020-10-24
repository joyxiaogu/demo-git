package com.example.demogit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("/index")
    public String index(){
        return "Welcome to here!" +
                "update by idea.. Merging  code and resolving problems. V0.9 通过rebase合并（合并后分支不在标准日志上展示了）" +
                "feature2...";

    }

}
