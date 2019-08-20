package com.example.demo.feignServer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by lidake on 2019/8/14.
 */
@FeignClient("server1")
public interface Server1Client
{
    @GetMapping("/server1")
    String sayHello();
}
