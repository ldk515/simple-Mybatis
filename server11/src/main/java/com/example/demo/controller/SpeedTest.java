package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lidake on 2019/8/13.
 */
@RestController
public class SpeedTest
{
    @RequestMapping("/server11")
    public String testSpeedByFor(){
        List list =new ArrayList<String>();
        for(int i=0;i<10000;i++){
            list.add("testSpeedStr");
        }
        return "success Server11";
    }
}
