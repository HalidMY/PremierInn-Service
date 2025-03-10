package com.example.PremierInnServices.Limitations.NightLimitations;

public class MaxNightsLimitation {

    private int maxNights;

    public MaxNightsLimitation() {}

    public MaxNightsLimitation(int maxNights) {
        this.maxNights = maxNights;
    }

    public int getMaxNights() {
        return maxNights;
    }

    public void setMaxNights(int maxNights) {
        this.maxNights = maxNights;
    }
}
