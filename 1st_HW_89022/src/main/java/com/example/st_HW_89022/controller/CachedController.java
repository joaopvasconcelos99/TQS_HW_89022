package com.example.st_HW_89022.controller;

import com.example.st_HW_89022.Cache.Cache;
import com.example.st_HW_89022.models.Example;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

//api.key=87c0e5b38c4b2fd56bc221e38629d3d1
@RestController
@RequestMapping("/cached")
public class CachedController {

    @GetMapping("")
    public Map<String, Example> getCachedStatistcs() {
        return Cache.example;
    }
}


