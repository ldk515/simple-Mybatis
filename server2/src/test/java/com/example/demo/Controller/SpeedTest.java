package com.example.demo.Controller;

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
    @RequestMapping("/server2")
    public void testSpeedByFor(){
        List list =new ArrayList<String>();
        for(int i=0;i<10000;i++){
            list.add("testSpeedStr");
        }

    }
}
