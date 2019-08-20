package com.example.demo.controller;

import com.example.demo.feignServer.Server1Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lidake on 2019/8/14.
 */
@RestController
public class Server1ClientController
{
    @Autowired
    Server1Client server1Client;
    @GetMapping("/hello")
    public String sayhi(){

        return server1Client.sayHello();
    }
}
