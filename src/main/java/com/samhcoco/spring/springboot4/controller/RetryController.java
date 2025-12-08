package com.samhcoco.spring.springboot4.controller;

import com.samhcoco.spring.springboot4.service.RetryService;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RetryController {

    private final RetryService retryService;

    @GetMapping(path = "/test-retry", version = "1")
    public ResponseEntity<?> testRetry() {
        val response = retryService.callWebApi("http://localhost:8080");
        return ResponseEntity.ok(response);
    }

}
