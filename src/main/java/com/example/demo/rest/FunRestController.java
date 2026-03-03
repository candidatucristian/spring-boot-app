package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" that returns hello world

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // expose new endpoint for 'workout
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 10K";
    }

    // expose new endpoint for "goodbye'
    @GetMapping("/goodbye")
    public String sayGoodbye() {
        return "Goodbye, y'all";
    }
}