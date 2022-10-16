package com.example.hibernateworld.controller;

import com.example.hibernateworld.domain.City;
import com.example.hibernateworld.service.CityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    private CityService cityService;


    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping({"/city"})
    @ResponseBody
    public List<City> getAllCities() {
        return this.cityService.getAllCities();
    }

    @GetMapping({"/city/{id}"})
    @ResponseBody
    public City getCityById(@PathVariable Integer id) {
        return this.cityService.getCityById(id);
    }
}
