package com.example.gps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gps.model.location;
import com.example.gps.service.LocationService;

@RestController
@RequestMapping("/api")
public class locationControl {
    
    @Autowired
    LocationService locationService;

    @GetMapping("/getLocation")
    public List<location> getLocation()
    {
        return locationService.getLocation();
    }

    @PostMapping("/addLocation")
    public String addLocation(@RequestBody List<String> Locationdata)
    {
        return locationService.addLocation(Locationdata);
    }
    {
        
    }
}
