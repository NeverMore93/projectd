package com.ywt.demo.projectd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(name = "/")
    public String hello(){
        return "Hello projectD";
    }
}
