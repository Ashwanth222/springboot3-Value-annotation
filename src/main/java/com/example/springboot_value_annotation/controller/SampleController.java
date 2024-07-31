package com.example.springboot_value_annotation.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Value("${welcome.salutation: 👋🏻 Hello}")
    private String welcomeSalutation;

    @Value("${welcome.greeting}")
    private String welcomeGreeting;

    @GetMapping
    public String home() {
        return welcomeGreeting;
    }

}
