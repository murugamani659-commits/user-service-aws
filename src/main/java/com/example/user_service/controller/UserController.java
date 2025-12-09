package com.example.user_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping("/health")
    public String health() {
        return "AWS Migration Successful! - Pipeline v1";
    }
    @GetMapping
    public Map<String, String> demo() {
        return Map.of("message", "Database connection active", "status", "OK");
    }
}