package com.okode.starter.controller;

import com.okode.starter.model.Greeting;
import com.okode.starter.model.Version;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class PublicController {

    private Version version = new Version();

    @GetMapping("/hello/{name}")
    public Greeting hello(@PathVariable String name) {
        log.info("Saying hello to {}", name);
        return new Greeting("Hello, " + name);
    }

    @GetMapping("/version")
    public Version getVersion() {
        log.info("Retrieving version");
        return version;
    }

}
