package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lidake on 2019/8/13.
 */
@RestController
public class TestTo

{

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public List dc() {
        long start = System.currentTimeMillis();
        String str="http://server$/server$";
        List<String> pathlist= new ArrayList<String>();
        for(int i=1;i<=30;i++){

            String s = restTemplate.getForObject(getPath(str, String.valueOf(i)), String.class) + "path:" + getPath(str, String.valueOf(i));

            pathlist.add(s);
        }
        long end=System.currentTimeMillis();
        long currentTime=end-start;

        pathlist.add(String.valueOf(currentTime));
       return pathlist;
    }
    public String getPath(String source,String target){
        if(source.indexOf("$") >0){
           source= source.replace("$",target);
        }

        return source;
    }
}
