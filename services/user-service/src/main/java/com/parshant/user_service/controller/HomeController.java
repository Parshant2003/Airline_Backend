package com.parshant.user_service.controller;

import com.parshant.Response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public ResponseEntity<?> HomeTest() {
        return ResponseEntity.ok("Welcome to user service!");
    }

}
