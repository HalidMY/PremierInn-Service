package com.example.PremierInnServices.services;


import com.example.PremierInnServices.models.Hotel;
import com.example.PremierInnServices.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> getHotels() {
        return hotelRepository.findAll();
    }

    public Hotel getHotelById(String id) {
        return hotelRepository.findById(id).orElse(null);
    }

    public Hotel createHotel(Hotel hotel) { return this.hotelRepository.save(hotel); }

    public Hotel updateHotel(Hotel hotel) { return this.hotelRepository.save(hotel); }
}
