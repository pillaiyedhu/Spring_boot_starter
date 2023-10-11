package com.yedhu.springbootstarter.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //@RequestMapping(value = "/",method = RequestMethod.GET)
    @GetMapping("/")
    public String helloWorld(){
        return "This is my Spring Started Project!!!!!Devtools Check";
    }
}
