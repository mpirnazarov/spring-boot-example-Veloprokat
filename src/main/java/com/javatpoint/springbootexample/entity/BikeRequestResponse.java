package com.javatpoint.springbootexample.entity;

public class BikeRequestResponse {

    String stationID;
    String portID;

    public BikeRequestResponse() {
    }

    public BikeRequestResponse(String stationID, String portID) {
        this.stationID = stationID;
        this.portID = portID;
    }

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
}
