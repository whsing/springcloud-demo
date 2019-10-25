package com.hsing.webdemo.controller;

import com.hsing.webdemo.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/")
    public String t(){
        return feignService.t();
    }
}
