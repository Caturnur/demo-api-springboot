package com.domain.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeControllers {

    @GetMapping
    public String welcome() {
        return "welcome catur in spring boot REST API";
    }

    @PostMapping
    public String other() {
        return "Welcome Catur";
    }

}
