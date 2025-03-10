package com.example.PremierInnServices.Limitations.RoomLimitation;

import java.util.List;

public class RoomOccupancies {

    private int adultsNumber;
    private int childrenNumber;
    private List<String> acceptedRoomTypes;

    public RoomOccupancies() {}

    public RoomOccupancies(int adultsNumber, int childrenNumber, List<String> acceptedRoomTypes) {
        this.adultsNumber = adultsNumber;
        this.childrenNumber = childrenNumber;
        this.acceptedRoomTypes = acceptedRoomTypes;
    }

    public int getAdultsNumber() {
        return adultsNumber;
    }

    public void setAdultsNumber(int adultsNumber) {
        this.adultsNumber = adultsNumber;
    }

    public int getChildrenNumber() {
        return childrenNumber;
    }

    public void setChildrenNumber(int childernNumber) {
        this.childrenNumber = childernNumber;
    }

    public List<String> getAcceptedRoomTypes() {
        return acceptedRoomTypes;
    }

    public void setAcceptedRoomTypes(List<String> acceptedRoomTypes) {
        this.acceptedRoomTypes = acceptedRoomTypes;
    }
}
