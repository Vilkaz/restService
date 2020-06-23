package de.vilkas.restService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Just basic running controller, for CI/CD experiments
 */
@RestController
public class HelloController {


    @GetMapping
    public String hello() {
        return "Hello, Spring boot is running";
    }
}
