package com.javatpoint.springbootexample.entity;

public class BikeRequestResponse {

    int stationID;
    int portID;

    public BikeRequestResponse() {
    }

    public BikeRequestResponse(int stationID, int portID) {
        this.stationID = stationID;
        this.portID = portID;
    }

    public int getStationID() {
        return stationID;
    }

    public void setStationID(int stationID) {
        this.stationID = stationID;
    }

    public int getPortID() {
        return portID;
    }

    public void setPortID(int portID) {
        this.portID = portID;
    }
}
