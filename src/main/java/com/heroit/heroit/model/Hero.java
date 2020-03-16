package com.heroit.heroit.model;

public class Hero {
    private long id;
    private String heroName;
    private String power;
    private String universe;
    private String creationDate;

    public Hero() {
    }

    public Hero(String heroName, String power, String universe, String creationDate) {
        this.heroName = heroName;
        this.power = power;
        this.universe = universe;
        this.creationDate = creationDate;
        // ID not added due to auto-increment function on the database
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getHeroName() {
        return heroName;
    }
    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getPower() {
        return power;
    }
    public void setPower(String power) {
        this.power = power;
    }

    public String getUniverse() {
        return universe;
    }
    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public String getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
