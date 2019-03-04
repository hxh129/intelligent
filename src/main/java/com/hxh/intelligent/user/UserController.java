package com.hxh.intelligent.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("hello")
    public String hello(){
        return "hello,first request";
    }
}
