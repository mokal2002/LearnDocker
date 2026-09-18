package com.docker.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class BaseController {

    @GetMapping("/status")
    public String status() {
        return "Docker Conatiner is working";
    }

}