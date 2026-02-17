package com.samhcoco.spring.springboot4.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SimulatedFailureController {

    @GetMapping(value = "error/500", version = "1")
    public ResponseEntity<Object> simulateServerErrorResponse() {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Simulated 500 Server Error Response");
    }

}
