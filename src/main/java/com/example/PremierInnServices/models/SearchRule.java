package com.example.PremierInnServices.models;


import com.example.PremierInnServices.Limitations.ArrivalDateLimitation.MaxArrivalDateLimitation;
import com.example.PremierInnServices.Limitations.NightLimitations.MaxNightsLimitation;
import com.example.PremierInnServices.Limitations.RoomLimitation.MaxRoomsLimitation;
import com.example.PremierInnServices.Limitations.RoomLimitation.RoomOccupancyLimitation;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "search_rules")
public class SearchRule {


    private MaxRoomsLimitation maxRoomsLimitation;
    private MaxNightsLimitation maxNightsLimitation;
    private MaxArrivalDateLimitation maxArrivalDateLimitation;
    private RoomOccupancyLimitation roomOccupancyLimitations;

    public SearchRule() {}

    public SearchRule(
                      MaxRoomsLimitation maxRoomsLimitation,
                      MaxNightsLimitation maxNightsLimitation,
                      MaxArrivalDateLimitation maxArrivalDateLimitation,
                      RoomOccupancyLimitation roomOccupancyLimitations) {
        this.maxRoomsLimitation = maxRoomsLimitation;
        this.maxNightsLimitation = maxNightsLimitation;
        this.maxArrivalDateLimitation = maxArrivalDateLimitation;
        this.roomOccupancyLimitations = roomOccupancyLimitations;
    }


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
}
