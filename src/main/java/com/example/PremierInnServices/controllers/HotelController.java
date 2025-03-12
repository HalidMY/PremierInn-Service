package com.example.PremierInnServices.controllers;


import com.example.PremierInnServices.models.Hotel;
import com.example.PremierInnServices.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping
    public List<Hotel> getAllHotels() {
        return hotelService.getHotels();
    }

    @GetMapping("/{id}")
    public Hotel getHotelById(@PathVariable String id) {
        return hotelService.getHotelById(id);
    }

    @PostMapping
    public Hotel createHotel(@RequestBody Hotel hotel) {
        return hotelService.createHotel(hotel);
    }

    @PutMapping
    public Hotel updateHotel(@RequestBody Hotel hotel) {
        return hotelService.updateHotel(hotel);
    }

}
