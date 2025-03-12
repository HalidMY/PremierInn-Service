package com.example.PremierInnServices.controllers;

import com.example.PremierInnServices.models.RoomType;
import com.example.PremierInnServices.services.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roomType")
public class RoomTypeController {

    @Autowired
    private RoomTypeService roomTypeService;

    @GetMapping
    public List<RoomType> getRoomTypes() {
        return roomTypeService.getAllRoomTypes();
    }

    @GetMapping("/{id}")
    public RoomType getRoomTypeById(@PathVariable String id) {
        return roomTypeService.getRoomTypeById(id);
    }


    @PostMapping
    public RoomType createRoomType(@RequestBody RoomType roomType) {
        return roomTypeService.createRoomType(roomType);
    }

    @PutMapping
    public RoomType updateRoomType(@RequestBody RoomType roomType) {
        return roomTypeService.updateRoomType(roomType);
    }

    @DeleteMapping
    public void deleteRoomType(@RequestBody RoomType roomType) {
        roomTypeService.deleteRoomType(roomType);
    }
}
