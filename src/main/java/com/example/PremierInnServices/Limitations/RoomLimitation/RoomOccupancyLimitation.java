package com.example.PremierInnServices.Limitations.RoomLimitation;

import java.util.List;

public class RoomOccupancyLimitation {

    private List<RoomOccupancies> roomOccupancies;

    public RoomOccupancyLimitation() {}

    public RoomOccupancyLimitation(List<RoomOccupancies> roomOccupancies) {
        this.roomOccupancies = roomOccupancies;
    }

    public List<RoomOccupancies> getRoomOccupancies() {
        return roomOccupancies;
    }

    public void setRoomOccupancies(List<RoomOccupancies> roomOccupancies) {
        this.roomOccupancies = roomOccupancies;
    }
}
