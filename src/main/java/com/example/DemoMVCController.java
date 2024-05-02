package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoMVCController {

    @GetMapping("/hello")
    public String displayMessage() {
        return "Hello Ynov";
    }
}
