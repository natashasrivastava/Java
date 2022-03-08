package com.payment.api.paymentapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET,path = "/helloWorld")
    public String helloWorld(){
        return "Hello World1";
    }

    @GetMapping(path = "/helloWorldBean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello Natasha");
    }
    @GetMapping(path = "/helloWorldBean/path-variable/{name}")
    public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
