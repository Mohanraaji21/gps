package com.example.gps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

import com.example.gps.model.location;
import com.example.gps.repository.locationRepository;

@Service
@Document("Live_location")
public class LocationService {
    
    @Autowired
    locationRepository LocationRep;

    public List<location> getLocation()
    {
        return LocationRep.findAll();
        
    }

    public String addLocation(List<String> locationdata) {
        Optional<location> temp = LocationRep.findById("66028547c405cc136dc10cdc");
        temp.get().setLatitude(locationdata.get(0));
        temp.get().setLongtitude(locationdata.get(1));
        temp.get().setAltitude(locationdata.get(2));
        try{
            LocationRep.save(temp.get());
            return "Added";
        }
        catch(Exception e){
            return e.toString();
        }
        
        
    }
}
