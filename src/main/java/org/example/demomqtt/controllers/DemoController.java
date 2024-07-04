package org.example.demomqtt.controllers;

import lombok.RequiredArgsConstructor;
import org.example.demomqtt.services.DemoServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final DemoServices demoServices;

    @GetMapping("/data")
    public Integer getData() {
        return demoServices.getMessage();
//        return 5;
    }
}
