package com.heroit.heroit.model;

public class Universe {
    private long id;
    private String universe;

    public Universe() {
    }

    public Universe(String universe) {
        this.universe = universe;
        // ID not added due to auto-increment function on the database
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getUniverse() {
        return universe;
    }
    public void setUniverse(String universe) {
        this.universe = universe;
    }
}
