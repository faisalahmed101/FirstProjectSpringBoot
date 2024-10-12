package com.faisal.firstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

    @GetMapping("home")
    public String sayHello(){
        return "hello";
    }

    @GetMapping("about")
    public String about(){
        return "This is about page";
    }
}
