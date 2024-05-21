package com.lgypro.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return "[" + username + "] Hello SpringSecurity!";
    }
}
