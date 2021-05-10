package com.example.st_HW_89022.controller;

import com.example.st_HW_89022.Cache.Cache;
import com.example.st_HW_89022.models.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

//api.key=87c0e5b38c4b2fd56bc221e38629d3d1
@RestController
@RequestMapping("/city")
public class ApplicationController {

    private final static Logger logger = Logger.getLogger(Cache.class.getName());

    private String andKey = "&key=";

    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(path = "/{cityName}")
    public Example getCityWeather(@PathVariable("cityName") String cityName) {
        if(!Cache.example.containsKey(cityName)) {
            this.refresh(cityName);
        }

        return Cache.example.get(cityName);
    }

    private void refresh(String cityName){
        Example citySummary = restTemplate.getForObject("https://api.weatherbit.io/v2.0/current/airquality?city=" + cityName + andKey + apiKey, Example.class);
        Cache.setExample(cityName,citySummary);
        logger.info("Cache number of requests: " + Cache.getNrRequests());
    }

    @GetMapping(path = "/coord/{lat},{lon}")
    public Example getCityWeatherByCoord(@PathVariable("lat") String lat, @PathVariable("lon") String lon) {
        Example citySummary = restTemplate.getForObject("https://api.weatherbit.io/v2.0/current/airquality?lat=" + lat + "&lon=" +  lon + andKey + apiKey, Example.class);

        if (citySummary != null) {
            return new Example(citySummary.getData(),citySummary.getCityName(),citySummary.getLon(),citySummary.getTimezone(),citySummary.getLat(),citySummary.getCountryCode(),citySummary.getStateCode());
        }

        else {
            return null;
        }
    }
}

