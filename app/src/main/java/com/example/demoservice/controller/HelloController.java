package com.example.demoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/api/v1/hello")
    public Map<String, String> hello() {
        return Map.of(
            "message", "Hello from DevOps EKS Platform - Version 2.0!",
            "application", "demo-service",
            "status", "Running"
        );
    }

    @GetMapping("/api/v1/info")
    public Map<String, String> info() {
        return Map.of(
            "application", "demo-service",
            "version", "2.0",
            "environment", "development"
        );
    }
}
