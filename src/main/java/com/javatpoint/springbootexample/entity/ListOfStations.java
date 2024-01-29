package com.javatpoint.springbootexample.entity;

import java.util.ArrayList;
import java.util.List;

public class ListOfStations {
    String stationID;
    String portID;
    String bikeID;

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    public String getPortID() {
        return portID;
    }

    public void setPortID(String portID) {
        this.portID = portID;
    }

    public String getBikeID() {
        return bikeID;
    }

    public void setBikeID(String bikeID) {
        this.bikeID = bikeID;
    }

    @Override
    public String toString() {
        return "ListOfStations{" +
                "stationID='" + stationID + '\'' +
                ", portID='" + portID + '\'' +
                ", bikeID='" + bikeID + '\'' +
                '}';
    }
}
