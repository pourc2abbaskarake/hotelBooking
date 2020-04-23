package com.karake.abbas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/bye")
    public String bye() {
        return "bye world";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
