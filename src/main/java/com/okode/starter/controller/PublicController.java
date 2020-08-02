package com.okode.starter.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PublicController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        log.info("Saying hello to {}", name);
        return "Hello, " + name;
    }

    @GetMapping("/version")
    public String getVersion() {
        log.info("Retrieving version");
        return "1.0";
    }

}
