package edu.miu.cs.cs590.lab2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/"})
public class GreetingController {

    @GetMapping(value = {"/hello"})
    public String sayHello(){
        return "Hello world";
    }
}
