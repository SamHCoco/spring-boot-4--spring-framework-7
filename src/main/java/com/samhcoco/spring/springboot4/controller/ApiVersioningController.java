package com.samhcoco.spring.springboot4.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ApiVersioningController {

    @GetMapping(path = "/test-v1", version = "1")
    public ResponseEntity<?> v1Api() {
        return ResponseEntity.ok("v1 API");
    }

    @GetMapping(path = "/test-v2", version = "2")
    public ResponseEntity<?> v2Api() {
        return ResponseEntity.ok("v2 API");
    }

    @GetMapping(path = "/test-v2.2+", version = "2.2+")
    public ResponseEntity<?> v2Point2PlusApi() {
        return ResponseEntity.ok("v2.2+ API (+ indicates 2.2 or above)");
    }


}
