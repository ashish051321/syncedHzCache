package com.example.hz_example.services;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Cacheable(value = "myCache", key = "#key")
    public String getCachedData(String key) {
        // ...
        System.out.println("MyService getCachedData called");
        return "100";
    }

    @CachePut(value = "myCache", key = "#key")
    public String updateCachedData(String key, String value) {
        // ...
        System.out.println("MyService updateCachedData called");
        System.out.println(key);
        System.out.println(value);
        return value;
    }
}

