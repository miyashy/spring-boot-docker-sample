package com.github.miyashy;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
    @Value
    public static class HelloResponse {
        private final String message;
    }

    @GetMapping("/hello")
    public HelloResponse getHello() {
        log.info("/hello called.");
        return new HelloResponse("hello");
    }
}
