package com.lgypro.controller;

import jakarta.annotation.Resource;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/filter")
public class FilterController {

    @Resource
    SecurityFilterChain securityFilterChain;

    @GetMapping("/list")
    public List<String> list() {
        return securityFilterChain.getFilters().stream().map(String::valueOf).toList();
    }
}
