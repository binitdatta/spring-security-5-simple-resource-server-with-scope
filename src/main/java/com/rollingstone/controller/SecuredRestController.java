package com.rollingstone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class SecuredRestController
{
    @GetMapping("/status/check")
    public String status() {
        return "Working....";
    }
}
