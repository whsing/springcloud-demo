package com.hsing.webdemo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "provider-demo")
public interface FeignService {
    @RequestMapping("/")
    String t();
}
