package io.sudostream.learning.springboot.two.learningspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String greeting(@RequestParam(required = false, defaultValue = "") String name) {
        return "".equals(name) ? "Hey!" : "Hey, " + name + "!";
    }

}
