package com.heroit.heroit.model;

public class Power {
    private long id;
    private String power;

    public Power() {
    }

    public Power(String power) {
        this.power = power;
        // ID not added due to auto-increment function on the database
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getPower() {
        return power;
    }
    public void setPower(String power) {
        this.power = power;
    }
}

