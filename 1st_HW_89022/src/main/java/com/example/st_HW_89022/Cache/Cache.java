package com.example.st_HW_89022.Cache;

import com.example.st_HW_89022.models.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.HashMap;
import java.util.Map;


public class Cache {

    public static final Map<String, Example> example = new HashMap<>();
    private static int nRequests = 0;

    @Autowired
    CommandLineRunner run;

    public static void setExample(String city,Example example){
        Cache.example.put(city, example);
        Cache.nRequests++;
    }

    public static int getNrRequests(){
        return Cache.nRequests;
    }
}
