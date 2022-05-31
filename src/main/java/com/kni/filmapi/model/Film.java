package com.kni.filmapi.model;



public class Film {

    public Film(String name, Double timeLength, String type) {
        this.name = name;
        this.timeLength = timeLength;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTimeLength() {
        return timeLength;
    }

    public void setTimeLength(Double timeLength) {
        this.timeLength = timeLength;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String name;
    private Double timeLength;
    private String type;

}
