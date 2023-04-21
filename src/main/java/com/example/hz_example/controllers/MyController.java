package com.example.hz_example.controllers;

import com.example.hz_example.services.MyService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/data/{key}")
    public ResponseEntity<String> getData(@PathVariable String key) {
        return ResponseEntity.ok().body(myService.getCachedData(key));
    }

    @PostMapping("/data/{key}")
    public void updateData(@PathVariable String key, @RequestBody String value) {
        myService.updateCachedData(key, value);
    }
}
