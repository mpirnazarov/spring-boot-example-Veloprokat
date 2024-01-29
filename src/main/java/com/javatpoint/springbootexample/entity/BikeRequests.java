package com.javatpoint.springbootexample.entity;

import java.time.LocalDateTime;

public class BikeRequests {
    String userID;
    String stationID;
    String portID;
    String bikeID;
    LocalDateTime dateTimeTaken;

    public BikeRequests(String userID, String stationID, String portID, String bikeID) {
        this.userID = userID;
        this.stationID = stationID;
        this.portID = portID;
        this.bikeID = bikeID;
        this.dateTimeTaken = LocalDateTime.now();
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
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

    public String getBikeID() {
        return bikeID;
    }

    public void setBikeID(String bikeID) {
        this.bikeID = bikeID;
    }

    public LocalDateTime getDateTimeTaken() {
        return dateTimeTaken;
    }

    public void setDateTimeTaken(LocalDateTime dateTimeTaken) {
        this.dateTimeTaken = dateTimeTaken;
    }

    @Override
    public String toString() {
        return "BikeRequests{" +
                "userID=" + userID +
                ", stationID=" + stationID +
                ", portID=" + portID +
                ", bikeID=" + bikeID +
                ", dateTimeTaken=" + dateTimeTaken +
                '}';
    }
}
