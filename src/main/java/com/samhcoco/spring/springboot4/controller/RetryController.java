package com.samhcoco.spring.springboot4.controller;

import com.samhcoco.spring.springboot4.service.RetryService;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.resilience.annotation.ConcurrencyLimit;
import org.springframework.resilience.annotation.Retryable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RetryController {

    private final RetryService retryService;

    @Retryable(
            maxRetries = 3,
            delay = 2000,
            multiplier = 1.5,
            maxDelay = 3000
    )
    @ConcurrencyLimit(
            limit = 5      // only 5 threads allowed
    )
    @GetMapping(path = "/test-retry", version = "1")
    public ResponseEntity<?> testRetry() {
        val response = retryService.callWebApi("http://localhost:9000/api/v1/error/500");
        return ResponseEntity.ok(response);
    }

}
