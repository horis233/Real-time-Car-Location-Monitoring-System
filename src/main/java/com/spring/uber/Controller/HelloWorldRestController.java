package com.spring.uber.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.spring.uber.domain.Message;

@RestController
public class HelloWorldRestController {

    @RequestMapping("/")
    public String welcome(){
        return "Hello Spring Uber";
    }

    @RequestMapping("/hello/{yourName}")
    public Message showMessage(@PathVariable String yourName){
        Message msg = new Message(yourName,"Hello "+yourName);
        return msg;
    }

}