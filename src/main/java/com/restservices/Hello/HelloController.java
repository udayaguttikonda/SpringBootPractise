package com.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //@GetMapping("/hello")
    @RequestMapping(method = RequestMethod.GET,path = "/hello")
    public String Hello(){
        return "Hello";
    }
}
