package com.samhcoco.spring.springboot4.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.resilience.annotation.ConcurrencyLimit;
import org.springframework.resilience.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClient;

@Slf4j
@Service
@RequiredArgsConstructor
public class RetryService {

    private final RestClient restClient;

    public Object callWebApi(String url) {
        log.debug("RETRY TEST: ATTEMPTING API CALL TO {}", url);
        return restClient.get()
                         .uri(url)
                         .retrieve()
                         .body(String.class);
    }

}
