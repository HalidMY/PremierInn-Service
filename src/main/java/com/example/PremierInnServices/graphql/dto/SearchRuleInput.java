package com.example.PremierInnServices.graphql.dto;

import com.example.PremierInnServices.Limitations.ArrivalDateLimitation.MaxArrivalDateLimitation;
import com.example.PremierInnServices.Limitations.NightLimitations.MaxNightsLimitation;
import com.example.PremierInnServices.Limitations.RoomLimitation.MaxRoomsLimitation;
import com.example.PremierInnServices.Limitations.RoomLimitation.RoomOccupancyLimitation;

public class SearchRuleInput {

    private MaxRoomsLimitation maxRoomsLimitation;
    private MaxNightsLimitation maxNightsLimitation;
    private MaxArrivalDateLimitation maxArrivalDateLimitation;
    private RoomOccupancyLimitation roomOccupancyLimitations;

    // Getters and setters
    public MaxRoomsLimitation getMaxRoomsLimitation() {
        return maxRoomsLimitation;
    }

    public void setMaxRoomsLimitation(MaxRoomsLimitation maxRoomsLimitation) {
        this.maxRoomsLimitation = maxRoomsLimitation;
    }

    public MaxNightsLimitation getMaxNightsLimitation() {
        return maxNightsLimitation;
    }

    public void setMaxNightsLimitation(MaxNightsLimitation maxNightsLimitation) {
        this.maxNightsLimitation = maxNightsLimitation;
    }

    public MaxArrivalDateLimitation getMaxArrivalDateLimitation() {
        return maxArrivalDateLimitation;
    }

    public void setMaxArrivalDateLimitation(MaxArrivalDateLimitation maxArrivalDateLimitation) {
        this.maxArrivalDateLimitation = maxArrivalDateLimitation;
    }

    public RoomOccupancyLimitation getRoomOccupancyLimitations() {
        return roomOccupancyLimitations;
    }

    public void setRoomOccupancyLimitations(RoomOccupancyLimitation roomOccupancyLimitations) {
        this.roomOccupancyLimitations = roomOccupancyLimitations;
    }
    @Override
    public String toString() {
        return "SearchRuleInput{" +
                "maxRoomsLimitation=" + maxRoomsLimitation +
                ", maxNightsLimitation=" + maxNightsLimitation +
                ", maxArrivalDateLimitation=" + maxArrivalDateLimitation +
                ", roomOccupancyLimitations=" + roomOccupancyLimitations +
                '}';
    }
}
